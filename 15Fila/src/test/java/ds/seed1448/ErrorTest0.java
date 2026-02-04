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
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.tras = 2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila15.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        java.lang.Object obj35 = fila32.desenfileira();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.tras = ' ';
        int int39 = fila24.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila24.item = objArray60;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        fila63.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila63.item = objArray71;
        fila24.enfileira((java.lang.Object) objArray71);
        fila0.enfileira((java.lang.Object) objArray71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object[] objArray14 = fila0.item;
        java.lang.Object[] objArray15 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        java.lang.Object[] objArray41 = fila39.item;
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100);
        fila42.frente = (short) 0;
        fila39.enfileira((java.lang.Object) fila42);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) (-1L));
        fila48.imprime();
        boolean boolean52 = fila48.vazia();
        java.lang.Object[] objArray53 = fila48.item;
        fila39.item = objArray53;
        fila0.enfileira((java.lang.Object) objArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        fila0.tras = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        fila3.frente = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila3.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        fila0.tras = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        java.lang.Object obj16 = fila3.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila3.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        java.lang.Object obj35 = fila32.desenfileira();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.tras = ' ';
        int int39 = fila24.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila24.item = objArray60;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        fila63.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila63.item = objArray71;
        fila24.enfileira((java.lang.Object) objArray71);
        fila0.enfileira((java.lang.Object) objArray71);
        int int75 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila3.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        fila0.frente = (byte) 0;
        boolean boolean10 = fila0.vazia();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.tras = (short) 0;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        boolean boolean17 = fila0.vazia();
        int int18 = fila0.frente;
        int int19 = fila0.tras;
        boolean boolean20 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) 10.0f);
        int int19 = fila15.tras;
        int int20 = fila15.tras;
        java.lang.Object[] objArray21 = fila15.item;
        fila13.item = objArray21;
        fila0.item = objArray21;
        fila0.frente = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.frente = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        java.lang.Object obj35 = fila32.desenfileira();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.tras = ' ';
        int int39 = fila24.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila24.item = objArray60;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        fila63.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila63.item = objArray71;
        fila24.enfileira((java.lang.Object) objArray71);
        fila0.enfileira((java.lang.Object) objArray71);
        int int75 = fila0.frente;
        java.lang.Object[] objArray76 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        int int15 = fila0.frente;
        fila0.frente = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (-1L));
        fila7.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila7.item = objArray15;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila7.item = objArray18;
        fila0.item = objArray18;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        boolean boolean17 = fila0.vazia();
        int int18 = fila0.frente;
        int int19 = fila0.tras;
        boolean boolean20 = fila0.vazia();
        fila0.enfileira((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.imprime();
        fila0.frente = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = (short) -1;
        int int11 = fila7.frente;
        java.lang.Object obj12 = fila7.desenfileira();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.tras = 2;
        fila0.tras = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 2;
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) 10.0f);
        int int21 = fila17.tras;
        int int22 = fila17.tras;
        java.lang.Object[] objArray23 = fila17.item;
        fila15.item = objArray23;
        fila0.enfileira((java.lang.Object) fila15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila0.enfileira((java.lang.Object) objArray47);
        fila0.frente = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) 10.0f);
        int int28 = fila24.tras;
        int int29 = fila24.tras;
        fila24.tras = (byte) 100;
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 100);
        java.lang.Object obj35 = fila32.desenfileira();
        fila24.enfileira((java.lang.Object) fila32);
        fila24.tras = ' ';
        int int39 = fila24.tras;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (-1L));
        fila40.imprime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila40.item = objArray48;
        int int50 = fila40.frente;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila40.enfileira((java.lang.Object) objArray52);
        fila40.enfileira((java.lang.Object) '#');
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (-1L));
        int int59 = fila56.tras;
        java.lang.Object[] objArray60 = fila56.item;
        fila40.item = objArray60;
        fila24.item = objArray60;
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (-1L));
        fila63.imprime();
        java.lang.Object[] objArray71 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila63.item = objArray71;
        fila24.enfileira((java.lang.Object) objArray71);
        fila0.enfileira((java.lang.Object) objArray71);
        ds.Fila fila75 = new ds.Fila();
        java.lang.Object[] objArray76 = fila75.item;
        fila75.enfileira((java.lang.Object) 10.0f);
        int int79 = fila75.tras;
        int int80 = fila75.tras;
        java.lang.Object[] objArray81 = fila75.item;
        fila0.item = objArray81;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (-1L));
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) 10.0f);
        int int19 = fila15.tras;
        int int20 = fila15.tras;
        java.lang.Object[] objArray21 = fila15.item;
        fila13.item = objArray21;
        fila0.item = objArray21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        fila0.imprime();
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.tras = (short) -1;
        int int11 = fila7.frente;
        java.lang.Object obj12 = fila7.desenfileira();
        fila0.enfileira((java.lang.Object) fila7);
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (-1L));
        fila15.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila15.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila15.item = objArray26;
        int int28 = fila15.tras;
        int int29 = fila15.frente;
        java.lang.Object[] objArray30 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila15.imprime();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        int int10 = fila8.frente;
        fila0.enfileira((java.lang.Object) int10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) 10.0f);
        int int16 = fila12.tras;
        int int17 = fila12.tras;
        java.lang.Object[] objArray18 = fila12.item;
        java.lang.Object obj19 = fila12.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        java.lang.Object[] objArray22 = fila20.item;
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 100);
        fila23.frente = (short) 0;
        fila20.enfileira((java.lang.Object) fila23);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila20.item = objArray34;
        fila12.item = objArray34;
        fila0.enfileira((java.lang.Object) fila12);
        int int38 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.frente = 0;
        fila0.frente = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.frente = (byte) 0;
        fila0.frente = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.tras = (short) 0;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        boolean boolean22 = fila0.vazia();
        boolean boolean23 = fila0.vazia();
        int int24 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        java.lang.Object[] objArray22 = fila0.item;
        boolean boolean23 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        fila3.frente = 0;
        boolean boolean18 = fila3.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila3.imprime();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        fila0.tras = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        fila0.frente = 10;
        boolean boolean9 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        int int10 = fila0.frente;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray12);
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        fila0.item = objArray20;
        fila0.tras = 0;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        java.lang.Object[] objArray26 = fila24.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 100);
        fila27.frente = (short) 0;
        fila24.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.enfileira((java.lang.Object) 10.0f);
        int int37 = fila33.tras;
        fila33.frente = (-1);
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        java.lang.Object[] objArray42 = fila40.item;
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 100);
        fila43.frente = (short) 0;
        fila40.enfileira((java.lang.Object) fila43);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (-1L));
        fila49.imprime();
        boolean boolean53 = fila49.vazia();
        java.lang.Object[] objArray54 = fila49.item;
        fila40.item = objArray54;
        fila33.enfileira((java.lang.Object) objArray54);
        fila24.item = objArray54;
        fila0.item = objArray54;
        fila0.frente = (byte) 10;
        boolean boolean61 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        java.lang.Object[] objArray41 = fila39.item;
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 100);
        fila42.frente = (short) 0;
        fila39.enfileira((java.lang.Object) fila42);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) (-1L));
        fila48.imprime();
        boolean boolean52 = fila48.vazia();
        java.lang.Object[] objArray53 = fila48.item;
        fila39.item = objArray53;
        fila0.enfileira((java.lang.Object) objArray53);
        int int56 = fila0.tras;
        boolean boolean57 = fila0.vazia();
        java.lang.Object[] objArray58 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila0.item = objArray8;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        int int14 = fila0.frente;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.enfileira((java.lang.Object) fila15);
        fila15.tras = 2;
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (-1L));
        fila20.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila20.item = objArray28;
        int int30 = fila20.frente;
        fila15.enfileira((java.lang.Object) fila20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila15.imprime();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (byte) 1;
        java.lang.Object[] objArray3 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        int int9 = fila3.tras;
        boolean boolean10 = fila3.vazia();
        int int11 = fila3.frente;
        boolean boolean12 = fila3.vazia();
        fila3.imprime();
        fila3.tras = '#';
        java.lang.Object obj16 = fila3.desenfileira();
        int int17 = fila3.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila3.imprime();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        int int8 = fila0.frente;
        fila0.frente = 2;
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (-1L));
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (-1L));
        fila18.imprime();
        fila18.imprime();
        int int23 = fila18.frente;
        java.lang.Object[] objArray24 = fila18.item;
        boolean boolean25 = fila18.vazia();
        java.lang.Object[] objArray26 = fila18.item;
        fila11.item = objArray26;
        fila11.tras = 35;
        fila0.enfileira((java.lang.Object) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        fila0.frente = 0;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass8);
        boolean boolean10 = fila0.vazia();
        fila0.tras = 33;
        java.lang.Object obj13 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 100);
        fila3.frente = (short) 0;
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) 10.0f);
        int int13 = fila9.tras;
        fila9.frente = (-1);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        java.lang.Object[] objArray18 = fila16.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 100);
        fila19.frente = (short) 0;
        fila16.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (-1L));
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila16.item = objArray30;
        fila9.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        fila34.enfileira((java.lang.Object) 10.0f);
        int int38 = fila34.tras;
        fila34.frente = 0;
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        fila34.enfileira((java.lang.Object) wildcardClass42);
        boolean boolean44 = fila34.vazia();
        fila0.enfileira((java.lang.Object) boolean44);
        java.lang.Object obj46 = fila0.desenfileira();
        fila0.tras = '#';
        int int49 = fila0.frente;
        java.lang.Object obj50 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        java.lang.Object[] objArray38 = fila16.item;
        fila0.enfileira((java.lang.Object) objArray38);
        fila0.enfileira((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (-1L));
        int int3 = fila0.tras;
        fila0.tras = 98;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (-1L));
        fila16.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila16.item = objArray24;
        int int26 = fila16.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila16.enfileira((java.lang.Object) objArray28);
        fila16.enfileira((java.lang.Object) '#');
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (-1L));
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        fila16.item = objArray36;
        fila0.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (-1L));
        fila39.imprime();
        java.lang.Object[] objArray47 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila39.item = objArray47;
        fila0.enfileira((java.lang.Object) objArray47);
        int int50 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) 10.0f);
        int int17 = fila13.tras;
        int int18 = fila13.tras;
        fila13.tras = (byte) 100;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 100);
        java.lang.Object obj24 = fila21.desenfileira();
        fila13.enfileira((java.lang.Object) fila21);
        fila13.tras = ' ';
        int int28 = fila13.tras;
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (-1L));
        fila29.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila29.item = objArray37;
        int int39 = fila29.frente;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila29.enfileira((java.lang.Object) objArray41);
        fila29.enfileira((java.lang.Object) '#');
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (-1L));
        int int48 = fila45.tras;
        java.lang.Object[] objArray49 = fila45.item;
        fila29.item = objArray49;
        fila13.item = objArray49;
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (-1L));
        fila52.imprime();
        java.lang.Object[] objArray60 = new java.lang.Object[] { '#', (-1.0f), 0.0f, (short) 1 };
        fila52.item = objArray60;
        fila13.enfileira((java.lang.Object) objArray60);
        fila8.enfileira((java.lang.Object) fila13);
        java.lang.Object obj64 = fila13.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila13.imprime();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) 10.0f);
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = (byte) 100;
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 100);
        java.lang.Object obj11 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.tras = ' ';
        int int15 = fila0.tras;
        fila0.tras = 32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

