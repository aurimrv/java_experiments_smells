package ds.seed9006;

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
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.ultimo = '#';
        lista0.ultimo = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        lista8.primeiro = (short) 0;
        lista8.insere((java.lang.Object) (-1L));
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) '#');
        int int19 = lista16.ultimo;
        java.lang.Object[] objArray20 = lista16.item;
        lista8.item = objArray20;
        lista0.item = objArray20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.ultimo = (short) 100;
        int int12 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        lista0.ultimo = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.ultimo = (byte) 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        boolean boolean8 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        lista0.ultimo = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        int int21 = lista13.pos;
        lista13.ultimo = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista13.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.ultimo = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        int int34 = lista0.primeiro;
        lista0.pos = 'a';
        int int37 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista12.item = objArray32;
        lista8.item = objArray32;
        lista0.item = objArray32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        int int34 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) '#');
        lista6.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.pos = ' ';
        lista10.pos = 0;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        int int20 = lista16.pos;
        int int21 = lista16.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista16.insere((java.lang.Object) lista22);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista24.item = objArray28;
        java.lang.Object[] objArray30 = lista24.item;
        lista22.item = objArray30;
        lista10.item = objArray30;
        lista6.item = objArray30;
        lista0.insere((java.lang.Object) objArray30);
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        int int37 = lista35.ultimo;
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) '#');
        int int41 = lista38.ultimo;
        java.lang.Object[] objArray42 = lista38.item;
        lista35.item = objArray42;
        lista0.item = objArray42;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

