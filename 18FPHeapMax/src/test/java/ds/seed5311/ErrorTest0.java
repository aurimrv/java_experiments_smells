package ds.seed5311;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) 10.0f);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) '#');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) ' ');
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) 10L);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 10, 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        java.lang.Class<?> wildcardClass19 = fPHeapMax16.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass19);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax20);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) 'a');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '4', (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(10, (int) '4');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) '#');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) (short) -1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(1);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
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
        fPHeapMax5.copia(itemArray18);
        ds.Item item22 = fPHeapMax5.max();
        ds.Item item23 = fPHeapMax5.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(1);
        fPHeapMax27.constroi();
        fPHeapMax27.imprime();
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
        fPHeapMax27.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(0);
        fPHeapMax48.imprime();
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) '4');
        ds.Item item54 = fPHeapMax53.max();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax(0);
        fPHeapMax56.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax56.copia(itemArray58);
        fPHeapMax56.constroi();
        fPHeapMax56.imprime();
        ds.Item[] itemArray62 = new ds.Item[] {};
        fPHeapMax56.copia(itemArray62);
        fPHeapMax53.copia(itemArray62);
        fPHeapMax48.copia(itemArray62);
        fPHeapMax46.copia(itemArray62);
        fPHeapMax20.copia(itemArray62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax20);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
        fPHeapMax17.imprime();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '4');
        ds.Item item27 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray35);
        fPHeapMax26.copia(itemArray35);
        fPHeapMax21.copia(itemArray35);
        fPHeapMax17.copia(itemArray35);
        fPHeapMax17.constroi();
        java.lang.Class<?> wildcardClass41 = fPHeapMax17.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) wildcardClass41);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMax8.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass12);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax(0);
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax(0);
        fPHeapMax47.imprime();
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(1);
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) '4');
        ds.Item item59 = fPHeapMax58.max();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax(0);
        fPHeapMax61.imprime();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax61.copia(itemArray63);
        fPHeapMax61.constroi();
        fPHeapMax61.imprime();
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMax61.copia(itemArray67);
        fPHeapMax58.copia(itemArray67);
        fPHeapMax54.copia(itemArray67);
        fPHeapMax47.copia(itemArray67);
        fPHeapMax42.copia(itemArray67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray67);
    }
}

