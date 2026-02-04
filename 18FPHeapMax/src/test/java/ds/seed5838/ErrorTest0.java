package ds.seed5838;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) 100L);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) '#');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) (short) -1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) 100.0d);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax7.refaz((int) (short) 10, (int) (short) 10);
        fPHeapMax7.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax5.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMax5.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) ' ');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = fPHeapMax3.max();
        ds.Item item5 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax3.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) wildcardClass17);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        ds.Item item7 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.Item item15 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray20);
        fPHeapMax13.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax9.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) ' ');
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray13);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray21);
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = fPHeapMax30.max();
        ds.Item item32 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray37);
        fPHeapMax30.copia(itemArray37);
        fPHeapMax28.copia(itemArray37);
        fPHeapMax26.copia(itemArray37);
        fPHeapMax18.copia(itemArray37);
        fPHeapMax10.copia(itemArray37);
        fPHeapMax10.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = fPHeapMax20.max();
        ds.Item item22 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray27);
        fPHeapMax20.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) itemArray27);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) 1L);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 10, 10);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        fPHeapMax6.imprime();
        ds.Item item9 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = fPHeapMax11.max();
        ds.Item item13 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        fPHeapMax6.copia(itemArray18);
        fPHeapMax4.copia(itemArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = fPHeapMax12.max();
        ds.Item item14 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax12.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) itemArray19);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = fPHeapMax23.max();
        ds.Item item25 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax27.imprime();
        fPHeapMax27.constroi();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray30);
        fPHeapMax23.copia(itemArray30);
        fPHeapMax21.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax9.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.imprime();
        fPHeapMax26.refaz(100, (int) (short) 0);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray37);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = fPHeapMax46.max();
        ds.Item item48 = fPHeapMax46.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax50.imprime();
        fPHeapMax50.constroi();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray53);
        fPHeapMax46.copia(itemArray53);
        fPHeapMax44.copia(itemArray53);
        fPHeapMax42.copia(itemArray53);
        fPHeapMax34.copia(itemArray53);
        fPHeapMax26.copia(itemArray53);
        fPHeapMax23.copia(itemArray53);
        fPHeapMax9.copia(itemArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray53);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        fPHeapMax15.imprime();
        ds.Item item18 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = fPHeapMax20.max();
        ds.Item item22 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray27);
        fPHeapMax20.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        fPHeapMax13.copia(itemArray27);
        fPHeapMax11.copia(itemArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax11);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.Item item5 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) 10.0d);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = fPHeapMax19.max();
        ds.Item item21 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray26);
        fPHeapMax19.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        fPHeapMax34.imprime();
        fPHeapMax34.imprime();
        ds.Item item37 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = fPHeapMax39.max();
        ds.Item item41 = fPHeapMax39.max();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax43.imprime();
        fPHeapMax43.constroi();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray46);
        fPHeapMax39.copia(itemArray46);
        fPHeapMax34.copia(itemArray46);
        fPHeapMax32.copia(itemArray46);
        fPHeapMax32.constroi();
        fPHeapMax32.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax32);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax4.copia(itemArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray15);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.Item item6 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = fPHeapMax12.max();
        ds.Item item14 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax12.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax3.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.imprime();
        fPHeapMax28.refaz(100, (int) (short) 0);
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray39);
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = fPHeapMax48.max();
        ds.Item item50 = fPHeapMax48.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray55);
        fPHeapMax48.copia(itemArray55);
        fPHeapMax46.copia(itemArray55);
        fPHeapMax44.copia(itemArray55);
        fPHeapMax36.copia(itemArray55);
        fPHeapMax28.copia(itemArray55);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax63.imprime();
        fPHeapMax63.refaz(100, (int) (short) 0);
        fPHeapMax63.constroi();
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax71.imprime();
        fPHeapMax71.constroi();
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMax71.copia(itemArray74);
        fPHeapMax71.constroi();
        fPHeapMax71.imprime();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item84 = fPHeapMax83.max();
        ds.Item item85 = fPHeapMax83.max();
        ds.FPHeapMax fPHeapMax87 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax87.imprime();
        fPHeapMax87.constroi();
        ds.Item[] itemArray90 = new ds.Item[] {};
        fPHeapMax87.copia(itemArray90);
        fPHeapMax83.copia(itemArray90);
        fPHeapMax81.copia(itemArray90);
        fPHeapMax79.copia(itemArray90);
        fPHeapMax71.copia(itemArray90);
        fPHeapMax63.copia(itemArray90);
        fPHeapMax28.copia(itemArray90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) itemArray90);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 10, 10);
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 10, (int) 'a');
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = fPHeapMax3.max();
        ds.Item item5 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax3.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        fPHeapMax18.imprime();
        ds.Item item21 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = fPHeapMax27.max();
        ds.Item item29 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray34);
        fPHeapMax27.copia(itemArray34);
        fPHeapMax25.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax18.copia(itemArray34);
        java.lang.Class<?> wildcardClass40 = fPHeapMax18.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax18);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray9);
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = fPHeapMax26.max();
        ds.Item item28 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray33);
        fPHeapMax26.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax22.copia(itemArray33);
        fPHeapMax14.copia(itemArray33);
        fPHeapMax6.copia(itemArray33);
        fPHeapMax6.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, 10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) ' ');
        fPHeapMax1.refaz((int) '4', 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) '#');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = fPHeapMax12.max();
        ds.Item item14 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax12.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax6.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = fPHeapMax28.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) wildcardClass29);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = fPHeapMax23.max();
        ds.Item item25 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax27.imprime();
        fPHeapMax27.constroi();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray30);
        fPHeapMax23.copia(itemArray30);
        fPHeapMax21.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) ' ');
        ds.Item item38 = fPHeapMax37.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = fPHeapMax40.max();
        ds.Item item42 = fPHeapMax40.max();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax40.copia(itemArray47);
        fPHeapMax37.copia(itemArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) itemArray47);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax21.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.imprime();
        fPHeapMax36.refaz(100, (int) (short) 0);
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = fPHeapMax56.max();
        ds.Item item58 = fPHeapMax56.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax60.imprime();
        fPHeapMax60.constroi();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray63);
        fPHeapMax56.copia(itemArray63);
        fPHeapMax54.copia(itemArray63);
        fPHeapMax52.copia(itemArray63);
        fPHeapMax44.copia(itemArray63);
        fPHeapMax36.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) 'a');
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 10, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) 'a', (int) (short) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.imprime();
        fPHeapMax8.refaz(100, (int) (short) 0);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = fPHeapMax28.max();
        ds.Item item30 = fPHeapMax28.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax28.copia(itemArray35);
        fPHeapMax26.copia(itemArray35);
        fPHeapMax24.copia(itemArray35);
        fPHeapMax16.copia(itemArray35);
        fPHeapMax8.copia(itemArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray35);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 10, (int) '4');
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray8);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = fPHeapMax25.max();
        ds.Item item27 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray32);
        fPHeapMax25.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax21.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax5.copia(itemArray32);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax42.imprime();
        fPHeapMax42.constroi();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax42.copia(itemArray45);
        fPHeapMax5.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) '#');
        fPHeapMax51.constroi();
        fPHeapMax51.imprime();
        fPHeapMax51.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax51);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax6.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(10, (int) 'a');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) ' ');
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        fPHeapMax13.refaz(100, (int) (short) 0);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray24);
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = fPHeapMax33.max();
        ds.Item item35 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray40);
        fPHeapMax33.copia(itemArray40);
        fPHeapMax31.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax21.copia(itemArray40);
        fPHeapMax13.copia(itemArray40);
        fPHeapMax10.copia(itemArray40);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) '#');
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.Item item53 = fPHeapMax50.max();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = fPHeapMax61.max();
        ds.Item item63 = fPHeapMax61.max();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax65.imprime();
        fPHeapMax65.constroi();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray68);
        fPHeapMax61.copia(itemArray68);
        fPHeapMax59.copia(itemArray68);
        fPHeapMax57.copia(itemArray68);
        fPHeapMax55.copia(itemArray68);
        fPHeapMax50.copia(itemArray68);
        fPHeapMax10.copia(itemArray68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item8 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax3.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item23 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 1, (int) '4');
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        ds.Item item13 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = fPHeapMax15.max();
        ds.Item item17 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax15.copia(itemArray22);
        fPHeapMax10.copia(itemArray22);
        fPHeapMax8.copia(itemArray22);
        fPHeapMax6.copia(itemArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax6);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = fPHeapMax3.max();
        ds.Item item5 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax3.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item16 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.imprime();
        fPHeapMax36.refaz(100, (int) (short) 0);
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = fPHeapMax56.max();
        ds.Item item58 = fPHeapMax56.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax60.imprime();
        fPHeapMax60.constroi();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray63);
        fPHeapMax56.copia(itemArray63);
        fPHeapMax54.copia(itemArray63);
        fPHeapMax52.copia(itemArray63);
        fPHeapMax44.copia(itemArray63);
        fPHeapMax36.copia(itemArray63);
        fPHeapMax33.copia(itemArray63);
        fPHeapMax19.copia(itemArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax19);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) '#');
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) 'a', (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.imprime();
        fPHeapMax4.refaz(100, (int) (short) 0);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = fPHeapMax24.max();
        ds.Item item26 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray31);
        fPHeapMax24.copia(itemArray31);
        fPHeapMax22.copia(itemArray31);
        fPHeapMax20.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax4.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) (short) 0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        fPHeapMax24.refaz((int) 'a', (int) (short) -1);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray34);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax39.imprime();
        fPHeapMax39.constroi();
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray42);
        fPHeapMax39.constroi();
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = fPHeapMax51.max();
        ds.Item item53 = fPHeapMax51.max();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax55.imprime();
        fPHeapMax55.constroi();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray58);
        fPHeapMax51.copia(itemArray58);
        fPHeapMax49.copia(itemArray58);
        fPHeapMax47.copia(itemArray58);
        fPHeapMax39.copia(itemArray58);
        fPHeapMax31.copia(itemArray58);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax68.imprime();
        fPHeapMax68.constroi();
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax68.copia(itemArray71);
        fPHeapMax31.copia(itemArray71);
        fPHeapMax24.copia(itemArray71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) itemArray71);
    }
}

