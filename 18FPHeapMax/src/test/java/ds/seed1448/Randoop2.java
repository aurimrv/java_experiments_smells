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
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
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
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.imprime();
        ds.Item item52 = fPHeapMax50.max();
        ds.Item item53 = fPHeapMax50.max();
        fPHeapMax50.imprime();
        fPHeapMax50.refaz(1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item53);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
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
        ds.Item item36 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
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
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item48);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 0);
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
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
        ds.Item item52 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 1);
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
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
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
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item32 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item32);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
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
        fPHeapMax13.refaz((int) (short) 10, (int) (short) 1);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax30.refaz((int) '4', 0);
        fPHeapMax30.imprime();
        fPHeapMax30.refaz((int) (byte) 100, 0);
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
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
        fPHeapMax30.copia(itemArray52);
        fPHeapMax13.copia(itemArray52);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax57.constroi();
        ds.Item item59 = fPHeapMax57.max();
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
        fPHeapMax57.copia(itemArray69);
        fPHeapMax13.copia(itemArray69);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        fPHeapMax7.refaz((int) (byte) 100, 0);
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
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
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax19.copia(itemArray50);
        fPHeapMax7.copia(itemArray50);
        java.lang.Class<?> wildcardClass54 = fPHeapMax7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
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
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
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
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
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
        fPHeapMax1.refaz((int) 'a', 10);
        ds.Item item33 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
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
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        ds.Item item24 = fPHeapMax21.max();
        fPHeapMax21.refaz((int) 'a', (int) (short) 10);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax32.imprime();
        ds.Item item34 = fPHeapMax32.max();
        ds.Item item35 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax38.constroi();
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
        fPHeapMax32.copia(itemArray61);
        fPHeapMax30.copia(itemArray61);
        fPHeapMax21.copia(itemArray61);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) itemArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
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
        ds.Item item89 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNull(item89);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
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
        ds.Item item33 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
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
        fPHeapMax1.constroi();
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, 0);
        fPHeapMax1.constroi();
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', 1);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.refaz((int) '4', 0);
        fPHeapMax9.imprime();
        fPHeapMax9.refaz((int) (byte) 100, 0);
        fPHeapMax9.constroi();
        ds.Item item18 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.constroi();
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
        fPHeapMax23.copia(itemArray43);
        fPHeapMax20.copia(itemArray43);
        fPHeapMax9.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
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
        java.lang.Class<?> wildcardClass40 = itemArray34.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
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
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
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
        fPHeapMax33.copia(itemArray58);
        fPHeapMax28.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax65.constroi();
        fPHeapMax65.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax69.constroi();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax69.copia(itemArray74);
        fPHeapMax65.copia(itemArray74);
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        fPHeapMax79.copia(itemArray81);
        fPHeapMax79.constroi();
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item86 = null;
        ds.Item[] itemArray87 = new ds.Item[] { item86 };
        fPHeapMax85.copia(itemArray87);
        fPHeapMax79.copia(itemArray87);
        fPHeapMax65.copia(itemArray87);
        java.lang.Class<?> wildcardClass91 = itemArray87.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) wildcardClass91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray87);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
        ds.Item item41 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        fPHeapMax13.refaz((int) (short) 10, 0);
        fPHeapMax13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item41);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) 'a');
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.Item item22 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.Item item24 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(1);
        ds.Item item27 = fPHeapMax26.max();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax16.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item81 = fPHeapMax1.retiraMax();
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
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
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
        fPHeapMax1.refaz(100, (int) (short) -1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        fPHeapMax40.imprime();
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax45.constroi();
        fPHeapMax45.constroi();
        fPHeapMax45.constroi();
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax51.refaz((int) '4', 0);
        fPHeapMax51.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax51.copia(itemArray59);
        fPHeapMax45.copia(itemArray59);
        fPHeapMax40.copia(itemArray59);
        fPHeapMax1.copia(itemArray59);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
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
        ds.Item item58 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax60.constroi();
        fPHeapMax60.imprime();
        fPHeapMax60.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax65.imprime();
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
        fPHeapMax60.copia(itemArray88);
        fPHeapMax34.copia(itemArray88);
        fPHeapMax1.copia(itemArray88);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
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
        java.lang.Class<?> wildcardClass64 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
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
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray68);
        fPHeapMax43.copia(itemArray68);
        ds.Item item71 = fPHeapMax43.max();
        fPHeapMax43.imprime();
        fPHeapMax43.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax77.refaz((int) '4', 0);
        fPHeapMax77.imprime();
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax77.copia(itemArray85);
        fPHeapMax43.copia(itemArray85);
        fPHeapMax43.imprime();
        ds.Item item90 = fPHeapMax43.max();
        fPHeapMax43.refaz((int) (short) 100, (int) ' ');
        fPHeapMax43.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax43);
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
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item71);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNull(item90);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
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
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
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
        fPHeapMax37.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        java.lang.Class<?> wildcardClass54 = itemArray49.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 0);
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
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
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
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
        fPHeapMax28.copia(itemArray40);
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        fPHeapMax28.refaz(1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
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
        fPHeapMax1.constroi();
        ds.Item item52 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
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
        fPHeapMax1.constroi();
        ds.Item item90 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item90);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
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
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
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
        ds.Item item59 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.Item item61 = fPHeapMax35.max();
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
        ds.Item[] itemArray88 = new ds.Item[] {};
        fPHeapMax77.copia(itemArray88);
        fPHeapMax63.copia(itemArray88);
        ds.FPHeapMax fPHeapMax92 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item93 = null;
        ds.Item[] itemArray94 = new ds.Item[] { item93 };
        fPHeapMax92.copia(itemArray94);
        fPHeapMax63.copia(itemArray94);
        fPHeapMax35.copia(itemArray94);
        fPHeapMax1.copia(itemArray94);
        ds.Item item99 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray94);
        org.junit.Assert.assertNull(item99);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray16);
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
        fPHeapMax5.copia(itemArray30);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
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
        fPHeapMax35.copia(itemArray65);
        fPHeapMax5.copia(itemArray65);
        fPHeapMax5.refaz((int) (byte) 1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax74.constroi();
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
        ds.Item[] itemArray88 = new ds.Item[] {};
        fPHeapMax77.copia(itemArray88);
        fPHeapMax74.copia(itemArray88);
        fPHeapMax5.copia(itemArray88);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
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
        ds.Item item64 = fPHeapMax1.max();
        ds.Item item65 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNull(item65);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
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
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) (short) 100);
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) '4');
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
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
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
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
        java.lang.Class<?> wildcardClass48 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
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
            fPHeapMax1.refaz((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
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
        ds.Item[] itemArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.refaz((int) '4', 0);
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 100, 0);
        fPHeapMax8.imprime();
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
        fPHeapMax8.copia(itemArray29);
        fPHeapMax8.imprime();
        java.lang.Class<?> wildcardClass33 = fPHeapMax8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
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
        ds.Item item46 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
        fPHeapMax11.copia(itemArray36);
        ds.Item item39 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        fPHeapMax11.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax45.refaz((int) '4', 0);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax11.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
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
        fPHeapMax1.refaz((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
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
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item32 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        ds.Item item35 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = fPHeapMax37.max();
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax43.imprime();
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
        fPHeapMax46.copia(itemArray66);
        fPHeapMax43.copia(itemArray66);
        fPHeapMax41.copia(itemArray66);
        fPHeapMax37.copia(itemArray66);
        fPHeapMax31.copia(itemArray66);
        fPHeapMax1.copia(itemArray66);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
            ds.Item item17 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.Item item14 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        fPHeapMax17.imprime();
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
        fPHeapMax17.copia(itemArray45);
        fPHeapMax9.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
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
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax38.constroi();
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
        fPHeapMax1.copia(itemArray61);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
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
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        ds.Item[] itemArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
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
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
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
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 1);
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
        fPHeapMax1.copia(itemArray77);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item65 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
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
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax20.copia(itemArray25);
        fPHeapMax16.copia(itemArray25);
        fPHeapMax16.constroi();
        ds.Item item30 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.refaz((int) '4', 0);
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
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
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.refaz((int) '4', 0);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        fPHeapMax33.constroi();
        fPHeapMax33.constroi();
        fPHeapMax33.constroi();
        ds.Item item38 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax46.imprime();
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
        fPHeapMax49.copia(itemArray69);
        fPHeapMax46.copia(itemArray69);
        fPHeapMax41.copia(itemArray69);
        fPHeapMax33.copia(itemArray69);
        fPHeapMax20.copia(itemArray69);
        fPHeapMax1.copia(itemArray69);
        ds.Item item78 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNull(item78);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
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
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax70.copia(itemArray75);
        fPHeapMax66.copia(itemArray75);
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
        fPHeapMax66.copia(itemArray88);
        fPHeapMax1.copia(itemArray88);
        java.lang.Class<?> wildcardClass93 = itemArray88.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
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
        ds.Item item72 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNull(item72);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.refaz((int) '4', 0);
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.Item item14 = fPHeapMax4.max();
        fPHeapMax4.refaz((int) ' ', (int) (short) 10);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
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
        fPHeapMax1.constroi();
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
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
        fPHeapMax1.refaz((int) (short) 100, 100);
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
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
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
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
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
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
        ds.Item item52 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.constroi();
        fPHeapMax55.imprime();
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
        fPHeapMax55.copia(itemArray67);
        fPHeapMax1.copia(itemArray67);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
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
        fPHeapMax3.copia(itemArray23);
        ds.Item item27 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
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
        fPHeapMax37.copia(itemArray57);
        fPHeapMax34.copia(itemArray57);
        fPHeapMax29.copia(itemArray57);
        fPHeapMax3.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
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
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item52);
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
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
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax51.refaz((int) '4', 0);
        fPHeapMax51.imprime();
        fPHeapMax51.refaz((int) (byte) 100, 0);
        fPHeapMax51.constroi();
        ds.Item item60 = fPHeapMax51.max();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax62.constroi();
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
        fPHeapMax51.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) 1);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
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
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
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
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
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
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item62 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
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
        fPHeapMax7.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        java.lang.Class<?> wildcardClass34 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
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
        fPHeapMax1.constroi();
        ds.Item item31 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item31);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
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
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(10, (int) (short) 1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
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
        ds.Item item29 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
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
        fPHeapMax31.copia(itemArray56);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax64.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax64.copia(itemArray69);
        fPHeapMax31.copia(itemArray69);
        fPHeapMax5.copia(itemArray69);
        fPHeapMax1.copia(itemArray69);
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax77.imprime();
        fPHeapMax77.refaz(1, (int) (short) 0);
        ds.Item item82 = fPHeapMax77.max();
        fPHeapMax77.imprime();
        fPHeapMax77.constroi();
        ds.Item item85 = fPHeapMax77.max();
        ds.Item item86 = fPHeapMax77.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) item86);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNull(item82);
        org.junit.Assert.assertNull(item85);
        org.junit.Assert.assertNull(item86);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        ds.Item item13 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
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
        ds.Item item90 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item90);
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item89 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
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
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
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
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
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
        fPHeapMax37.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        fPHeapMax1.imprime();
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
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMax59.copia(itemArray70);
        fPHeapMax56.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        java.lang.Class<?> wildcardClass74 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
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
        fPHeapMax1.refaz((int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
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
        ds.Item item35 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass36 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 100);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
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
        fPHeapMax8.copia(itemArray37);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
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
        fPHeapMax44.copia(itemArray56);
        fPHeapMax8.copia(itemArray56);
        fPHeapMax8.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
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
        fPHeapMax1.constroi();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 1);
        ds.Item item15 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) -1);
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
        fPHeapMax13.copia(itemArray35);
        fPHeapMax13.constroi();
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
        fPHeapMax41.refaz((int) (short) 100, (int) '#');
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax73.constroi();
        ds.Item item75 = fPHeapMax73.max();
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
        fPHeapMax73.copia(itemArray85);
        fPHeapMax41.copia(itemArray85);
        fPHeapMax13.copia(itemArray85);
        fPHeapMax13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNull(item75);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item48 = fPHeapMax1.retiraMax();
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
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
        ds.Item item61 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
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
        fPHeapMax66.copia(itemArray78);
        fPHeapMax63.copia(itemArray78);
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item85 = null;
        ds.Item[] itemArray86 = new ds.Item[] { item85 };
        fPHeapMax84.copia(itemArray86);
        fPHeapMax84.constroi();
        ds.FPHeapMax fPHeapMax90 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item91 = null;
        ds.Item[] itemArray92 = new ds.Item[] { item91 };
        fPHeapMax90.copia(itemArray92);
        fPHeapMax84.copia(itemArray92);
        ds.Item[] itemArray95 = new ds.Item[] {};
        fPHeapMax84.copia(itemArray95);
        fPHeapMax63.copia(itemArray95);
        fPHeapMax1.copia(itemArray95);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertNotNull(itemArray92);
        org.junit.Assert.assertNotNull(itemArray95);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
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
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax45.refaz((int) '4', 0);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax39.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
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
        ds.Item[] itemArray91 = new ds.Item[] {};
        fPHeapMax80.copia(itemArray91);
        fPHeapMax66.copia(itemArray91);
        fPHeapMax61.copia(itemArray91);
        fPHeapMax59.copia(itemArray91);
        fPHeapMax1.copia(itemArray91);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
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
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax75.constroi();
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item82 = null;
        ds.Item[] itemArray83 = new ds.Item[] { item82 };
        fPHeapMax81.copia(itemArray83);
        fPHeapMax75.copia(itemArray83);
        ds.Item[] itemArray86 = new ds.Item[] {};
        fPHeapMax75.copia(itemArray86);
        fPHeapMax61.copia(itemArray86);
        ds.Item item89 = fPHeapMax61.max();
        fPHeapMax61.imprime();
        fPHeapMax61.refaz(100, 10);
        fPHeapMax61.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax61);
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
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertNull(item89);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 100);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
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
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
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
            fPHeapMax1.refaz(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
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
        ds.Item item19 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
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
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.refaz((int) '4', 0);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax21.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item40 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
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
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '#', (int) (short) 10);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
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
        ds.Item item33 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
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
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
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
        fPHeapMax1.refaz((int) '4', (int) (byte) 1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item37);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax8);
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
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
        java.lang.Class<?> wildcardClass19 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
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
        ds.Item item58 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item58);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
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
        fPHeapMax1.constroi();
        ds.Item item21 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax27.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
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
        ds.Item item51 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
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
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item64 = fPHeapMax1.retiraMax();
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
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
            fPHeapMax1.refaz(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
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
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1163");
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
        ds.Item item58 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax60.constroi();
        fPHeapMax60.imprime();
        fPHeapMax60.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax65.imprime();
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
        fPHeapMax60.copia(itemArray88);
        fPHeapMax34.copia(itemArray88);
        fPHeapMax1.copia(itemArray88);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item97 = fPHeapMax1.retiraMax();
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
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1164");
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
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
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
        fPHeapMax37.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item56 = fPHeapMax55.max();
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax61.imprime();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax64.constroi();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax64.copia(itemArray72);
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax76.constroi();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        fPHeapMax82.copia(itemArray84);
        fPHeapMax76.copia(itemArray84);
        fPHeapMax64.copia(itemArray84);
        fPHeapMax61.copia(itemArray84);
        fPHeapMax59.copia(itemArray84);
        fPHeapMax55.copia(itemArray84);
        fPHeapMax1.copia(itemArray84);
        ds.Item item92 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNull(item92);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1165");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1166");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax11.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1167");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax10.imprime();
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
        fPHeapMax10.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1168");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1169");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1170");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1171");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.imprime();
        fPHeapMax12.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1172");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
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
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1173");
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
        fPHeapMax1.constroi();
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
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1174");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1175");
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
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax70.constroi();
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
        ds.Item[] itemArray84 = new ds.Item[] {};
        fPHeapMax73.copia(itemArray84);
        fPHeapMax70.copia(itemArray84);
        fPHeapMax1.copia(itemArray84);
        fPHeapMax1.constroi();
        ds.Item item89 = fPHeapMax1.max();
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
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNull(item89);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1176");
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
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax46.imprime();
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
        fPHeapMax49.copia(itemArray69);
        fPHeapMax46.copia(itemArray69);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax46);
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
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1177");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1178");
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
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1179");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) ' ');
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1180");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1181");
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
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1182");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1183");
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
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1184");
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
        ds.Item item19 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1185");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1186");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1187");
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
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item37);
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1188");
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
        java.lang.Class<?> wildcardClass29 = itemArray24.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1189");
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
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item26);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1190");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax13.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
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
        fPHeapMax9.copia(itemArray31);
        fPHeapMax7.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1191");
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
        fPHeapMax1.refaz((int) '4', (int) '#');
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1192");
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
        ds.Item item71 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(item71);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1193");
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
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1194");
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
        fPHeapMax1.imprime();
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1195");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
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
        ds.Item item40 = fPHeapMax5.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1196");
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
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item66 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1197");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.Item item14 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        fPHeapMax17.imprime();
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
        fPHeapMax17.copia(itemArray45);
        fPHeapMax9.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1198");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1199");
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
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax(1);
        ds.Item item50 = fPHeapMax49.max();
        ds.Item[] itemArray51 = new ds.Item[] {};
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
        fPHeapMax1.copia(itemArray79);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1200");
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
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1201");
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
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1202");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1203");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1204");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (short) 0);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1205");
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
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1206");
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
        ds.Item item53 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item53);
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1207");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1208");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
        ds.Item item9 = fPHeapMax1.max();
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
        fPHeapMax12.copia(itemArray26);
        ds.Item item29 = fPHeapMax12.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) item29);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1209");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
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
        fPHeapMax9.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1210");
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
        java.lang.Class<?> wildcardClass37 = itemArray30.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1211");
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
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1212");
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
        ds.Item item52 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item54 = fPHeapMax1.retiraMax();
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
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1213");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1214");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1215");
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
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass80 = fPHeapMax1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1216");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1217");
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
        fPHeapMax1.refaz(100, (int) (byte) 0);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(1);
        ds.Item item40 = fPHeapMax39.max();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1218");
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
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item50);
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1219");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1220");
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
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.constroi();
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
        fPHeapMax39.copia(itemArray59);
        fPHeapMax36.copia(itemArray59);
        fPHeapMax34.copia(itemArray59);
        fPHeapMax1.copia(itemArray59);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item66 = fPHeapMax1.retiraMax();
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
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1221");
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
        java.lang.Class<?> wildcardClass11 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1222");
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
        java.lang.Class<?> wildcardClass20 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1223");
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
            fPHeapMax1.refaz((int) (byte) 0, 1);
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
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1224");
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
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.imprime();
        ds.Item item49 = fPHeapMax47.max();
        ds.Item item50 = fPHeapMax47.max();
        fPHeapMax47.imprime();
        fPHeapMax47.constroi();
        ds.Item item53 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.constroi();
        fPHeapMax55.constroi();
        fPHeapMax55.constroi();
        fPHeapMax55.constroi();
        ds.Item item60 = fPHeapMax55.max();
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax63.constroi();
        fPHeapMax63.imprime();
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax68.imprime();
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
        fPHeapMax63.copia(itemArray91);
        fPHeapMax55.copia(itemArray91);
        fPHeapMax47.copia(itemArray91);
        fPHeapMax1.copia(itemArray91);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1225");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1226");
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
        fPHeapMax1.imprime();
        ds.Item item52 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1227");
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
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item48);
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1228");
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
        java.lang.Class<?> wildcardClass53 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1229");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1230");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.imprime();
        ds.Item item16 = fPHeapMax11.max();
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
        fPHeapMax18.copia(itemArray43);
        ds.Item item46 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax52.refaz((int) '4', 0);
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax52.copia(itemArray60);
        fPHeapMax18.copia(itemArray60);
        fPHeapMax11.copia(itemArray60);
        fPHeapMax11.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray60);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1231");
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
        ds.Item item49 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNull(item49);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1232");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1233");
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
        ds.Item item52 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1234");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
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
        fPHeapMax1.copia(itemArray50);
        java.lang.Class<?> wildcardClass55 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1235");
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
            fPHeapMax1.refaz((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1236");
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
        ds.Item item27 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1237");
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
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax19.imprime();
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
        fPHeapMax19.copia(itemArray34);
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
        fPHeapMax19.copia(itemArray51);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax57.imprime();
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
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax72.constroi();
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMax78.copia(itemArray80);
        fPHeapMax72.copia(itemArray80);
        fPHeapMax60.copia(itemArray80);
        fPHeapMax57.copia(itemArray80);
        fPHeapMax55.copia(itemArray80);
        fPHeapMax19.copia(itemArray80);
        fPHeapMax1.copia(itemArray80);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1238");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1239");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1240");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (short) 0);
        ds.Item item12 = fPHeapMax1.max();
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
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
        fPHeapMax15.copia(itemArray40);
        fPHeapMax15.imprime();
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
        fPHeapMax15.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1241");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.imprime();
        ds.Item item14 = fPHeapMax12.max();
        ds.Item item15 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
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
        fPHeapMax12.copia(itemArray41);
        ds.Item item47 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item47);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1242");
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
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1243");
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
        ds.Item item19 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1244");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.refaz((int) '4', 0);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1245");
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
            fPHeapMax1.refaz((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1246");
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
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 0);
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
        org.junit.Assert.assertNull(item56);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1247");
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
        fPHeapMax1.imprime();
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1248");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1249");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
        ds.Item item34 = fPHeapMax10.max();
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
        fPHeapMax10.copia(itemArray65);
        fPHeapMax10.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1250");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item72 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
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

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1251");
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
        ds.Item item64 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item64);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1252");
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
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        ds.Item item25 = fPHeapMax23.max();
        ds.Item item26 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax29.constroi();
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
        fPHeapMax23.copia(itemArray52);
        fPHeapMax21.copia(itemArray52);
        fPHeapMax1.copia(itemArray52);
        ds.Item item60 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1253");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
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
        fPHeapMax9.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1254");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1255");
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
        fPHeapMax1.copia(itemArray42);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.constroi();
        fPHeapMax47.constroi();
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax53.refaz((int) '4', 0);
        fPHeapMax53.imprime();
        fPHeapMax53.refaz((int) (byte) 100, 0);
        fPHeapMax53.constroi();
        ds.Item item62 = fPHeapMax53.max();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax64.constroi();
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
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        fPHeapMax79.copia(itemArray81);
        fPHeapMax79.constroi();
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item86 = null;
        ds.Item[] itemArray87 = new ds.Item[] { item86 };
        fPHeapMax85.copia(itemArray87);
        fPHeapMax79.copia(itemArray87);
        fPHeapMax67.copia(itemArray87);
        fPHeapMax64.copia(itemArray87);
        fPHeapMax53.copia(itemArray87);
        fPHeapMax47.copia(itemArray87);
        fPHeapMax1.copia(itemArray87);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray87);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1256");
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
        java.lang.Class<?> wildcardClass63 = itemArray54.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1257");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item93 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1258");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = item3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1259");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1260");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1261");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1262");
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
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1263");
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
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
        ds.Item item81 = fPHeapMax53.max();
        fPHeapMax53.imprime();
        fPHeapMax53.refaz(100, 10);
        java.lang.Class<?> wildcardClass86 = fPHeapMax53.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax53);
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
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNull(item81);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1264");
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
        fPHeapMax1.constroi();
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1265");
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
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
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
        fPHeapMax31.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1266");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        fPHeapMax11.refaz((int) (short) 1, 1);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.refaz((int) '4', 0);
        fPHeapMax21.imprime();
        fPHeapMax21.refaz((int) (byte) 100, 0);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
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
        fPHeapMax31.copia(itemArray61);
        fPHeapMax21.copia(itemArray61);
        fPHeapMax11.copia(itemArray61);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1267");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.imprime();
        fPHeapMax11.refaz(1, (int) (short) 0);
        ds.Item item16 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.Item item19 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
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
        fPHeapMax21.copia(itemArray46);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax54.copia(itemArray59);
        fPHeapMax21.copia(itemArray59);
        fPHeapMax11.copia(itemArray59);
        ds.Item item64 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item64);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1268");
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
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.refaz((int) '4', 0);
        fPHeapMax41.imprime();
        fPHeapMax41.imprime();
        ds.Item item47 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
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
        fPHeapMax41.copia(itemArray74);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax41);
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
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1269");
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
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        ds.Item item40 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax43.constroi();
        fPHeapMax43.imprime();
        fPHeapMax43.imprime();
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
        fPHeapMax43.copia(itemArray71);
        fPHeapMax35.copia(itemArray71);
        fPHeapMax1.copia(itemArray71);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1270");
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
        fPHeapMax1.constroi();
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
        fPHeapMax22.copia(itemArray47);
        ds.Item item50 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        fPHeapMax22.refaz(100, 10);
        ds.Item item55 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax58.imprime();
        fPHeapMax58.refaz(1, (int) (short) 0);
        ds.Item item63 = fPHeapMax58.max();
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax66.refaz((int) '4', 0);
        fPHeapMax66.imprime();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax72.constroi();
        fPHeapMax72.imprime();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax76.constroi();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        fPHeapMax82.copia(itemArray84);
        fPHeapMax76.copia(itemArray84);
        fPHeapMax72.copia(itemArray84);
        fPHeapMax66.copia(itemArray84);
        fPHeapMax58.copia(itemArray84);
        fPHeapMax22.copia(itemArray84);
        fPHeapMax1.copia(itemArray84);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1271");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
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
        fPHeapMax1.copia(itemArray35);
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1272");
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
        fPHeapMax1.constroi();
        ds.Item item31 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        fPHeapMax34.imprime();
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
        fPHeapMax34.copia(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1273");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax15.constroi();
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
        fPHeapMax18.copia(itemArray38);
        fPHeapMax15.copia(itemArray38);
        fPHeapMax9.copia(itemArray38);
        fPHeapMax7.copia(itemArray38);
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
        fPHeapMax7.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1274");
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
        fPHeapMax1.constroi();
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1275");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax11.copia(itemArray16);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
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
        fPHeapMax21.copia(itemArray46);
        fPHeapMax11.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1276");
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
        fPHeapMax1.imprime();
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1277");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.refaz((int) '4', 0);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
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
        fPHeapMax17.copia(itemArray29);
        fPHeapMax11.copia(itemArray29);
        fPHeapMax11.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1278");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
        fPHeapMax13.constroi();
        fPHeapMax13.refaz((int) 'a', 10);
        ds.Item item45 = fPHeapMax13.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) item45);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1279");
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
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.imprime();
        ds.Item item39 = fPHeapMax37.max();
        ds.Item item40 = fPHeapMax37.max();
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax43.constroi();
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
        fPHeapMax46.copia(itemArray66);
        fPHeapMax43.copia(itemArray66);
        fPHeapMax37.copia(itemArray66);
        fPHeapMax35.copia(itemArray66);
        fPHeapMax33.copia(itemArray66);
        fPHeapMax1.copia(itemArray66);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1280");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (short) -1);
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
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray21);
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
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        ds.Item item38 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.refaz((int) '4', 0);
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        fPHeapMax10.copia(itemArray52);
        fPHeapMax1.copia(itemArray52);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1281");
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
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
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
        fPHeapMax33.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass51 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1282");
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
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1283");
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
        ds.Item item59 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.Item item61 = fPHeapMax35.max();
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
        ds.Item[] itemArray88 = new ds.Item[] {};
        fPHeapMax77.copia(itemArray88);
        fPHeapMax63.copia(itemArray88);
        ds.FPHeapMax fPHeapMax92 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item93 = null;
        ds.Item[] itemArray94 = new ds.Item[] { item93 };
        fPHeapMax92.copia(itemArray94);
        fPHeapMax63.copia(itemArray94);
        fPHeapMax35.copia(itemArray94);
        fPHeapMax1.copia(itemArray94);
        java.lang.Class<?> wildcardClass99 = itemArray94.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray94);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1284");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 1);
        ds.Item[] itemArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1285");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '#', 10);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1286");
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
        java.lang.Class<?> wildcardClass21 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1287");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 1);
        fPHeapMax1.imprime();
        ds.Item item16 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1288");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 1);
        fPHeapMax1.refaz(1, (-1));
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1289");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1290");
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
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1291");
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
        fPHeapMax1.refaz(100, (int) (byte) 0);
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1292");
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
        ds.Item item37 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item37);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1293");
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
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1294");
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
        fPHeapMax1.constroi();
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
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1295");
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
        ds.Item item39 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item39);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1296");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        fPHeapMax10.refaz((int) (byte) 10, 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
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
        fPHeapMax21.copia(itemArray46);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax54.imprime();
        ds.Item item56 = fPHeapMax54.max();
        ds.Item item57 = fPHeapMax54.max();
        fPHeapMax54.constroi();
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
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax75.constroi();
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item82 = null;
        ds.Item[] itemArray83 = new ds.Item[] { item82 };
        fPHeapMax81.copia(itemArray83);
        fPHeapMax75.copia(itemArray83);
        fPHeapMax63.copia(itemArray83);
        fPHeapMax60.copia(itemArray83);
        fPHeapMax54.copia(itemArray83);
        fPHeapMax21.copia(itemArray83);
        fPHeapMax10.copia(itemArray83);
        fPHeapMax1.copia(itemArray83);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1297");
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
        fPHeapMax1.constroi();
        ds.Item item31 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item31);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1298");
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
        fPHeapMax1.copia(itemArray85);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1299");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1300");
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
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 1);
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
        ds.Item[] itemArray91 = new ds.Item[] {};
        fPHeapMax80.copia(itemArray91);
        fPHeapMax66.copia(itemArray91);
        fPHeapMax66.imprime();
        java.lang.Class<?> wildcardClass95 = fPHeapMax66.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) wildcardClass95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray91);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1301");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
        ds.Item item21 = fPHeapMax8.max();
        fPHeapMax8.refaz(10, 10);
        fPHeapMax8.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1302");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1303");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1304");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1305");
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
        ds.Item item21 = fPHeapMax1.max();
        ds.Item item22 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1306");
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
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass90 = fPHeapMax1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1307");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(100, 10);
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
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1308");
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
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        ds.Item item42 = fPHeapMax40.max();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
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
        fPHeapMax47.copia(itemArray59);
        fPHeapMax44.copia(itemArray59);
        fPHeapMax40.copia(itemArray59);
        fPHeapMax40.constroi();
        ds.Item item66 = fPHeapMax40.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item66);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1309");
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
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item33 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1310");
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
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1311");
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
        fPHeapMax56.imprime();
        ds.FPHeapMax fPHeapMax89 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax89.constroi();
        ds.FPHeapMax fPHeapMax92 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item93 = null;
        ds.Item[] itemArray94 = new ds.Item[] { item93 };
        fPHeapMax92.copia(itemArray94);
        fPHeapMax89.copia(itemArray94);
        fPHeapMax56.copia(itemArray94);
        fPHeapMax1.copia(itemArray94);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray94);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1312");
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
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.imprime();
        fPHeapMax33.refaz(1, (int) (short) 0);
        ds.Item item38 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item item40 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.imprime();
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
        fPHeapMax42.copia(itemArray71);
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax78.imprime();
        fPHeapMax78.constroi();
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
        fPHeapMax78.copia(itemArray90);
        fPHeapMax42.copia(itemArray90);
        fPHeapMax33.copia(itemArray90);
        fPHeapMax1.copia(itemArray90);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item97 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1313");
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
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '4', (int) (byte) 10);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1314");
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
            java.lang.Class<?> wildcardClass26 = item25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1315");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1316");
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
        java.lang.Class<?> wildcardClass49 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1317");
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
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item21 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1318");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1319");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.refaz((int) '4', 0);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
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
        fPHeapMax20.copia(itemArray32);
        fPHeapMax14.copia(itemArray32);
        fPHeapMax14.refaz((int) (byte) 10, (-1));
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.refaz((int) '4', 0);
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
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
        fPHeapMax47.copia(itemArray59);
        fPHeapMax41.copia(itemArray59);
        fPHeapMax14.copia(itemArray59);
        fPHeapMax14.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1320");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1321");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
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
        fPHeapMax12.copia(itemArray24);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.Item item33 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
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
        fPHeapMax35.copia(itemArray70);
        fPHeapMax31.copia(itemArray70);
        fPHeapMax12.copia(itemArray70);
        fPHeapMax5.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1322");
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
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax32.constroi();
        fPHeapMax32.constroi();
        fPHeapMax32.constroi();
        fPHeapMax32.constroi();
        ds.Item item37 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        fPHeapMax40.imprime();
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax45.imprime();
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
        fPHeapMax48.copia(itemArray68);
        fPHeapMax45.copia(itemArray68);
        fPHeapMax40.copia(itemArray68);
        fPHeapMax32.copia(itemArray68);
        fPHeapMax1.copia(itemArray68);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1323");
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
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item33);
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1324");
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
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (byte) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1325");
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
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1326");
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
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.imprime();
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax46.constroi();
        fPHeapMax46.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax50.copia(itemArray55);
        fPHeapMax46.copia(itemArray55);
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
        fPHeapMax46.copia(itemArray68);
        fPHeapMax39.copia(itemArray68);
        fPHeapMax1.copia(itemArray68);
        ds.Item item74 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item74);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1327");
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
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1328");
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
        java.lang.Class<?> wildcardClass80 = fPHeapMax1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1329");
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
        java.lang.Class<?> wildcardClass35 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1330");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, (int) (short) 10);
        fPHeapMax1.refaz((int) (short) 100, (int) 'a');
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1331");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.refaz(0, (int) (byte) -1);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
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
        ds.Item item41 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax43.imprime();
        ds.Item item45 = fPHeapMax43.max();
        ds.Item item46 = fPHeapMax43.max();
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax49.constroi();
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
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax64.constroi();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax64.copia(itemArray72);
        fPHeapMax52.copia(itemArray72);
        fPHeapMax49.copia(itemArray72);
        fPHeapMax43.copia(itemArray72);
        fPHeapMax17.copia(itemArray72);
        fPHeapMax6.copia(itemArray72);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1332");
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
        ds.Item item38 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1333");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) -1);
        ds.Item item10 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1334");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (byte) 1);
        fPHeapMax1.constroi();
        ds.Item item13 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1335");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item89 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
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
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1336");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1337");
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
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) 'a');
        fPHeapMax24.imprime();
        ds.Item item26 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(1);
        ds.Item item29 = fPHeapMax28.max();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray30);
        fPHeapMax24.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray30);
    }
}

