package ds.seed1448;

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
        int int2 = lista0.primeiro;
        lista0.pos = (byte) 100;
        lista0.ultimo = ' ';
        java.lang.Object[] objArray7 = lista0.item;
        lista0.primeiro = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        lista0.ultimo = (byte) 1;
        lista0.primeiro = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = (short) 10;
        lista0.pos = (short) 0;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) 100, boolean12, 1 };
        lista8.item = objArray14;
        lista8.insere((java.lang.Object) (short) 1);
        int int18 = lista8.primeiro;
        lista8.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = (short) 10;
        lista0.pos = (short) 0;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) 100, boolean12, 1 };
        lista8.item = objArray14;
        lista8.insere((java.lang.Object) (short) 1);
        int int18 = lista8.primeiro;
        lista8.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        int int22 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.primeiro;
        lista0.ultimo = (short) 100;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) 100, boolean12, 1 };
        lista8.item = objArray14;
        lista8.insere((java.lang.Object) (short) 1);
        lista8.primeiro = 1;
        boolean boolean20 = lista8.vazia();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista8.insere((java.lang.Object) lista21);
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (byte) 100, boolean28, 1 };
        lista24.item = objArray30;
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        boolean boolean34 = lista32.vazia();
        int int35 = lista32.primeiro;
        java.lang.Object[] objArray36 = lista32.item;
        lista24.item = objArray36;
        lista8.item = objArray36;
        lista0.item = objArray36;
        boolean boolean40 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.ultimo = (short) 10;
        lista0.insere((java.lang.Object) lista5);
        lista0.ultimo = (short) 10;
        int int12 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        lista0.pos = (byte) 100;
        lista0.ultimo = ' ';
        lista0.pos = (-1);
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (byte) 100, boolean13, 1 };
        lista9.item = objArray15;
        lista9.insere((java.lang.Object) (short) 1);
        lista9.primeiro = 1;
        boolean boolean21 = lista9.vazia();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        lista9.insere((java.lang.Object) lista22);
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (byte) 100, boolean29, 1 };
        lista25.item = objArray31;
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        boolean boolean35 = lista33.vazia();
        int int36 = lista33.primeiro;
        java.lang.Object[] objArray37 = lista33.item;
        lista25.item = objArray37;
        lista9.item = objArray37;
        lista0.item = objArray37;
        lista0.primeiro = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = (short) 10;
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.primeiro;
        lista0.ultimo = (short) 100;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) 100, boolean12, 1 };
        lista8.item = objArray14;
        lista8.insere((java.lang.Object) (short) 1);
        lista8.primeiro = 1;
        boolean boolean20 = lista8.vazia();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista8.insere((java.lang.Object) lista21);
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (byte) 100, boolean28, 1 };
        lista24.item = objArray30;
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        boolean boolean34 = lista32.vazia();
        int int35 = lista32.primeiro;
        java.lang.Object[] objArray36 = lista32.item;
        lista24.item = objArray36;
        lista8.item = objArray36;
        lista0.item = objArray36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, boolean4, 1 };
        lista0.item = objArray6;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = 1;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (byte) 100, boolean20, 1 };
        lista16.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        int int27 = lista24.primeiro;
        java.lang.Object[] objArray28 = lista24.item;
        lista16.item = objArray28;
        lista0.item = objArray28;
        java.lang.Object[] objArray31 = lista0.item;
        int int32 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.ultimo = (short) 10;
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 100, boolean8, 1 };
        lista4.item = objArray10;
        lista4.pos = (-1);
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        int int16 = lista14.ultimo;
        lista14.imprime();
        lista14.ultimo = (short) 10;
        lista14.primeiro = (byte) 10;
        int int22 = lista14.primeiro;
        lista4.insere((java.lang.Object) int22);
        lista0.insere((java.lang.Object) int22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 100, boolean8, 1 };
        lista4.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        int int15 = lista12.primeiro;
        java.lang.Object[] objArray16 = lista12.item;
        lista4.item = objArray16;
        lista0.item = objArray16;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        int int21 = lista19.ultimo;
        lista19.imprime();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        boolean boolean25 = lista23.vazia();
        lista23.imprime();
        lista19.insere((java.lang.Object) lista23);
        lista23.pos = (short) 10;
        int int30 = lista23.pos;
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (byte) 100, boolean35, 1 };
        lista31.item = objArray37;
        lista23.item = objArray37;
        lista0.item = objArray37;
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        java.lang.Object[] objArray47 = new java.lang.Object[] { (byte) 100, boolean45, 1 };
        lista41.item = objArray47;
        java.lang.Object[] objArray49 = lista41.item;
        lista0.insere((java.lang.Object) objArray49);
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        java.lang.Object[] objArray57 = new java.lang.Object[] { (byte) 100, boolean55, 1 };
        lista51.item = objArray57;
        lista51.insere((java.lang.Object) (short) 1);
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        ds.Lista lista64 = new ds.Lista();
        boolean boolean65 = lista64.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { (byte) 100, boolean65, 1 };
        lista61.item = objArray67;
        ds.Lista lista69 = new ds.Lista();
        boolean boolean70 = lista69.vazia();
        boolean boolean71 = lista69.vazia();
        int int72 = lista69.primeiro;
        java.lang.Object[] objArray73 = lista69.item;
        lista61.item = objArray73;
        lista51.item = objArray73;
        lista0.item = objArray73;
        lista0.ultimo = 35;
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
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.primeiro;
        lista0.ultimo = (short) 100;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) 100, boolean12, 1 };
        lista8.item = objArray14;
        lista8.insere((java.lang.Object) (short) 1);
        lista8.primeiro = 1;
        boolean boolean20 = lista8.vazia();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista8.insere((java.lang.Object) lista21);
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (byte) 100, boolean28, 1 };
        lista24.item = objArray30;
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        boolean boolean34 = lista32.vazia();
        int int35 = lista32.primeiro;
        java.lang.Object[] objArray36 = lista32.item;
        lista24.item = objArray36;
        lista8.item = objArray36;
        lista0.item = objArray36;
        lista0.pos = (byte) 100;
        int int42 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        boolean boolean5 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        int int9 = lista3.primeiro;
        lista3.primeiro = 0;
        lista3.ultimo = (byte) 1;
        int int14 = lista3.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista3.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.ultimo = (short) 10;
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray10 = lista5.item;
        lista5.ultimo = 'a';
        lista5.ultimo = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista5.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, boolean4, 1 };
        lista0.item = objArray6;
        lista0.insere((java.lang.Object) (short) 1);
        int int10 = lista0.primeiro;
        lista0.insere((java.lang.Object) false);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 100, boolean17, 1 };
        lista13.item = objArray19;
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        boolean boolean23 = lista21.vazia();
        int int24 = lista21.primeiro;
        java.lang.Object[] objArray25 = lista21.item;
        lista13.item = objArray25;
        lista0.item = objArray25;
        int int28 = lista0.primeiro;
        int int29 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, boolean4, 1 };
        lista0.item = objArray6;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = 1;
        int int12 = lista0.pos;
        lista0.ultimo = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        int int17 = lista15.ultimo;
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        lista19.imprime();
        lista15.insere((java.lang.Object) lista19);
        lista19.pos = (short) 10;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (byte) 100, boolean30, 1 };
        lista26.item = objArray32;
        lista26.insere((java.lang.Object) (short) 1);
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        java.lang.Object[] objArray42 = new java.lang.Object[] { (byte) 100, boolean40, 1 };
        lista36.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        boolean boolean46 = lista44.vazia();
        int int47 = lista44.primeiro;
        java.lang.Object[] objArray48 = lista44.item;
        lista36.item = objArray48;
        lista26.item = objArray48;
        lista19.item = objArray48;
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        boolean boolean54 = lista52.vazia();
        int int55 = lista52.primeiro;
        java.lang.Object[] objArray56 = lista52.item;
        lista19.item = objArray56;
        lista0.item = objArray56;
        ds.Lista lista59 = new ds.Lista();
        boolean boolean60 = lista59.vazia();
        ds.Lista lista62 = new ds.Lista();
        boolean boolean63 = lista62.vazia();
        java.lang.Object[] objArray65 = new java.lang.Object[] { (byte) 100, boolean63, 1 };
        lista59.item = objArray65;
        lista59.insere((java.lang.Object) (short) 1);
        lista59.primeiro = 1;
        lista59.pos = (byte) 10;
        lista59.ultimo = 0;
        ds.Lista lista75 = new ds.Lista();
        boolean boolean76 = lista75.vazia();
        ds.Lista lista78 = new ds.Lista();
        boolean boolean79 = lista78.vazia();
        java.lang.Object[] objArray81 = new java.lang.Object[] { (byte) 100, boolean79, 1 };
        lista75.item = objArray81;
        lista75.insere((java.lang.Object) (short) 1);
        lista75.primeiro = 1;
        lista75.pos = (byte) 10;
        lista75.imprime();
        lista59.insere((java.lang.Object) lista75);
        java.lang.Object[] objArray91 = lista75.item;
        lista0.insere((java.lang.Object) lista75);
        int int93 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        boolean boolean5 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean7 = lista3.vazia();
        lista3.ultimo = 'a';
        boolean boolean10 = lista3.vazia();
        java.lang.Object[] objArray11 = lista3.item;
        lista3.pos = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista3.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = (short) 10;
        lista0.insere((java.lang.Object) 1.0f);
        int int8 = lista0.ultimo;
        int int9 = lista0.primeiro;
        lista0.ultimo = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, boolean4, 1 };
        lista0.item = objArray6;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = 1;
        int int12 = lista0.pos;
        lista0.ultimo = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        int int17 = lista15.ultimo;
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        lista19.imprime();
        lista15.insere((java.lang.Object) lista19);
        lista19.pos = (short) 10;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (byte) 100, boolean30, 1 };
        lista26.item = objArray32;
        lista26.insere((java.lang.Object) (short) 1);
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        java.lang.Object[] objArray42 = new java.lang.Object[] { (byte) 100, boolean40, 1 };
        lista36.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        boolean boolean46 = lista44.vazia();
        int int47 = lista44.primeiro;
        java.lang.Object[] objArray48 = lista44.item;
        lista36.item = objArray48;
        lista26.item = objArray48;
        lista19.item = objArray48;
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        boolean boolean54 = lista52.vazia();
        int int55 = lista52.primeiro;
        java.lang.Object[] objArray56 = lista52.item;
        lista19.item = objArray56;
        lista0.item = objArray56;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

