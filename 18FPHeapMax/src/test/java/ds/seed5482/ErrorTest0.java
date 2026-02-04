package ds.seed5482;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) ' ');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) 'a');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        fPHeapMax7.refaz(0, (int) (short) -1);
        ds.Item item11 = fPHeapMax7.max();
        ds.Item item12 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) ' ', (int) (short) 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) 'a');
        fPHeapMax8.refaz(0, (int) (short) -1);
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax15.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        fPHeapMax8.copia(itemArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(1);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) 'a');
        fPHeapMax14.refaz(0, (int) (short) -1);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        fPHeapMax21.copia(itemArray26);
        fPHeapMax14.copia(itemArray26);
        fPHeapMax11.copia(itemArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax11);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '4', (int) (short) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) '4');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) 'a');
        fPHeapMax4.refaz(0, (int) (short) -1);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax11.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) 'a');
        fPHeapMax10.refaz(0, (int) (short) -1);
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
        fPHeapMax10.copia(itemArray22);
        java.lang.Class<?> wildcardClass26 = itemArray22.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) itemArray22);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax4.copia(itemArray7);
        fPHeapMax4.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(100, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray8);
        fPHeapMax7.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) 'a');
        fPHeapMax4.refaz(0, (int) (short) -1);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax11.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(1);
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) 'a');
        fPHeapMax25.refaz(0, (int) (short) -1);
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax32.copia(itemArray37);
        fPHeapMax25.copia(itemArray37);
        fPHeapMax22.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        java.lang.Object obj3 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', obj3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 1L);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) 100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) 'a');
        fPHeapMax3.refaz(0, (int) (short) -1);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax3.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) 'a');
        fPHeapMax26.refaz(0, (int) (short) -1);
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) 'a');
        fPHeapMax37.refaz(0, (int) (short) -1);
        ds.Item item41 = fPHeapMax37.max();
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax37.copia(itemArray49);
        fPHeapMax35.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) '4');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) 'a');
        fPHeapMax8.refaz(0, (int) (short) -1);
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax15.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        fPHeapMax8.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax18.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray22);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) 'a');
        fPHeapMax28.refaz(0, (int) (short) -1);
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax35.copia(itemArray40);
        fPHeapMax28.copia(itemArray40);
        fPHeapMax26.copia(itemArray40);
        fPHeapMax18.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 100);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) '#');
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) ' ');
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) 'a');
        fPHeapMax3.refaz(0, (int) (short) -1);
        ds.Item item7 = fPHeapMax3.max();
        ds.Item item8 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.imprime();
        java.lang.Class<?> wildcardClass20 = fPHeapMax18.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax18);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) 'a');
        fPHeapMax5.refaz(0, (int) (short) -1);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        fPHeapMax12.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item22 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) 'a');
        fPHeapMax25.refaz(0, (int) (short) -1);
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) 'a');
        fPHeapMax36.refaz(0, (int) (short) -1);
        ds.Item item40 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray48);
        fPHeapMax43.copia(itemArray48);
        fPHeapMax36.copia(itemArray48);
        fPHeapMax34.copia(itemArray48);
        fPHeapMax25.copia(itemArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax25);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 0, (-1));
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        fPHeapMax5.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.imprime();
        java.lang.Class<?> wildcardClass8 = fPHeapMax6.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) wildcardClass8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item7 = fPHeapMax6.max();
        ds.Item item8 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) 'a');
        fPHeapMax10.refaz(0, (int) (short) -1);
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
        fPHeapMax10.copia(itemArray22);
        fPHeapMax6.copia(itemArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) itemArray22);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.Item item18 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 100);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax18.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray22);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) 'a');
        fPHeapMax28.refaz(0, (int) (short) -1);
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax35.copia(itemArray40);
        fPHeapMax28.copia(itemArray40);
        fPHeapMax26.copia(itemArray40);
        fPHeapMax18.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item47 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(1);
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) 'a');
        fPHeapMax53.refaz(0, (int) (short) -1);
        ds.Item item57 = fPHeapMax53.max();
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray61);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray65);
        fPHeapMax60.copia(itemArray65);
        fPHeapMax53.copia(itemArray65);
        fPHeapMax50.copia(itemArray65);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax(1);
        fPHeapMax71.imprime();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) 'a');
        fPHeapMax74.refaz(0, (int) (short) -1);
        ds.Item item78 = fPHeapMax74.max();
        fPHeapMax74.imprime();
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray82 = new ds.Item[] {};
        fPHeapMax81.copia(itemArray82);
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray86 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray86);
        fPHeapMax81.copia(itemArray86);
        fPHeapMax74.copia(itemArray86);
        fPHeapMax71.copia(itemArray86);
        fPHeapMax50.copia(itemArray86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) itemArray86);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 1, 100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(10, (int) ' ');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(1);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) 'a');
        fPHeapMax9.refaz(0, (int) (short) -1);
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax16.copia(itemArray21);
        fPHeapMax9.copia(itemArray21);
        fPHeapMax6.copia(itemArray21);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(1);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) 'a');
        fPHeapMax30.refaz(0, (int) (short) -1);
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray38);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray42);
        fPHeapMax37.copia(itemArray42);
        fPHeapMax30.copia(itemArray42);
        fPHeapMax27.copia(itemArray42);
        fPHeapMax6.copia(itemArray42);
        java.lang.Class<?> wildcardClass48 = itemArray42.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) wildcardClass48);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax4.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) 'a');
        fPHeapMax5.refaz(0, (int) (short) -1);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item item11 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) 1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) 'a');
        fPHeapMax5.refaz(0, (int) (short) -1);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        fPHeapMax12.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item22 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray30);
        fPHeapMax25.copia(itemArray30);
        fPHeapMax25.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax25);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) 'a');
        fPHeapMax3.refaz(0, (int) (short) -1);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax3.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) 'a');
        fPHeapMax26.refaz(0, (int) (short) -1);
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) 'a');
        fPHeapMax37.refaz(0, (int) (short) -1);
        ds.Item item41 = fPHeapMax37.max();
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax37.copia(itemArray49);
        fPHeapMax35.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 100);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 10, 100);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) (short) 100);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) 'a');
        fPHeapMax6.refaz(0, (int) (short) -1);
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax16.copia(itemArray19);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) 'a');
        fPHeapMax24.refaz(0, (int) (short) -1);
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax31.copia(itemArray36);
        fPHeapMax24.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax6.copia(itemArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax6);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) 'a');
        fPHeapMax9.constroi();
        fPHeapMax9.refaz((int) '4', (int) (short) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax15.copia(itemArray20);
        fPHeapMax9.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) 'a');
        fPHeapMax29.refaz(0, (int) (short) -1);
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray41);
        fPHeapMax36.copia(itemArray41);
        fPHeapMax29.copia(itemArray41);
        fPHeapMax27.copia(itemArray41);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray48);
        fPHeapMax47.imprime();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray51);
        fPHeapMax27.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        fPHeapMax57.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax57);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '4', (int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        fPHeapMax11.refaz(0, (int) (short) -1);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        fPHeapMax31.imprime();
        ds.Item item35 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray38);
        fPHeapMax37.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        java.lang.Class<?> wildcardClass44 = fPHeapMax31.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax31);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) (short) 10);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '4', (int) (short) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax9.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) 'a');
        fPHeapMax16.refaz(0, (int) (short) -1);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '4');
        ds.Item item23 = fPHeapMax22.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item26 = fPHeapMax25.max();
        ds.Item item27 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) 'a');
        fPHeapMax29.refaz(0, (int) (short) -1);
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray41);
        fPHeapMax36.copia(itemArray41);
        fPHeapMax29.copia(itemArray41);
        fPHeapMax25.copia(itemArray41);
        fPHeapMax22.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        fPHeapMax9.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray53);
        fPHeapMax52.imprime();
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray61);
        fPHeapMax60.imprime();
        ds.Item item64 = fPHeapMax60.max();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray67);
        fPHeapMax66.imprime();
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray70);
        fPHeapMax60.copia(itemArray70);
        fPHeapMax58.copia(itemArray70);
        fPHeapMax52.copia(itemArray70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) itemArray70);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax20.imprime();
        ds.Item item24 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax26.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray30);
        fPHeapMax20.copia(itemArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray30);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '4', (int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        fPHeapMax11.refaz(0, (int) (short) -1);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax31.copia(itemArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) itemArray36);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item8 = fPHeapMax7.max();
        ds.Item item9 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        fPHeapMax11.refaz(0, (int) (short) -1);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) 'a');
        fPHeapMax31.refaz(0, (int) (short) -1);
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray39);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax42.copia(itemArray43);
        fPHeapMax38.copia(itemArray43);
        fPHeapMax31.copia(itemArray43);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray49);
        fPHeapMax31.copia(itemArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax31);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) 'a');
        ds.Item item5 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item item7 = fPHeapMax4.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 0, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax22.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray26);
        fPHeapMax20.copia(itemArray26);
        fPHeapMax14.copia(itemArray26);
        fPHeapMax12.copia(itemArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax12);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) 'a');
        fPHeapMax13.refaz(0, (int) (short) -1);
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) 'a');
        fPHeapMax24.refaz(0, (int) (short) -1);
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax31.copia(itemArray36);
        fPHeapMax24.copia(itemArray36);
        fPHeapMax22.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax43.imprime();
        fPHeapMax43.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax51.copia(itemArray52);
        fPHeapMax51.imprime();
        ds.Item item55 = fPHeapMax51.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray58);
        fPHeapMax57.imprime();
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray61);
        fPHeapMax51.copia(itemArray61);
        fPHeapMax49.copia(itemArray61);
        fPHeapMax43.copia(itemArray61);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) '4');
        fPHeapMax67.constroi();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) 'a');
        fPHeapMax72.refaz(0, (int) (short) -1);
        ds.Item item76 = fPHeapMax72.max();
        ds.Item item77 = fPHeapMax72.max();
        fPHeapMax72.imprime();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray81 = new ds.Item[] {};
        fPHeapMax80.copia(itemArray81);
        fPHeapMax72.copia(itemArray81);
        fPHeapMax70.copia(itemArray81);
        fPHeapMax67.copia(itemArray81);
        fPHeapMax43.copia(itemArray81);
        fPHeapMax13.copia(itemArray81);
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax13);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item8 = fPHeapMax7.max();
        ds.Item item9 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        fPHeapMax11.refaz(0, (int) (short) -1);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) 'a');
        fPHeapMax32.refaz(0, (int) (short) -1);
        ds.Item item36 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax39.copia(itemArray44);
        fPHeapMax32.copia(itemArray44);
        java.lang.Class<?> wildcardClass48 = itemArray44.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) wildcardClass48);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) 'a');
        fPHeapMax8.refaz(0, (int) (short) -1);
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax15.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray31);
        fPHeapMax28.copia(itemArray31);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) 'a');
        fPHeapMax36.refaz(0, (int) (short) -1);
        ds.Item item40 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray48);
        fPHeapMax43.copia(itemArray48);
        fPHeapMax36.copia(itemArray48);
        fPHeapMax28.copia(itemArray48);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax56.copia(itemArray57);
        fPHeapMax54.copia(itemArray57);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) 'a');
        fPHeapMax62.refaz(0, (int) (short) -1);
        ds.Item item66 = fPHeapMax62.max();
        fPHeapMax62.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray70);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMax73.copia(itemArray74);
        fPHeapMax69.copia(itemArray74);
        fPHeapMax62.copia(itemArray74);
        fPHeapMax54.copia(itemArray74);
        fPHeapMax28.copia(itemArray74);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray85 = new ds.Item[] {};
        fPHeapMax84.copia(itemArray85);
        fPHeapMax82.copia(itemArray85);
        fPHeapMax28.copia(itemArray85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax28);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray8);
        fPHeapMax5.copia(itemArray8);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) 'a');
        fPHeapMax12.refaz(0, (int) (short) -1);
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax12.copia(itemArray24);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray30);
        fPHeapMax29.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray33);
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) 'a');
        fPHeapMax39.refaz(0, (int) (short) -1);
        ds.Item item43 = fPHeapMax39.max();
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray51);
        fPHeapMax46.copia(itemArray51);
        fPHeapMax39.copia(itemArray51);
        fPHeapMax37.copia(itemArray51);
        fPHeapMax29.copia(itemArray51);
        fPHeapMax12.copia(itemArray51);
        fPHeapMax5.copia(itemArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) itemArray51);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = fPHeapMax11.max();
        ds.Item item13 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) 'a');
        fPHeapMax15.constroi();
        fPHeapMax15.refaz((int) '4', (int) (short) 1);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(1);
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) 'a');
        fPHeapMax25.refaz(0, (int) (short) -1);
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax32.copia(itemArray37);
        fPHeapMax25.copia(itemArray37);
        fPHeapMax22.copia(itemArray37);
        fPHeapMax15.copia(itemArray37);
        fPHeapMax11.copia(itemArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax11);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax18.imprime();
        ds.Item item22 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        fPHeapMax24.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray28);
        fPHeapMax18.copia(itemArray28);
        fPHeapMax16.copia(itemArray28);
        fPHeapMax10.copia(itemArray28);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '4');
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) 'a');
        fPHeapMax39.refaz(0, (int) (short) -1);
        ds.Item item43 = fPHeapMax39.max();
        ds.Item item44 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray48);
        fPHeapMax39.copia(itemArray48);
        fPHeapMax37.copia(itemArray48);
        fPHeapMax34.copia(itemArray48);
        fPHeapMax10.copia(itemArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray8);
        fPHeapMax7.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) 'a');
        fPHeapMax21.refaz(0, (int) (short) -1);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item28 = fPHeapMax27.max();
        ds.Item item29 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) 'a');
        fPHeapMax31.refaz(0, (int) (short) -1);
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray39);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax42.copia(itemArray43);
        fPHeapMax38.copia(itemArray43);
        fPHeapMax31.copia(itemArray43);
        fPHeapMax27.copia(itemArray43);
        fPHeapMax21.copia(itemArray43);
        fPHeapMax17.copia(itemArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax17);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, 10);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) 'a');
        fPHeapMax6.refaz(0, (int) (short) -1);
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax13.copia(itemArray18);
        fPHeapMax6.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        ds.Item item27 = fPHeapMax6.max();
        ds.Item item28 = fPHeapMax6.max();
        ds.Item item29 = fPHeapMax6.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax6);
    }
}

