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
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista5.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        lista0.ultimo = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        lista0.item = objArray10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.ultimo;
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 10;
        lista24.insere((java.lang.Object) lista26);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        int int33 = lista30.primeiro;
        int int34 = lista30.primeiro;
        lista26.insere((java.lang.Object) int34);
        java.lang.Object[] objArray36 = lista26.item;
        lista19.item = objArray36;
        lista19.primeiro = ' ';
        int int40 = lista19.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista41.imprime();
        int int44 = lista41.ultimo;
        int int45 = lista41.pos;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        lista46.imprime();
        lista46.ultimo = '4';
        java.lang.Object[] objArray51 = lista46.item;
        lista41.item = objArray51;
        int int53 = lista41.primeiro;
        int int54 = lista41.primeiro;
        int int55 = lista41.ultimo;
        lista41.primeiro = 32;
        lista41.imprime();
        java.lang.Object[] objArray59 = lista41.item;
        lista19.item = objArray59;
        lista2.item = objArray59;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        lista2.pos = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 10;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        int int15 = lista13.pos;
        lista13.primeiro = 100;
        java.lang.Class<?> wildcardClass18 = lista13.getClass();
        lista5.insere((java.lang.Object) wildcardClass18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista5.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        lista2.pos = (short) 1;
        java.lang.Object[] objArray17 = lista2.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        lista2.pos = 2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.pos = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        boolean boolean17 = lista0.vazia();
        boolean boolean18 = lista0.vazia();
        lista0.pos = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        int int7 = lista0.pos;
        java.lang.Object[] objArray8 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        lista13.ultimo = '#';
        lista13.ultimo = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista13.imprime();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 0;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = (byte) 0;
        lista0.ultimo = 12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        int int14 = lista10.primeiro;
        lista10.pos = (short) -1;
        lista10.pos = (short) 1;
        lista10.imprime();
        java.lang.Object[] objArray20 = lista10.item;
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        lista0.insere((java.lang.Object) wildcardClass21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1L, 0.0f };
        lista29.item = objArray33;
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista22.item = objArray33;
        lista14.item = objArray33;
        int int39 = lista14.pos;
        boolean boolean40 = lista14.vazia();
        lista2.insere((java.lang.Object) boolean40);
        int int42 = lista2.pos;
        int int43 = lista2.ultimo;
        int int44 = lista2.pos;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        int int47 = lista45.pos;
        java.lang.Object[] objArray48 = lista45.item;
        lista45.primeiro = (byte) -1;
        java.lang.Object[] objArray51 = lista45.item;
        lista2.item = objArray51;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        int int10 = lista7.ultimo;
        java.lang.Object[] objArray11 = lista7.item;
        lista0.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        boolean boolean22 = lista18.vazia();
        lista13.insere((java.lang.Object) lista18);
        lista18.ultimo = 10;
        lista18.ultimo = ' ';
        lista0.insere((java.lang.Object) lista18);
        lista0.ultimo = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista2.imprime();
    }
}

