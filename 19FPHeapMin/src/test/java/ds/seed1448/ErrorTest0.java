package ds.seed1448;

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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) itemArray5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) 1L);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 10, (int) ' ');
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        java.lang.Object obj8 = new java.lang.Object();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, obj8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.constroi();
        ds.Item item7 = fPHeapMin5.min();
        fPHeapMin5.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(1, (int) '4');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) 'a');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, (int) '#');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) (-1.0d));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) (-1L));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) (short) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        ds.Item item11 = fPHeapMin7.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) 'a');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.Item item22 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin29.constroi();
        fPHeapMin29.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin29);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin17.constroi();
        ds.Item item19 = fPHeapMin17.min();
        fPHeapMin17.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin17);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(10, (int) (byte) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) fPHeapMin7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.Item item14 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item18 = fPHeapMin17.min();
        ds.Item item19 = fPHeapMin17.min();
        fPHeapMin17.refaz(1, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin17.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) fPHeapMin17);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(1, (int) 'a');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 1, 100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 10, (int) '#');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin9.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin16.imprime();
        fPHeapMin16.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin16.copia(itemArray21);
        ds.Item item25 = fPHeapMin16.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin16);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) (short) 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) '#');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) 1L);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.constroi();
        fPHeapMin6.constroi();
        ds.Item item10 = fPHeapMin6.min();
        fPHeapMin6.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz(1, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin17.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) fPHeapMin6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) (-1.0d));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        ds.Item item14 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, (int) ' ');
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = fPHeapMin20.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin20);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.Item item12 = fPHeapMin8.min();
        fPHeapMin8.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin43.imprime();
        fPHeapMin43.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray48 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray48);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray48);
        fPHeapMin43.copia(itemArray48);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray48);
        fPHeapMin36.copia(itemArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin36);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        fPHeapMin24.refaz((int) (short) 1, 0);
        ds.Item item28 = fPHeapMin24.min();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz(1, 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray36);
        fPHeapMin30.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        fPHeapMin24.copia(itemArray36);
        fPHeapMin21.copia(itemArray36);
        fPHeapMin14.copia(itemArray36);
        fPHeapMin14.refaz((int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) (short) 1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) (short) 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        fPHeapMin16.constroi();
        fPHeapMin16.constroi();
        fPHeapMin16.imprime();
        java.lang.Class<?> wildcardClass20 = fPHeapMin16.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) wildcardClass20);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        fPHeapMin12.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin12);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        fPHeapMin17.refaz(1, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray21);
        fPHeapMin15.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin13.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) itemArray26);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin6);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz(1, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin11.imprime();
        fPHeapMin11.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin11.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        fPHeapMin25.refaz(1, 0);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray29);
        fPHeapMin23.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin4.copia(itemArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) itemArray29);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.Item item14 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(1, 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item18 = fPHeapMin17.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz((int) (short) 1, 0);
        ds.Item item24 = fPHeapMin20.min();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        fPHeapMin28.refaz(1, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray32);
        fPHeapMin26.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        fPHeapMin20.copia(itemArray32);
        fPHeapMin17.copia(itemArray32);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray32);
        fPHeapMin1.copia(itemArray32);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin42.imprime();
        fPHeapMin42.constroi();
        fPHeapMin42.constroi();
        fPHeapMin42.imprime();
        fPHeapMin42.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin42);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(1, (int) (byte) 100);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.Item item12 = fPHeapMin8.min();
        fPHeapMin8.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 10, (int) ' ');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.constroi();
        ds.Item item24 = fPHeapMin22.min();
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        fPHeapMin22.copia(itemArray32);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray37);
        fPHeapMin22.copia(itemArray37);
        fPHeapMin1.copia(itemArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin16.imprime();
        ds.Item item18 = fPHeapMin16.min();
        fPHeapMin16.imprime();
        fPHeapMin16.constroi();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz((int) (short) 1, 0);
        ds.Item item26 = fPHeapMin22.min();
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        fPHeapMin29.constroi();
        ds.Item item33 = fPHeapMin29.min();
        fPHeapMin29.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        fPHeapMin44.refaz(1, 0);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray48);
        fPHeapMin42.copia(itemArray48);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray48);
        fPHeapMin40.copia(itemArray48);
        fPHeapMin29.copia(itemArray48);
        fPHeapMin22.copia(itemArray48);
        fPHeapMin16.copia(itemArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) fPHeapMin16);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.refaz(1, 0);
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin18.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        fPHeapMin12.copia(itemArray23);
        fPHeapMin6.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        fPHeapMin1.copia(itemArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 10);
    }
}

