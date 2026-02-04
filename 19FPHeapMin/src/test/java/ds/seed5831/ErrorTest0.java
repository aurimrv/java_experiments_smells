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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) '#');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray11);
        ds.Item item13 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray16);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray18);
        fPHeapMin8.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin24.copia(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin22.copia(itemArray25);
        fPHeapMin8.copia(itemArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray25);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
        fPHeapMin4.constroi();
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin4.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) itemArray9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) (short) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray10);
        ds.Item item12 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray17);
        fPHeapMin7.copia(itemArray17);
        fPHeapMin3.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        fPHeapMin1.imprime();
        ds.Item item24 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        fPHeapMin26.copia(itemArray29);
        fPHeapMin1.copia(itemArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.Item item8 = fPHeapMin5.min();
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray14);
        ds.Item item16 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        fPHeapMin5.copia(itemArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) ' ');
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin23.copia(itemArray26);
        fPHeapMin21.copia(itemArray26);
        fPHeapMin14.copia(itemArray26);
        ds.Item item32 = fPHeapMin14.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMin34.copia(itemArray35);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMin34.copia(itemArray37);
        ds.Item item39 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray42);
        fPHeapMin34.copia(itemArray42);
        fPHeapMin14.copia(itemArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) fPHeapMin14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin10.copia(itemArray13);
        fPHeapMin8.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin27.copia(itemArray30);
        fPHeapMin25.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin35);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 10, (int) (short) -1);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 0, (int) 'a');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(10, (int) (short) 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray7);
        ds.Item item9 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) ' ');
        fPHeapMin17.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        fPHeapMin26.copia(itemArray29);
        fPHeapMin24.copia(itemArray29);
        fPHeapMin17.copia(itemArray29);
        fPHeapMin4.copia(itemArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin15.copia(itemArray18);
        fPHeapMin1.copia(itemArray18);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray28);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin9.copia(itemArray12);
        fPHeapMin9.refaz((int) (short) 0, (int) (short) -1);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray32);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray34);
        ds.Item item36 = fPHeapMin31.min();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMin38.copia(itemArray39);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin38.copia(itemArray41);
        fPHeapMin31.copia(itemArray41);
        fPHeapMin27.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray41);
        fPHeapMin25.copia(itemArray41);
        fPHeapMin9.copia(itemArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin9);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray8);
        ds.Item item10 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        fPHeapMin5.copia(itemArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin15.copia(itemArray18);
        fPHeapMin1.copia(itemArray18);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin28.constroi();
        java.lang.Class<?> wildcardClass30 = fPHeapMin28.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(10, (java.lang.Object) wildcardClass30);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray13);
        ds.Item item15 = fPHeapMin10.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray18);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray20);
        fPHeapMin10.copia(itemArray20);
        fPHeapMin6.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        fPHeapMin4.copia(itemArray20);
        fPHeapMin4.imprime();
        ds.Item item27 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin29.copia(itemArray32);
        fPHeapMin4.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(100, (java.lang.Object) itemArray32);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.refaz((int) (short) 0, (int) (short) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray26);
        ds.Item item28 = fPHeapMin23.min();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray31);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray33);
        fPHeapMin23.copia(itemArray33);
        fPHeapMin19.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin17.copia(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray44);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray46);
        fPHeapMin43.refaz((int) (byte) 10, (int) (byte) 1);
        ds.Item item51 = fPHeapMin43.min();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray54);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray62 = new ds.Item[] {};
        fPHeapMin61.copia(itemArray62);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray62);
        fPHeapMin59.copia(itemArray62);
        fPHeapMin57.copia(itemArray62);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray62);
        fPHeapMin43.copia(itemArray62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin43);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.refaz((int) (byte) 10, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) (byte) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.constroi();
        ds.Item item15 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(1, (int) (short) 10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin11.imprime();
        ds.Item item13 = fPHeapMin11.min();
        fPHeapMin11.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin11);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item12 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) (short) 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin11.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) 100);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) (short) 100);
    }
}

