package ds.seed5311;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) '4');
        ds.Item item30 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(0);
        fPHeapMax32.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray38);
        fPHeapMax29.copia(itemArray38);
        fPHeapMax25.copia(itemArray38);
        fPHeapMax1.copia(itemArray38);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
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
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax15.copia(itemArray21);
        fPHeapMax7.copia(itemArray21);
        fPHeapMax4.copia(itemArray21);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(0);
        fPHeapMax27.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        fPHeapMax27.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray33);
        fPHeapMax4.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax6.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax6.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(0);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(0);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax32.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '4');
        ds.Item item21 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        fPHeapMax23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray25);
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax20.copia(itemArray29);
        fPHeapMax16.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(0);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax35.copia(itemArray41);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray53);
        fPHeapMax44.copia(itemArray53);
        fPHeapMax35.copia(itemArray53);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(0);
        fPHeapMax58.imprime();
        fPHeapMax58.constroi();
        fPHeapMax58.imprime();
        fPHeapMax58.constroi();
        fPHeapMax58.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(1);
        fPHeapMax65.constroi();
        fPHeapMax65.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) '4');
        ds.Item item70 = fPHeapMax69.max();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax(0);
        fPHeapMax72.imprime();
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMax72.copia(itemArray74);
        fPHeapMax72.constroi();
        fPHeapMax72.imprime();
        ds.Item[] itemArray78 = new ds.Item[] {};
        fPHeapMax72.copia(itemArray78);
        fPHeapMax69.copia(itemArray78);
        fPHeapMax65.copia(itemArray78);
        fPHeapMax58.copia(itemArray78);
        fPHeapMax35.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item70);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.Item item7 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '4');
        ds.Item item31 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax30.copia(itemArray39);
        fPHeapMax25.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax17.copia(itemArray39);
        fPHeapMax8.copia(itemArray39);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray51);
        fPHeapMax8.copia(itemArray51);
        fPHeapMax4.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax17.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax29.copia(itemArray35);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax29.copia(itemArray47);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(1);
        fPHeapMax59.constroi();
        fPHeapMax59.imprime();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) '4');
        ds.Item item64 = fPHeapMax63.max();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax(0);
        fPHeapMax66.imprime();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax59.copia(itemArray72);
        fPHeapMax52.copia(itemArray72);
        fPHeapMax29.copia(itemArray72);
        fPHeapMax15.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass81 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
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
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(1);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '4');
        ds.Item item36 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray44);
        fPHeapMax35.copia(itemArray44);
        fPHeapMax31.copia(itemArray44);
        fPHeapMax24.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        fPHeapMax52.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray54);
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '4');
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(1);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '4');
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray26);
        fPHeapMax17.copia(itemArray26);
        fPHeapMax13.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax4.copia(itemArray19);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(0);
        fPHeapMax28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = fPHeapMax40.max();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(0);
        fPHeapMax45.imprime();
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) '4');
        ds.Item item51 = fPHeapMax50.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(0);
        fPHeapMax53.imprime();
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray55);
        fPHeapMax53.constroi();
        fPHeapMax53.imprime();
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray59);
        fPHeapMax50.copia(itemArray59);
        fPHeapMax45.copia(itemArray59);
        fPHeapMax43.copia(itemArray59);
        fPHeapMax40.copia(itemArray59);
        fPHeapMax37.copia(itemArray59);
        fPHeapMax28.copia(itemArray59);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax68.constroi();
        fPHeapMax68.imprime();
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax68.copia(itemArray71);
        fPHeapMax28.copia(itemArray71);
        fPHeapMax24.copia(itemArray71);
        fPHeapMax4.copia(itemArray71);
        fPHeapMax1.copia(itemArray71);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.Item item35 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray40);
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        fPHeapMax44.constroi();
        fPHeapMax44.constroi();
        fPHeapMax44.constroi();
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        fPHeapMax50.imprime();
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        fPHeapMax37.copia(itemArray52);
        fPHeapMax32.copia(itemArray52);
        fPHeapMax1.copia(itemArray52);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.constroi();
        fPHeapMax46.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray49);
        fPHeapMax40.copia(itemArray49);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(0);
        fPHeapMax53.imprime();
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray55);
        fPHeapMax40.copia(itemArray55);
        fPHeapMax38.copia(itemArray55);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass11 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(0);
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        fPHeapMax44.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray50);
        fPHeapMax23.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        fPHeapMax1.imprime();
        ds.Item item55 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item55);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMax8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(1, 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax6.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        fPHeapMax6.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
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
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax5.copia(itemArray21);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) '4');
        ds.Item item32 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(0);
        fPHeapMax34.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray40);
        fPHeapMax31.copia(itemArray40);
        fPHeapMax26.copia(itemArray40);
        fPHeapMax5.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        fPHeapMax1.constroi();
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
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
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '4');
        ds.Item item29 = fPHeapMax28.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(0);
        fPHeapMax31.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray37);
        fPHeapMax28.copia(itemArray37);
        fPHeapMax23.copia(itemArray37);
        fPHeapMax21.copia(itemArray37);
        fPHeapMax18.copia(itemArray37);
        fPHeapMax15.copia(itemArray37);
        fPHeapMax6.copia(itemArray37);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.constroi();
        fPHeapMax46.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray49);
        fPHeapMax6.copia(itemArray49);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(0);
        fPHeapMax53.imprime();
        fPHeapMax53.constroi();
        fPHeapMax53.imprime();
        fPHeapMax53.constroi();
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax60.constroi();
        fPHeapMax60.constroi();
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(0);
        fPHeapMax65.imprime();
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax(0);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax65.copia(itemArray71);
        fPHeapMax60.copia(itemArray71);
        fPHeapMax53.copia(itemArray71);
        fPHeapMax6.copia(itemArray71);
        fPHeapMax1.copia(itemArray71);
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax80.constroi();
        fPHeapMax80.imprime();
        ds.Item[] itemArray83 = new ds.Item[] {};
        fPHeapMax80.copia(itemArray83);
        fPHeapMax80.constroi();
        ds.FPHeapMax fPHeapMax87 = new ds.FPHeapMax(0);
        ds.Item item88 = null;
        ds.Item[] itemArray89 = new ds.Item[] { item88 };
        fPHeapMax87.copia(itemArray89);
        fPHeapMax80.copia(itemArray89);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray89);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(itemArray89);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item item17 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(0);
        fPHeapMax32.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax19.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        fPHeapMax41.imprime();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = fPHeapMax53.max();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(0);
        fPHeapMax58.imprime();
        fPHeapMax58.constroi();
        fPHeapMax58.imprime();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) '4');
        ds.Item item64 = fPHeapMax63.max();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax(0);
        fPHeapMax66.imprime();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax58.copia(itemArray72);
        fPHeapMax56.copia(itemArray72);
        fPHeapMax53.copia(itemArray72);
        fPHeapMax50.copia(itemArray72);
        fPHeapMax41.copia(itemArray72);
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax81.constroi();
        fPHeapMax81.imprime();
        ds.Item[] itemArray84 = new ds.Item[] {};
        fPHeapMax81.copia(itemArray84);
        fPHeapMax41.copia(itemArray84);
        fPHeapMax1.copia(itemArray84);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax3.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax22.copia(itemArray28);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(0);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray40);
        fPHeapMax31.copia(itemArray40);
        fPHeapMax22.copia(itemArray40);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(1);
        fPHeapMax46.constroi();
        fPHeapMax46.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) '4');
        ds.Item item51 = fPHeapMax50.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(0);
        fPHeapMax53.imprime();
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray55);
        fPHeapMax53.constroi();
        fPHeapMax53.imprime();
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray59);
        fPHeapMax50.copia(itemArray59);
        fPHeapMax46.copia(itemArray59);
        fPHeapMax22.copia(itemArray59);
        fPHeapMax1.copia(itemArray59);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.Item item28 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax22.copia(itemArray36);
        fPHeapMax20.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax5.copia(itemArray36);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray48);
        fPHeapMax5.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax9.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.Item item13 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax8.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '4');
        ds.Item item35 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray39);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray43);
        fPHeapMax34.copia(itemArray43);
        fPHeapMax29.copia(itemArray43);
        fPHeapMax27.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        java.lang.Class<?> wildcardClass49 = itemArray43.getClass();
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax33.copia(itemArray47);
        fPHeapMax12.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(0);
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax54.copia(itemArray60);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax(0);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax69.constroi();
        fPHeapMax69.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax54.copia(itemArray72);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax(1);
        fPHeapMax78.constroi();
        fPHeapMax78.imprime();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) '4');
        ds.Item item83 = fPHeapMax82.max();
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax(0);
        fPHeapMax85.imprime();
        ds.Item[] itemArray87 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray87);
        fPHeapMax85.constroi();
        fPHeapMax85.imprime();
        ds.Item[] itemArray91 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray91);
        fPHeapMax82.copia(itemArray91);
        fPHeapMax78.copia(itemArray91);
        fPHeapMax54.copia(itemArray91);
        fPHeapMax1.copia(itemArray91);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item98 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item83);
        org.junit.Assert.assertNotNull(itemArray87);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item13 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.Item item28 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax22.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.refaz((int) (byte) 100, 10);
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(1);
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.constroi();
        fPHeapMax46.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray49);
        fPHeapMax40.copia(itemArray49);
        fPHeapMax36.copia(itemArray49);
        fPHeapMax34.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.Item item13 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax8.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '4');
        ds.Item item35 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray39);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray43);
        fPHeapMax34.copia(itemArray43);
        fPHeapMax29.copia(itemArray43);
        fPHeapMax27.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        java.lang.Class<?> wildcardClass49 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '4');
        ds.Item item10 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '4');
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax3.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '4');
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(1);
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax35.constroi();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax35.copia(itemArray41);
        fPHeapMax27.copia(itemArray41);
        fPHeapMax24.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax49.constroi();
        fPHeapMax49.constroi();
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(0);
        fPHeapMax58.imprime();
        fPHeapMax58.constroi();
        fPHeapMax58.imprime();
        fPHeapMax58.constroi();
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax58.copia(itemArray64);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax(0);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax67.imprime();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax73.constroi();
        fPHeapMax73.imprime();
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMax73.copia(itemArray76);
        fPHeapMax67.copia(itemArray76);
        fPHeapMax58.copia(itemArray76);
        fPHeapMax54.copia(itemArray76);
        fPHeapMax49.copia(itemArray76);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) itemArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray76);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax33.copia(itemArray47);
        fPHeapMax12.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(0);
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax54.copia(itemArray60);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax(0);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax69.constroi();
        fPHeapMax69.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax54.copia(itemArray72);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax(1);
        fPHeapMax78.constroi();
        fPHeapMax78.imprime();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) '4');
        ds.Item item83 = fPHeapMax82.max();
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax(0);
        fPHeapMax85.imprime();
        ds.Item[] itemArray87 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray87);
        fPHeapMax85.constroi();
        fPHeapMax85.imprime();
        ds.Item[] itemArray91 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray91);
        fPHeapMax82.copia(itemArray91);
        fPHeapMax78.copia(itemArray91);
        fPHeapMax54.copia(itemArray91);
        fPHeapMax1.copia(itemArray91);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item97 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item83);
        org.junit.Assert.assertNotNull(itemArray87);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '4');
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax3.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(0);
        fPHeapMax48.imprime();
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax55.constroi();
        fPHeapMax55.constroi();
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax(0);
        fPHeapMax60.imprime();
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax(0);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax60.copia(itemArray66);
        fPHeapMax55.copia(itemArray66);
        fPHeapMax48.copia(itemArray66);
        fPHeapMax1.copia(itemArray66);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item72 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.Item item8 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray13);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        fPHeapMax23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax10.copia(itemArray25);
        fPHeapMax5.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        fPHeapMax1.imprime();
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
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
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
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
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(1);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        fPHeapMax25.imprime();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(0);
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = fPHeapMax37.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax(0);
        fPHeapMax42.imprime();
        fPHeapMax42.constroi();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) '4');
        ds.Item item48 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        fPHeapMax50.imprime();
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray56);
        fPHeapMax47.copia(itemArray56);
        fPHeapMax42.copia(itemArray56);
        fPHeapMax40.copia(itemArray56);
        fPHeapMax37.copia(itemArray56);
        fPHeapMax34.copia(itemArray56);
        fPHeapMax25.copia(itemArray56);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax65.constroi();
        fPHeapMax65.imprime();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray68);
        fPHeapMax25.copia(itemArray68);
        fPHeapMax21.copia(itemArray68);
        fPHeapMax1.copia(itemArray68);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax6.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '4');
        ds.Item item21 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        fPHeapMax23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray25);
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax20.copia(itemArray29);
        fPHeapMax16.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '4');
        ds.Item item10 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '4');
        ds.Item item20 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray39);
        fPHeapMax30.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) '4');
        ds.Item item50 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        fPHeapMax52.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray54);
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray58);
        fPHeapMax49.copia(itemArray58);
        fPHeapMax44.copia(itemArray58);
        fPHeapMax23.copia(itemArray58);
        fPHeapMax19.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item65 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax24.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.Item item28 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax22.copia(itemArray36);
        fPHeapMax20.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax5.copia(itemArray36);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray48);
        fPHeapMax5.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '4');
        ds.Item item20 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax14.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax6.copia(itemArray28);
        java.lang.Class<?> wildcardClass35 = fPHeapMax6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax15.copia(itemArray21);
        fPHeapMax7.copia(itemArray21);
        fPHeapMax4.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax14.imprime();
        java.lang.Class<?> wildcardClass27 = fPHeapMax14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax33.copia(itemArray47);
        fPHeapMax12.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(0);
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax54.copia(itemArray60);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax(0);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax69.constroi();
        fPHeapMax69.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax54.copia(itemArray72);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax(1);
        fPHeapMax78.constroi();
        fPHeapMax78.imprime();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) '4');
        ds.Item item83 = fPHeapMax82.max();
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax(0);
        fPHeapMax85.imprime();
        ds.Item[] itemArray87 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray87);
        fPHeapMax85.constroi();
        fPHeapMax85.imprime();
        ds.Item[] itemArray91 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray91);
        fPHeapMax82.copia(itemArray91);
        fPHeapMax78.copia(itemArray91);
        fPHeapMax54.copia(itemArray91);
        fPHeapMax1.copia(itemArray91);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item83);
        org.junit.Assert.assertNotNull(itemArray87);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item25 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax3.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz((int) '4', (int) 'a');
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.Item item7 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '4');
        ds.Item item25 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(1);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax34.copia(itemArray47);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray55);
        fPHeapMax34.copia(itemArray55);
        fPHeapMax24.copia(itemArray55);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) itemArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax10.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '4');
        ds.Item item10 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass24 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax20.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax10.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(0);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax24.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(0);
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax36.copia(itemArray42);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(0);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax51.constroi();
        fPHeapMax51.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax51.copia(itemArray54);
        fPHeapMax45.copia(itemArray54);
        fPHeapMax36.copia(itemArray54);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(0);
        fPHeapMax59.imprime();
        fPHeapMax59.constroi();
        fPHeapMax59.imprime();
        fPHeapMax59.constroi();
        fPHeapMax59.imprime();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax(1);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) '4');
        ds.Item item71 = fPHeapMax70.max();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax(0);
        fPHeapMax73.imprime();
        ds.Item[] itemArray75 = new ds.Item[] {};
        fPHeapMax73.copia(itemArray75);
        fPHeapMax73.constroi();
        fPHeapMax73.imprime();
        ds.Item[] itemArray79 = new ds.Item[] {};
        fPHeapMax73.copia(itemArray79);
        fPHeapMax70.copia(itemArray79);
        fPHeapMax66.copia(itemArray79);
        fPHeapMax59.copia(itemArray79);
        fPHeapMax36.copia(itemArray79);
        fPHeapMax22.copia(itemArray79);
        fPHeapMax8.copia(itemArray79);
        fPHeapMax1.copia(itemArray79);
        java.lang.Class<?> wildcardClass88 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item71);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray24);
        fPHeapMax15.copia(itemArray24);
        fPHeapMax8.copia(itemArray24);
        fPHeapMax8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(0);
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        fPHeapMax44.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray50);
        fPHeapMax23.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item54 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
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
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(0);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax35.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        fPHeapMax25.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        java.lang.Class<?> wildcardClass10 = itemArray7.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax20.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '4');
        ds.Item item10 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        fPHeapMax1.imprime();
        ds.Item item23 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax4.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax4.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
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
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
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
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax15.copia(itemArray21);
        fPHeapMax7.copia(itemArray21);
        fPHeapMax4.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        java.lang.Class<?> wildcardClass27 = itemArray21.getClass();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '4');
        ds.Item item18 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(0);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray37);
        fPHeapMax28.copia(itemArray37);
        fPHeapMax21.copia(itemArray37);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax(0);
        fPHeapMax42.imprime();
        fPHeapMax42.constroi();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) '4');
        ds.Item item48 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        fPHeapMax50.imprime();
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray56);
        fPHeapMax47.copia(itemArray56);
        fPHeapMax42.copia(itemArray56);
        fPHeapMax21.copia(itemArray56);
        fPHeapMax17.copia(itemArray56);
        fPHeapMax3.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        ds.Item item64 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item64);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', 0);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax9.copia(itemArray15);
        fPHeapMax4.copia(itemArray15);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        fPHeapMax23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax4.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        fPHeapMax1.refaz((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax15.copia(itemArray21);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax15.copia(itemArray33);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(1);
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) '4');
        ds.Item item50 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        fPHeapMax52.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray54);
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray58);
        fPHeapMax49.copia(itemArray58);
        fPHeapMax45.copia(itemArray58);
        fPHeapMax38.copia(itemArray58);
        fPHeapMax15.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        java.lang.Class<?> wildcardClass65 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '4');
        ds.Item item10 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax4.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item23 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '4');
        ds.Item item36 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray44);
        fPHeapMax35.copia(itemArray44);
        fPHeapMax30.copia(itemArray44);
        fPHeapMax28.copia(itemArray44);
        fPHeapMax25.copia(itemArray44);
        fPHeapMax25.refaz((int) (byte) 100, 10);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(0);
        fPHeapMax54.imprime();
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax(0);
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item67 = fPHeapMax66.max();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax(0);
        fPHeapMax71.imprime();
        fPHeapMax71.constroi();
        fPHeapMax71.imprime();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) '4');
        ds.Item item77 = fPHeapMax76.max();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax(0);
        fPHeapMax79.imprime();
        ds.Item[] itemArray81 = new ds.Item[] {};
        fPHeapMax79.copia(itemArray81);
        fPHeapMax79.constroi();
        fPHeapMax79.imprime();
        ds.Item[] itemArray85 = new ds.Item[] {};
        fPHeapMax79.copia(itemArray85);
        fPHeapMax76.copia(itemArray85);
        fPHeapMax71.copia(itemArray85);
        fPHeapMax69.copia(itemArray85);
        fPHeapMax66.copia(itemArray85);
        fPHeapMax63.copia(itemArray85);
        fPHeapMax54.copia(itemArray85);
        fPHeapMax25.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item67);
        org.junit.Assert.assertNull(item77);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray85);
    }
}

