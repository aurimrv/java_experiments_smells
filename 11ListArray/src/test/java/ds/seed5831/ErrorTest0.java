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
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.primeiro;
        lista6.ultimo = 10;
        java.lang.Object[] objArray10 = lista6.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        lista0.insere((java.lang.Object) wildcardClass11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        int int6 = lista0.ultimo;
        lista0.pos = (short) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        lista9.primeiro = (byte) -1;
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        int int24 = lista15.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista15.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = ' ';
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        boolean boolean12 = lista6.vazia();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray15 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        int int6 = lista4.ultimo;
        lista4.primeiro = '#';
        int int9 = lista4.ultimo;
        java.lang.Object[] objArray10 = lista4.item;
        lista4.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.ultimo = 100;
        lista12.ultimo = '4';
        lista12.primeiro = (byte) -1;
        lista12.insere((java.lang.Object) 35);
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista12.item = objArray26;
        lista4.item = objArray26;
        java.lang.Object[] objArray29 = lista4.item;
        lista0.item = objArray29;
        lista0.pos = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.ultimo = 10;
        lista7.primeiro = (short) 0;
        java.lang.Object[] objArray13 = lista7.item;
        java.lang.Object[] objArray14 = lista7.item;
        lista0.insere((java.lang.Object) lista7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista7.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        java.lang.Object[] objArray23 = lista18.item;
        int int24 = lista18.primeiro;
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        int int6 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        int int6 = lista4.ultimo;
        lista4.primeiro = '#';
        int int9 = lista4.ultimo;
        java.lang.Object[] objArray10 = lista4.item;
        lista4.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.ultimo = 100;
        lista12.ultimo = '4';
        lista12.primeiro = (byte) -1;
        lista12.insere((java.lang.Object) 35);
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista12.item = objArray26;
        lista4.item = objArray26;
        java.lang.Object[] objArray29 = lista4.item;
        lista0.item = objArray29;
        boolean boolean31 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.ultimo = 32;
        int int18 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = 35;
        lista0.ultimo = 'a';
        lista0.primeiro = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 100;
        int int9 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 100;
        lista16.ultimo = '4';
        int int21 = lista16.pos;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        java.lang.Object[] objArray27 = lista22.item;
        lista16.item = objArray27;
        lista16.pos = 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 100;
        lista31.primeiro = '#';
        java.lang.Object[] objArray36 = lista31.item;
        lista31.primeiro = 35;
        lista16.insere((java.lang.Object) lista31);
        lista16.pos = 100;
        lista0.insere((java.lang.Object) lista16);
        int int43 = lista16.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista16.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        lista4.ultimo = 100;
        lista4.ultimo = '4';
        int int9 = lista4.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        java.lang.Object[] objArray15 = lista10.item;
        lista4.item = objArray15;
        int int17 = lista4.primeiro;
        int int18 = lista4.primeiro;
        java.lang.Object[] objArray19 = lista4.item;
        lista0.item = objArray19;
        int int21 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.primeiro;
        lista19.ultimo = 10;
        lista19.primeiro = (short) 0;
        java.lang.Object[] objArray25 = lista19.item;
        lista2.item = objArray25;
        lista2.ultimo = (short) 100;
        boolean boolean29 = lista2.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '4';
        lista6.insere((java.lang.Object) 10.0d);
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        lista0.pos = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista0.item = objArray22;
        int int24 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        int int19 = lista2.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.pos = (byte) -1;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        int int10 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.ultimo = 'a';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.ultimo = '4';
        int int20 = lista15.pos;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista15.item = objArray26;
        lista0.item = objArray26;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.pos = (byte) -1;
        int int8 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.pos = (byte) -1;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = 0;
        lista7.imprime();
        lista7.insere((java.lang.Object) 10.0f);
        lista7.primeiro = (short) -1;
        int int16 = lista7.pos;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray18 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.pos = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        boolean boolean15 = lista9.vazia();
        int int16 = lista9.pos;
        lista9.pos = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        int int24 = lista19.ultimo;
        java.lang.Object[] objArray25 = lista19.item;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.imprime();
        lista26.ultimo = ' ';
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        java.lang.Object[] objArray37 = lista32.item;
        boolean boolean38 = lista32.vazia();
        lista32.imprime();
        lista26.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray41 = lista26.item;
        lista19.insere((java.lang.Object) objArray41);
        lista9.item = objArray41;
        lista0.item = objArray41;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        int int17 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        int int6 = lista0.ultimo;
        lista0.pos = (short) 1;
        boolean boolean9 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 100;
        lista13.ultimo = '4';
        lista13.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass20 = lista13.getClass();
        lista11.insere((java.lang.Object) wildcardClass20);
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        java.lang.Object[] objArray33 = lista27.item;
        lista22.item = objArray33;
        lista22.pos = (short) 100;
        boolean boolean37 = lista22.vazia();
        java.lang.Object[] objArray38 = lista22.item;
        lista11.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        boolean boolean41 = lista0.vazia();
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 100;
        lista47.ultimo = '4';
        int int52 = lista47.pos;
        java.lang.Object[] objArray53 = lista47.item;
        lista42.item = objArray53;
        lista42.pos = (short) 100;
        java.lang.Object[] objArray57 = lista42.item;
        lista0.item = objArray57;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.ultimo = '4';
        int int26 = lista21.pos;
        java.lang.Object[] objArray27 = lista21.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.ultimo = '4';
        int int33 = lista28.pos;
        java.lang.Object[] objArray34 = lista28.item;
        lista21.item = objArray34;
        int int36 = lista21.ultimo;
        lista19.insere((java.lang.Object) lista21);
        lista19.imprime();
        lista19.ultimo = 'a';
        boolean boolean41 = lista19.vazia();
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista42.primeiro = (byte) -1;
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.primeiro;
        lista50.ultimo = 10;
        lista50.pos = ' ';
        lista50.ultimo = 1;
        java.lang.Object[] objArray58 = lista50.item;
        lista42.item = objArray58;
        ds.Lista lista60 = new ds.Lista();
        int int61 = lista60.pos;
        int int62 = lista60.ultimo;
        lista60.primeiro = '#';
        lista60.primeiro = 0;
        lista42.insere((java.lang.Object) 0);
        java.lang.Object[] objArray68 = lista42.item;
        java.lang.Object[] objArray69 = lista42.item;
        lista19.item = objArray69;
        lista0.insere((java.lang.Object) lista19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista19.imprime();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        int int5 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

