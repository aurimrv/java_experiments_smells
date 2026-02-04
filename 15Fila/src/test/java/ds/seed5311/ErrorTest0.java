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
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        fila0.frente = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        fila0.frente = '#';
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        java.lang.Object obj5 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = 10;
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        java.lang.Object[] objArray9 = fila5.item;
        fila5.enfileira((java.lang.Object) 1.0d);
        int int12 = fila5.tras;
        fila0.enfileira((java.lang.Object) int12);
        int int14 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        fila0.frente = (short) 100;
        fila0.frente = (byte) 100;
        java.lang.Object[] objArray9 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 35;
        java.lang.Object[] objArray6 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.tras = 0;
        int int9 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.tras = 100;
        int int13 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        boolean boolean5 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.imprime();
        java.lang.Object[] objArray11 = fila8.item;
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        boolean boolean8 = fila6.vazia();
        fila6.frente = '#';
        int int11 = fila6.frente;
        java.lang.Object[] objArray12 = fila6.item;
        java.lang.Object[] objArray13 = fila6.item;
        fila0.item = objArray13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila0.item = objArray7;
        int int9 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = 0;
        int int4 = fila0.tras;
        fila0.frente = (byte) 1;
        fila0.tras = '#';
        int int9 = fila0.frente;
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        fila13.item = objArray17;
        fila11.item = objArray17;
        int int20 = fila11.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila11.item = objArray22;
        fila0.item = objArray22;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 35;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        boolean boolean8 = fila6.vazia();
        fila6.frente = '#';
        int int11 = fila6.frente;
        java.lang.Object[] objArray12 = fila6.item;
        fila0.item = objArray12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) 10;
        fila0.tras = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

