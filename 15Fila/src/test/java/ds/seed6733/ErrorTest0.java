package ds.seed6733;

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
        int int1 = fila0.frente;
        fila0.frente = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray7 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        int int12 = fila5.frente;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.frente = '4';
        boolean boolean17 = fila13.vazia();
        java.lang.Object[] objArray18 = fila13.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        fila13.item = objArray24;
        fila5.item = objArray24;
        fila0.item = objArray24;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila8.item = objArray19;
        fila0.item = objArray19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.enfileira((java.lang.Object) objArray11);
        fila0.frente = 2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        fila0.frente = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        int int13 = fila0.frente;
        boolean boolean14 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object[] objArray7 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.frente = (short) 10;
        fila20.frente = (short) -1;
        boolean boolean26 = fila20.vazia();
        java.lang.Object[] objArray27 = fila20.item;
        fila13.item = objArray27;
        fila0.enfileira((java.lang.Object) objArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        fila0.tras = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        fila0.tras = (byte) -1;
        fila0.frente = 2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.frente = 52;
        java.lang.Object[] objArray18 = fila0.item;
        int int19 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        java.lang.Object[] objArray18 = fila0.item;
        fila0.frente = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila3.item = objArray17;
        fila0.item = objArray17;
        fila0.frente = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.frente = 0;
        fila0.frente = (short) 1;
        boolean boolean11 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 10;
        fila11.frente = (short) -1;
        boolean boolean17 = fila11.vazia();
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila19.item = objArray30;
        fila11.item = objArray30;
        fila0.item = objArray30;
        java.lang.Object obj34 = fila0.desenfileira();
        int int35 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        java.lang.Object obj9 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.frente = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        fila0.frente = 52;
        java.lang.Object obj15 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        fila6.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.tras = (byte) 0;
        java.lang.Object[] objArray28 = fila24.item;
        fila22.item = objArray28;
        fila6.item = objArray28;
        fila0.item = objArray28;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.frente = ' ';
        fila0.frente = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        fila0.frente = '#';
        java.lang.Object obj20 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.tras = 1;
        fila0.frente = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        int int16 = fila9.frente;
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (byte) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila18.enfileira((java.lang.Object) objArray25);
        fila9.enfileira((java.lang.Object) objArray25);
        fila0.item = objArray25;
        boolean boolean29 = fila0.vazia();
        int int30 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

