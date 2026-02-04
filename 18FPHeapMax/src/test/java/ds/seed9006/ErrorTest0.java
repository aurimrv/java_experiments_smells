package ds.seed9006;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(1, (int) (short) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) '4');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.Item item7 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) ' ', (int) (short) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax11.refaz((int) (short) 100, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        fPHeapMax8.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) '4');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        java.lang.Class<?> wildcardClass14 = fPHeapMax10.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.Item item15 = fPHeapMax10.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        fPHeapMax8.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMax9.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) "hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax12);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        fPHeapMax10.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMax10.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) wildcardClass12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz(1, (-1));
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax13);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '#', 0);
        fPHeapMax1.refaz(1, 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax14);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 1, (int) '#');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) 10);
    }
}

