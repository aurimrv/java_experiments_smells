package ds.seed5838;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0501");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        lista0.ultimo = (short) 10;
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0502");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.imprime();
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.imprime();
        int int15 = lista11.ultimo;
        int int16 = lista11.primeiro;
        lista0.insere((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0503");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0504");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        lista6.ultimo = 32;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        lista28.primeiro = (short) 1;
        int int35 = lista28.pos;
        lista28.primeiro = 100;
        int int38 = lista28.primeiro;
        lista28.primeiro = (short) 100;
        lista28.pos = (-1);
        lista6.insere((java.lang.Object) lista28);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0505");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 101;
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0506");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.imprime();
        lista0.pos = (byte) 1;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        lista12.primeiro = (short) 1;
        int int19 = lista12.pos;
        int int20 = lista12.pos;
        int int21 = lista12.pos;
        lista0.insere((java.lang.Object) lista12);
        lista12.pos = 'a';
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0507");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.item = objArray20;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0508");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.ultimo = 1;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        int int31 = lista25.primeiro;
        lista25.ultimo = 0;
        lista25.primeiro = 0;
        lista25.pos = (short) 10;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        lista38.imprime();
        boolean boolean41 = lista38.vazia();
        int int42 = lista38.primeiro;
        java.lang.Object[] objArray43 = lista38.item;
        lista38.ultimo = 10;
        java.lang.Object[] objArray46 = lista38.item;
        lista25.item = objArray46;
        lista0.item = objArray46;
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        lista49.pos = (byte) 100;
        lista49.primeiro = (short) 1;
        int int56 = lista49.pos;
        int int57 = lista49.primeiro;
        java.lang.Object[] objArray58 = lista49.item;
        lista0.item = objArray58;
        int int60 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0509");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        lista9.pos = 100;
        lista9.pos = (byte) 0;
        lista6.insere((java.lang.Object) (byte) 0);
        lista6.primeiro = 'a';
        lista0.insere((java.lang.Object) 'a');
        lista0.pos = (short) -1;
        int int27 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0510");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) 10;
        java.lang.Object[] objArray21 = lista0.item;
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0511");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) 0L);
        boolean boolean14 = lista9.vazia();
        lista9.primeiro = (byte) -1;
        java.lang.Object[] objArray17 = lista9.item;
        lista0.item = objArray17;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        lista19.item = objArray24;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.insere((java.lang.Object) lista19);
        boolean boolean28 = lista0.vazia();
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0512");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0513");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        int int9 = lista0.primeiro;
        lista0.pos = 0;
        int int12 = lista0.primeiro;
        int int13 = lista0.pos;
        int int14 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0514");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.primeiro;
        lista0.primeiro = 10;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0515");
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
        lista0.pos = 35;
        lista0.primeiro = (short) -1;
        int int21 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0516");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.pos = (byte) 100;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0517");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista17.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista17.getClass();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.imprime();
        int int30 = lista26.ultimo;
        boolean boolean31 = lista26.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        boolean boolean35 = lista32.vazia();
        int int36 = lista32.primeiro;
        java.lang.Object[] objArray37 = lista32.item;
        lista26.item = objArray37;
        lista0.insere((java.lang.Object) lista26);
        int int40 = lista0.pos;
        int int41 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0518");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        lista0.primeiro = (byte) 100;
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0519");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0520");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 97;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0521");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        lista3.ultimo = 0;
        int int25 = lista3.primeiro;
        int int26 = lista3.primeiro;
        int int27 = lista3.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0522");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 32;
        int int15 = lista0.pos;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0523");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.pos = 10;
        lista1.pos = (byte) 100;
        boolean boolean6 = lista1.vazia();
        lista1.ultimo = '#';
        lista1.ultimo = (short) 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        int int20 = lista14.primeiro;
        lista14.ultimo = 0;
        lista14.primeiro = 0;
        java.lang.Class<?> wildcardClass25 = lista14.getClass();
        lista11.insere((java.lang.Object) wildcardClass25);
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        lista27.imprime();
        boolean boolean30 = lista27.vazia();
        int int31 = lista27.primeiro;
        java.lang.Object[] objArray32 = lista27.item;
        lista27.ultimo = 10;
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        lista35.imprime();
        boolean boolean38 = lista35.vazia();
        int int39 = lista35.primeiro;
        java.lang.Object[] objArray40 = lista35.item;
        lista27.item = objArray40;
        lista11.item = objArray40;
        lista1.item = objArray40;
        lista0.insere((java.lang.Object) objArray40);
        ds.Lista lista45 = new ds.Lista();
        lista45.pos = 10;
        lista45.pos = (byte) 100;
        lista45.primeiro = (short) 1;
        lista0.insere((java.lang.Object) lista45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0524");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (-1);
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        java.lang.Object[] objArray30 = lista25.item;
        lista12.item = objArray30;
        lista0.item = objArray30;
        java.lang.Object[] objArray33 = lista0.item;
        lista0.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0525");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        lista0.pos = 100;
        java.lang.Object[] objArray15 = lista0.item;
        lista0.primeiro = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        lista18.pos = (byte) 100;
        lista18.primeiro = (short) 1;
        int int25 = lista18.pos;
        lista18.pos = '#';
        lista18.imprime();
        boolean boolean29 = lista18.vazia();
        int int30 = lista18.ultimo;
        java.lang.Object[] objArray31 = lista18.item;
        lista0.item = objArray31;
        lista0.pos = (short) 10;
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0526");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        lista0.pos = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        boolean boolean16 = lista11.vazia();
        lista11.ultimo = (byte) 10;
        int int19 = lista11.primeiro;
        int int20 = lista11.primeiro;
        lista0.insere((java.lang.Object) int20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0527");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        lista0.primeiro = '#';
        lista0.pos = ' ';
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        java.lang.Object[] objArray20 = lista17.item;
        int int21 = lista17.ultimo;
        lista17.imprime();
        lista17.pos = 101;
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista26.imprime();
        boolean boolean29 = lista26.vazia();
        int int30 = lista26.primeiro;
        java.lang.Object[] objArray31 = lista26.item;
        lista26.ultimo = 10;
        java.lang.Object[] objArray34 = lista26.item;
        lista0.item = objArray34;
        lista0.pos = '#';
        lista0.insere((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0528");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 32;
        int int15 = lista0.pos;
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0529");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista17.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista17.getClass();
        lista0.insere((java.lang.Object) lista17);
        int int26 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0530");
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
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        lista0.pos = ' ';
        boolean boolean22 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0531");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        lista0.primeiro = ' ';
        int int10 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0532");
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
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        lista0.ultimo = 0;
        int int22 = lista0.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0533");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.pos = ' ';
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0534");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.primeiro;
        java.lang.Object[] objArray13 = lista3.item;
        lista3.ultimo = (short) 10;
        java.lang.Object obj16 = null;
        lista3.insere(obj16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0535");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        lista15.primeiro = (short) 1;
        int int22 = lista15.pos;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.ultimo;
        java.lang.Object[] objArray25 = new java.lang.Object[] { int24 };
        lista15.item = objArray25;
        lista15.imprime();
        lista15.primeiro = '#';
        lista15.pos = ' ';
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = 10;
        java.lang.Object[] objArray35 = lista32.item;
        int int36 = lista32.ultimo;
        lista32.imprime();
        lista32.pos = 101;
        lista15.insere((java.lang.Object) lista32);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        lista41.imprime();
        boolean boolean44 = lista41.vazia();
        int int45 = lista41.primeiro;
        java.lang.Object[] objArray46 = lista41.item;
        lista41.ultimo = 10;
        java.lang.Object[] objArray49 = lista41.item;
        lista15.item = objArray49;
        lista15.pos = '#';
        lista0.insere((java.lang.Object) lista15);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0536");
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
        lista0.ultimo = '#';
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0537");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        boolean boolean26 = lista0.vazia();
        int int27 = lista0.ultimo;
        boolean boolean28 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0538");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        java.lang.Object[] objArray13 = lista9.item;
        lista9.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista9);
        lista9.imprime();
        int int18 = lista9.ultimo;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0539");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        lista4.primeiro = (short) 1;
        lista4.pos = 100;
        java.lang.Class<?> wildcardClass12 = lista4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0540");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        lista6.pos = (byte) 0;
        int int12 = lista6.pos;
        lista6.imprime();
        java.lang.Object[] objArray14 = lista6.item;
        lista0.insere((java.lang.Object) objArray14);
        int int16 = lista0.primeiro;
        lista0.pos = '4';
        lista0.pos = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0541");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista10.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        lista13.insere((java.lang.Object) 0L);
        int int18 = lista13.primeiro;
        lista10.insere((java.lang.Object) lista13);
        lista13.primeiro = 'a';
        lista13.imprime();
        lista13.ultimo = (byte) 10;
        int int25 = lista13.ultimo;
        lista0.insere((java.lang.Object) int25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0542");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.imprime();
        int int16 = lista12.ultimo;
        boolean boolean17 = lista12.vazia();
        boolean boolean18 = lista12.vazia();
        java.lang.Object[] objArray19 = lista12.item;
        lista12.imprime();
        java.lang.Object[] objArray21 = lista12.item;
        java.lang.Object[] objArray22 = lista12.item;
        lista0.item = objArray22;
        boolean boolean24 = lista0.vazia();
        java.lang.Object[] objArray25 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0543");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        lista12.imprime();
        boolean boolean15 = lista12.vazia();
        int int16 = lista12.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        lista17.imprime();
        lista17.insere((java.lang.Object) 0L);
        int int22 = lista17.primeiro;
        lista17.primeiro = (-1);
        lista12.insere((java.lang.Object) (-1));
        int int26 = lista12.pos;
        lista0.insere((java.lang.Object) int26);
        java.lang.Object[] objArray28 = lista0.item;
        java.lang.Object[] objArray29 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0544");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista8.pos = (short) 100;
        int int13 = lista8.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        lista14.ultimo = '#';
        lista14.pos = 10;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.pos = (byte) 100;
        int int28 = lista23.pos;
        lista23.pos = (byte) 100;
        int int31 = lista23.pos;
        lista14.insere((java.lang.Object) int31);
        lista8.insere((java.lang.Object) lista14);
        lista8.ultimo = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0545");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0546");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        java.lang.Object[] objArray30 = lista25.item;
        lista12.item = objArray30;
        java.lang.Object[] objArray32 = lista12.item;
        lista3.insere((java.lang.Object) objArray32);
        lista3.pos = ' ';
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0547");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        int int20 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0548");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.pos = '#';
        int int12 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.imprime();
        lista14.imprime();
        boolean boolean19 = lista14.vazia();
        lista14.primeiro = (short) 100;
        int int22 = lista14.ultimo;
        java.lang.Object[] objArray23 = lista14.item;
        lista0.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        boolean boolean30 = lista25.vazia();
        lista25.ultimo = '#';
        lista25.insere((java.lang.Object) true);
        int int35 = lista25.primeiro;
        lista0.insere((java.lang.Object) lista25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0549");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0550");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.primeiro;
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0551");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 1);
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0552");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.ultimo = (byte) 1;
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0553");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        java.lang.Object[] objArray33 = lista0.item;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        int int39 = lista34.pos;
        lista34.pos = (byte) 100;
        lista34.pos = 100;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        lista44.primeiro = (short) 1;
        lista44.pos = 1;
        lista44.primeiro = (short) 10;
        lista44.primeiro = ' ';
        lista44.pos = 100;
        java.lang.Object[] objArray59 = lista44.item;
        lista44.primeiro = '#';
        lista34.insere((java.lang.Object) lista44);
        lista0.insere((java.lang.Object) lista44);
        lista44.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0554");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.pos = (short) 10;
        int int25 = lista0.primeiro;
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.pos = (byte) 100;
        boolean boolean31 = lista26.vazia();
        boolean boolean32 = lista26.vazia();
        lista26.pos = 10;
        lista0.insere((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0555");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        int int19 = lista14.primeiro;
        lista14.primeiro = (-1);
        lista9.insere((java.lang.Object) (-1));
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) 0L);
        boolean boolean28 = lista23.vazia();
        int int29 = lista23.primeiro;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        boolean boolean33 = lista30.vazia();
        int int34 = lista30.primeiro;
        java.lang.Object[] objArray35 = lista30.item;
        lista23.insere((java.lang.Object) objArray35);
        lista9.item = objArray35;
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        lista38.primeiro = 0;
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        lista49.pos = (byte) 100;
        int int54 = lista49.pos;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista49.item = objArray59;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 0L, lista9, 0, lista49, 10.0d };
        lista0.item = objArray62;
        lista0.ultimo = 0;
        lista0.imprime();
        java.lang.Class<?> wildcardClass67 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0556");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0557");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        lista3.primeiro = 'a';
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.primeiro = ' ';
        java.lang.Object[] objArray21 = null;
        lista12.item = objArray21;
        lista3.insere((java.lang.Object) objArray21);
        boolean boolean24 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0558");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0559");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.item = objArray20;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0560");
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
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        boolean boolean20 = lista15.vazia();
        boolean boolean21 = lista15.vazia();
        int int22 = lista15.ultimo;
        int int23 = lista15.pos;
        lista0.insere((java.lang.Object) int23);
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        int int31 = lista25.primeiro;
        lista25.ultimo = 0;
        lista25.primeiro = 0;
        lista25.pos = (short) 10;
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        java.lang.Object[] objArray43 = lista38.item;
        lista25.item = objArray43;
        lista25.imprime();
        java.lang.Object[] objArray46 = lista25.item;
        lista0.insere((java.lang.Object) lista25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0561");
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
        lista0.primeiro = (byte) 100;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0562");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0563");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        lista14.pos = 100;
        lista14.pos = (byte) 0;
        int int26 = lista14.pos;
        lista14.primeiro = '#';
        int int29 = lista14.primeiro;
        lista0.insere((java.lang.Object) int29);
        lista0.ultimo = (-1);
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0564");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        java.lang.Object[] objArray5 = lista0.item;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0565");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = 1;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        lista14.primeiro = (short) 1;
        lista14.pos = 1;
        lista14.ultimo = (short) 10;
        lista14.pos = 2;
        ds.Lista lista27 = new ds.Lista();
        lista27.pos = 10;
        lista27.pos = (byte) 100;
        lista27.primeiro = (short) 1;
        lista27.pos = 1;
        lista27.primeiro = (short) 10;
        lista27.primeiro = ' ';
        boolean boolean40 = lista27.vazia();
        int int41 = lista27.primeiro;
        lista27.pos = 97;
        lista27.ultimo = 101;
        lista14.insere((java.lang.Object) 101);
        lista0.insere((java.lang.Object) 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0566");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0567");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.imprime();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0568");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        lista15.primeiro = (short) 10;
        java.lang.Object[] objArray19 = lista15.item;
        lista0.item = objArray19;
        int int21 = lista0.ultimo;
        int int22 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0569");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.pos = 100;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0570");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        lista0.ultimo = (byte) 100;
        lista0.pos = 10;
        lista0.pos = 0;
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0571");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0572");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        int int15 = lista10.pos;
        int int16 = lista10.primeiro;
        lista10.ultimo = 0;
        lista10.primeiro = 0;
        lista10.pos = (short) 10;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.imprime();
        int int27 = lista23.ultimo;
        boolean boolean28 = lista23.vazia();
        boolean boolean29 = lista23.vazia();
        java.lang.Object[] objArray30 = lista23.item;
        lista23.imprime();
        java.lang.Object[] objArray32 = lista23.item;
        java.lang.Object[] objArray33 = lista23.item;
        lista10.insere((java.lang.Object) objArray33);
        ds.Lista lista35 = new ds.Lista();
        lista35.pos = 10;
        lista35.pos = (byte) 100;
        lista35.primeiro = (short) 1;
        lista35.pos = 1;
        lista35.primeiro = (short) 10;
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = 10;
        lista46.pos = (byte) 100;
        lista46.primeiro = (short) 1;
        int int53 = lista46.pos;
        ds.Lista lista54 = new ds.Lista();
        int int55 = lista54.ultimo;
        java.lang.Object[] objArray56 = new java.lang.Object[] { int55 };
        lista46.item = objArray56;
        lista35.item = objArray56;
        lista10.item = objArray56;
        lista0.item = objArray56;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[0]");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0573");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0574");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0575");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        boolean boolean19 = lista14.vazia();
        int int20 = lista14.primeiro;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        int int25 = lista21.primeiro;
        java.lang.Object[] objArray26 = lista21.item;
        lista14.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        int int29 = lista0.primeiro;
        java.lang.Object[] objArray30 = lista0.item;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0576");
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
        lista0.pos = 32;
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0577");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = (byte) 10;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0578");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        int int9 = lista0.primeiro;
        lista0.pos = 0;
        int int12 = lista0.primeiro;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        boolean boolean17 = lista14.vazia();
        lista14.pos = (byte) 0;
        int int20 = lista14.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        int int25 = lista21.primeiro;
        java.lang.Object[] objArray26 = lista21.item;
        lista14.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0579");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.imprime();
        int int6 = lista0.pos;
        lista0.ultimo = (byte) 10;
        int int9 = lista0.pos;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0580");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.pos = (byte) 100;
        lista11.pos = 100;
        lista11.pos = (byte) 0;
        int int23 = lista11.pos;
        boolean boolean24 = lista11.vazia();
        lista11.primeiro = (short) 1;
        lista11.ultimo = (byte) 10;
        boolean boolean29 = lista11.vazia();
        java.lang.Object[] objArray30 = lista11.item;
        lista0.insere((java.lang.Object) lista11);
        int int32 = lista0.pos;
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0581");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        lista0.imprime();
        lista0.pos = 12;
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        int int15 = lista10.pos;
        lista10.pos = (byte) 100;
        lista10.pos = 100;
        lista10.pos = (byte) 0;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.pos = (byte) 100;
        java.lang.Object[] objArray27 = lista22.item;
        lista10.item = objArray27;
        lista0.item = objArray27;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0582");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        lista3.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0583");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        java.lang.Object[] objArray8 = lista0.item;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0584");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.pos = (short) 0;
        lista0.ultimo = (short) 100;
        java.lang.Object[] objArray18 = lista0.item;
        java.lang.Class<?> wildcardClass19 = objArray18.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0585");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object obj11 = null;
        lista0.insere(obj11);
        int int13 = lista0.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        lista14.primeiro = (short) 1;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.ultimo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { int23 };
        lista14.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.pos = (byte) 100;
        int int31 = lista26.pos;
        lista26.pos = (byte) 100;
        lista26.pos = 100;
        lista26.pos = (byte) 0;
        int int38 = lista26.pos;
        boolean boolean39 = lista26.vazia();
        lista26.primeiro = (short) 1;
        lista14.insere((java.lang.Object) lista26);
        ds.Lista lista43 = new ds.Lista();
        lista43.pos = 10;
        lista43.pos = (byte) 100;
        int int48 = lista43.pos;
        int int49 = lista43.primeiro;
        lista43.ultimo = 0;
        lista43.primeiro = 0;
        lista43.pos = (short) 10;
        ds.Lista lista56 = new ds.Lista();
        lista56.imprime();
        lista56.imprime();
        boolean boolean59 = lista56.vazia();
        int int60 = lista56.primeiro;
        java.lang.Object[] objArray61 = lista56.item;
        lista56.ultimo = 10;
        java.lang.Object[] objArray64 = lista56.item;
        lista43.item = objArray64;
        lista26.item = objArray64;
        ds.Lista lista67 = new ds.Lista();
        lista67.pos = 10;
        lista67.pos = (byte) 100;
        lista67.primeiro = (short) 1;
        lista67.pos = 1;
        lista67.primeiro = (short) 10;
        lista67.primeiro = ' ';
        java.lang.Object[] objArray80 = lista67.item;
        lista67.imprime();
        java.lang.Object[] objArray82 = lista67.item;
        java.lang.Object[] objArray83 = lista67.item;
        lista26.item = objArray83;
        lista0.item = objArray83;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0586");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        lista14.pos = 100;
        lista14.pos = (byte) 0;
        int int26 = lista14.pos;
        lista14.primeiro = '#';
        int int29 = lista14.primeiro;
        lista0.insere((java.lang.Object) int29);
        lista0.ultimo = (-1);
        int int33 = lista0.primeiro;
        lista0.ultimo = 37;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0587");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 'a';
        int int9 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0588");
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
        lista0.pos = 32;
        lista0.ultimo = 35;
        lista0.pos = (short) 0;
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0589");
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
        int int16 = lista0.ultimo;
        int int17 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0590");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        lista0.pos = (byte) 10;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0591");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) 0;
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.pos = (-1);
        int int23 = lista12.primeiro;
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        int int29 = lista24.pos;
        int int30 = lista24.primeiro;
        lista24.ultimo = 0;
        lista24.primeiro = 0;
        lista24.pos = (short) 10;
        ds.Lista lista37 = new ds.Lista();
        lista37.pos = 10;
        lista37.pos = (byte) 100;
        java.lang.Object[] objArray42 = lista37.item;
        lista24.item = objArray42;
        lista12.item = objArray42;
        int int45 = lista12.primeiro;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0592");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0593");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.pos = (byte) 100;
        int int13 = lista8.pos;
        int int14 = lista8.primeiro;
        lista8.ultimo = 0;
        lista8.primeiro = 0;
        lista8.pos = (short) 10;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        int int25 = lista21.primeiro;
        java.lang.Object[] objArray26 = lista21.item;
        lista21.ultimo = 10;
        java.lang.Object[] objArray29 = lista21.item;
        lista8.item = objArray29;
        lista0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0594");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0595");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0596");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.pos;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0597");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        lista7.pos = (byte) 0;
        int int13 = lista7.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        boolean boolean17 = lista14.vazia();
        int int18 = lista14.primeiro;
        java.lang.Object[] objArray19 = lista14.item;
        lista7.insere((java.lang.Object) objArray19);
        lista7.imprime();
        int int22 = lista7.primeiro;
        lista0.insere((java.lang.Object) int22);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0598");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = lista0.item;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0599");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        lista0.pos = 10;
        int int22 = lista0.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.pos = (byte) 100;
        int int28 = lista23.pos;
        lista23.pos = (byte) 100;
        lista23.pos = 100;
        lista23.pos = (byte) 0;
        int int35 = lista23.pos;
        boolean boolean36 = lista23.vazia();
        lista23.primeiro = (short) 1;
        lista23.pos = '#';
        lista23.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.imprime();
        java.lang.Object[] objArray48 = lista44.item;
        lista0.item = objArray48;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0600");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        lista3.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0601");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        boolean boolean6 = lista0.vazia();
        lista0.pos = (short) 100;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0602");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        lista0.primeiro = 10;
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0603");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        lista16.ultimo = '#';
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        java.lang.Object[] objArray30 = lista28.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray33 = lista31.item;
        lista28.item = objArray33;
        ds.Lista lista35 = new ds.Lista();
        lista35.pos = 10;
        lista35.pos = (byte) 100;
        int int40 = lista35.pos;
        lista35.pos = (byte) 100;
        lista35.pos = 100;
        lista35.pos = (byte) 0;
        int int47 = lista35.pos;
        boolean boolean48 = lista35.vazia();
        java.lang.Object[] objArray49 = lista35.item;
        lista28.item = objArray49;
        lista16.item = objArray49;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0604");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.imprime();
        int int15 = lista11.ultimo;
        boolean boolean16 = lista11.vazia();
        boolean boolean17 = lista11.vazia();
        java.lang.Object[] objArray18 = lista11.item;
        lista11.imprime();
        java.lang.Object[] objArray20 = lista11.item;
        java.lang.Object[] objArray21 = lista11.item;
        lista11.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        boolean boolean26 = lista23.vazia();
        int int27 = lista23.primeiro;
        java.lang.Object[] objArray28 = lista23.item;
        lista23.ultimo = 10;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        lista31.imprime();
        boolean boolean34 = lista31.vazia();
        int int35 = lista31.primeiro;
        java.lang.Object[] objArray36 = lista31.item;
        lista23.item = objArray36;
        java.lang.Object[] objArray38 = lista23.item;
        lista11.item = objArray38;
        lista0.item = objArray38;
        lista0.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        lista42.imprime();
        boolean boolean45 = lista42.vazia();
        int int46 = lista42.primeiro;
        java.lang.Object[] objArray47 = lista42.item;
        lista42.ultimo = 10;
        boolean boolean50 = lista42.vazia();
        java.lang.Object[] objArray51 = lista42.item;
        java.lang.Object[] objArray52 = lista42.item;
        lista0.item = objArray52;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0605");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.ultimo = (byte) 100;
        lista0.ultimo = 1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0606");
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
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        lista17.imprime();
        lista17.insere((java.lang.Object) 0L);
        boolean boolean22 = lista17.vazia();
        int int23 = lista17.primeiro;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        lista24.imprime();
        boolean boolean27 = lista24.vazia();
        int int28 = lista24.primeiro;
        java.lang.Object[] objArray29 = lista24.item;
        lista17.insere((java.lang.Object) objArray29);
        lista0.item = objArray29;
        java.lang.Class<?> wildcardClass32 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0607");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista17.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista17.getClass();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.imprime();
        int int30 = lista26.ultimo;
        boolean boolean31 = lista26.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        boolean boolean35 = lista32.vazia();
        int int36 = lista32.primeiro;
        java.lang.Object[] objArray37 = lista32.item;
        lista26.item = objArray37;
        lista0.insere((java.lang.Object) lista26);
        int int40 = lista0.pos;
        java.lang.Object[] objArray41 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0608");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        boolean boolean19 = lista14.vazia();
        int int20 = lista14.primeiro;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        int int25 = lista21.primeiro;
        java.lang.Object[] objArray26 = lista21.item;
        lista14.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        java.lang.Class<?> wildcardClass29 = objArray26.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0609");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.pos = (byte) 100;
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 100.0d, (byte) 100, lista34, 1L };
        lista23.item = objArray36;
        int int38 = lista23.pos;
        int int39 = lista23.ultimo;
        lista3.insere((java.lang.Object) int39);
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0610");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        java.lang.Object[] objArray17 = lista12.item;
        lista0.item = objArray17;
        int int19 = lista0.pos;
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.pos = (byte) 100;
        lista20.primeiro = (short) 1;
        int int27 = lista20.pos;
        int int28 = lista20.pos;
        int int29 = lista20.ultimo;
        int int30 = lista20.ultimo;
        ds.Lista lista31 = new ds.Lista();
        lista31.pos = 10;
        lista31.imprime();
        int int35 = lista31.ultimo;
        boolean boolean36 = lista31.vazia();
        boolean boolean37 = lista31.vazia();
        java.lang.Object[] objArray38 = lista31.item;
        lista31.imprime();
        java.lang.Object[] objArray40 = lista31.item;
        java.lang.Object[] objArray41 = lista31.item;
        lista31.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        lista43.imprime();
        boolean boolean46 = lista43.vazia();
        int int47 = lista43.primeiro;
        java.lang.Object[] objArray48 = lista43.item;
        lista43.ultimo = 10;
        ds.Lista lista51 = new ds.Lista();
        lista51.imprime();
        lista51.imprime();
        boolean boolean54 = lista51.vazia();
        int int55 = lista51.primeiro;
        java.lang.Object[] objArray56 = lista51.item;
        lista43.item = objArray56;
        java.lang.Object[] objArray58 = lista43.item;
        lista31.item = objArray58;
        lista20.item = objArray58;
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass63 = lista20.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0611");
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
        lista18.pos = 10;
        lista18.pos = (byte) 100;
        lista18.primeiro = (short) 1;
        lista18.pos = 1;
        lista18.primeiro = (short) 10;
        lista18.primeiro = ' ';
        java.lang.Object[] objArray31 = lista18.item;
        lista18.pos = (short) 0;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        lista34.primeiro = (short) 1;
        int int41 = lista34.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.ultimo;
        java.lang.Object[] objArray44 = new java.lang.Object[] { int43 };
        lista34.item = objArray44;
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = 10;
        lista46.pos = (byte) 100;
        boolean boolean51 = lista46.vazia();
        lista46.ultimo = '#';
        java.lang.Object[] objArray54 = lista46.item;
        lista34.insere((java.lang.Object) objArray54);
        lista18.item = objArray54;
        lista0.item = objArray54;
        lista0.primeiro = (byte) 100;
        java.lang.Object[] objArray60 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0612");
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
        int int17 = lista0.ultimo;
        lista0.pos = (short) 1;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0613");
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
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        lista17.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        lista20.insere((java.lang.Object) 0L);
        int int25 = lista20.primeiro;
        lista17.insere((java.lang.Object) lista20);
        lista20.primeiro = 'a';
        lista20.imprime();
        boolean boolean30 = lista20.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.pos = 10;
        lista31.pos = (byte) 100;
        lista31.primeiro = (short) 1;
        int int38 = lista31.pos;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.ultimo;
        java.lang.Object[] objArray41 = new java.lang.Object[] { int40 };
        lista31.item = objArray41;
        ds.Lista lista43 = new ds.Lista();
        lista43.pos = 10;
        lista43.pos = (byte) 100;
        boolean boolean48 = lista43.vazia();
        lista43.ultimo = '#';
        java.lang.Object[] objArray51 = lista43.item;
        lista31.insere((java.lang.Object) objArray51);
        lista20.insere((java.lang.Object) objArray51);
        lista0.item = objArray51;
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0614");
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
        lista0.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0615");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        lista0.pos = 101;
        int int13 = lista0.pos;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0616");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = (short) 1;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0617");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 1;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0618");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        lista8.pos = (byte) 0;
        int int14 = lista8.ultimo;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.imprime();
        boolean boolean18 = lista15.vazia();
        int int19 = lista15.primeiro;
        java.lang.Object[] objArray20 = lista15.item;
        lista8.insere((java.lang.Object) objArray20);
        lista8.imprime();
        boolean boolean23 = lista8.vazia();
        lista0.insere((java.lang.Object) lista8);
        lista8.pos = (short) 1;
        lista8.primeiro = 32;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0619");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = 0;
        lista0.ultimo = 35;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0620");
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
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        lista0.ultimo = 0;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0621");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        int int10 = lista0.primeiro;
        lista0.primeiro = (short) 100;
        lista0.pos = (-1);
        lista0.ultimo = 0;
        boolean boolean17 = lista0.vazia();
        int int18 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0622");
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
        lista18.pos = 10;
        lista18.pos = (byte) 100;
        lista18.primeiro = (short) 1;
        lista18.pos = 1;
        lista18.primeiro = (short) 10;
        lista18.primeiro = ' ';
        java.lang.Object[] objArray31 = lista18.item;
        lista18.pos = (short) 0;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        lista34.primeiro = (short) 1;
        int int41 = lista34.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.ultimo;
        java.lang.Object[] objArray44 = new java.lang.Object[] { int43 };
        lista34.item = objArray44;
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = 10;
        lista46.pos = (byte) 100;
        boolean boolean51 = lista46.vazia();
        lista46.ultimo = '#';
        java.lang.Object[] objArray54 = lista46.item;
        lista34.insere((java.lang.Object) objArray54);
        lista18.item = objArray54;
        lista0.item = objArray54;
        lista0.primeiro = (byte) 100;
        boolean boolean60 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0623");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.ultimo;
        int int15 = lista3.primeiro;
        lista3.pos = (short) 10;
        lista3.ultimo = (short) -1;
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.pos = (byte) 100;
        int int25 = lista20.pos;
        int int26 = lista20.primeiro;
        lista20.ultimo = 0;
        lista20.primeiro = 0;
        lista20.pos = (short) 10;
        ds.Lista lista33 = new ds.Lista();
        lista33.pos = 10;
        lista33.pos = (byte) 100;
        java.lang.Object[] objArray38 = lista33.item;
        lista20.item = objArray38;
        java.lang.Object[] objArray40 = lista20.item;
        lista3.item = objArray40;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0624");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0625");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.ultimo = 1;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        int int31 = lista25.primeiro;
        lista25.ultimo = 0;
        lista25.primeiro = 0;
        lista25.pos = (short) 10;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        lista38.imprime();
        boolean boolean41 = lista38.vazia();
        int int42 = lista38.primeiro;
        java.lang.Object[] objArray43 = lista38.item;
        lista38.ultimo = 10;
        java.lang.Object[] objArray46 = lista38.item;
        lista25.item = objArray46;
        lista0.item = objArray46;
        java.lang.Class<?> wildcardClass49 = objArray46.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0626");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (short) 100;
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0627");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.primeiro;
        boolean boolean13 = lista3.vazia();
        lista3.primeiro = 10;
        int int16 = lista3.ultimo;
        int int17 = lista3.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0628");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.imprime();
        int int15 = lista11.ultimo;
        boolean boolean16 = lista11.vazia();
        boolean boolean17 = lista11.vazia();
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0629");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = 0;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0630");
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
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        lista0.pos = ' ';
        int int22 = lista0.pos;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0631");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        int int14 = lista0.pos;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.ultimo;
        lista16.pos = (short) -1;
        lista0.insere((java.lang.Object) lista16);
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0632");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0633");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        lista0.pos = 0;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0634");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0635");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.primeiro = (byte) 1;
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0636");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.ultimo = 10;
        lista0.ultimo = 100;
        lista0.ultimo = 12;
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0637");
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
        boolean boolean15 = lista0.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        int int21 = lista16.pos;
        lista16.pos = (byte) 100;
        lista16.pos = 100;
        lista16.pos = (byte) 0;
        int int28 = lista16.pos;
        lista16.primeiro = '#';
        boolean boolean31 = lista16.vazia();
        lista16.ultimo = 97;
        boolean boolean34 = lista16.vazia();
        lista16.ultimo = (short) 100;
        java.lang.Object[] objArray37 = lista16.item;
        lista0.item = objArray37;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0638");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        lista15.primeiro = (short) 10;
        java.lang.Object[] objArray19 = lista15.item;
        lista0.item = objArray19;
        int int21 = lista0.primeiro;
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0639");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        int int14 = lista0.pos;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.ultimo;
        lista16.pos = (short) -1;
        lista0.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0640");
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
        boolean boolean18 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        int int21 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0641");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        boolean boolean17 = lista14.vazia();
        lista14.pos = (byte) 0;
        int int20 = lista14.pos;
        lista14.ultimo = (short) 10;
        int int23 = lista14.ultimo;
        lista14.ultimo = (short) -1;
        lista14.imprime();
        lista14.pos = 101;
        lista0.insere((java.lang.Object) 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0642");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        java.lang.Object[] objArray12 = lista0.item;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.imprime();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = 10;
        lista19.imprime();
        lista19.primeiro = (short) 0;
        java.lang.Object[] objArray25 = lista19.item;
        lista13.item = objArray25;
        lista0.item = objArray25;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0643");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        lista0.primeiro = 101;
        lista0.imprime();
        int int17 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0644");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0645");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        lista0.primeiro = 10;
        lista0.primeiro = (short) 0;
        int int24 = lista0.pos;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.imprime();
        int int29 = lista25.ultimo;
        boolean boolean30 = lista25.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        lista31.imprime();
        boolean boolean34 = lista31.vazia();
        int int35 = lista31.primeiro;
        java.lang.Object[] objArray36 = lista31.item;
        lista25.item = objArray36;
        lista0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0646");
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
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        lista0.pos = ' ';
        lista0.primeiro = 1;
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0647");
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
        boolean boolean18 = lista0.vazia();
        java.lang.Object[] objArray19 = lista0.item;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0648");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        lista0.insere((java.lang.Object) (-1.0f));
        int int11 = lista0.ultimo;
        lista0.pos = 97;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0649");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0650");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.pos = 32;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.ultimo = ' ';
        boolean boolean19 = lista11.vazia();
        int int20 = lista11.pos;
        lista11.pos = 0;
        int int23 = lista11.ultimo;
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0651");
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
        lista0.primeiro = 35;
        int int19 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0652");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0653");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        int int19 = lista0.ultimo;
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.pos = (byte) 100;
        int int25 = lista20.pos;
        int int26 = lista20.primeiro;
        lista20.ultimo = 0;
        lista20.primeiro = 0;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.ultimo;
        lista31.pos = (short) -1;
        lista31.imprime();
        lista31.pos = 10;
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        java.lang.Object[] objArray43 = lista38.item;
        lista38.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.pos = 10;
        lista45.pos = (byte) 100;
        lista45.primeiro = (short) 1;
        int int52 = lista45.pos;
        lista45.pos = '#';
        lista45.imprime();
        boolean boolean56 = lista45.vazia();
        int int57 = lista45.ultimo;
        java.lang.Object[] objArray58 = lista45.item;
        lista38.item = objArray58;
        lista31.item = objArray58;
        lista20.insere((java.lang.Object) objArray58);
        lista0.item = objArray58;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0654");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (short) 100;
        int int8 = lista0.ultimo;
        lista0.insere((java.lang.Object) 100.0f);
        lista0.ultimo = 12;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0655");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        java.lang.Object[] objArray9 = lista6.item;
        lista0.item = objArray9;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0656");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.pos;
        lista0.imprime();
        lista0.ultimo = 35;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        lista25.primeiro = (short) 1;
        int int32 = lista25.pos;
        int int33 = lista25.pos;
        int int34 = lista25.ultimo;
        lista21.insere((java.lang.Object) int34);
        lista21.primeiro = '#';
        int int38 = lista21.primeiro;
        lista0.insere((java.lang.Object) lista21);
        boolean boolean40 = lista21.vazia();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0657");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        java.lang.Object[] objArray14 = lista0.item;
        int int15 = lista0.primeiro;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0658");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0659");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        int int14 = lista0.pos;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.ultimo;
        lista16.pos = (short) -1;
        lista0.insere((java.lang.Object) lista16);
        int int21 = lista16.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0660");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        lista0.primeiro = '#';
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista16.imprime();
        boolean boolean19 = lista16.vazia();
        int int20 = lista16.primeiro;
        java.lang.Object[] objArray21 = lista16.item;
        lista16.ultimo = 10;
        lista16.primeiro = (short) 1;
        lista16.ultimo = (short) 0;
        lista0.insere((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0661");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0662");
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
        int int24 = lista0.primeiro;
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0663");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (short) 100;
        int int8 = lista0.ultimo;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0664");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        lista0.pos = 10;
        int int22 = lista0.ultimo;
        boolean boolean23 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0665");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.imprime();
        int int11 = lista7.ultimo;
        int int12 = lista7.ultimo;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        lista13.primeiro = (short) 1;
        int int20 = lista13.pos;
        lista13.pos = '#';
        lista13.imprime();
        boolean boolean24 = lista13.vazia();
        int int25 = lista13.ultimo;
        java.lang.Object[] objArray26 = lista13.item;
        lista7.item = objArray26;
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        int int34 = lista29.pos;
        int int35 = lista29.primeiro;
        lista29.ultimo = 0;
        lista29.pos = (-1);
        int int40 = lista29.primeiro;
        lista29.ultimo = 97;
        ds.Lista lista43 = new ds.Lista();
        lista43.pos = 10;
        lista43.imprime();
        lista43.primeiro = (short) 0;
        java.lang.Object[] objArray49 = lista43.item;
        java.lang.Object[] objArray50 = lista43.item;
        lista29.item = objArray50;
        lista0.item = objArray50;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0666");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.pos;
        lista0.ultimo = 101;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0667");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0668");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        int int22 = lista0.ultimo;
        boolean boolean23 = lista0.vazia();
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0669");
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
        int int15 = lista0.primeiro;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0670");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        lista3.ultimo = 0;
        int int25 = lista3.primeiro;
        int int26 = lista3.primeiro;
        lista3.primeiro = 0;
        lista3.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0671");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        lista0.imprime();
        lista0.ultimo = 37;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        boolean boolean26 = lista23.vazia();
        lista23.pos = (byte) 0;
        int int29 = lista23.ultimo;
        ds.Lista lista30 = new ds.Lista();
        lista30.pos = 10;
        lista30.pos = (byte) 100;
        lista30.primeiro = (short) 1;
        int int37 = lista30.pos;
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.ultimo;
        java.lang.Object[] objArray40 = new java.lang.Object[] { int39 };
        lista30.item = objArray40;
        lista23.insere((java.lang.Object) lista30);
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        lista43.imprime();
        boolean boolean46 = lista43.vazia();
        lista43.pos = (byte) 0;
        int int49 = lista43.pos;
        lista43.ultimo = (short) 10;
        ds.Lista lista52 = new ds.Lista();
        lista52.imprime();
        lista52.imprime();
        boolean boolean55 = lista52.vazia();
        int int56 = lista52.primeiro;
        java.lang.Object[] objArray57 = lista52.item;
        lista43.insere((java.lang.Object) objArray57);
        lista30.insere((java.lang.Object) objArray57);
        lista0.item = objArray57;
        lista0.pos = 101;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0672");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = (short) 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        int int23 = lista16.pos;
        lista16.primeiro = 100;
        int int26 = lista16.primeiro;
        lista0.insere((java.lang.Object) int26);
        int int28 = lista0.ultimo;
        lista0.primeiro = '#';
        int int31 = lista0.primeiro;
        lista0.pos = '4';
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0673");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        lista0.ultimo = (short) -1;
        lista0.primeiro = 101;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0674");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        lista0.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0675");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        int int17 = lista11.primeiro;
        lista11.insere((java.lang.Object) 100.0f);
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.imprime();
        int int24 = lista20.ultimo;
        boolean boolean25 = lista20.vazia();
        boolean boolean26 = lista20.vazia();
        java.lang.Object[] objArray27 = lista20.item;
        lista20.imprime();
        java.lang.Object[] objArray29 = lista20.item;
        lista11.insere((java.lang.Object) lista20);
        lista11.primeiro = (byte) 100;
        lista0.insere((java.lang.Object) lista11);
        boolean boolean34 = lista11.vazia();
        int int35 = lista11.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0676");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.primeiro;
        lista0.primeiro = 10;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0677");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.primeiro;
        int int16 = lista0.primeiro;
        int int17 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0678");
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
        boolean boolean18 = lista0.vazia();
        int int19 = lista0.pos;
        lista0.primeiro = 97;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0679");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.ultimo;
        int int13 = lista3.pos;
        int int14 = lista3.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0680");
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
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        java.lang.Object[] objArray47 = lista38.item;
        lista0.insere((java.lang.Object) objArray47);
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0681");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        lista3.ultimo = 0;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        lista25.ultimo = ' ';
        boolean boolean33 = lista25.vazia();
        java.lang.Object[] objArray34 = lista25.item;
        lista3.item = objArray34;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0682");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.ultimo = (byte) 0;
        int int10 = lista0.ultimo;
        lista0.pos = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0683");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.pos = (short) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0684");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0685");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        int int8 = lista0.primeiro;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0686");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.pos = 32;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0687");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        int int8 = lista0.pos;
        lista0.pos = 100;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0688");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        int int9 = lista0.ultimo;
        lista0.ultimo = '4';
        lista0.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0689");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista0.insere((java.lang.Object) lista12);
        int int29 = lista12.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0690");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 1);
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0691");
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
        int int17 = lista0.pos;
        int int18 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0692");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = (short) 1;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        int int18 = lista13.pos;
        lista13.pos = (byte) 100;
        lista13.pos = 100;
        lista13.pos = (byte) 0;
        int int25 = lista13.pos;
        boolean boolean26 = lista13.vazia();
        lista13.primeiro = (short) 1;
        lista13.ultimo = (byte) 10;
        boolean boolean31 = lista13.vazia();
        java.lang.Object[] objArray32 = lista13.item;
        lista0.item = objArray32;
        java.lang.Object[] objArray34 = lista0.item;
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        java.lang.Object[] objArray37 = lista35.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        java.lang.Object[] objArray40 = lista38.item;
        lista35.item = objArray40;
        lista35.pos = (byte) 1;
        ds.Lista lista44 = new ds.Lista();
        lista44.imprime();
        lista44.imprime();
        boolean boolean47 = lista44.vazia();
        int int48 = lista44.primeiro;
        java.lang.Object[] objArray49 = lista44.item;
        lista44.ultimo = 10;
        ds.Lista lista52 = new ds.Lista();
        lista52.imprime();
        lista52.imprime();
        boolean boolean55 = lista52.vazia();
        int int56 = lista52.primeiro;
        java.lang.Object[] objArray57 = lista52.item;
        lista44.item = objArray57;
        int int59 = lista44.primeiro;
        java.lang.Object[] objArray60 = lista44.item;
        lista35.item = objArray60;
        lista0.insere((java.lang.Object) objArray60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0693");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.pos = ' ';
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        java.lang.Object[] objArray29 = lista24.item;
        lista12.item = objArray29;
        lista0.item = objArray29;
        lista0.pos = (byte) 1;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        int int39 = lista34.pos;
        lista34.pos = (byte) 100;
        lista34.pos = 100;
        lista34.pos = (byte) 0;
        ds.Lista lista46 = new ds.Lista();
        lista46.pos = 10;
        lista46.pos = (byte) 100;
        java.lang.Object[] objArray51 = lista46.item;
        lista34.item = objArray51;
        lista0.item = objArray51;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0694");
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
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = 10;
        lista19.pos = (byte) 100;
        int int24 = lista19.pos;
        lista19.pos = (byte) 100;
        lista19.pos = 100;
        lista19.pos = (byte) 0;
        lista16.insere((java.lang.Object) (byte) 0);
        boolean boolean32 = lista16.vazia();
        int int33 = lista16.ultimo;
        int int34 = lista16.pos;
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0695");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista10.imprime();
        boolean boolean13 = lista10.vazia();
        lista10.pos = (byte) 0;
        int int16 = lista10.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        int int24 = lista17.pos;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.ultimo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { int26 };
        lista17.item = objArray27;
        lista10.insere((java.lang.Object) lista17);
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        boolean boolean33 = lista30.vazia();
        lista30.pos = (byte) 0;
        int int36 = lista30.pos;
        lista30.ultimo = (short) 10;
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        boolean boolean42 = lista39.vazia();
        int int43 = lista39.primeiro;
        java.lang.Object[] objArray44 = lista39.item;
        lista30.insere((java.lang.Object) objArray44);
        lista17.insere((java.lang.Object) objArray44);
        ds.Lista lista47 = new ds.Lista();
        lista47.pos = 10;
        lista47.imprime();
        int int51 = lista47.ultimo;
        boolean boolean52 = lista47.vazia();
        boolean boolean53 = lista47.vazia();
        java.lang.Object[] objArray54 = lista47.item;
        lista47.imprime();
        java.lang.Object[] objArray56 = lista47.item;
        lista17.item = objArray56;
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista59 = new ds.Lista();
        lista59.pos = 10;
        lista59.imprime();
        int int63 = lista59.ultimo;
        ds.Lista lista64 = new ds.Lista();
        lista64.pos = 10;
        lista64.pos = (byte) 100;
        int int69 = lista64.pos;
        int int70 = lista64.primeiro;
        lista64.ultimo = 0;
        lista64.primeiro = 0;
        lista64.pos = (short) 10;
        ds.Lista lista77 = new ds.Lista();
        lista77.pos = 10;
        lista77.pos = (byte) 100;
        java.lang.Object[] objArray82 = lista77.item;
        lista64.item = objArray82;
        lista64.imprime();
        java.lang.Object[] objArray85 = lista64.item;
        boolean boolean86 = lista64.vazia();
        lista59.insere((java.lang.Object) lista64);
        lista17.insere((java.lang.Object) lista64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0696");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.pos = '4';
        lista0.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0697");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0698");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        java.lang.Object[] objArray16 = lista13.item;
        lista13.pos = (short) 0;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        lista0.pos = 35;
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0699");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.imprime();
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0700");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        java.lang.Object[] objArray13 = lista10.item;
        lista10.pos = (short) 0;
        java.lang.Object[] objArray16 = lista10.item;
        lista0.item = objArray16;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        lista21.insere((java.lang.Object) 0L);
        int int26 = lista21.primeiro;
        lista18.insere((java.lang.Object) lista21);
        int int28 = lista21.ultimo;
        lista21.pos = 0;
        ds.Lista lista31 = new ds.Lista();
        lista31.pos = 10;
        lista31.pos = (byte) 100;
        int int36 = lista31.pos;
        int int37 = lista31.primeiro;
        lista31.ultimo = 0;
        lista31.primeiro = 0;
        lista31.pos = (short) 10;
        ds.Lista lista44 = new ds.Lista();
        lista44.imprime();
        lista44.imprime();
        boolean boolean47 = lista44.vazia();
        int int48 = lista44.primeiro;
        java.lang.Object[] objArray49 = lista44.item;
        lista44.ultimo = 10;
        java.lang.Object[] objArray52 = lista44.item;
        lista31.item = objArray52;
        lista21.insere((java.lang.Object) objArray52);
        lista0.item = objArray52;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0701");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        int int21 = lista0.ultimo;
        int int22 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0702");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (byte) 10;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0703");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.ultimo = (short) -1;
        lista0.pos = 97;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0704");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        lista0.primeiro = (short) 1;
        lista0.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        java.lang.Object[] objArray21 = lista16.item;
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0705");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        lista0.imprime();
        lista0.pos = 'a';
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0706");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.primeiro;
        int int16 = lista0.ultimo;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0707");
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
        lista0.primeiro = 35;
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0708");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0709");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.ultimo = 0;
        lista0.primeiro = 97;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0710");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        lista0.pos = 10;
        int int22 = lista0.ultimo;
        boolean boolean23 = lista0.vazia();
        java.lang.Object[] objArray24 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0711");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0712");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = 1;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = ' ';
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        int int23 = lista16.pos;
        int int24 = lista16.primeiro;
        java.lang.Object[] objArray25 = lista16.item;
        boolean boolean26 = lista16.vazia();
        int int27 = lista16.ultimo;
        boolean boolean28 = lista16.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        java.lang.Object[] objArray32 = lista29.item;
        lista29.pos = (short) 0;
        java.lang.Object[] objArray35 = lista29.item;
        lista16.item = objArray35;
        int int37 = lista16.primeiro;
        int int38 = lista16.pos;
        lista0.insere((java.lang.Object) int38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0713");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        int int13 = lista0.ultimo;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0714");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista0.insere((java.lang.Object) lista12);
        lista0.primeiro = 35;
        lista0.imprime();
        lista0.ultimo = 12;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0715");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        lista0.pos = (byte) 1;
        lista0.primeiro = '#';
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        lista11.imprime();
        boolean boolean14 = lista11.vazia();
        int int15 = lista11.primeiro;
        java.lang.Object[] objArray16 = lista11.item;
        lista11.ultimo = 10;
        boolean boolean19 = lista11.vazia();
        lista11.pos = 2;
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0716");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        boolean boolean20 = lista0.vazia();
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0717");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.primeiro;
        int int9 = lista0.primeiro;
        lista0.pos = ' ';
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0718");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0719");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 1);
        lista0.imprime();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        lista9.pos = 100;
        lista9.pos = (byte) 0;
        int int21 = lista9.pos;
        boolean boolean22 = lista9.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.pos = (byte) 100;
        int int28 = lista23.pos;
        int int29 = lista23.primeiro;
        lista23.insere((java.lang.Object) 100.0f);
        lista23.ultimo = (-1);
        int int34 = lista23.ultimo;
        ds.Lista lista35 = new ds.Lista();
        lista35.pos = 10;
        lista35.pos = (byte) 100;
        int int40 = lista35.pos;
        lista35.pos = (byte) 100;
        lista35.pos = 100;
        lista35.pos = (byte) 0;
        int int47 = lista35.pos;
        boolean boolean48 = lista35.vazia();
        lista35.primeiro = (short) 1;
        lista35.ultimo = (byte) 10;
        ds.Lista lista53 = new ds.Lista();
        lista53.imprime();
        lista53.imprime();
        lista53.insere((java.lang.Object) 0L);
        lista53.ultimo = '#';
        lista53.pos = 10;
        ds.Lista lista62 = new ds.Lista();
        lista62.pos = 10;
        lista62.pos = (byte) 100;
        int int67 = lista62.pos;
        lista62.pos = (byte) 100;
        int int70 = lista62.pos;
        lista53.insere((java.lang.Object) int70);
        lista35.insere((java.lang.Object) int70);
        ds.Lista lista73 = new ds.Lista();
        lista73.pos = 10;
        lista73.pos = (byte) 100;
        int int78 = lista73.pos;
        int int79 = lista73.primeiro;
        lista73.ultimo = 0;
        java.lang.Object[] objArray82 = lista73.item;
        lista35.insere((java.lang.Object) objArray82);
        lista23.item = objArray82;
        lista9.item = objArray82;
        lista0.insere((java.lang.Object) lista9);
        java.lang.Object[] objArray87 = lista0.item;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray87);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0720");
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
        lista0.pos = '#';
        boolean boolean18 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0721");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) 0L);
        boolean boolean14 = lista9.vazia();
        lista9.primeiro = (byte) -1;
        java.lang.Object[] objArray17 = lista9.item;
        lista0.item = objArray17;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        lista19.item = objArray24;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.insere((java.lang.Object) lista19);
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0722");
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
        boolean boolean18 = lista0.vazia();
        java.lang.Object[] objArray19 = lista0.item;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.ultimo;
        int int22 = lista20.primeiro;
        boolean boolean23 = lista20.vazia();
        java.lang.Object[] objArray24 = lista20.item;
        lista0.item = objArray24;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0723");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0724");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0725");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0726");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        int int16 = lista0.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        int int22 = lista17.pos;
        lista17.pos = (byte) 100;
        lista17.pos = 100;
        lista17.pos = (byte) 0;
        int int29 = lista17.pos;
        lista17.primeiro = '#';
        int int32 = lista17.pos;
        java.lang.Object[] objArray33 = lista17.item;
        lista0.insere((java.lang.Object) lista17);
        lista0.imprime();
        int int36 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0727");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        int int10 = lista0.pos;
        lista0.pos = (byte) 0;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        lista13.pos = (byte) 0;
        int int19 = lista13.ultimo;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        boolean boolean23 = lista20.vazia();
        int int24 = lista20.primeiro;
        java.lang.Object[] objArray25 = lista20.item;
        lista13.insere((java.lang.Object) objArray25);
        lista13.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        int int33 = lista28.pos;
        lista28.ultimo = ' ';
        boolean boolean36 = lista28.vazia();
        java.lang.Object[] objArray37 = lista28.item;
        lista13.insere((java.lang.Object) lista28);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista39.pos = (short) 100;
        int int44 = lista39.pos;
        ds.Lista lista45 = new ds.Lista();
        lista45.imprime();
        lista45.imprime();
        lista45.insere((java.lang.Object) 0L);
        lista45.ultimo = '#';
        lista45.pos = 10;
        ds.Lista lista54 = new ds.Lista();
        lista54.pos = 10;
        lista54.pos = (byte) 100;
        int int59 = lista54.pos;
        lista54.pos = (byte) 100;
        int int62 = lista54.pos;
        lista45.insere((java.lang.Object) int62);
        lista39.insere((java.lang.Object) lista45);
        lista13.insere((java.lang.Object) lista45);
        lista0.insere((java.lang.Object) lista13);
        lista13.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0728");
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
        boolean boolean18 = lista0.vazia();
        java.lang.Object[] objArray19 = lista0.item;
        int int20 = lista0.primeiro;
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0729");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        int int21 = lista15.primeiro;
        lista15.ultimo = 0;
        lista15.primeiro = 0;
        lista15.pos = (short) 10;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        java.lang.Object[] objArray33 = lista28.item;
        lista15.item = objArray33;
        java.lang.Object[] objArray35 = lista15.item;
        lista15.primeiro = '#';
        lista15.ultimo = 1;
        ds.Lista lista40 = new ds.Lista();
        lista40.pos = 10;
        lista40.pos = (byte) 100;
        int int45 = lista40.pos;
        int int46 = lista40.primeiro;
        lista40.ultimo = 0;
        lista40.primeiro = 0;
        lista40.pos = (short) 10;
        ds.Lista lista53 = new ds.Lista();
        lista53.imprime();
        lista53.imprime();
        boolean boolean56 = lista53.vazia();
        int int57 = lista53.primeiro;
        java.lang.Object[] objArray58 = lista53.item;
        lista53.ultimo = 10;
        java.lang.Object[] objArray61 = lista53.item;
        lista40.item = objArray61;
        lista15.item = objArray61;
        ds.Lista lista64 = new ds.Lista();
        lista64.pos = 10;
        lista64.pos = (byte) 100;
        lista64.primeiro = (short) 1;
        int int71 = lista64.pos;
        int int72 = lista64.primeiro;
        java.lang.Object[] objArray73 = lista64.item;
        lista15.item = objArray73;
        lista0.insere((java.lang.Object) objArray73);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0730");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        lista9.primeiro = (short) 0;
        java.lang.Object[] objArray15 = lista9.item;
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        lista0.primeiro = 97;
        lista0.pos = (short) 1;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0731");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        int int8 = lista0.pos;
        lista0.insere((java.lang.Object) (short) 100);
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0732");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        lista6.primeiro = (short) 1;
        lista6.pos = 1;
        lista6.primeiro = (short) 10;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        int int24 = lista17.pos;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.ultimo;
        java.lang.Object[] objArray27 = new java.lang.Object[] { int26 };
        lista17.item = objArray27;
        lista6.item = objArray27;
        lista0.item = objArray27;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0]");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0733");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.ultimo = ' ';
        lista11.ultimo = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.pos = (byte) 100;
        lista22.primeiro = (short) 1;
        boolean boolean29 = lista22.vazia();
        boolean boolean30 = lista22.vazia();
        lista22.imprime();
        lista0.insere((java.lang.Object) lista22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0734");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        lista0.ultimo = (short) 10;
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        int int15 = lista10.pos;
        int int16 = lista10.primeiro;
        lista10.ultimo = 0;
        lista10.primeiro = 0;
        lista10.pos = (short) 10;
        boolean boolean23 = lista10.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        int int29 = lista24.pos;
        lista24.pos = (byte) 100;
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = 10;
        lista32.imprime();
        lista32.primeiro = (short) 0;
        java.lang.Object[] objArray38 = lista32.item;
        java.lang.Object[] objArray39 = lista32.item;
        lista24.item = objArray39;
        lista10.item = objArray39;
        lista0.item = objArray39;
        boolean boolean43 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0735");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.insere((java.lang.Object) objArray20);
        lista0.ultimo = (byte) 100;
        int int24 = lista0.primeiro;
        int int25 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0736");
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
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0737");
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
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista16.imprime();
        boolean boolean19 = lista16.vazia();
        int int20 = lista16.primeiro;
        java.lang.Object[] objArray21 = lista16.item;
        lista16.ultimo = 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        lista24.imprime();
        boolean boolean27 = lista24.vazia();
        int int28 = lista24.primeiro;
        java.lang.Object[] objArray29 = lista24.item;
        lista16.item = objArray29;
        lista0.item = objArray29;
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = 10;
        lista32.pos = (byte) 100;
        lista32.primeiro = (short) 1;
        int int39 = lista32.pos;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { int41 };
        lista32.item = objArray42;
        lista32.imprime();
        lista32.primeiro = '#';
        lista32.pos = ' ';
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        java.lang.Object[] objArray52 = lista49.item;
        int int53 = lista49.ultimo;
        lista49.imprime();
        lista49.pos = 101;
        lista32.insere((java.lang.Object) lista49);
        ds.Lista lista58 = new ds.Lista();
        lista58.imprime();
        lista58.imprime();
        boolean boolean61 = lista58.vazia();
        int int62 = lista58.primeiro;
        java.lang.Object[] objArray63 = lista58.item;
        lista58.ultimo = 10;
        java.lang.Object[] objArray66 = lista58.item;
        lista32.item = objArray66;
        lista0.item = objArray66;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0738");
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
        java.lang.Object[] objArray17 = null;
        lista0.item = objArray17;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0739");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0740");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        lista0.ultimo = '#';
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0741");
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
        int int17 = lista0.ultimo;
        lista0.pos = (short) 1;
        java.lang.Object[] objArray20 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0742");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        int int16 = lista0.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        int int22 = lista17.pos;
        lista17.pos = (byte) 100;
        lista17.pos = 100;
        lista17.pos = (byte) 0;
        int int29 = lista17.pos;
        lista17.primeiro = '#';
        int int32 = lista17.pos;
        java.lang.Object[] objArray33 = lista17.item;
        lista0.insere((java.lang.Object) lista17);
        lista17.primeiro = 1;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0743");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.primeiro;
        lista0.primeiro = (-1);
        int int8 = lista0.ultimo;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0744");
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
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        lista38.primeiro = (short) 1;
        lista38.pos = 1;
        lista38.imprime();
        lista38.pos = (byte) 1;
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.ultimo;
        lista50.primeiro = (short) 10;
        lista50.primeiro = 'a';
        boolean boolean56 = lista50.vazia();
        ds.Lista lista57 = new ds.Lista();
        lista57.pos = 10;
        lista57.pos = (byte) 100;
        int int62 = lista57.pos;
        lista57.pos = (byte) 100;
        lista57.pos = 100;
        lista57.pos = (byte) 0;
        int int69 = lista57.pos;
        boolean boolean70 = lista57.vazia();
        lista57.primeiro = (short) 1;
        lista57.ultimo = (byte) 10;
        boolean boolean75 = lista57.vazia();
        java.lang.Object[] objArray76 = lista57.item;
        lista50.item = objArray76;
        lista38.item = objArray76;
        lista0.item = objArray76;
        int int80 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0745");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        lista6.primeiro = (short) 1;
        int int13 = lista6.pos;
        int int14 = lista6.primeiro;
        java.lang.Object[] objArray15 = lista6.item;
        boolean boolean16 = lista6.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        java.lang.Object[] objArray20 = lista17.item;
        int int21 = lista17.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.pos = (byte) 100;
        int int27 = lista22.pos;
        int int28 = lista22.primeiro;
        lista22.insere((java.lang.Object) 100.0f);
        lista22.ultimo = (-1);
        int int33 = lista22.ultimo;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        int int39 = lista34.pos;
        lista34.pos = (byte) 100;
        lista34.pos = 100;
        lista34.pos = (byte) 0;
        int int46 = lista34.pos;
        boolean boolean47 = lista34.vazia();
        lista34.primeiro = (short) 1;
        lista34.ultimo = (byte) 10;
        ds.Lista lista52 = new ds.Lista();
        lista52.imprime();
        lista52.imprime();
        lista52.insere((java.lang.Object) 0L);
        lista52.ultimo = '#';
        lista52.pos = 10;
        ds.Lista lista61 = new ds.Lista();
        lista61.pos = 10;
        lista61.pos = (byte) 100;
        int int66 = lista61.pos;
        lista61.pos = (byte) 100;
        int int69 = lista61.pos;
        lista52.insere((java.lang.Object) int69);
        lista34.insere((java.lang.Object) int69);
        ds.Lista lista72 = new ds.Lista();
        lista72.pos = 10;
        lista72.pos = (byte) 100;
        int int77 = lista72.pos;
        int int78 = lista72.primeiro;
        lista72.ultimo = 0;
        java.lang.Object[] objArray81 = lista72.item;
        lista34.insere((java.lang.Object) objArray81);
        lista22.item = objArray81;
        lista17.item = objArray81;
        lista6.item = objArray81;
        lista0.insere((java.lang.Object) lista6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0746");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.pos = 'a';
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0747");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        int int19 = lista14.primeiro;
        lista14.primeiro = (-1);
        lista9.insere((java.lang.Object) (-1));
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) 0L);
        boolean boolean28 = lista23.vazia();
        int int29 = lista23.primeiro;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        boolean boolean33 = lista30.vazia();
        int int34 = lista30.primeiro;
        java.lang.Object[] objArray35 = lista30.item;
        lista23.insere((java.lang.Object) objArray35);
        lista9.item = objArray35;
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        lista38.primeiro = 0;
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        lista49.pos = (byte) 100;
        int int54 = lista49.pos;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista49.item = objArray59;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 0L, lista9, 0, lista49, 10.0d };
        lista0.item = objArray62;
        int int64 = lista0.pos;
        boolean boolean65 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0748");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.primeiro = (byte) 1;
        lista0.pos = 32;
        java.lang.Object[] objArray21 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0749");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray6 = null;
        lista0.item = objArray6;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0750");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        int int26 = lista21.pos;
        int int27 = lista21.primeiro;
        lista21.primeiro = ' ';
        java.lang.Object[] objArray30 = lista21.item;
        lista0.insere((java.lang.Object) objArray30);
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0751");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        lista0.primeiro = '#';
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0752");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = 0;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.imprime();
        int int11 = lista7.ultimo;
        int int12 = lista7.ultimo;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        lista13.primeiro = (short) 1;
        int int20 = lista13.pos;
        lista13.pos = '#';
        lista13.imprime();
        boolean boolean24 = lista13.vazia();
        int int25 = lista13.ultimo;
        java.lang.Object[] objArray26 = lista13.item;
        lista7.item = objArray26;
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        int int34 = lista29.pos;
        int int35 = lista29.primeiro;
        lista29.ultimo = 0;
        lista29.primeiro = 0;
        lista29.pos = (short) 10;
        ds.Lista lista42 = new ds.Lista();
        lista42.pos = 10;
        lista42.imprime();
        int int46 = lista42.ultimo;
        boolean boolean47 = lista42.vazia();
        boolean boolean48 = lista42.vazia();
        java.lang.Object[] objArray49 = lista42.item;
        lista42.imprime();
        java.lang.Object[] objArray51 = lista42.item;
        java.lang.Object[] objArray52 = lista42.item;
        lista29.insere((java.lang.Object) objArray52);
        lista0.item = objArray52;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0753");
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
        boolean boolean18 = lista0.vazia();
        java.lang.Object[] objArray19 = lista0.item;
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0754");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        java.lang.Object[] objArray12 = lista0.item;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        lista13.pos = (byte) 0;
        int int19 = lista13.pos;
        ds.Lista lista20 = new ds.Lista();
        lista20.pos = 10;
        lista20.pos = (byte) 100;
        lista20.primeiro = (short) 1;
        int int27 = lista20.pos;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.ultimo;
        java.lang.Object[] objArray30 = new java.lang.Object[] { int29 };
        lista20.item = objArray30;
        lista20.imprime();
        lista20.primeiro = (short) 1;
        ds.Lista lista35 = new ds.Lista();
        lista35.pos = 10;
        lista35.pos = (byte) 100;
        int int40 = lista35.pos;
        int int41 = lista35.primeiro;
        lista35.ultimo = 0;
        lista35.primeiro = 0;
        lista35.pos = (short) 10;
        ds.Lista lista48 = new ds.Lista();
        lista48.pos = 10;
        lista48.pos = (byte) 100;
        java.lang.Object[] objArray53 = lista48.item;
        lista35.item = objArray53;
        lista20.item = objArray53;
        lista13.item = objArray53;
        lista0.item = objArray53;
        boolean boolean58 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0755");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        int int34 = lista29.pos;
        int int35 = lista29.primeiro;
        lista29.ultimo = 0;
        lista29.primeiro = 0;
        lista29.pos = (short) 10;
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        lista42.imprime();
        boolean boolean45 = lista42.vazia();
        int int46 = lista42.primeiro;
        java.lang.Object[] objArray47 = lista42.item;
        lista42.ultimo = 10;
        java.lang.Object[] objArray50 = lista42.item;
        lista29.item = objArray50;
        lista12.item = objArray50;
        int int53 = lista12.ultimo;
        ds.Lista lista54 = new ds.Lista();
        lista54.pos = 10;
        lista54.pos = (byte) 100;
        lista54.primeiro = (short) 1;
        lista54.pos = 1;
        lista54.primeiro = (short) 10;
        lista54.primeiro = ' ';
        java.lang.Object[] objArray67 = lista54.item;
        lista54.pos = (short) 0;
        lista54.ultimo = (short) 100;
        java.lang.Object[] objArray72 = lista54.item;
        lista12.item = objArray72;
        int int74 = lista12.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0756");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.pos;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.ultimo = 10;
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0757");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        java.lang.Object[] objArray33 = lista0.item;
        java.lang.Object[] objArray34 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0758");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.pos;
        lista0.primeiro = (short) -1;
        int int20 = lista0.ultimo;
        int int21 = lista0.primeiro;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0759");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 1);
        lista0.imprime();
        int int8 = lista0.primeiro;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0760");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        lista11.imprime();
        lista11.pos = (short) 100;
        int int16 = lista11.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        lista17.imprime();
        lista17.insere((java.lang.Object) 0L);
        lista17.ultimo = '#';
        lista17.pos = 10;
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.pos = (byte) 100;
        int int31 = lista26.pos;
        lista26.pos = (byte) 100;
        int int34 = lista26.pos;
        lista17.insere((java.lang.Object) int34);
        lista11.insere((java.lang.Object) lista17);
        lista11.ultimo = (byte) 1;
        java.lang.Object[] objArray39 = lista11.item;
        lista0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0761");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.ultimo;
        lista3.ultimo = 97;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0762");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0763");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        lista0.primeiro = 'a';
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista7.imprime();
        lista7.pos = (short) 100;
        int int12 = lista7.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        lista13.imprime();
        lista13.insere((java.lang.Object) 0L);
        lista13.ultimo = '#';
        lista13.pos = 10;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.pos = (byte) 100;
        int int27 = lista22.pos;
        lista22.pos = (byte) 100;
        int int30 = lista22.pos;
        lista13.insere((java.lang.Object) int30);
        lista7.insere((java.lang.Object) lista13);
        lista7.ultimo = (byte) 1;
        boolean boolean35 = lista7.vazia();
        java.lang.Object[] objArray36 = lista7.item;
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0764");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        lista6.ultimo = 32;
        java.lang.Class<?> wildcardClass28 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0765");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) 0L);
        boolean boolean14 = lista9.vazia();
        lista9.primeiro = (byte) -1;
        java.lang.Object[] objArray17 = lista9.item;
        lista0.item = objArray17;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        lista19.item = objArray24;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.insere((java.lang.Object) lista19);
        boolean boolean28 = lista0.vazia();
        lista0.ultimo = 100;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0766");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        lista14.pos = 100;
        lista14.pos = (byte) 0;
        int int26 = lista14.pos;
        lista14.primeiro = '#';
        int int29 = lista14.primeiro;
        lista0.insere((java.lang.Object) int29);
        lista0.primeiro = (short) 100;
        int int33 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0767");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0768");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0769");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        lista0.imprime();
        java.lang.Object[] objArray21 = lista0.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.imprime();
        boolean boolean27 = lista22.vazia();
        boolean boolean28 = lista22.vazia();
        lista22.pos = (short) 10;
        int int31 = lista22.pos;
        lista22.ultimo = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0770");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.pos;
        int int17 = lista0.primeiro;
        int int18 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0771");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        int int20 = lista0.pos;
        lista0.imprime();
        int int22 = lista0.primeiro;
        lista0.primeiro = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0772");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        lista14.pos = 100;
        lista14.pos = (byte) 0;
        int int26 = lista14.pos;
        lista14.primeiro = '#';
        int int29 = lista14.primeiro;
        lista0.insere((java.lang.Object) int29);
        lista0.ultimo = (-1);
        lista0.primeiro = 100;
        ds.Lista lista35 = new ds.Lista();
        lista35.pos = 10;
        lista35.pos = (byte) 100;
        lista35.primeiro = (short) 1;
        int int42 = lista35.pos;
        lista35.pos = '#';
        int int45 = lista35.pos;
        boolean boolean46 = lista35.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.imprime();
        lista47.imprime();
        boolean boolean50 = lista47.vazia();
        lista47.pos = (byte) 0;
        int int53 = lista47.pos;
        lista47.imprime();
        java.lang.Object[] objArray55 = lista47.item;
        lista35.item = objArray55;
        lista0.item = objArray55;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0773");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (byte) 10;
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        lista15.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        java.lang.Object[] objArray24 = lista21.item;
        lista15.item = objArray24;
        lista10.item = objArray24;
        boolean boolean27 = lista10.vazia();
        java.lang.Class<?> wildcardClass28 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0774");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        java.lang.Object[] objArray14 = lista0.item;
        int int15 = lista0.primeiro;
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0775");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        lista9.pos = 100;
        lista9.pos = (byte) 0;
        int int21 = lista9.pos;
        lista9.primeiro = '#';
        boolean boolean24 = lista9.vazia();
        int int25 = lista9.primeiro;
        lista9.primeiro = (byte) 1;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.imprime();
        int int32 = lista28.ultimo;
        boolean boolean33 = lista28.vazia();
        boolean boolean34 = lista28.vazia();
        java.lang.Object[] objArray35 = lista28.item;
        lista28.imprime();
        java.lang.Object[] objArray37 = lista28.item;
        java.lang.Object[] objArray38 = lista28.item;
        lista28.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        lista40.imprime();
        boolean boolean43 = lista40.vazia();
        int int44 = lista40.primeiro;
        java.lang.Object[] objArray45 = lista40.item;
        lista40.ultimo = 10;
        ds.Lista lista48 = new ds.Lista();
        lista48.imprime();
        lista48.imprime();
        boolean boolean51 = lista48.vazia();
        int int52 = lista48.primeiro;
        java.lang.Object[] objArray53 = lista48.item;
        lista40.item = objArray53;
        java.lang.Object[] objArray55 = lista40.item;
        lista28.item = objArray55;
        lista9.item = objArray55;
        lista0.insere((java.lang.Object) objArray55);
        lista0.pos = (byte) 1;
        ds.Lista lista61 = new ds.Lista();
        lista61.pos = 10;
        lista61.pos = (byte) 100;
        int int66 = lista61.pos;
        lista61.pos = (byte) 100;
        lista61.pos = 100;
        lista61.pos = (byte) 0;
        int int73 = lista61.pos;
        lista61.primeiro = '#';
        int int76 = lista61.primeiro;
        int int77 = lista61.primeiro;
        java.lang.Object[] objArray78 = lista61.item;
        java.lang.Object[] objArray79 = lista61.item;
        ds.Lista lista80 = new ds.Lista();
        lista80.pos = 10;
        lista80.pos = (byte) 100;
        lista80.primeiro = 0;
        lista80.ultimo = (byte) 100;
        lista80.pos = 10;
        lista80.primeiro = (short) -1;
        lista61.insere((java.lang.Object) lista80);
        lista0.insere((java.lang.Object) lista80);
        int int95 = lista80.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 35 + "'", int77 == 35);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0776");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        int int20 = lista0.primeiro;
        int int21 = lista0.pos;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.pos = (byte) 100;
        int int27 = lista22.primeiro;
        lista22.ultimo = 0;
        java.lang.Object[] objArray30 = lista22.item;
        lista0.item = objArray30;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0777");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        lista14.pos = 100;
        lista14.pos = (byte) 0;
        int int26 = lista14.pos;
        lista14.primeiro = '#';
        int int29 = lista14.primeiro;
        lista0.insere((java.lang.Object) int29);
        lista0.ultimo = (-1);
        int int33 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0778");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0779");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.pos = 10;
        lista1.pos = (byte) 100;
        boolean boolean6 = lista1.vazia();
        lista1.ultimo = '#';
        lista1.ultimo = (short) 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        int int20 = lista14.primeiro;
        lista14.ultimo = 0;
        lista14.primeiro = 0;
        java.lang.Class<?> wildcardClass25 = lista14.getClass();
        lista11.insere((java.lang.Object) wildcardClass25);
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        lista27.imprime();
        boolean boolean30 = lista27.vazia();
        int int31 = lista27.primeiro;
        java.lang.Object[] objArray32 = lista27.item;
        lista27.ultimo = 10;
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        lista35.imprime();
        boolean boolean38 = lista35.vazia();
        int int39 = lista35.primeiro;
        java.lang.Object[] objArray40 = lista35.item;
        lista27.item = objArray40;
        lista11.item = objArray40;
        lista1.item = objArray40;
        lista0.insere((java.lang.Object) objArray40);
        int int45 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0780");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (short) 100;
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0781");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        lista12.imprime();
        lista12.insere((java.lang.Object) 0L);
        int int17 = lista12.primeiro;
        lista9.insere((java.lang.Object) lista12);
        int int19 = lista12.ultimo;
        lista12.pos = 0;
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista26.imprime();
        lista26.insere((java.lang.Object) 0L);
        int int31 = lista26.primeiro;
        lista23.insere((java.lang.Object) lista26);
        lista26.primeiro = 'a';
        ds.Lista lista35 = new ds.Lista();
        lista35.pos = 10;
        lista35.pos = (byte) 100;
        int int40 = lista35.pos;
        int int41 = lista35.primeiro;
        lista35.ultimo = 0;
        lista35.pos = (-1);
        ds.Lista lista46 = new ds.Lista();
        lista46.imprime();
        lista46.imprime();
        boolean boolean49 = lista46.vazia();
        lista46.pos = (byte) 0;
        int int52 = lista46.pos;
        ds.Lista lista53 = new ds.Lista();
        lista53.pos = 10;
        lista53.pos = (byte) 100;
        lista53.primeiro = (short) 1;
        int int60 = lista53.pos;
        ds.Lista lista61 = new ds.Lista();
        int int62 = lista61.ultimo;
        java.lang.Object[] objArray63 = new java.lang.Object[] { int62 };
        lista53.item = objArray63;
        lista53.imprime();
        lista53.primeiro = (short) 1;
        ds.Lista lista68 = new ds.Lista();
        lista68.pos = 10;
        lista68.pos = (byte) 100;
        int int73 = lista68.pos;
        int int74 = lista68.primeiro;
        lista68.ultimo = 0;
        lista68.primeiro = 0;
        lista68.pos = (short) 10;
        ds.Lista lista81 = new ds.Lista();
        lista81.pos = 10;
        lista81.pos = (byte) 100;
        java.lang.Object[] objArray86 = lista81.item;
        lista68.item = objArray86;
        lista53.item = objArray86;
        lista46.item = objArray86;
        lista35.item = objArray86;
        lista26.item = objArray86;
        lista26.imprime();
        lista26.imprime();
        lista26.ultimo = '4';
        lista12.insere((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0782");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.ultimo = 1;
        int int25 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0783");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        java.lang.Object[] objArray33 = lista0.item;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        lista34.primeiro = (short) 1;
        lista34.pos = 1;
        lista34.primeiro = (short) 10;
        lista34.primeiro = ' ';
        java.lang.Object[] objArray47 = lista34.item;
        lista0.item = objArray47;
        int int49 = lista0.ultimo;
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        lista50.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.imprime();
        lista53.imprime();
        lista53.insere((java.lang.Object) 0L);
        int int58 = lista53.primeiro;
        lista50.insere((java.lang.Object) lista53);
        lista53.primeiro = 'a';
        lista53.imprime();
        boolean boolean63 = lista53.vazia();
        ds.Lista lista64 = new ds.Lista();
        lista64.pos = 10;
        lista64.pos = (byte) 100;
        lista64.primeiro = (short) 1;
        int int71 = lista64.pos;
        ds.Lista lista72 = new ds.Lista();
        int int73 = lista72.ultimo;
        java.lang.Object[] objArray74 = new java.lang.Object[] { int73 };
        lista64.item = objArray74;
        ds.Lista lista76 = new ds.Lista();
        lista76.pos = 10;
        lista76.pos = (byte) 100;
        boolean boolean81 = lista76.vazia();
        lista76.ultimo = '#';
        java.lang.Object[] objArray84 = lista76.item;
        lista64.insere((java.lang.Object) objArray84);
        lista53.insere((java.lang.Object) objArray84);
        lista0.item = objArray84;
        int int88 = lista0.pos;
        int int89 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 10 + "'", int89 == 10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0784");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        lista0.pos = ' ';
        lista0.pos = (short) -1;
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0785");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100.0d, (byte) 100, lista11, 1L };
        lista0.item = objArray13;
        int int15 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0786");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 1;
        boolean boolean8 = lista0.vazia();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0787");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.pos = 10;
        int int9 = lista0.pos;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0788");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        boolean boolean17 = lista3.vazia();
        int int18 = lista3.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0789");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (-1);
        lista0.ultimo = 35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0790");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.primeiro = (byte) 0;
        int int20 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0791");
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
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        lista12.primeiro = '#';
        boolean boolean27 = lista12.vazia();
        lista12.ultimo = 97;
        boolean boolean30 = lista12.vazia();
        lista12.ultimo = (short) 100;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0792");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object obj11 = null;
        lista0.insere(obj11);
        int int13 = lista0.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0793");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        lista0.imprime();
        lista0.pos = (short) 1;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0794");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0795");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = (byte) 1;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        lista28.primeiro = (short) 1;
        int int35 = lista28.pos;
        int int36 = lista28.pos;
        ds.Lista lista37 = new ds.Lista();
        lista37.pos = 10;
        lista37.pos = (byte) 100;
        int int42 = lista37.pos;
        lista37.pos = (byte) 100;
        lista37.pos = 100;
        lista37.pos = (byte) 0;
        int int49 = lista37.pos;
        lista37.primeiro = '#';
        boolean boolean52 = lista37.vazia();
        int int53 = lista37.primeiro;
        lista37.primeiro = (byte) 1;
        ds.Lista lista56 = new ds.Lista();
        lista56.pos = 10;
        lista56.imprime();
        int int60 = lista56.ultimo;
        boolean boolean61 = lista56.vazia();
        boolean boolean62 = lista56.vazia();
        java.lang.Object[] objArray63 = lista56.item;
        lista56.imprime();
        java.lang.Object[] objArray65 = lista56.item;
        java.lang.Object[] objArray66 = lista56.item;
        lista56.imprime();
        ds.Lista lista68 = new ds.Lista();
        lista68.imprime();
        lista68.imprime();
        boolean boolean71 = lista68.vazia();
        int int72 = lista68.primeiro;
        java.lang.Object[] objArray73 = lista68.item;
        lista68.ultimo = 10;
        ds.Lista lista76 = new ds.Lista();
        lista76.imprime();
        lista76.imprime();
        boolean boolean79 = lista76.vazia();
        int int80 = lista76.primeiro;
        java.lang.Object[] objArray81 = lista76.item;
        lista68.item = objArray81;
        java.lang.Object[] objArray83 = lista68.item;
        lista56.item = objArray83;
        lista37.item = objArray83;
        lista28.insere((java.lang.Object) objArray83);
        lista0.item = objArray83;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0796");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        int int20 = lista14.primeiro;
        lista14.insere((java.lang.Object) 100.0f);
        lista14.ultimo = (-1);
        int int25 = lista14.ultimo;
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.pos = (byte) 100;
        int int31 = lista26.pos;
        lista26.pos = (byte) 100;
        lista26.pos = 100;
        lista26.pos = (byte) 0;
        int int38 = lista26.pos;
        boolean boolean39 = lista26.vazia();
        lista26.primeiro = (short) 1;
        lista26.ultimo = (byte) 10;
        ds.Lista lista44 = new ds.Lista();
        lista44.imprime();
        lista44.imprime();
        lista44.insere((java.lang.Object) 0L);
        lista44.ultimo = '#';
        lista44.pos = 10;
        ds.Lista lista53 = new ds.Lista();
        lista53.pos = 10;
        lista53.pos = (byte) 100;
        int int58 = lista53.pos;
        lista53.pos = (byte) 100;
        int int61 = lista53.pos;
        lista44.insere((java.lang.Object) int61);
        lista26.insere((java.lang.Object) int61);
        ds.Lista lista64 = new ds.Lista();
        lista64.pos = 10;
        lista64.pos = (byte) 100;
        int int69 = lista64.pos;
        int int70 = lista64.primeiro;
        lista64.ultimo = 0;
        java.lang.Object[] objArray73 = lista64.item;
        lista26.insere((java.lang.Object) objArray73);
        lista14.item = objArray73;
        lista0.item = objArray73;
        ds.Lista lista77 = new ds.Lista();
        lista77.pos = 10;
        lista77.pos = (byte) 100;
        lista77.primeiro = (short) 1;
        lista77.pos = 1;
        lista77.primeiro = (short) 10;
        lista77.primeiro = ' ';
        boolean boolean90 = lista77.vazia();
        java.lang.Object[] objArray91 = lista77.item;
        lista0.item = objArray91;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0797");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0798");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.pos = (byte) 100;
        lista0.ultimo = 97;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0799");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        lista0.primeiro = 1;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0800");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        lista4.primeiro = (short) 1;
        java.lang.Object[] objArray10 = lista4.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        lista11.imprime();
        boolean boolean14 = lista11.vazia();
        int int15 = lista11.primeiro;
        java.lang.Object[] objArray16 = lista11.item;
        lista11.ultimo = 10;
        lista11.primeiro = (short) 1;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        lista21.primeiro = (short) 1;
        int int28 = lista21.pos;
        lista21.pos = '#';
        lista21.imprime();
        boolean boolean32 = lista21.vazia();
        int int33 = lista21.primeiro;
        int int34 = lista21.ultimo;
        lista11.insere((java.lang.Object) int34);
        lista11.primeiro = 10;
        lista11.ultimo = 0;
        lista11.ultimo = (short) 0;
        lista4.insere((java.lang.Object) lista11);
        int int43 = lista4.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0801");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        boolean boolean17 = lista12.vazia();
        lista12.ultimo = '#';
        java.lang.Object[] objArray20 = lista12.item;
        lista0.item = objArray20;
        boolean boolean22 = lista0.vazia();
        int int23 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0802");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0803");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        lista0.pos = 97;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.ultimo;
        lista16.pos = (short) -1;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista16.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass24 = lista20.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0804");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        int int11 = lista6.pos;
        lista6.pos = (byte) 100;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.imprime();
        lista14.primeiro = (short) 0;
        java.lang.Object[] objArray20 = lista14.item;
        java.lang.Object[] objArray21 = lista14.item;
        lista6.item = objArray21;
        lista0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0805");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        int int10 = lista0.primeiro;
        int int11 = lista0.pos;
        boolean boolean12 = lista0.vazia();
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0806");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.ultimo = ' ';
        lista11.ultimo = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        int int22 = lista0.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.imprime();
        int int27 = lista23.ultimo;
        boolean boolean28 = lista23.vazia();
        boolean boolean29 = lista23.vazia();
        java.lang.Object[] objArray30 = lista23.item;
        lista23.imprime();
        java.lang.Object[] objArray32 = lista23.item;
        java.lang.Object[] objArray33 = lista23.item;
        lista23.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        lista35.imprime();
        boolean boolean38 = lista35.vazia();
        int int39 = lista35.primeiro;
        java.lang.Object[] objArray40 = lista35.item;
        lista35.ultimo = 10;
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        lista43.imprime();
        boolean boolean46 = lista43.vazia();
        int int47 = lista43.primeiro;
        java.lang.Object[] objArray48 = lista43.item;
        lista35.item = objArray48;
        java.lang.Object[] objArray50 = lista35.item;
        lista23.item = objArray50;
        java.lang.Object[] objArray52 = lista23.item;
        lista0.item = objArray52;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0807");
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
        lista0.pos = (short) 0;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0808");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.pos = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        lista21.insere((java.lang.Object) 0L);
        int int26 = lista21.primeiro;
        lista18.insere((java.lang.Object) lista21);
        lista21.primeiro = 'a';
        lista21.imprime();
        boolean boolean31 = lista21.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = 10;
        lista32.pos = (byte) 100;
        lista32.primeiro = (short) 1;
        int int39 = lista32.pos;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { int41 };
        lista32.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        boolean boolean49 = lista44.vazia();
        lista44.ultimo = '#';
        java.lang.Object[] objArray52 = lista44.item;
        lista32.insere((java.lang.Object) objArray52);
        lista21.insere((java.lang.Object) objArray52);
        lista0.item = objArray52;
        int int56 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0809");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0810");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista0.pos;
        int int11 = lista0.ultimo;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0811");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 1;
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0812");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista0.ultimo;
        int int11 = lista0.ultimo;
        int int12 = lista0.pos;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0813");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.imprime();
        lista6.primeiro = (short) 0;
        java.lang.Object[] objArray12 = lista6.item;
        lista0.item = objArray12;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0814");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.primeiro;
        boolean boolean13 = lista3.vazia();
        lista3.primeiro = 10;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.ultimo;
        int int18 = lista16.primeiro;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = 10;
        lista19.pos = (byte) 100;
        int int24 = lista19.pos;
        lista19.pos = (byte) 100;
        lista19.pos = 100;
        lista19.pos = (byte) 0;
        int int31 = lista19.pos;
        lista16.insere((java.lang.Object) lista19);
        int int33 = lista16.pos;
        lista16.primeiro = (-1);
        lista16.pos = ' ';
        int int38 = lista16.pos;
        int int39 = lista16.ultimo;
        lista3.insere((java.lang.Object) int39);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0815");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        java.lang.Object[] objArray33 = lista0.item;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        int int39 = lista34.pos;
        lista34.pos = (byte) 100;
        lista34.pos = 100;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        lista44.primeiro = (short) 1;
        lista44.pos = 1;
        lista44.primeiro = (short) 10;
        lista44.primeiro = ' ';
        lista44.pos = 100;
        java.lang.Object[] objArray59 = lista44.item;
        lista44.primeiro = '#';
        lista34.insere((java.lang.Object) lista44);
        lista0.insere((java.lang.Object) lista44);
        lista0.pos = 97;
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0816");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.imprime();
        int int17 = lista13.ultimo;
        boolean boolean18 = lista13.vazia();
        boolean boolean19 = lista13.vazia();
        java.lang.Object[] objArray20 = lista13.item;
        lista13.imprime();
        java.lang.Object[] objArray22 = lista13.item;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.insere((java.lang.Object) objArray23);
        lista0.ultimo = 100;
        int int27 = lista0.pos;
        lista0.primeiro = 101;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0817");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        lista0.imprime();
        lista0.primeiro = (short) 1;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0]");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0818");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        lista0.primeiro = (-1);
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0819");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = (byte) 100;
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0820");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.primeiro = (byte) 0;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0821");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0822");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        lista0.pos = 10;
        int int22 = lista0.ultimo;
        boolean boolean23 = lista0.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        int int29 = lista24.pos;
        lista24.pos = (byte) 100;
        java.lang.Class<?> wildcardClass32 = lista24.getClass();
        lista0.insere((java.lang.Object) lista24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0823");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        lista0.ultimo = (short) 10;
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        int int15 = lista10.pos;
        int int16 = lista10.primeiro;
        lista10.ultimo = 0;
        lista10.primeiro = 0;
        lista10.pos = (short) 10;
        boolean boolean23 = lista10.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        int int29 = lista24.pos;
        lista24.pos = (byte) 100;
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = 10;
        lista32.imprime();
        lista32.primeiro = (short) 0;
        java.lang.Object[] objArray38 = lista32.item;
        java.lang.Object[] objArray39 = lista32.item;
        lista24.item = objArray39;
        lista10.item = objArray39;
        lista0.item = objArray39;
        ds.Lista lista43 = new ds.Lista();
        lista43.pos = 10;
        lista43.pos = (byte) 100;
        int int48 = lista43.pos;
        lista43.pos = (byte) 100;
        lista43.pos = 100;
        lista43.pos = (byte) 0;
        int int55 = lista43.pos;
        lista43.primeiro = '#';
        boolean boolean58 = lista43.vazia();
        lista43.ultimo = 97;
        boolean boolean61 = lista43.vazia();
        ds.Lista lista62 = new ds.Lista();
        int int63 = lista62.ultimo;
        lista62.pos = (short) -1;
        ds.Lista lista66 = new ds.Lista();
        lista66.imprime();
        java.lang.Object[] objArray68 = lista66.item;
        lista62.insere((java.lang.Object) lista66);
        java.lang.Object[] objArray70 = lista66.item;
        lista43.item = objArray70;
        lista0.item = objArray70;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0824");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        int int16 = lista0.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        int int24 = lista17.ultimo;
        lista17.ultimo = 'a';
        lista17.pos = ' ';
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        int int34 = lista29.pos;
        lista29.pos = (byte) 100;
        lista29.pos = 100;
        lista29.pos = (byte) 0;
        ds.Lista lista41 = new ds.Lista();
        lista41.pos = 10;
        lista41.pos = (byte) 100;
        java.lang.Object[] objArray46 = lista41.item;
        lista29.item = objArray46;
        lista17.item = objArray46;
        lista0.item = objArray46;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0825");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0826");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.pos = (byte) 100;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100.0d, (byte) 100, lista11, 1L };
        lista0.item = objArray13;
        lista0.ultimo = ' ';
        lista0.primeiro = (-1);
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0827");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        int int9 = lista0.ultimo;
        lista0.imprime();
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0828");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        lista0.primeiro = 1;
        java.lang.Object[] objArray16 = lista0.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        lista17.pos = 1;
        lista17.primeiro = (short) 10;
        lista17.primeiro = ' ';
        boolean boolean30 = lista17.vazia();
        int int31 = lista17.primeiro;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.ultimo;
        lista32.primeiro = (short) 10;
        java.lang.Object[] objArray36 = lista32.item;
        lista17.item = objArray36;
        lista0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0829");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        int int12 = lista8.primeiro;
        java.lang.Object[] objArray13 = lista8.item;
        lista0.item = objArray13;
        int int15 = lista0.primeiro;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.pos = 100;
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0830");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = 2;
        int int5 = lista0.ultimo;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0831");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0832");
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
        int int16 = lista0.primeiro;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.ultimo;
        lista17.pos = (short) -1;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray23 = lista21.item;
        lista17.insere((java.lang.Object) lista21);
        int int25 = lista21.ultimo;
        int int26 = lista21.ultimo;
        int int27 = lista21.pos;
        lista0.insere((java.lang.Object) lista21);
        int int29 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0833");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0834");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0835");
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
        boolean boolean18 = lista0.vazia();
        java.lang.Object[] objArray19 = lista0.item;
        lista0.pos = (short) 0;
        lista0.primeiro = 101;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0836");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.ultimo;
        lista9.pos = (short) -1;
        lista9.imprime();
        lista9.pos = 10;
        int int16 = lista9.ultimo;
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0837");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.ultimo = (byte) 0;
        lista0.pos = 1;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.imprime();
        int int16 = lista12.ultimo;
        boolean boolean17 = lista12.vazia();
        boolean boolean18 = lista12.vazia();
        java.lang.Object[] objArray19 = lista12.item;
        lista12.imprime();
        lista12.primeiro = 0;
        lista0.insere((java.lang.Object) 0);
        java.lang.Object[] objArray24 = lista0.item;
        int int25 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0838");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0839");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.imprime();
        lista9.primeiro = (short) 0;
        java.lang.Object[] objArray15 = lista9.item;
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        lista0.primeiro = 97;
        lista0.pos = (short) 1;
        int int22 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0840");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        lista0.imprime();
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0841");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        lista0.ultimo = (-1);
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista12.ultimo = (byte) 10;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        lista30.insere((java.lang.Object) 0L);
        lista30.ultimo = '#';
        lista30.pos = 10;
        ds.Lista lista39 = new ds.Lista();
        lista39.pos = 10;
        lista39.pos = (byte) 100;
        int int44 = lista39.pos;
        lista39.pos = (byte) 100;
        int int47 = lista39.pos;
        lista30.insere((java.lang.Object) int47);
        lista12.insere((java.lang.Object) int47);
        ds.Lista lista50 = new ds.Lista();
        lista50.pos = 10;
        lista50.pos = (byte) 100;
        int int55 = lista50.pos;
        int int56 = lista50.primeiro;
        lista50.ultimo = 0;
        java.lang.Object[] objArray59 = lista50.item;
        lista12.insere((java.lang.Object) objArray59);
        lista0.item = objArray59;
        int int62 = lista0.ultimo;
        ds.Lista lista63 = new ds.Lista();
        lista63.imprime();
        lista63.imprime();
        boolean boolean66 = lista63.vazia();
        int int67 = lista63.primeiro;
        java.lang.Object[] objArray68 = lista63.item;
        lista63.ultimo = 10;
        boolean boolean71 = lista63.vazia();
        java.lang.Object[] objArray72 = lista63.item;
        lista0.item = objArray72;
        ds.Lista lista74 = new ds.Lista();
        lista74.imprime();
        lista74.imprime();
        boolean boolean77 = lista74.vazia();
        lista74.pos = (byte) 0;
        int int80 = lista74.ultimo;
        ds.Lista lista81 = new ds.Lista();
        lista81.imprime();
        lista81.imprime();
        boolean boolean84 = lista81.vazia();
        int int85 = lista81.primeiro;
        java.lang.Object[] objArray86 = lista81.item;
        lista74.insere((java.lang.Object) objArray86);
        lista0.item = objArray86;
        java.lang.Class<?> wildcardClass89 = objArray86.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0842");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (byte) 1;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0843");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        int int11 = lista0.primeiro;
        lista0.pos = 101;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0844");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0845");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0846");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = (short) 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        int int23 = lista16.pos;
        lista16.primeiro = 100;
        int int26 = lista16.primeiro;
        lista0.insere((java.lang.Object) int26);
        int int28 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.pos = (-1);
        ds.Lista lista33 = new ds.Lista();
        lista33.pos = 10;
        lista33.pos = (byte) 100;
        int int38 = lista33.pos;
        lista33.pos = (byte) 100;
        lista33.pos = 100;
        lista33.pos = (byte) 0;
        int int45 = lista33.pos;
        boolean boolean46 = lista33.vazia();
        lista33.primeiro = (short) 1;
        lista33.ultimo = (byte) 10;
        boolean boolean51 = lista33.vazia();
        java.lang.Object[] objArray52 = lista33.item;
        lista0.insere((java.lang.Object) objArray52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0847");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = '#';
        lista0.insere((java.lang.Object) true);
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0848");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0849");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0850");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0851");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        lista4.primeiro = (short) 1;
        lista4.pos = 100;
        boolean boolean12 = lista4.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0852");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0853");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        lista21.pos = (byte) 0;
        int int27 = lista21.ultimo;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        lista28.primeiro = (short) 1;
        int int35 = lista28.pos;
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.ultimo;
        java.lang.Object[] objArray38 = new java.lang.Object[] { int37 };
        lista28.item = objArray38;
        lista21.insere((java.lang.Object) lista28);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        lista41.imprime();
        boolean boolean44 = lista41.vazia();
        lista41.pos = (byte) 0;
        int int47 = lista41.pos;
        lista41.ultimo = (short) 10;
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        lista50.imprime();
        boolean boolean53 = lista50.vazia();
        int int54 = lista50.primeiro;
        java.lang.Object[] objArray55 = lista50.item;
        lista41.insere((java.lang.Object) objArray55);
        lista28.insere((java.lang.Object) objArray55);
        ds.Lista lista58 = new ds.Lista();
        lista58.pos = 10;
        lista58.imprime();
        int int62 = lista58.ultimo;
        boolean boolean63 = lista58.vazia();
        boolean boolean64 = lista58.vazia();
        java.lang.Object[] objArray65 = lista58.item;
        lista58.imprime();
        java.lang.Object[] objArray67 = lista58.item;
        lista28.item = objArray67;
        lista0.insere((java.lang.Object) objArray67);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0854");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        int int17 = lista3.primeiro;
        boolean boolean18 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0855");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = 35;
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0856");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        int int17 = lista3.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        int int26 = lista21.pos;
        int int27 = lista21.primeiro;
        lista21.ultimo = 0;
        lista21.primeiro = 0;
        java.lang.Class<?> wildcardClass32 = lista21.getClass();
        lista18.insere((java.lang.Object) wildcardClass32);
        java.lang.Object[] objArray34 = lista18.item;
        lista3.item = objArray34;
        ds.Lista lista36 = new ds.Lista();
        lista36.pos = 10;
        lista36.pos = (byte) 100;
        lista36.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.pos = 10;
        java.lang.Object[] objArray45 = lista42.item;
        lista36.item = objArray45;
        lista3.item = objArray45;
        lista3.ultimo = (byte) 100;
        lista3.pos = 10;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0857");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.pos = (byte) 100;
        int int13 = lista8.pos;
        int int14 = lista8.primeiro;
        lista8.ultimo = 0;
        lista8.primeiro = 0;
        lista8.pos = (short) 10;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        java.lang.Object[] objArray26 = lista21.item;
        lista8.item = objArray26;
        java.lang.Object[] objArray28 = lista8.item;
        lista8.primeiro = '#';
        lista8.ultimo = 1;
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        int int35 = lista8.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0858");
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
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        lista16.pos = 1;
        lista16.primeiro = (short) 10;
        lista16.primeiro = ' ';
        java.lang.Object[] objArray29 = lista16.item;
        lista16.pos = (short) 0;
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = 10;
        lista32.pos = (byte) 100;
        lista32.primeiro = (short) 1;
        int int39 = lista32.pos;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { int41 };
        lista32.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        boolean boolean49 = lista44.vazia();
        lista44.ultimo = '#';
        java.lang.Object[] objArray52 = lista44.item;
        lista32.insere((java.lang.Object) objArray52);
        lista16.item = objArray52;
        lista0.item = objArray52;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0859");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (short) 100;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        lista6.insere((java.lang.Object) 0L);
        lista6.ultimo = '#';
        lista6.pos = 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        int int20 = lista15.pos;
        lista15.pos = (byte) 100;
        int int23 = lista15.pos;
        lista6.insere((java.lang.Object) int23);
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = (byte) 1;
        boolean boolean28 = lista0.vazia();
        boolean boolean29 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0860");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        int int16 = lista9.ultimo;
        int int17 = lista9.pos;
        int int18 = lista9.ultimo;
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) 0L);
        int int28 = lista23.primeiro;
        lista20.insere((java.lang.Object) lista23);
        int int30 = lista23.ultimo;
        int int31 = lista23.primeiro;
        lista23.primeiro = (byte) 0;
        int int34 = lista23.pos;
        lista23.ultimo = 0;
        int int37 = lista23.primeiro;
        lista9.insere((java.lang.Object) lista23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0861");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = (short) 1;
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.imprime();
        java.lang.Object[] objArray18 = lista14.item;
        lista14.primeiro = (byte) 0;
        boolean boolean21 = lista14.vazia();
        java.lang.Object[] objArray22 = lista14.item;
        boolean boolean23 = lista14.vazia();
        int int24 = lista14.pos;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.imprime();
        int int29 = lista25.ultimo;
        boolean boolean30 = lista25.vazia();
        int int31 = lista25.pos;
        int int32 = lista25.primeiro;
        ds.Lista lista33 = new ds.Lista();
        lista33.pos = 10;
        lista33.pos = (byte) 100;
        int int38 = lista33.pos;
        lista33.pos = (byte) 100;
        lista33.pos = 100;
        lista33.pos = (byte) 0;
        int int45 = lista33.pos;
        lista33.primeiro = '#';
        int int48 = lista33.pos;
        java.lang.Object[] objArray49 = lista33.item;
        lista25.item = objArray49;
        lista14.item = objArray49;
        lista0.item = objArray49;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0862");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray20 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0863");
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
        lista3.primeiro = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0864");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.ultimo = 'a';
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0865");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        int int26 = lista16.primeiro;
        int int27 = lista16.primeiro;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0866");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        java.lang.Object[] objArray33 = lista0.item;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        int int39 = lista34.pos;
        lista34.pos = (byte) 100;
        lista34.pos = 100;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        lista44.primeiro = (short) 1;
        lista44.pos = 1;
        lista44.primeiro = (short) 10;
        lista44.primeiro = ' ';
        lista44.pos = 100;
        java.lang.Object[] objArray59 = lista44.item;
        lista44.primeiro = '#';
        lista34.insere((java.lang.Object) lista44);
        lista0.insere((java.lang.Object) lista44);
        boolean boolean64 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0867");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.pos;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.primeiro = '4';
        lista0.pos = 2;
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0868");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        int int17 = lista3.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        lista18.pos = (byte) 100;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.pos = (byte) 100;
        lista23.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        java.lang.Object[] objArray32 = lista29.item;
        lista23.item = objArray32;
        lista18.item = objArray32;
        lista3.insere((java.lang.Object) objArray32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0869");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        int int17 = lista3.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        int int26 = lista21.pos;
        int int27 = lista21.primeiro;
        lista21.ultimo = 0;
        lista21.primeiro = 0;
        java.lang.Class<?> wildcardClass32 = lista21.getClass();
        lista18.insere((java.lang.Object) wildcardClass32);
        java.lang.Object[] objArray34 = lista18.item;
        lista3.item = objArray34;
        ds.Lista lista36 = new ds.Lista();
        lista36.pos = 10;
        lista36.pos = (byte) 100;
        lista36.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.pos = 10;
        java.lang.Object[] objArray45 = lista42.item;
        lista36.item = objArray45;
        lista3.item = objArray45;
        lista3.ultimo = (byte) 100;
        lista3.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0870");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista8 = new ds.Lista();
        lista8.pos = 10;
        lista8.imprime();
        int int12 = lista8.ultimo;
        boolean boolean13 = lista8.vazia();
        boolean boolean14 = lista8.vazia();
        java.lang.Object[] objArray15 = lista8.item;
        lista0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0871");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        lista14.pos = 100;
        lista14.pos = (byte) 0;
        int int26 = lista14.pos;
        lista14.primeiro = '#';
        int int29 = lista14.primeiro;
        lista0.insere((java.lang.Object) int29);
        lista0.primeiro = 10;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0872");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        lista0.pos = (short) 10;
        lista0.imprime();
        lista0.ultimo = 100;
        lista0.primeiro = 2;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0873");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.imprime();
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0874");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 97;
        lista0.primeiro = (short) 0;
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0875");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (-1);
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        java.lang.Object[] objArray30 = lista25.item;
        lista12.item = objArray30;
        lista0.item = objArray30;
        int int33 = lista0.primeiro;
        lista0.pos = (-1);
        int int36 = lista0.pos;
        boolean boolean37 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0876");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        lista0.pos = 100;
        lista0.ultimo = 37;
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0877");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.pos = (short) 10;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0878");
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
        lista0.pos = '#';
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 37;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        int int31 = lista25.primeiro;
        lista25.ultimo = 0;
        lista25.primeiro = 0;
        java.lang.Class<?> wildcardClass36 = lista25.getClass();
        lista22.insere((java.lang.Object) wildcardClass36);
        int int38 = lista22.primeiro;
        lista22.primeiro = 100;
        ds.Lista lista41 = new ds.Lista();
        lista41.pos = 10;
        lista41.pos = (byte) 100;
        int int46 = lista41.pos;
        int int47 = lista41.primeiro;
        lista41.primeiro = ' ';
        java.lang.Object[] objArray50 = lista41.item;
        lista22.item = objArray50;
        lista0.item = objArray50;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0879");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        lista0.pos = 100;
        java.lang.Object[] objArray15 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0880");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.pos = (byte) 100;
        lista15.primeiro = (short) 1;
        lista15.pos = 1;
        lista15.primeiro = (short) 10;
        lista15.primeiro = ' ';
        boolean boolean28 = lista15.vazia();
        lista15.pos = 0;
        lista15.imprime();
        lista0.insere((java.lang.Object) lista15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0881");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        lista0.ultimo = '#';
        lista0.pos = 10;
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = 10;
        lista9.pos = (byte) 100;
        int int14 = lista9.pos;
        lista9.pos = (byte) 100;
        int int17 = lista9.pos;
        lista0.insere((java.lang.Object) int17);
        java.lang.Object obj19 = null;
        lista0.insere(obj19);
        int int21 = lista0.ultimo;
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0882");
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
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0883");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0884");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        lista3.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0885");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = 1;
        boolean boolean13 = lista0.vazia();
        lista0.primeiro = ' ';
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0886");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = 1;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0887");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        lista0.pos = 'a';
        int int17 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0888");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        int int22 = lista0.ultimo;
        boolean boolean23 = lista0.vazia();
        int int24 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0889");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.primeiro;
        lista0.pos = (-1);
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0890");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        lista3.primeiro = 'a';
        lista3.imprime();
        boolean boolean13 = lista3.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        lista14.primeiro = (short) 1;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.ultimo;
        java.lang.Object[] objArray24 = new java.lang.Object[] { int23 };
        lista14.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        lista26.pos = 10;
        lista26.pos = (byte) 100;
        boolean boolean31 = lista26.vazia();
        lista26.ultimo = '#';
        java.lang.Object[] objArray34 = lista26.item;
        lista14.insere((java.lang.Object) objArray34);
        lista3.insere((java.lang.Object) objArray34);
        lista3.imprime();
        int int38 = lista3.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0891");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0892");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        lista0.pos = (byte) 10;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0893");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.primeiro = 'a';
        lista0.ultimo = (byte) 10;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0894");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.pos = (short) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        lista11.imprime();
        boolean boolean14 = lista11.vazia();
        int int15 = lista11.primeiro;
        java.lang.Object[] objArray16 = lista11.item;
        lista11.ultimo = 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        boolean boolean22 = lista19.vazia();
        int int23 = lista19.primeiro;
        java.lang.Object[] objArray24 = lista19.item;
        lista11.item = objArray24;
        int int26 = lista11.primeiro;
        java.lang.Object[] objArray27 = lista11.item;
        lista11.pos = 100;
        ds.Lista lista30 = new ds.Lista();
        lista30.pos = 10;
        lista30.imprime();
        lista30.primeiro = (short) 0;
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        lista36.imprime();
        boolean boolean39 = lista36.vazia();
        lista36.pos = (byte) 0;
        int int42 = lista36.pos;
        java.lang.Object[] objArray43 = lista36.item;
        lista30.item = objArray43;
        lista11.insere((java.lang.Object) lista30);
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.ultimo;
        lista46.pos = (short) -1;
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        java.lang.Object[] objArray52 = lista50.item;
        lista46.insere((java.lang.Object) lista50);
        java.lang.Object[] objArray54 = lista50.item;
        lista11.insere((java.lang.Object) objArray54);
        lista0.insere((java.lang.Object) lista11);
        boolean boolean57 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0895");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.pos = (short) 0;
        lista0.ultimo = (short) 100;
        java.lang.Object[] objArray18 = lista0.item;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0896");
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
        int int15 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int18 = lista0.primeiro;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0897");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        boolean boolean11 = lista8.vazia();
        lista8.pos = (byte) 0;
        int int14 = lista8.ultimo;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.imprime();
        boolean boolean18 = lista15.vazia();
        int int19 = lista15.primeiro;
        java.lang.Object[] objArray20 = lista15.item;
        lista8.insere((java.lang.Object) objArray20);
        lista8.imprime();
        boolean boolean23 = lista8.vazia();
        lista0.insere((java.lang.Object) lista8);
        lista8.primeiro = 2;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0898");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.pos = '#';
        int int12 = lista0.primeiro;
        lista0.imprime();
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0899");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        int int18 = lista13.primeiro;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        lista0.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.imprime();
        int int27 = lista23.ultimo;
        boolean boolean28 = lista23.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        boolean boolean32 = lista29.vazia();
        int int33 = lista29.primeiro;
        java.lang.Object[] objArray34 = lista29.item;
        lista23.item = objArray34;
        lista23.pos = 100;
        lista0.insere((java.lang.Object) 100);
        int int39 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0900");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.primeiro;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        lista13.primeiro = 0;
        lista13.ultimo = (byte) 100;
        int int22 = lista13.ultimo;
        lista0.insere((java.lang.Object) lista13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0901");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0902");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        lista0.primeiro = '#';
        int int17 = lista0.primeiro;
        lista0.ultimo = 35;
        lista0.primeiro = (byte) -1;
        int int22 = lista0.primeiro;
        lista0.pos = 'a';
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0903");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista0.insere((java.lang.Object) lista12);
        lista12.imprime();
        int int30 = lista12.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0904");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        lista0.imprime();
        lista0.pos = (short) 1;
        lista0.pos = 12;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        int int17 = lista11.primeiro;
        lista11.ultimo = 0;
        lista11.pos = (-1);
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        lista22.imprime();
        boolean boolean25 = lista22.vazia();
        lista22.pos = (byte) 0;
        int int28 = lista22.pos;
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = 10;
        lista29.pos = (byte) 100;
        lista29.primeiro = (short) 1;
        int int36 = lista29.pos;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.ultimo;
        java.lang.Object[] objArray39 = new java.lang.Object[] { int38 };
        lista29.item = objArray39;
        lista29.imprime();
        lista29.primeiro = (short) 1;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        int int49 = lista44.pos;
        int int50 = lista44.primeiro;
        lista44.ultimo = 0;
        lista44.primeiro = 0;
        lista44.pos = (short) 10;
        ds.Lista lista57 = new ds.Lista();
        lista57.pos = 10;
        lista57.pos = (byte) 100;
        java.lang.Object[] objArray62 = lista57.item;
        lista44.item = objArray62;
        lista29.item = objArray62;
        lista22.item = objArray62;
        lista11.item = objArray62;
        lista0.item = objArray62;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0905");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        boolean boolean23 = lista20.vazia();
        lista20.pos = (byte) 0;
        int int26 = lista20.pos;
        lista20.ultimo = (short) 10;
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        boolean boolean32 = lista29.vazia();
        int int33 = lista29.primeiro;
        java.lang.Object[] objArray34 = lista29.item;
        lista20.insere((java.lang.Object) objArray34);
        lista7.insere((java.lang.Object) objArray34);
        ds.Lista lista37 = new ds.Lista();
        lista37.pos = 10;
        lista37.imprime();
        int int41 = lista37.ultimo;
        boolean boolean42 = lista37.vazia();
        boolean boolean43 = lista37.vazia();
        java.lang.Object[] objArray44 = lista37.item;
        lista37.imprime();
        java.lang.Object[] objArray46 = lista37.item;
        lista7.item = objArray46;
        java.lang.Class<?> wildcardClass48 = lista7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0906");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.ultimo = ' ';
        lista12.ultimo = (short) 10;
        lista3.insere((java.lang.Object) (short) 10);
        lista3.ultimo = 0;
        lista3.primeiro = '4';
        lista3.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0907");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.pos = 10;
        lista5.pos = (byte) 100;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 35;
        lista0.insere((java.lang.Object) lista5);
        int int14 = lista5.pos;
        lista5.imprime();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0908");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (byte) 10;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0909");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.ultimo = (short) 10;
        int int9 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0910");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        lista0.primeiro = (short) -1;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        int int24 = lista17.pos;
        lista17.pos = '#';
        lista17.imprime();
        boolean boolean28 = lista17.vazia();
        int int29 = lista17.ultimo;
        java.lang.Object[] objArray30 = lista17.item;
        lista17.pos = 37;
        lista0.insere((java.lang.Object) lista17);
        lista17.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0911");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = (short) 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        int int23 = lista16.pos;
        lista16.primeiro = 100;
        int int26 = lista16.primeiro;
        lista0.insere((java.lang.Object) int26);
        int int28 = lista0.ultimo;
        int int29 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0912");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = 0;
        lista16.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista16);
        boolean boolean26 = lista0.vazia();
        int int27 = lista0.ultimo;
        lista0.ultimo = (byte) 100;
        java.lang.Class<?> wildcardClass30 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0913");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = new java.lang.Object[] { int9 };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista0.insere((java.lang.Object) lista12);
        lista0.primeiro = 35;
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0914");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        lista6.imprime();
        lista6.primeiro = (short) 0;
        java.lang.Object[] objArray12 = lista6.item;
        lista0.item = objArray12;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0915");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (-1);
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        java.lang.Object[] objArray30 = lista25.item;
        lista12.item = objArray30;
        lista0.item = objArray30;
        lista0.pos = 1;
        java.lang.Object[] objArray35 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0916");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        int int17 = lista3.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0917");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.ultimo;
        lista0.imprime();
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0918");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista8.pos = (short) 100;
        int int13 = lista8.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        lista14.ultimo = '#';
        lista14.pos = 10;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.pos = (byte) 100;
        int int28 = lista23.pos;
        lista23.pos = (byte) 100;
        int int31 = lista23.pos;
        lista14.insere((java.lang.Object) int31);
        lista8.insere((java.lang.Object) lista14);
        lista8.ultimo = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0919");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        boolean boolean17 = lista0.vazia();
        boolean boolean18 = lista0.vazia();
        lista0.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0920");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0921");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        int int13 = lista0.ultimo;
        int int14 = lista0.pos;
        boolean boolean15 = lista0.vazia();
        lista0.primeiro = (short) -1;
        java.lang.Object[] objArray18 = null;
        lista0.item = objArray18;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0922");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        lista0.primeiro = '#';
        int int17 = lista0.primeiro;
        lista0.ultimo = 35;
        lista0.primeiro = (byte) -1;
        int int22 = lista0.primeiro;
        int int23 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0923");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        lista0.primeiro = (short) -1;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0924");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.pos;
        lista3.ultimo = 0;
        int int17 = lista3.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.pos = 10;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        int int26 = lista21.pos;
        int int27 = lista21.primeiro;
        lista21.ultimo = 0;
        lista21.primeiro = 0;
        java.lang.Class<?> wildcardClass32 = lista21.getClass();
        lista18.insere((java.lang.Object) wildcardClass32);
        java.lang.Object[] objArray34 = lista18.item;
        lista3.item = objArray34;
        ds.Lista lista36 = new ds.Lista();
        lista36.pos = 10;
        lista36.pos = (byte) 100;
        lista36.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.pos = 10;
        java.lang.Object[] objArray45 = lista42.item;
        lista36.item = objArray45;
        lista3.item = objArray45;
        lista3.ultimo = (byte) 100;
        lista3.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0925");
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
        int int15 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int18 = lista0.primeiro;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = 10;
        lista19.imprime();
        int int23 = lista19.ultimo;
        boolean boolean24 = lista19.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        lista25.imprime();
        boolean boolean28 = lista25.vazia();
        int int29 = lista25.primeiro;
        java.lang.Object[] objArray30 = lista25.item;
        lista19.item = objArray30;
        lista19.primeiro = (short) 100;
        java.lang.Object[] objArray34 = lista19.item;
        lista0.item = objArray34;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0926");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        int int10 = lista6.primeiro;
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.ultimo;
        int int15 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0927");
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
        boolean boolean38 = lista25.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0928");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.ultimo = 1;
        java.lang.Object[] objArray25 = lista0.item;
        boolean boolean26 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0929");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 100;
        int int8 = lista0.ultimo;
        lista0.ultimo = 'a';
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0930");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.pos = 100;
        lista0.ultimo = 101;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0931");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0932");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        int int24 = lista17.pos;
        lista17.pos = '#';
        lista17.imprime();
        boolean boolean28 = lista17.vazia();
        int int29 = lista17.ultimo;
        java.lang.Object[] objArray30 = lista17.item;
        lista0.item = objArray30;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        boolean boolean35 = lista32.vazia();
        int int36 = lista32.primeiro;
        java.lang.Object[] objArray37 = lista32.item;
        java.lang.Class<?> wildcardClass38 = lista32.getClass();
        lista0.insere((java.lang.Object) lista32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0933");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        int int5 = lista0.primeiro;
        lista0.primeiro = (-1);
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.ultimo;
        int int11 = lista9.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        boolean boolean22 = lista12.vazia();
        int int23 = lista12.pos;
        lista9.insere((java.lang.Object) int23);
        lista9.pos = (short) 0;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0934");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.ultimo = ' ';
        lista11.ultimo = (short) 10;
        lista0.insere((java.lang.Object) (short) 10);
        lista0.primeiro = (byte) -1;
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0935");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        lista10.pos = 10;
        lista10.pos = (byte) 100;
        lista10.primeiro = (short) 1;
        int int17 = lista10.pos;
        lista10.pos = '#';
        lista10.imprime();
        boolean boolean21 = lista10.vazia();
        int int22 = lista10.primeiro;
        int int23 = lista10.ultimo;
        lista0.insere((java.lang.Object) int23);
        lista0.primeiro = 10;
        ds.Lista lista27 = new ds.Lista();
        lista27.pos = 10;
        lista27.pos = (byte) 100;
        lista27.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.pos = 10;
        java.lang.Object[] objArray36 = lista33.item;
        lista27.item = objArray36;
        java.lang.Class<?> wildcardClass38 = lista27.getClass();
        lista0.insere((java.lang.Object) lista27);
        boolean boolean40 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0936");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        int int15 = lista0.pos;
        java.lang.Object[] objArray16 = lista0.item;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0937");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0938");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.primeiro = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        boolean boolean22 = lista19.vazia();
        int int23 = lista19.primeiro;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        lista24.imprime();
        lista24.insere((java.lang.Object) 0L);
        int int29 = lista24.primeiro;
        lista24.primeiro = (-1);
        lista19.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray33 = lista19.item;
        java.lang.Object[] objArray34 = lista19.item;
        lista0.item = objArray34;
        lista0.primeiro = '#';
        lista0.pos = '4';
        int int40 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0939");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.ultimo;
        lista10.pos = (short) -1;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        lista10.insere((java.lang.Object) lista14);
        java.lang.Object[] objArray18 = lista14.item;
        lista14.primeiro = 0;
        lista0.insere((java.lang.Object) lista14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0940");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        lista0.pos = 35;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        lista12.primeiro = (short) 1;
        int int19 = lista12.pos;
        lista12.pos = '#';
        lista12.imprime();
        int int23 = lista12.primeiro;
        lista12.primeiro = (byte) 1;
        int int26 = lista12.ultimo;
        java.lang.Object[] objArray27 = lista12.item;
        lista0.item = objArray27;
        boolean boolean29 = lista0.vazia();
        java.lang.Object[] objArray30 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0941");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.pos = (byte) 100;
        int int16 = lista11.pos;
        lista11.pos = (byte) 100;
        lista11.pos = 100;
        lista11.pos = (byte) 0;
        int int23 = lista11.pos;
        boolean boolean24 = lista11.vazia();
        lista11.primeiro = (short) 1;
        lista11.ultimo = (byte) 10;
        boolean boolean29 = lista11.vazia();
        java.lang.Object[] objArray30 = lista11.item;
        lista0.insere((java.lang.Object) lista11);
        int int32 = lista0.pos;
        boolean boolean33 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0942");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        lista0.ultimo = (-1);
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        int int24 = lista12.pos;
        boolean boolean25 = lista12.vazia();
        lista12.primeiro = (short) 1;
        lista12.ultimo = (byte) 10;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        lista30.insere((java.lang.Object) 0L);
        lista30.ultimo = '#';
        lista30.pos = 10;
        ds.Lista lista39 = new ds.Lista();
        lista39.pos = 10;
        lista39.pos = (byte) 100;
        int int44 = lista39.pos;
        lista39.pos = (byte) 100;
        int int47 = lista39.pos;
        lista30.insere((java.lang.Object) int47);
        lista12.insere((java.lang.Object) int47);
        ds.Lista lista50 = new ds.Lista();
        lista50.pos = 10;
        lista50.pos = (byte) 100;
        int int55 = lista50.pos;
        int int56 = lista50.primeiro;
        lista50.ultimo = 0;
        java.lang.Object[] objArray59 = lista50.item;
        lista12.insere((java.lang.Object) objArray59);
        lista0.item = objArray59;
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0943");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        java.lang.Object[] objArray33 = lista0.item;
        lista0.imprime();
        boolean boolean35 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0944");
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
        int int17 = lista3.pos;
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0945");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.ultimo;
        int int13 = lista3.ultimo;
        lista3.ultimo = 0;
        java.lang.Class<?> wildcardClass16 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0946");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.imprime();
        int int16 = lista12.ultimo;
        boolean boolean17 = lista12.vazia();
        boolean boolean18 = lista12.vazia();
        java.lang.Object[] objArray19 = lista12.item;
        lista12.imprime();
        java.lang.Object[] objArray21 = lista12.item;
        java.lang.Object[] objArray22 = lista12.item;
        lista0.item = objArray22;
        boolean boolean24 = lista0.vazia();
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0947");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        lista0.primeiro = (short) -1;
        ds.Lista lista17 = new ds.Lista();
        lista17.pos = 10;
        lista17.pos = (byte) 100;
        lista17.primeiro = (short) 1;
        int int24 = lista17.pos;
        lista17.pos = '#';
        lista17.imprime();
        boolean boolean28 = lista17.vazia();
        int int29 = lista17.ultimo;
        java.lang.Object[] objArray30 = lista17.item;
        lista17.pos = 37;
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        lista34.primeiro = (short) 1;
        lista34.pos = 1;
        lista34.primeiro = (short) 10;
        lista34.primeiro = ' ';
        boolean boolean47 = lista34.vazia();
        java.lang.Object[] objArray48 = lista34.item;
        lista0.item = objArray48;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0948");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0949");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.pos = 10;
        lista7.pos = (byte) 100;
        lista7.primeiro = (short) 1;
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.ultimo;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int16 };
        lista7.item = objArray17;
        lista0.insere((java.lang.Object) lista7);
        lista0.pos = 10;
        int int22 = lista0.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.pos = 10;
        lista23.pos = (byte) 100;
        int int28 = lista23.pos;
        lista23.pos = (byte) 100;
        lista23.pos = 100;
        lista23.pos = (byte) 0;
        int int35 = lista23.pos;
        boolean boolean36 = lista23.vazia();
        lista23.primeiro = (short) 1;
        lista23.pos = '#';
        lista23.primeiro = (byte) 0;
        lista0.insere((java.lang.Object) lista23);
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0950");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0951");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = 0;
        lista0.primeiro = (short) 10;
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        lista14.primeiro = (short) 1;
        int int21 = lista14.pos;
        int int22 = lista14.primeiro;
        java.lang.Object[] objArray23 = lista14.item;
        boolean boolean24 = lista14.vazia();
        int int25 = lista14.ultimo;
        boolean boolean26 = lista14.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.pos = 10;
        java.lang.Object[] objArray30 = lista27.item;
        lista27.pos = (short) 0;
        java.lang.Object[] objArray33 = lista27.item;
        lista14.item = objArray33;
        java.lang.Class<?> wildcardClass35 = lista14.getClass();
        lista0.insere((java.lang.Object) lista14);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0952");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.ultimo = (byte) 0;
        lista0.pos = 1;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0953");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.pos = 10;
        lista4.pos = (byte) 100;
        lista4.primeiro = (short) 1;
        int int11 = lista4.pos;
        int int12 = lista4.pos;
        int int13 = lista4.ultimo;
        lista0.insere((java.lang.Object) int13);
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0954");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0955");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        ds.Lista lista5 = new ds.Lista();
        lista5.pos = 10;
        lista5.pos = (byte) 100;
        lista5.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        java.lang.Object[] objArray14 = lista11.item;
        lista5.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0956");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.pos = 10;
        lista14.pos = (byte) 100;
        int int19 = lista14.pos;
        lista14.pos = (byte) 100;
        ds.Lista lista22 = new ds.Lista();
        lista22.pos = 10;
        lista22.imprime();
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray28 = lista22.item;
        java.lang.Object[] objArray29 = lista22.item;
        lista14.item = objArray29;
        lista0.item = objArray29;
        int int32 = lista0.primeiro;
        java.lang.Object[] objArray33 = lista0.item;
        lista0.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.pos = 10;
        lista35.imprime();
        lista35.ultimo = ' ';
        ds.Lista lista41 = new ds.Lista();
        lista41.pos = 10;
        lista41.pos = (byte) 100;
        int int46 = lista41.pos;
        lista41.pos = (byte) 100;
        lista41.pos = 100;
        lista41.pos = (byte) 0;
        ds.Lista lista53 = new ds.Lista();
        lista53.pos = 10;
        lista53.pos = (byte) 100;
        java.lang.Object[] objArray58 = lista53.item;
        lista41.item = objArray58;
        lista35.item = objArray58;
        lista0.item = objArray58;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0957");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean5 = lista0.vazia();
        lista0.pos = 100;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0958");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.imprime();
        int int29 = lista25.ultimo;
        boolean boolean30 = lista25.vazia();
        boolean boolean31 = lista25.vazia();
        java.lang.Object[] objArray32 = lista25.item;
        lista25.imprime();
        java.lang.Object[] objArray34 = lista25.item;
        java.lang.Object[] objArray35 = lista25.item;
        lista12.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        int int38 = lista0.primeiro;
        ds.Lista lista39 = new ds.Lista();
        lista39.pos = 10;
        lista39.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.pos = 10;
        lista43.pos = (byte) 100;
        lista43.primeiro = (short) 1;
        int int50 = lista43.pos;
        int int51 = lista43.pos;
        int int52 = lista43.ultimo;
        lista39.insere((java.lang.Object) int52);
        java.lang.Object[] objArray54 = lista39.item;
        ds.Lista lista55 = new ds.Lista();
        lista55.pos = 10;
        lista55.pos = (byte) 100;
        lista55.primeiro = 0;
        lista55.ultimo = (byte) 100;
        lista39.insere((java.lang.Object) lista55);
        boolean boolean65 = lista39.vazia();
        int int66 = lista39.ultimo;
        lista39.ultimo = (byte) 100;
        lista39.primeiro = (byte) 1;
        lista0.insere((java.lang.Object) lista39);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0959");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object[] objArray10 = lista3.item;
        int int11 = lista3.ultimo;
        int int12 = lista3.primeiro;
        java.lang.Object[] objArray13 = lista3.item;
        lista3.ultimo = (short) 10;
        int int16 = lista3.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0960");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) 10;
        int int21 = lista0.primeiro;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0961");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        int int20 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0962");
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
        boolean boolean18 = lista0.vazia();
        int int19 = lista0.pos;
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0963");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        int int13 = lista9.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 0L);
        int int19 = lista14.primeiro;
        lista14.primeiro = (-1);
        lista9.insere((java.lang.Object) (-1));
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) 0L);
        boolean boolean28 = lista23.vazia();
        int int29 = lista23.primeiro;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        lista30.imprime();
        boolean boolean33 = lista30.vazia();
        int int34 = lista30.primeiro;
        java.lang.Object[] objArray35 = lista30.item;
        lista23.insere((java.lang.Object) objArray35);
        lista9.item = objArray35;
        ds.Lista lista38 = new ds.Lista();
        lista38.pos = 10;
        lista38.pos = (byte) 100;
        int int43 = lista38.pos;
        int int44 = lista38.primeiro;
        lista38.ultimo = 0;
        lista38.primeiro = 0;
        ds.Lista lista49 = new ds.Lista();
        lista49.pos = 10;
        lista49.pos = (byte) 100;
        int int54 = lista49.pos;
        java.lang.Object[] objArray59 = new java.lang.Object[] { (byte) 1, "hi!", true, 1.0f };
        lista49.item = objArray59;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 0L, lista9, 0, lista49, 10.0d };
        lista0.item = objArray62;
        java.lang.Class<?> wildcardClass64 = objArray62.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, hi!, true, 1.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0964");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.pos = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        lista21.insere((java.lang.Object) 0L);
        int int26 = lista21.primeiro;
        lista18.insere((java.lang.Object) lista21);
        lista21.primeiro = 'a';
        lista21.imprime();
        boolean boolean31 = lista21.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = 10;
        lista32.pos = (byte) 100;
        lista32.primeiro = (short) 1;
        int int39 = lista32.pos;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { int41 };
        lista32.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        boolean boolean49 = lista44.vazia();
        lista44.ultimo = '#';
        java.lang.Object[] objArray52 = lista44.item;
        lista32.insere((java.lang.Object) objArray52);
        lista21.insere((java.lang.Object) objArray52);
        lista0.item = objArray52;
        int int56 = lista0.primeiro;
        java.lang.Object[] objArray57 = lista0.item;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0965");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.insere((java.lang.Object) 100.0f);
        int int9 = lista0.ultimo;
        lista0.pos = 97;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0966");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        java.lang.Object[] objArray16 = lista13.item;
        lista13.pos = (short) 0;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        lista24.imprime();
        lista24.insere((java.lang.Object) 0L);
        int int29 = lista24.primeiro;
        lista21.insere((java.lang.Object) lista24);
        int int31 = lista24.ultimo;
        lista24.pos = 0;
        lista0.insere((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0967");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int6 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        lista9.imprime();
        lista9.pos = (short) 100;
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.imprime();
        lista15.insere((java.lang.Object) 0L);
        lista15.ultimo = '#';
        lista15.pos = 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        int int29 = lista24.pos;
        lista24.pos = (byte) 100;
        int int32 = lista24.pos;
        lista15.insere((java.lang.Object) int32);
        lista9.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista9);
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0968");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        int int16 = lista0.ultimo;
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0969");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        lista0.imprime();
        lista0.pos = (short) 1;
        lista0.pos = 12;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0970");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.ultimo = 1;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        int int31 = lista25.primeiro;
        lista25.ultimo = 0;
        lista25.primeiro = 0;
        lista25.pos = (short) 10;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        lista38.imprime();
        boolean boolean41 = lista38.vazia();
        int int42 = lista38.primeiro;
        java.lang.Object[] objArray43 = lista38.item;
        lista38.ultimo = 10;
        java.lang.Object[] objArray46 = lista38.item;
        lista25.item = objArray46;
        lista0.item = objArray46;
        lista0.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.pos = 10;
        lista50.pos = (byte) 100;
        ds.Lista lista55 = new ds.Lista();
        lista55.pos = 10;
        lista55.pos = (byte) 100;
        lista55.imprime();
        ds.Lista lista61 = new ds.Lista();
        lista61.pos = 10;
        java.lang.Object[] objArray64 = lista61.item;
        lista55.item = objArray64;
        lista50.item = objArray64;
        boolean boolean67 = lista50.vazia();
        java.lang.Class<?> wildcardClass68 = lista50.getClass();
        lista0.insere((java.lang.Object) wildcardClass68);
        int int70 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0971");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0972");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray13 = null;
        lista0.item = objArray13;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0973");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0974");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        int int15 = lista0.ultimo;
        int int16 = lista0.pos;
        lista0.pos = (short) 0;
        lista0.imprime();
        lista0.primeiro = 101;
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0975");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.primeiro = '#';
        lista0.ultimo = 1;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        int int30 = lista25.pos;
        int int31 = lista25.primeiro;
        lista25.ultimo = 0;
        lista25.primeiro = 0;
        lista25.pos = (short) 10;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        lista38.imprime();
        boolean boolean41 = lista38.vazia();
        int int42 = lista38.primeiro;
        java.lang.Object[] objArray43 = lista38.item;
        lista38.ultimo = 10;
        java.lang.Object[] objArray46 = lista38.item;
        lista25.item = objArray46;
        lista0.item = objArray46;
        lista0.imprime();
        lista0.pos = 35;
        ds.Lista lista52 = new ds.Lista();
        lista52.pos = 10;
        lista52.pos = (byte) 100;
        lista52.primeiro = (short) 1;
        lista52.pos = 1;
        lista52.primeiro = (short) 10;
        lista52.primeiro = ' ';
        java.lang.Object[] objArray65 = lista52.item;
        java.lang.Object[] objArray66 = lista52.item;
        lista0.item = objArray66;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0976");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.pos;
        lista0.pos = '#';
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        lista12.imprime();
        boolean boolean15 = lista12.vazia();
        lista12.pos = (byte) 0;
        int int18 = lista12.pos;
        lista12.imprime();
        java.lang.Object[] objArray20 = lista12.item;
        lista0.item = objArray20;
        boolean boolean22 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0977");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 1);
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0978");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 10;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.pos = 10;
        lista13.pos = (byte) 100;
        lista13.primeiro = (short) 1;
        lista13.imprime();
        java.lang.Object[] objArray21 = lista13.item;
        java.lang.Object[] objArray22 = lista13.item;
        lista0.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0979");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = 10;
        java.lang.Object[] objArray9 = lista6.item;
        lista0.item = objArray9;
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0980");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.imprime();
        lista0.pos = (byte) 1;
        int int12 = lista0.ultimo;
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0981");
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
        int int17 = lista0.pos;
        lista0.primeiro = (-1);
        lista0.pos = ' ';
        lista0.primeiro = 1;
        int int24 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0982");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.imprime();
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0983");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        lista0.pos = (short) 100;
        java.lang.Object[] objArray17 = lista0.item;
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0984");
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
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        lista16.pos = 1;
        lista16.primeiro = (short) 10;
        lista16.primeiro = ' ';
        java.lang.Object[] objArray29 = lista16.item;
        lista16.pos = (short) 0;
        ds.Lista lista32 = new ds.Lista();
        lista32.pos = 10;
        lista32.pos = (byte) 100;
        lista32.primeiro = (short) 1;
        int int39 = lista32.pos;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { int41 };
        lista32.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        lista44.pos = 10;
        lista44.pos = (byte) 100;
        boolean boolean49 = lista44.vazia();
        lista44.ultimo = '#';
        java.lang.Object[] objArray52 = lista44.item;
        lista32.insere((java.lang.Object) objArray52);
        lista16.item = objArray52;
        lista0.item = objArray52;
        java.lang.Object[] objArray56 = lista0.item;
        int int57 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0985");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        lista0.primeiro = '#';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.imprime();
        int int20 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray22 = lista0.item;
        lista0.pos = (short) 10;
        lista0.ultimo = 2;
        lista0.primeiro = 100;
        java.lang.Object[] objArray29 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0986");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.pos = (short) 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        lista16.primeiro = (short) 1;
        int int23 = lista16.pos;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.ultimo;
        java.lang.Object[] objArray26 = new java.lang.Object[] { int25 };
        lista16.item = objArray26;
        ds.Lista lista28 = new ds.Lista();
        lista28.pos = 10;
        lista28.pos = (byte) 100;
        boolean boolean33 = lista28.vazia();
        lista28.ultimo = '#';
        java.lang.Object[] objArray36 = lista28.item;
        lista16.insere((java.lang.Object) objArray36);
        lista0.item = objArray36;
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.ultimo = (short) 100;
        boolean boolean43 = lista39.vazia();
        java.lang.Class<?> wildcardClass44 = lista39.getClass();
        lista0.insere((java.lang.Object) lista39);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0987");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        lista15.pos = 10;
        lista15.imprime();
        int int19 = lista15.ultimo;
        int int20 = lista15.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista21.pos = 10;
        lista21.pos = (byte) 100;
        lista21.primeiro = (short) 1;
        int int28 = lista21.pos;
        lista21.pos = '#';
        lista21.imprime();
        boolean boolean32 = lista21.vazia();
        int int33 = lista21.ultimo;
        java.lang.Object[] objArray34 = lista21.item;
        lista15.item = objArray34;
        lista0.insere((java.lang.Object) objArray34);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0988");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.primeiro = (short) 10;
        lista0.imprime();
        int int5 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0989");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        int int10 = lista5.primeiro;
        lista5.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = lista0.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = 10;
        lista16.pos = (byte) 100;
        boolean boolean21 = lista16.vazia();
        lista16.ultimo = (short) 100;
        int int24 = lista16.primeiro;
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0990");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        lista0.ultimo = 0;
        lista0.pos = (-1);
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        int int18 = lista12.primeiro;
        lista12.ultimo = 0;
        lista12.primeiro = 0;
        lista12.pos = (short) 10;
        ds.Lista lista25 = new ds.Lista();
        lista25.pos = 10;
        lista25.pos = (byte) 100;
        java.lang.Object[] objArray30 = lista25.item;
        lista12.item = objArray30;
        lista0.item = objArray30;
        int int33 = lista0.primeiro;
        lista0.pos = (-1);
        int int36 = lista0.pos;
        ds.Lista lista37 = new ds.Lista();
        lista37.pos = 10;
        lista37.pos = (byte) 100;
        int int42 = lista37.pos;
        int int43 = lista37.primeiro;
        lista37.ultimo = 0;
        lista37.primeiro = 0;
        lista37.pos = (short) 10;
        ds.Lista lista50 = new ds.Lista();
        lista50.pos = 10;
        lista50.pos = (byte) 100;
        java.lang.Object[] objArray55 = lista50.item;
        lista37.item = objArray55;
        lista37.primeiro = 10;
        lista37.primeiro = (short) 0;
        int int61 = lista37.pos;
        java.lang.Object[] objArray62 = lista37.item;
        lista0.item = objArray62;
        int int64 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0991");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.pos = (short) -1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray6 = lista4.item;
        lista0.insere((java.lang.Object) lista4);
        lista4.primeiro = (short) 1;
        lista4.imprime();
        lista4.imprime();
        lista4.pos = (byte) -1;
        java.lang.Class<?> wildcardClass14 = lista4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0992");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.pos = 100;
        lista0.pos = (byte) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0993");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 0L);
        int int8 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        int int10 = lista3.ultimo;
        int int11 = lista3.primeiro;
        lista3.primeiro = (byte) 0;
        int int14 = lista3.ultimo;
        int int15 = lista3.primeiro;
        lista3.pos = (short) 10;
        lista3.ultimo = (short) -1;
        lista3.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0994");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        lista0.primeiro = ' ';
        lista0.pos = 100;
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.ultimo;
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0995");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray6 = null;
        lista0.item = objArray6;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0996");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista11.pos = 10;
        lista11.imprime();
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        int int17 = lista11.pos;
        java.lang.Class<?> wildcardClass18 = lista11.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0997");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.ultimo = 'a';
        lista0.pos = ' ';
        ds.Lista lista12 = new ds.Lista();
        lista12.pos = 10;
        lista12.pos = (byte) 100;
        int int17 = lista12.pos;
        lista12.pos = (byte) 100;
        lista12.pos = 100;
        lista12.pos = (byte) 0;
        ds.Lista lista24 = new ds.Lista();
        lista24.pos = 10;
        lista24.pos = (byte) 100;
        java.lang.Object[] objArray29 = lista24.item;
        lista12.item = objArray29;
        lista0.item = objArray29;
        lista0.pos = (byte) 1;
        ds.Lista lista34 = new ds.Lista();
        lista34.pos = 10;
        lista34.pos = (byte) 100;
        lista34.primeiro = (short) 1;
        lista34.pos = 1;
        lista34.primeiro = (short) 10;
        lista34.primeiro = ' ';
        java.lang.Object[] objArray47 = lista34.item;
        java.lang.Object[] objArray48 = lista34.item;
        lista0.insere((java.lang.Object) lista34);
        int int50 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0998");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 10;
        lista0.pos = (byte) 100;
        int int5 = lista0.pos;
        lista0.ultimo = ' ';
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = 35;
        int int11 = lista0.pos;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0999");
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
        lista0.pos = '#';
        lista0.primeiro = (byte) 0;
        int int20 = lista0.pos;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.ultimo;
        lista21.primeiro = (short) 10;
        java.lang.Object[] objArray25 = lista21.item;
        int int26 = lista21.ultimo;
        java.lang.Object[] objArray27 = lista21.item;
        lista0.item = objArray27;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test1000");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.pos = 10;
        lista3.pos = (byte) 100;
        int int8 = lista3.pos;
        lista3.pos = (byte) 100;
        lista3.pos = 100;
        lista3.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        int int16 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}

