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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 10, (int) ' ');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 10, (int) ' ');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) (-1L));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 1, (int) '#');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin5.copia(itemArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) fPHeapMin5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) 1.0f);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) ' ');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) 10.0d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) ' ');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) (short) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) (byte) 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item11 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin16.copia(itemArray19);
        fPHeapMin14.copia(itemArray19);
        java.lang.Class<?> wildcardClass24 = itemArray19.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray19);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) ' ');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin15.constroi();
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) fPHeapMin15);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        fPHeapMin6.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin21);
    }
}

