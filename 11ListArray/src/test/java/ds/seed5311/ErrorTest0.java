package ds.seed5311;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = 2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.primeiro = 0;
        ds.Lista lista19 = new ds.Lista();
        lista19.primeiro = '4';
        java.lang.Object obj22 = new java.lang.Object();
        lista19.insere(obj22);
        lista19.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        java.lang.Object[] objArray27 = lista25.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        java.lang.Object[] objArray30 = lista28.item;
        lista25.item = objArray30;
        boolean boolean32 = lista25.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        lista33.pos = '4';
        lista33.primeiro = '4';
        lista33.imprime();
        java.lang.Object[] objArray41 = lista33.item;
        lista25.item = objArray41;
        lista19.item = objArray41;
        lista0.item = objArray41;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = 'a';
        lista0.pos = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        boolean boolean15 = lista8.vazia();
        lista8.pos = 100;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista8.item = objArray20;
        lista0.item = objArray20;
        lista0.imprime();
        lista0.ultimo = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.ultimo = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 35;
        int int15 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.ultimo = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

