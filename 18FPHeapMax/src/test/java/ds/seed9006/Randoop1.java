package ds.seed9006;

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
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax12.constroi();
        fPHeapMax12.constroi();
        ds.Item item15 = fPHeapMax12.max();
        ds.Item item16 = fPHeapMax12.max();
        ds.Item item17 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax12.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
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
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax27.constroi();
        ds.Item item29 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.Item item31 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '4');
        ds.Item item35 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax40.copia(itemArray44);
        fPHeapMax38.copia(itemArray44);
        fPHeapMax34.copia(itemArray44);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax50.copia(itemArray57);
        fPHeapMax34.copia(itemArray57);
        fPHeapMax27.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.Item item9 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax14.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax26.copia(itemArray33);
        fPHeapMax10.copia(itemArray33);
        fPHeapMax4.copia(itemArray33);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax41.constroi();
        ds.Item item43 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax41.copia(itemArray50);
        fPHeapMax4.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        fPHeapMax1.refaz((int) ' ', (int) (short) 10);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax10.copia(itemArray16);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax20.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax30.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax27.constroi();
        ds.Item item29 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.Item item31 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '4');
        ds.Item item35 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax40.copia(itemArray44);
        fPHeapMax38.copia(itemArray44);
        fPHeapMax34.copia(itemArray44);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax50.copia(itemArray57);
        fPHeapMax34.copia(itemArray57);
        fPHeapMax27.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        java.lang.Class<?> wildcardClass64 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax3.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', 1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax21.copia(itemArray27);
        fPHeapMax8.copia(itemArray27);
        fPHeapMax6.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        java.lang.Class<?> wildcardClass32 = itemArray27.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        ds.Item item10 = fPHeapMax6.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax6.copia(itemArray12);
        fPHeapMax6.constroi();
        ds.Item item15 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax6.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax14.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax24.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.Item item36 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax9.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '4');
        fPHeapMax28.refaz(1, (-1));
        fPHeapMax28.constroi();
        java.lang.Class<?> wildcardClass33 = fPHeapMax28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax15.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        ds.Item item32 = fPHeapMax28.max();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax28.copia(itemArray34);
        fPHeapMax15.copia(itemArray34);
        fPHeapMax13.copia(itemArray34);
        fPHeapMax8.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) '4');
        ds.Item item44 = fPHeapMax43.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item44);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.refaz(1, (int) (short) 1);
        fPHeapMax1.refaz((int) (byte) 10, 10);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass15 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item26 = fPHeapMax1.max();
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item26);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax16.copia(itemArray27);
        fPHeapMax10.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        java.lang.Class<?> wildcardClass33 = itemArray27.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.refaz((int) ' ', (-1));
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax21.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax23.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.Item item36 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax10.copia(itemArray16);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax20.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax30.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        fPHeapMax1.imprime();
        ds.Item item41 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        fPHeapMax12.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item24 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(100, 10);
        ds.Item item29 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        fPHeapMax21.refaz((int) (byte) 0, (int) (short) -1);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax31.constroi();
        ds.Item item33 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax44.copia(itemArray48);
        fPHeapMax42.copia(itemArray48);
        fPHeapMax38.copia(itemArray48);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(0);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax54.copia(itemArray61);
        fPHeapMax38.copia(itemArray61);
        fPHeapMax31.copia(itemArray61);
        fPHeapMax21.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (-1));
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(0);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax27.copia(itemArray34);
        fPHeapMax13.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
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
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
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
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax3.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.refaz(10, 1);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) 'a');
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        ds.Item item13 = fPHeapMax9.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        fPHeapMax9.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax29.copia(itemArray34);
        fPHeapMax9.copia(itemArray34);
        fPHeapMax5.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item21 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        ds.Item item26 = fPHeapMax22.max();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax22.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        java.lang.Class<?> wildcardClass32 = itemArray28.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax3.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax11.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax21.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item30 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.refaz((int) (short) 10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax15.copia(itemArray21);
        fPHeapMax5.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.refaz((int) (short) 100, (int) (short) -1);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.imprime();
        ds.Item item20 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax22.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax15.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax12.copia(itemArray18);
        fPHeapMax12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 100, (-1));
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
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.imprime();
        ds.Item item8 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) -1);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) 10);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        ds.Item item26 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        fPHeapMax22.refaz((int) (short) 10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax34.copia(itemArray38);
        fPHeapMax32.copia(itemArray38);
        fPHeapMax22.copia(itemArray38);
        fPHeapMax1.copia(itemArray38);
        fPHeapMax1.imprime();
        ds.Item item45 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax10.copia(itemArray16);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax20.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax30.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '#', (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax18.copia(itemArray24);
        fPHeapMax5.copia(itemArray24);
        fPHeapMax3.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(1);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.imprime();
        ds.Item item11 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (-1));
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax23.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.Item item36 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (-1));
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax11.copia(itemArray17);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax21.copia(itemArray27);
        fPHeapMax11.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax31.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax11.copia(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
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
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        ds.Item item14 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax5.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '4');
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax25.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax40.copia(itemArray44);
        fPHeapMax37.copia(itemArray44);
        fPHeapMax21.copia(itemArray44);
        fPHeapMax15.copia(itemArray44);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax52.constroi();
        ds.Item item54 = fPHeapMax52.max();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax52.copia(itemArray61);
        fPHeapMax15.copia(itemArray61);
        fPHeapMax12.copia(itemArray61);
        ds.Item item66 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        ds.Item item72 = fPHeapMax68.max();
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax68.copia(itemArray74);
        fPHeapMax68.constroi();
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        fPHeapMax80.copia(itemArray82);
        fPHeapMax78.copia(itemArray82);
        fPHeapMax68.copia(itemArray82);
        fPHeapMax12.copia(itemArray82);
        fPHeapMax1.copia(itemArray82);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray82);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.imprime();
        ds.Item item12 = fPHeapMax7.max();
        ds.Item item13 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '4');
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax25.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax40.copia(itemArray44);
        fPHeapMax37.copia(itemArray44);
        fPHeapMax21.copia(itemArray44);
        fPHeapMax15.copia(itemArray44);
        fPHeapMax7.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        fPHeapMax20.constroi();
        java.lang.Class<?> wildcardClass22 = fPHeapMax20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax17.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax3.copia(itemArray16);
        fPHeapMax3.constroi();
        fPHeapMax3.refaz((int) ' ', (int) (byte) 10);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        fPHeapMax24.refaz((int) (short) 10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax36.copia(itemArray40);
        fPHeapMax34.copia(itemArray40);
        fPHeapMax24.copia(itemArray40);
        fPHeapMax3.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax11.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax21.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        ds.Item item42 = fPHeapMax38.max();
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax38.copia(itemArray44);
        fPHeapMax38.constroi();
        ds.Item item47 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax38.copia(itemArray51);
        fPHeapMax38.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item26 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass28 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) 'a');
        ds.Item item20 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax23.copia(itemArray29);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        ds.Item item37 = fPHeapMax33.max();
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax33.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax43.copia(itemArray48);
        fPHeapMax23.copia(itemArray48);
        fPHeapMax19.copia(itemArray48);
        fPHeapMax15.copia(itemArray48);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax57.constroi();
        ds.Item item59 = fPHeapMax57.max();
        fPHeapMax57.constroi();
        fPHeapMax57.imprime();
        fPHeapMax57.imprime();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax57.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        ds.Item item74 = fPHeapMax70.max();
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax70.copia(itemArray76);
        fPHeapMax57.copia(itemArray76);
        fPHeapMax55.copia(itemArray76);
        fPHeapMax15.copia(itemArray76);
        fPHeapMax1.copia(itemArray76);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNotNull(itemArray76);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 100, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax1.copia(itemArray8);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.Item item22 = fPHeapMax19.max();
        ds.Item item23 = fPHeapMax19.max();
        ds.Item item24 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax26.copia(itemArray33);
        fPHeapMax19.copia(itemArray33);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax39.imprime();
        fPHeapMax39.constroi();
        fPHeapMax39.imprime();
        fPHeapMax39.refaz((int) (byte) 0, (int) (short) -1);
        fPHeapMax39.imprime();
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax49.constroi();
        ds.Item item51 = fPHeapMax49.max();
        fPHeapMax49.constroi();
        ds.Item item53 = fPHeapMax49.max();
        fPHeapMax49.imprime();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) '4');
        ds.Item item57 = fPHeapMax56.max();
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax62.copia(itemArray66);
        fPHeapMax60.copia(itemArray66);
        fPHeapMax56.copia(itemArray66);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax(0);
        fPHeapMax72.constroi();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        fPHeapMax77.copia(itemArray79);
        fPHeapMax75.copia(itemArray79);
        fPHeapMax72.copia(itemArray79);
        fPHeapMax56.copia(itemArray79);
        fPHeapMax49.copia(itemArray79);
        fPHeapMax39.copia(itemArray79);
        fPHeapMax19.copia(itemArray79);
        fPHeapMax13.copia(itemArray79);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) (byte) 1);
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '4');
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax19.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax40.copia(itemArray45);
        fPHeapMax31.copia(itemArray45);
        fPHeapMax15.copia(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.constroi();
        ds.Item item18 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(100);
        fPHeapMax21.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 100, (-1));
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.refaz(1, (int) (short) 1);
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.refaz(1, (-1));
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 0, (int) (short) -1);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax26.copia(itemArray31);
        fPHeapMax17.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) 'a');
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        ds.Item item13 = fPHeapMax9.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        fPHeapMax9.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax29.copia(itemArray34);
        fPHeapMax9.copia(itemArray34);
        fPHeapMax5.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.imprime();
        ds.Item item46 = fPHeapMax41.max();
        ds.Item item47 = fPHeapMax41.max();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax49.constroi();
        ds.Item item51 = fPHeapMax49.max();
        fPHeapMax49.constroi();
        fPHeapMax49.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) '4');
        ds.Item item56 = fPHeapMax55.max();
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax61.copia(itemArray65);
        fPHeapMax59.copia(itemArray65);
        fPHeapMax55.copia(itemArray65);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax(0);
        fPHeapMax71.constroi();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax74.copia(itemArray78);
        fPHeapMax71.copia(itemArray78);
        fPHeapMax55.copia(itemArray78);
        fPHeapMax49.copia(itemArray78);
        fPHeapMax41.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax11.copia(itemArray17);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax11.copia(itemArray25);
        ds.Item item29 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        fPHeapMax31.refaz((int) (short) 10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax43.copia(itemArray47);
        fPHeapMax41.copia(itemArray47);
        fPHeapMax31.copia(itemArray47);
        fPHeapMax11.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item54 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax11.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax21.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        ds.Item item34 = fPHeapMax31.max();
        ds.Item item35 = fPHeapMax31.max();
        ds.Item item36 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax38.copia(itemArray45);
        fPHeapMax31.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass55 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item26 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(100);
        fPHeapMax19.imprime();
        fPHeapMax19.imprime();
        ds.Item item22 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        ds.Item item28 = fPHeapMax24.max();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax24.copia(itemArray30);
        fPHeapMax24.constroi();
        ds.Item item33 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax24.copia(itemArray37);
        fPHeapMax19.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '4');
        ds.Item item18 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax21.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax36.copia(itemArray40);
        fPHeapMax33.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax48.constroi();
        ds.Item item50 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax48.copia(itemArray57);
        fPHeapMax11.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        ds.Item item68 = fPHeapMax64.max();
        ds.Item item69 = fPHeapMax64.max();
        fPHeapMax64.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNull(item69);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 10);
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 100, (-1));
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax20.copia(itemArray26);
        fPHeapMax7.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax33.copia(itemArray37);
        fPHeapMax30.copia(itemArray37);
        fPHeapMax7.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax10.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax30.constroi();
        ds.Item item32 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        fPHeapMax30.imprime();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        fPHeapMax37.copia(itemArray43);
        fPHeapMax30.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item49 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = item8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax14.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax26.copia(itemArray33);
        fPHeapMax10.copia(itemArray33);
        fPHeapMax4.copia(itemArray33);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax41.constroi();
        ds.Item item43 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax41.copia(itemArray50);
        fPHeapMax4.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
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
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item item15 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax18.copia(itemArray30);
        fPHeapMax12.copia(itemArray30);
        ds.Item item35 = fPHeapMax12.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) item35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
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
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item26 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item26);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax21.copia(itemArray26);
        fPHeapMax12.copia(itemArray26);
        java.lang.Class<?> wildcardClass30 = fPHeapMax12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.imprime();
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
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '4');
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax25.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax10.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax16.copia(itemArray21);
        fPHeapMax7.copia(itemArray21);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        ds.Item item31 = fPHeapMax27.max();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax27.copia(itemArray33);
        fPHeapMax7.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        fPHeapMax1.refaz((int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item15 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) 'a');
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        ds.Item item29 = fPHeapMax25.max();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax25.copia(itemArray31);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        ds.Item item39 = fPHeapMax35.max();
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax35.copia(itemArray41);
        fPHeapMax25.copia(itemArray41);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax45.copia(itemArray50);
        fPHeapMax25.copia(itemArray50);
        fPHeapMax21.copia(itemArray50);
        fPHeapMax17.copia(itemArray50);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax59.constroi();
        ds.Item item61 = fPHeapMax59.max();
        fPHeapMax59.constroi();
        fPHeapMax59.imprime();
        fPHeapMax59.imprime();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax59.copia(itemArray68);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        ds.Item item76 = fPHeapMax72.max();
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax72.copia(itemArray78);
        fPHeapMax59.copia(itemArray78);
        fPHeapMax57.copia(itemArray78);
        fPHeapMax17.copia(itemArray78);
        fPHeapMax9.copia(itemArray78);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax16.copia(itemArray27);
        fPHeapMax10.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax35.refaz(1, (int) (short) 1);
        fPHeapMax35.refaz((int) (byte) 10, 10);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax49.copia(itemArray53);
        fPHeapMax49.constroi();
        fPHeapMax49.constroi();
        fPHeapMax49.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) '4');
        ds.Item item61 = fPHeapMax60.max();
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax66.copia(itemArray70);
        fPHeapMax64.copia(itemArray70);
        fPHeapMax60.copia(itemArray70);
        fPHeapMax49.copia(itemArray70);
        fPHeapMax35.copia(itemArray70);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 100, (-1));
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax11.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax21.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        ds.Item item34 = fPHeapMax31.max();
        ds.Item item35 = fPHeapMax31.max();
        ds.Item item36 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax38.copia(itemArray45);
        fPHeapMax31.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax17.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.refaz((int) ' ', (-1));
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '#', 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '4');
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax19.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(0);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax34.copia(itemArray38);
        fPHeapMax31.copia(itemArray38);
        fPHeapMax15.copia(itemArray38);
        fPHeapMax9.copia(itemArray38);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax46.constroi();
        ds.Item item48 = fPHeapMax46.max();
        fPHeapMax46.constroi();
        fPHeapMax46.imprime();
        fPHeapMax46.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax46.copia(itemArray55);
        fPHeapMax9.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass61 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        ds.Item item29 = fPHeapMax25.max();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax25.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax10.copia(itemArray31);
        fPHeapMax5.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax16.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(0);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax28.copia(itemArray35);
        fPHeapMax12.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
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
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        ds.Item item29 = fPHeapMax25.max();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax25.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax10.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', 1);
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        fPHeapMax19.refaz((int) (byte) 0, (int) (short) -1);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax13.copia(itemArray19);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax23.copia(itemArray29);
        fPHeapMax13.copia(itemArray29);
        fPHeapMax10.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax10.refaz((int) 'a', 100);
        ds.Item item20 = fPHeapMax10.max();
        ds.Item item21 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        ds.Item item32 = fPHeapMax28.max();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax28.copia(itemArray34);
        fPHeapMax24.copia(itemArray34);
        fPHeapMax10.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.refaz((int) (short) 1, 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax10.copia(itemArray16);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax20.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax30.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        ds.Item item40 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax27.constroi();
        ds.Item item29 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.Item item31 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '4');
        ds.Item item35 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax40.copia(itemArray44);
        fPHeapMax38.copia(itemArray44);
        fPHeapMax34.copia(itemArray44);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax50.copia(itemArray57);
        fPHeapMax34.copia(itemArray57);
        fPHeapMax27.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.refaz(1, (int) (short) 1);
        fPHeapMax1.refaz((int) (byte) 10, 10);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(1);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax22.constroi();
        ds.Item item24 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax22.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) itemArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item18 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.refaz(100, (int) (byte) 10);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        fPHeapMax11.refaz((int) (byte) 0, (int) (short) -1);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax11.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (-1));
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.refaz((int) 'a', 100);
        ds.Item item11 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax7.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.Item item28 = fPHeapMax24.max();
        ds.Item item29 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax31.constroi();
        ds.Item item33 = fPHeapMax31.max();
        fPHeapMax31.refaz(1, (-1));
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax31.copia(itemArray42);
        fPHeapMax24.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax3.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item22 = fPHeapMax1.max();
        ds.Item item23 = fPHeapMax1.max();
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(100);
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        fPHeapMax31.refaz((int) (short) 10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax43.copia(itemArray47);
        fPHeapMax41.copia(itemArray47);
        fPHeapMax31.copia(itemArray47);
        fPHeapMax27.copia(itemArray47);
        fPHeapMax27.constroi();
        ds.Item item54 = fPHeapMax27.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) item54);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item54);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax6.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax26.copia(itemArray31);
        fPHeapMax17.copia(itemArray31);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        ds.Item item41 = fPHeapMax37.max();
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax37.copia(itemArray43);
        fPHeapMax17.copia(itemArray43);
        fPHeapMax6.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        ds.Item item13 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax15.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax15.copia(itemArray28);
        fPHeapMax11.copia(itemArray28);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax34.constroi();
        ds.Item item36 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        fPHeapMax34.imprime();
        fPHeapMax34.imprime();
        fPHeapMax34.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax45.imprime();
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        ds.Item item53 = fPHeapMax49.max();
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax49.copia(itemArray55);
        fPHeapMax45.copia(itemArray55);
        fPHeapMax34.copia(itemArray55);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax60.constroi();
        ds.Item item62 = fPHeapMax60.max();
        fPHeapMax60.constroi();
        ds.Item item64 = fPHeapMax60.max();
        fPHeapMax60.imprime();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) '4');
        ds.Item item68 = fPHeapMax67.max();
        fPHeapMax67.constroi();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax73.copia(itemArray77);
        fPHeapMax71.copia(itemArray77);
        fPHeapMax67.copia(itemArray77);
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax(0);
        fPHeapMax83.constroi();
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax88 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item89 = null;
        ds.Item[] itemArray90 = new ds.Item[] { item89 };
        fPHeapMax88.copia(itemArray90);
        fPHeapMax86.copia(itemArray90);
        fPHeapMax83.copia(itemArray90);
        fPHeapMax67.copia(itemArray90);
        fPHeapMax60.copia(itemArray90);
        fPHeapMax34.copia(itemArray90);
        fPHeapMax11.copia(itemArray90);
        fPHeapMax1.copia(itemArray90);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        fPHeapMax3.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item26 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item28 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz((int) (short) 10, (int) (short) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '4');
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax25.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax10.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        java.lang.Class<?> wildcardClass38 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.imprime();
        ds.Item item8 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 100, (-1));
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        ds.Item item12 = fPHeapMax8.max();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax8.copia(itemArray14);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax8.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 1);
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        fPHeapMax21.refaz((int) (byte) 0, (int) (short) -1);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax31.constroi();
        ds.Item item33 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax44.copia(itemArray48);
        fPHeapMax42.copia(itemArray48);
        fPHeapMax38.copia(itemArray48);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(0);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax54.copia(itemArray61);
        fPHeapMax38.copia(itemArray61);
        fPHeapMax31.copia(itemArray61);
        fPHeapMax21.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
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
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) (byte) 1);
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = item12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax11.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax21.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        ds.Item item34 = fPHeapMax31.max();
        ds.Item item35 = fPHeapMax31.max();
        ds.Item item36 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax38.copia(itemArray45);
        fPHeapMax31.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        java.lang.Class<?> wildcardClass51 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.refaz(1, (int) (short) 0);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax34.copia(itemArray39);
        fPHeapMax25.copia(itemArray39);
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        ds.Item item49 = fPHeapMax45.max();
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax45.copia(itemArray51);
        fPHeapMax25.copia(itemArray51);
        fPHeapMax19.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray51);
    }
}

