package ds.seed5831;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) (byte) 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray4);
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) ' ', (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 10, (int) '4');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) '#', (int) 'a');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) "hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray8);
        fPHeapMax7.constroi();
        fPHeapMax7.refaz((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass14 = fPHeapMax7.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) wildcardClass14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) ' ', (int) '4');
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray8);
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray4);
        fPHeapMax1.copia(itemArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) (byte) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 10.0f);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax5.refaz(0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray4);
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(10, (int) ' ');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray4);
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 1, (int) '#');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax5.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) ' ', (int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax6.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(100);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        java.lang.Class<?> wildcardClass19 = fPHeapMax16.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) wildcardClass19);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray4);
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray4);
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray4);
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax16.copia(itemArray19);
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 10, (int) '#');
    }
}

