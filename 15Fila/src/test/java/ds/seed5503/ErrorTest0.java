package ds.seed5503;

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
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.frente = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.tras = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 'a';
        java.lang.Object[] objArray15 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        fila0.frente = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        int int9 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        fila0.tras = (short) 0;
        int int13 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj11 = fila7.desenfileira();
        fila7.tras = (byte) 100;
        fila7.enfileira((java.lang.Object) 100);
        int int16 = fila7.tras;
        java.lang.Object[] objArray17 = fila7.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila21.item = objArray24;
        fila18.item = objArray24;
        java.lang.Object[] objArray27 = fila18.item;
        fila7.item = objArray27;
        fila0.item = objArray27;
        java.lang.Object obj30 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        int int25 = fila17.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        fila17.item = objArray28;
        fila17.tras = 101;
        fila0.enfileira((java.lang.Object) 101);
        boolean boolean33 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object obj16 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        fila0.tras = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        int int22 = fila12.frente;
        fila0.enfileira((java.lang.Object) fila12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila12.imprime();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        int int22 = fila12.frente;
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj24 = fila12.desenfileira();
        java.lang.Object[] objArray25 = fila12.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila12.imprime();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.tras = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.tras = '#';
        fila20.tras = (short) 0;
        fila20.tras = (short) 10;
        int int28 = fila20.tras;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        fila20.item = objArray31;
        fila20.tras = 101;
        java.lang.Object[] objArray35 = fila20.item;
        fila0.item = objArray35;
        java.lang.Object[] objArray37 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        boolean boolean13 = fila11.vazia();
        int int14 = fila11.tras;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        fila15.imprime();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        fila15.item = objArray20;
        fila11.item = objArray20;
        java.lang.Object[] objArray23 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        fila11.tras = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila11.imprime();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        boolean boolean13 = fila11.vazia();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        boolean boolean16 = fila14.vazia();
        int int17 = fila14.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        fila18.item = objArray23;
        fila14.item = objArray23;
        java.lang.Object[] objArray26 = fila14.item;
        fila11.item = objArray26;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.tras = '#';
        fila28.tras = (short) 0;
        fila28.tras = (short) 10;
        int int36 = fila28.tras;
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        java.lang.Object[] objArray39 = fila37.item;
        fila28.item = objArray39;
        fila11.item = objArray39;
        fila0.item = objArray39;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        fila0.frente = 0;
        fila0.tras = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        int int15 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.frente;
        fila0.tras = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        java.lang.Object[] objArray5 = fila3.item;
        fila0.item = objArray5;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 101;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        int int9 = fila0.tras;
        java.lang.Object[] objArray10 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

