package ds.seed5838;

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
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        lista0.ultimo = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) 0L);
        lista18.ultimo = '#';
        lista18.pos = 10;
        ds.Lista lista27 = new ds.Lista();
        lista27.pos = 10;
        lista27.pos = (byte) 100;
        int int32 = lista27.pos;
        lista27.pos = (byte) 100;
        int int35 = lista27.pos;
        lista18.insere((java.lang.Object) int35);
        lista0.insere((java.lang.Object) int35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        boolean boolean13 = lista3.vazia();
        int int14 = lista3.pos;
        lista0.insere((java.lang.Object) int14);
        int int16 = lista0.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.imprime();
        int int21 = lista17.ultimo;
        boolean boolean22 = lista17.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        boolean boolean26 = lista23.vazia();
        int int27 = lista23.primeiro;
        java.lang.Object[] objArray28 = lista23.item;
        lista17.item = objArray28;
        java.lang.Object[] objArray30 = lista17.item;
        lista0.item = objArray30;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 100.0d, (byte) 100, lista18, 1L };
        lista7.item = objArray20;
        java.lang.Class<?> wildcardClass22 = objArray20.getClass();
        lista0.insere((java.lang.Object) objArray20);
        int int24 = lista0.ultimo;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        lista25.ultimo = ' ';
        boolean boolean33 = lista25.vazia();
        lista25.ultimo = 35;
        java.lang.Object[] objArray36 = lista25.item;
        lista0.insere((java.lang.Object) lista25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista25.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        int int9 = lista3.primeiro;
        lista3.ultimo = 0;
        lista3.primeiro = 0;
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        java.lang.Object[] objArray16 = lista0.item;
        lista0.ultimo = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        int int11 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        lista0.insere((java.lang.Object) (-1.0f));
        int int11 = lista0.ultimo;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray14 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.insere((java.lang.Object) objArray12);
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.ultimo = ' ';
        boolean boolean23 = lista15.vazia();
        java.lang.Object[] objArray24 = lista15.item;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista26.imprime();
        lista26.pos = (short) 100;
        int int31 = lista26.pos;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        lista32.insere((java.lang.Object) 0L);
        lista32.ultimo = '#';
        lista32.pos = 10;
        ds.Lista lista41 = new ds.Lista();
        lista41.pos = 10;
        lista41.pos = (byte) 100;
        int int46 = lista41.pos;
        lista41.pos = (byte) 100;
        int int49 = lista41.pos;
        lista32.insere((java.lang.Object) int49);
        lista26.insere((java.lang.Object) lista32);
        lista0.insere((java.lang.Object) lista32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista32.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        lista0.ultimo = (byte) 100;
        int int9 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        int int15 = lista3.pos;
        lista0.insere((java.lang.Object) lista3);
        lista0.ultimo = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        int int13 = lista9.ultimo;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Object[] objArray16 = lista9.item;
        lista9.imprime();
        java.lang.Object[] objArray18 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        lista9.ultimo = 1;
        boolean boolean22 = lista9.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista9.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.pos = 97;
        lista0.ultimo = 101;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.pos = 10;
        lista5.pos = (byte) 100;
        int int10 = lista5.pos;
        lista5.pos = (byte) 100;
        lista5.pos = 100;
        lista5.pos = (byte) 0;
        int int17 = lista5.pos;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) 0L);
        boolean boolean23 = lista18.vazia();
        lista18.primeiro = (byte) -1;
        int int26 = lista18.primeiro;
        ds.Lista lista27 = new ds.Lista();
        lista27.pos = 10;
        lista27.imprime();
        lista27.primeiro = (short) 0;
        java.lang.Object[] objArray33 = lista27.item;
        java.lang.Object[] objArray34 = lista27.item;
        lista18.item = objArray34;
        lista5.item = objArray34;
        lista0.item = objArray34;
        lista0.ultimo = 101;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

