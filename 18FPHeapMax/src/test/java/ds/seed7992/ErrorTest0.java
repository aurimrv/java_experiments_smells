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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(10, (java.lang.Object) 10.0d);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) '#');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) (byte) 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) '#');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (short) 0, (int) '4');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz((int) (byte) 0, (int) '4');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave(0, (java.lang.Object) (short) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.refaz(0, (int) (short) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
        fPHeapMax4.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMax4.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax4);
    }
}

