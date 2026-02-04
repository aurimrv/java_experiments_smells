package ds.seed5503;

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
        fPHeapMax1.refaz(0, (int) '4');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) 0L);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax6.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) 100L);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) 100L);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax9.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) '#');
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax29.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray34);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = fPHeapMax5.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) '#');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        ds.Item item16 = fPHeapMax14.max();
        ds.Item item17 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) wildcardClass6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) (short) 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax4.copia(itemArray9);
        fPHeapMax4.refaz((int) (byte) 10, (int) (byte) -1);
        fPHeapMax4.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 1, 100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.Item item11 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray17);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        java.lang.Class<?> wildcardClass16 = fPHeapMax5.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass16);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax8.copia(itemArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        java.lang.Class<?> wildcardClass7 = itemArray5.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) wildcardClass7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax9.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax27.copia(itemArray33);
        fPHeapMax27.imprime();
        fPHeapMax27.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax27);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) 100L);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax8);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax6.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax17.copia(itemArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax17);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) 'a');
        ds.Item item4 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax9.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        fPHeapMax3.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax22.copia(itemArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax22);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax8.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        fPHeapMax25.imprime();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax30.copia(itemArray35);
        fPHeapMax25.copia(itemArray35);
        fPHeapMax21.copia(itemArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) itemArray35);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz((int) 'a', (int) (short) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax9.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax27.copia(itemArray33);
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax27);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) 'a');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax6.constroi();
        fPHeapMax6.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray38);
        fPHeapMax32.copia(itemArray38);
        fPHeapMax32.imprime();
        fPHeapMax32.imprime();
        java.lang.Class<?> wildcardClass43 = fPHeapMax32.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) wildcardClass43);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) ' ');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray8);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax7.copia(itemArray13);
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax8.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.refaz((int) ' ', 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax25.imprime();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax25);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax6.constroi();
        fPHeapMax6.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        ds.Item item31 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax34.copia(itemArray40);
        fPHeapMax34.imprime();
        fPHeapMax34.imprime();
        java.lang.Class<?> wildcardClass45 = fPHeapMax34.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(100, (java.lang.Object) wildcardClass45);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        fPHeapMax15.imprime();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        fPHeapMax20.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        fPHeapMax5.copia(itemArray25);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item32 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax5);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        fPHeapMax3.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax10.copia(itemArray16);
        fPHeapMax3.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax3.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax8.constroi();
        fPHeapMax8.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '#');
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        fPHeapMax21.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax8.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item33 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '#');
        fPHeapMax36.imprime();
        ds.Item item38 = fPHeapMax36.max();
        ds.Item item39 = fPHeapMax36.max();
        ds.Item item40 = fPHeapMax36.max();
        ds.Item item41 = fPHeapMax36.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax36);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        ds.Item item32 = fPHeapMax30.max();
        ds.Item item33 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax30.copia(itemArray36);
        fPHeapMax9.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) '#');
        fPHeapMax42.imprime();
        fPHeapMax42.imprime();
        fPHeapMax42.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray50);
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax54.copia(itemArray55);
        fPHeapMax49.copia(itemArray55);
        fPHeapMax42.copia(itemArray55);
        fPHeapMax7.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) '#');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) '4');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax9);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax6.constroi();
        fPHeapMax6.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        ds.Item item31 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, 10);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax13);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz((int) 'a', (int) (short) 0);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax11.constroi();
        fPHeapMax11.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.imprime();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray29);
        fPHeapMax24.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        fPHeapMax11.copia(itemArray29);
        ds.Item item34 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        fPHeapMax11.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax11);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', (int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) ' ', 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) 'a');
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax11.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz((int) 'a', (int) (short) 0);
        fPHeapMax1.refaz((int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) '4');
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax6.constroi();
        fPHeapMax6.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        ds.Item item31 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray38);
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax42.copia(itemArray43);
        fPHeapMax37.copia(itemArray43);
        fPHeapMax37.imprime();
        fPHeapMax37.imprime();
        fPHeapMax37.imprime();
        java.lang.Class<?> wildcardClass49 = fPHeapMax37.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax37);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax13.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax13);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (byte) 0);
    }
}

