package ds.seed5482;

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
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.imprime();
        int int19 = lista15.pos;
        lista15.primeiro = (byte) -1;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.item = objArray22;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista10.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        lista0.ultimo = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        int int15 = lista10.pos;
        int int16 = lista10.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista10.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.pos;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray13 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        int int15 = lista10.pos;
        int int16 = lista10.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista10.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.primeiro;
        java.lang.Object[] objArray11 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        int int15 = lista10.pos;
        int int16 = lista10.primeiro;
        java.lang.Object[] objArray17 = lista10.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista10.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        boolean boolean22 = lista20.vazia();
        int int23 = lista20.primeiro;
        lista0.insere((java.lang.Object) lista20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.ultimo = 97;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = 10;
        lista0.insere((java.lang.Object) lista6);
        int int11 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        int int15 = lista10.pos;
        int int16 = lista10.ultimo;
        lista10.pos = 36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista10.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista0.primeiro = (short) -1;
        lista0.ultimo = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = '#';
        lista14.pos = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista14.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista20.insere((java.lang.Object) lista24);
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        int int31 = lista29.primeiro;
        lista29.imprime();
        int int33 = lista29.pos;
        lista29.primeiro = (byte) -1;
        java.lang.Object[] objArray36 = lista29.item;
        lista24.item = objArray36;
        lista0.insere((java.lang.Object) lista24);
        int int39 = lista24.ultimo;
        lista24.ultimo = 36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista24.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = '4';
        lista0.pos = ' ';
        int int6 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista5.imprime();
        boolean boolean9 = lista5.vazia();
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.ultimo = 0;
        lista8.ultimo = (short) 10;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.pos = 10;
        lista16.primeiro = 0;
        int int23 = lista16.ultimo;
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = '4';
        lista0.pos = ' ';
        boolean boolean6 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        java.lang.Object[] objArray7 = lista4.item;
        lista0.item = objArray7;
        int int9 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = (-1);
        int int9 = lista6.primeiro;
        int int10 = lista6.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        int int14 = lista11.ultimo;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        int int17 = lista15.ultimo;
        lista15.primeiro = (short) 1;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista15.item = objArray22;
        lista11.item = objArray22;
        lista6.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int27 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.ultimo;
        java.lang.Object[] objArray14 = lista12.item;
        lista9.item = objArray14;
        lista0.item = objArray14;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (short) 100;
        lista0.primeiro = ' ';
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.pos = (short) 10;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        lista8.insere((java.lang.Object) lista14);
        lista8.primeiro = (short) -1;
        lista8.ultimo = (short) 1;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        lista22.ultimo = '#';
        lista22.pos = (short) 10;
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        java.lang.Object[] objArray30 = lista28.item;
        lista22.insere((java.lang.Object) lista28);
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        lista32.ultimo = '#';
        lista28.insere((java.lang.Object) lista32);
        ds.Lista lista37 = new ds.Lista();
        lista37.imprime();
        int int39 = lista37.primeiro;
        lista37.imprime();
        int int41 = lista37.pos;
        lista37.primeiro = (byte) -1;
        java.lang.Object[] objArray44 = lista37.item;
        lista32.item = objArray44;
        lista8.insere((java.lang.Object) lista32);
        lista0.insere((java.lang.Object) lista32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista32.imprime();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista10.imprime();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        lista7.item = objArray19;
        lista7.pos = (short) -1;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        lista0.ultimo = '4';
        java.lang.Object[] objArray28 = lista0.item;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista29.item = objArray33;
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        int int37 = lista35.primeiro;
        lista35.imprime();
        int int39 = lista35.pos;
        lista35.primeiro = (byte) -1;
        int int42 = lista35.ultimo;
        lista35.pos = '4';
        java.lang.Class<?> wildcardClass45 = lista35.getClass();
        lista29.insere((java.lang.Object) lista35);
        lista29.imprime();
        lista29.imprime();
        int int49 = lista29.ultimo;
        java.lang.Object[] objArray50 = lista29.item;
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.pos;
        lista51.ultimo = '#';
        lista51.pos = (short) 0;
        ds.Lista lista57 = new ds.Lista();
        int int58 = lista57.pos;
        java.lang.Object[] objArray59 = lista57.item;
        lista51.item = objArray59;
        int int61 = lista51.ultimo;
        java.lang.Object[] objArray62 = lista51.item;
        lista29.item = objArray62;
        lista0.insere((java.lang.Object) lista29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista29.imprime();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        int int7 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.pos = (short) -1;
        lista0.ultimo = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.imprime();
        int int19 = lista15.pos;
        lista15.primeiro = (byte) -1;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.item = objArray22;
        lista10.pos = (byte) 100;
        lista10.ultimo = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista10.imprime();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.pos = 10;
        lista8.primeiro = 0;
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        java.lang.Object[] objArray18 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

