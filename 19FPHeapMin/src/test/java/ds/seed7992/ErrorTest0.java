package ds.seed7992;

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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) '4');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) '#');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(10, (int) (short) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item11 = fPHeapMin1.min();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin16.constroi();
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        fPHeapMin16.copia(itemArray18);
        fPHeapMin14.copia(itemArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin14);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin9.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin9.copia(itemArray11);
        fPHeapMin7.copia(itemArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) itemArray11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(10, (java.lang.Object) 10.0f);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        fPHeapMin5.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin5.copia(itemArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(10, (java.lang.Object) fPHeapMin5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin15.copia(itemArray19);
        fPHeapMin1.copia(itemArray19);
        fPHeapMin1.constroi();
        ds.Item item25 = fPHeapMin1.min();
        ds.Item item26 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin29.constroi();
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin34.constroi();
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin34.copia(itemArray36);
        fPHeapMin32.copia(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        fPHeapMin29.copia(itemArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin29);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin4.constroi();
        ds.Item item6 = fPHeapMin4.min();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin4.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin15.constroi();
        fPHeapMin15.imprime();
        fPHeapMin15.constroi();
        fPHeapMin15.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin15);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin4.constroi();
        fPHeapMin4.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin8.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.Item item20 = fPHeapMin1.min();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin26.constroi();
        fPHeapMin26.constroi();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin32.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin32.copia(itemArray34);
        fPHeapMin30.copia(itemArray34);
        fPHeapMin26.copia(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin42.constroi();
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        fPHeapMin42.copia(itemArray44);
        fPHeapMin40.copia(itemArray44);
        fPHeapMin26.copia(itemArray44);
        fPHeapMin24.copia(itemArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray44);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) ' ', (int) 'a');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) (byte) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) ' ', 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) (short) -1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.imprime();
        java.lang.Class<?> wildcardClass14 = fPHeapMin5.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) fPHeapMin5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin11.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin16.constroi();
        fPHeapMin16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        fPHeapMin5.copia(itemArray19);
        java.lang.Class<?> wildcardClass23 = fPHeapMin5.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) wildcardClass23);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 1, 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin6.constroi();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) itemArray8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = fPHeapMin13.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin13);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item4 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin13.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin13.copia(itemArray15);
        fPHeapMin11.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin23.constroi();
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin23.copia(itemArray25);
        fPHeapMin21.copia(itemArray25);
        fPHeapMin7.copia(itemArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) itemArray25);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin18.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        fPHeapMin28.constroi();
        java.lang.Class<?> wildcardClass30 = fPHeapMin28.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) wildcardClass30);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) (-1));
    }
}

