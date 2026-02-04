package ds.seed9121;

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
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        fila0.tras = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.tras = (-1);
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        fila0.frente = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean16 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) (-1.0d));
        fila0.tras = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        int int13 = fila8.frente;
        fila0.enfileira((java.lang.Object) fila8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila8.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.tras = ' ';
        int int18 = fila6.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila6.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        int int3 = fila0.frente;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj5, (byte) 100 };
        fila0.item = objArray7;
        int int9 = fila0.frente;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 100;
        fila10.tras = (short) 1;
        int int16 = fila10.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object[] objArray20 = fila17.item;
        fila10.enfileira((java.lang.Object) fila17);
        fila10.frente = '#';
        fila0.enfileira((java.lang.Object) fila10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila10.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray16 = fila12.item;
        boolean boolean17 = fila12.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 100;
        java.lang.Object obj22 = fila18.desenfileira();
        java.lang.Object[] objArray23 = fila18.item;
        fila12.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 100;
        java.lang.Object obj29 = fila25.desenfileira();
        int int30 = fila25.frente;
        boolean boolean31 = fila25.vazia();
        fila12.enfileira((java.lang.Object) boolean31);
        fila12.frente = (byte) 0;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        java.lang.Object[] objArray37 = fila35.item;
        fila12.item = objArray37;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 100;
        java.lang.Object obj43 = fila39.desenfileira();
        int int44 = fila39.frente;
        ds.Fila fila45 = new ds.Fila();
        fila45.frente = 0;
        int int48 = fila45.frente;
        java.lang.Object[] objArray49 = fila45.item;
        fila39.item = objArray49;
        int int51 = fila39.frente;
        java.lang.Object[] objArray52 = fila39.item;
        fila12.item = objArray52;
        fila0.item = objArray52;
        java.lang.Object obj55 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.frente;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        java.lang.Object[] objArray7 = fila5.item;
        java.lang.Object[] objArray8 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray8);
        int int10 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        fila0.tras = (byte) 1;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 100;
        java.lang.Object obj16 = fila12.desenfileira();
        int int17 = fila12.frente;
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = 0;
        int int21 = fila18.frente;
        java.lang.Object[] objArray22 = fila18.item;
        fila12.item = objArray22;
        fila0.item = objArray22;
        java.lang.Object[] objArray25 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        boolean boolean2 = fila0.vazia();
        fila0.tras = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.enfileira((java.lang.Object) (byte) 100);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila0.item = objArray25;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 100;
        java.lang.Object obj31 = fila27.desenfileira();
        int int32 = fila27.frente;
        ds.Fila fila33 = new ds.Fila();
        fila33.frente = 0;
        int int36 = fila33.frente;
        java.lang.Object[] objArray37 = fila33.item;
        fila27.item = objArray37;
        int int39 = fila27.frente;
        java.lang.Object[] objArray40 = fila27.item;
        fila0.item = objArray40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        int int10 = fila6.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila6.enfileira((java.lang.Object) objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        fila0.enfileira((java.lang.Object) objArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        java.lang.Object[] objArray10 = fila7.item;
        fila7.tras = (short) 1;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        java.lang.Object[] objArray18 = fila13.item;
        java.lang.Object[] objArray19 = fila13.item;
        fila13.tras = 1;
        java.lang.Object[] objArray22 = fila13.item;
        fila7.item = objArray22;
        java.lang.Object[] objArray24 = fila7.item;
        fila0.item = objArray24;
        java.lang.Object[] objArray26 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        int int7 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        fila0.tras = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        fila0.frente = 101;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 100;
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object[] objArray13 = fila8.item;
        java.lang.Object[] objArray14 = fila8.item;
        fila8.tras = 1;
        fila8.tras = (byte) 1;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila8.imprime();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 1;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = 0;
        int int13 = fila10.frente;
        java.lang.Object[] objArray14 = fila10.item;
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object[] objArray16 = fila0.item;
        fila0.tras = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 100;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        fila17.item = objArray23;
        boolean boolean25 = fila17.vazia();
        fila17.frente = (short) 0;
        fila17.imprime();
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        fila29.frente = (short) 100;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        java.lang.Object[] objArray35 = fila33.item;
        fila29.item = objArray35;
        fila17.item = objArray35;
        java.lang.Object[] objArray38 = fila17.item;
        fila0.item = objArray38;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila9.tras = '4';
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        int int23 = fila19.frente;
        int int24 = fila19.frente;
        fila0.enfileira((java.lang.Object) fila19);
        int int26 = fila0.tras;
        int int27 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.tras;
        fila0.tras = (-1);
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = 0;
        int int10 = fila7.frente;
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 0, obj12, (byte) 100 };
        fila7.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.tras = (short) 10;
        java.lang.Object obj20 = fila16.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 100;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        java.lang.Object[] objArray28 = fila25.item;
        fila21.item = objArray28;
        fila16.item = objArray28;
        fila7.enfileira((java.lang.Object) objArray28);
        fila0.item = objArray28;
        int int33 = fila0.frente;
        fila0.frente = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.tras = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = (short) 10;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        fila0.tras = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        java.lang.Object obj10 = fila6.desenfileira();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 100;
        java.lang.Object obj17 = fila13.desenfileira();
        int int18 = fila13.frente;
        boolean boolean19 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        fila0.frente = (byte) 0;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila0.item = objArray25;
        java.lang.Object[] objArray27 = fila0.item;
        java.lang.Object obj28 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        java.lang.Object[] objArray8 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = 'a';
        fila0.tras = '4';
        java.lang.Object[] objArray8 = fila0.item;
        fila0.frente = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        int int10 = fila6.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila6.enfileira((java.lang.Object) objArray14);
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        fila0.enfileira((java.lang.Object) objArray14);
        java.lang.Object obj18 = fila0.desenfileira();
        int int19 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (short) 1;
        int int6 = fila0.frente;
        fila0.frente = (-1);
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = (short) 10;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila9.item = objArray16;
        fila0.enfileira((java.lang.Object) objArray16);
        fila0.tras = 1;
        fila0.frente = '4';
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = 0;
        java.lang.Object[] objArray26 = fila23.item;
        fila0.enfileira((java.lang.Object) fila23);
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 100;
        int int32 = fila28.tras;
        int int33 = fila28.frente;
        int int34 = fila28.tras;
        fila0.enfileira((java.lang.Object) fila28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila28.imprime();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 100;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object[] objArray13 = fila10.item;
        fila6.item = objArray13;
        fila0.enfileira((java.lang.Object) fila6);
        fila6.tras = ' ';
        java.lang.Object[] objArray18 = fila6.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila6.imprime();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        fila0.tras = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        fila9.frente = 100;
        java.lang.Object obj18 = fila9.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila9.imprime();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (short) 100;
        fila0.frente = 103;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila9.tras = '4';
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 100;
        int int23 = fila19.frente;
        int int24 = fila19.frente;
        fila0.enfileira((java.lang.Object) fila19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila19.imprime();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        java.lang.Object[] objArray6 = fila4.item;
        java.lang.Object[] objArray7 = fila4.item;
        fila0.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        java.lang.Object[] objArray12 = fila9.item;
        fila9.frente = 'a';
        fila0.enfileira((java.lang.Object) fila9);
        int int16 = fila0.tras;
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Object obj18 = fila0.desenfileira();
        fila0.tras = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

