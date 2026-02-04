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
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = (short) 100;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean7 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        java.lang.Object[] objArray19 = fila0.item;
        ds.Fila fila20 = new ds.Fila();
        fila20.tras = 0;
        fila20.imprime();
        fila20.tras = 97;
        fila0.enfileira((java.lang.Object) fila20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        int int14 = fila11.tras;
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        fila0.tras = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 1L);
        fila2.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        int int14 = fila11.tras;
        java.lang.Object[] objArray15 = fila11.item;
        fila2.item = objArray15;
        fila2.tras = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila2.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.frente = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        fila0.tras = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object[] objArray12 = fila0.item;
        int int13 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = ' ';
        fila0.frente = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        fila0.tras = 98;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.enfileira((java.lang.Object) 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        int int5 = fila2.tras;
        java.lang.Object[] objArray6 = fila2.item;
        fila2.frente = (byte) 10;
        java.lang.Object[] objArray9 = fila2.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila2.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        int int6 = fila0.frente;
        java.lang.Object obj7 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        fila0.frente = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        int int9 = fila6.tras;
        java.lang.Object[] objArray10 = fila6.item;
        fila0.item = objArray10;
        fila0.tras = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

