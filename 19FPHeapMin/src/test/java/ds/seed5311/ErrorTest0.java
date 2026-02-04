package ds.seed5311;

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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) (short) 100);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) '4');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 0, (int) 'a');
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) (short) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz(0, (int) (byte) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 1, 10);
    }
}

