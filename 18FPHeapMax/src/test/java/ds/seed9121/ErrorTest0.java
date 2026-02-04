package ds.seed9121;

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
        fPHeapMax1.refaz((int) (byte) 0, (int) '4');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 1, (int) 'a');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 100.0f);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax10.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) itemArray18);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) (byte) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) (short) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax14.constroi();
        ds.Item item16 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax14);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(100);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) itemArray9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz((int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass18 = fPHeapMax10.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax24);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) '4');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) 0.0f);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(100);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        java.lang.Class<?> wildcardClass9 = itemArray7.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax23);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 1, (int) ' ');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        java.lang.Class<?> wildcardClass22 = fPHeapMax17.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax17);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax25.constroi();
        ds.Item item27 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax25);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax38);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax22.copia(itemArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray32);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) 'a');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) (byte) 10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) (short) 10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.Item item9 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) (short) 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax36.constroi();
        ds.Item item38 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax36);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) (byte) 100);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(100);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax10.imprime();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        java.lang.Class<?> wildcardClass16 = fPHeapMax10.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 1, 10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.refaz(10, (int) (byte) 1);
        fPHeapMax9.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax9);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax11);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.refaz((int) (short) 1, 0);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax27.constroi();
        ds.Item item29 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.Item item31 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray33);
        fPHeapMax27.constroi();
        ds.Item item36 = fPHeapMax27.max();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray37);
        fPHeapMax25.copia(itemArray37);
        fPHeapMax19.copia(itemArray37);
        ds.Item item41 = fPHeapMax19.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax19);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(100);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        fPHeapMax30.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax53);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray13);
        fPHeapMax7.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax7.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 1, (int) 'a');
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) ' ');
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        fPHeapMax4.copia(itemArray14);
        ds.Item item18 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) (short) 100, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax24.constroi();
        ds.Item item26 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        fPHeapMax24.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(100);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax4.copia(itemArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) itemArray33);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) (-1L));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax20.constroi();
        ds.Item item22 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.Item item24 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray26);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(100);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray31);
        fPHeapMax20.copia(itemArray31);
        fPHeapMax17.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) itemArray31);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) '#', 100);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(100);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        fPHeapMax12.copia(itemArray17);
        fPHeapMax12.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax12);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax4.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax4.copia(itemArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax6.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 100);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, 10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(100);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax26.copia(itemArray37);
        fPHeapMax22.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax44.constroi();
        ds.Item item46 = fPHeapMax44.max();
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.Item item49 = fPHeapMax44.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax44);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax13.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax13);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, 100);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) 'a');
        fPHeapMax25.imprime();
        fPHeapMax25.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax25);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax12.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax12);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax25);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        ds.Item item21 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item23 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) ' ');
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 0);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (-1));
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) (byte) 100);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax8.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(100);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax20.constroi();
        ds.Item item22 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.Item item24 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray26);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(100);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray31);
        fPHeapMax20.copia(itemArray31);
        fPHeapMax16.copia(itemArray31);
        fPHeapMax8.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, 0);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 10);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) 'a');
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 10);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        ds.Item item16 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray25);
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(100);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax33.copia(itemArray44);
        fPHeapMax30.copia(itemArray44);
        fPHeapMax19.copia(itemArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax19);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) 'a');
        fPHeapMax13.imprime();
        java.lang.Class<?> wildcardClass15 = fPHeapMax13.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass15);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) ' ');
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 100);
    }
}

