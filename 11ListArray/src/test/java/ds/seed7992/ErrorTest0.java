package ds.seed7992;

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
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = 100;
        lista0.primeiro = 11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista8.item = objArray14;
        lista8.pos = 0;
        lista8.imprime();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista20.pos = 0;
        java.lang.Class<?> wildcardClass30 = lista20.getClass();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista31.item = objArray37;
        lista31.primeiro = (short) -1;
        int int41 = lista31.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1), lista20, lista31 };
        lista8.item = objArray42;
        lista8.ultimo = (byte) 1;
        lista8.imprime();
        int int47 = lista8.ultimo;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        boolean boolean50 = lista48.vazia();
        int int51 = lista48.pos;
        int int52 = lista48.pos;
        java.lang.Object[] objArray53 = lista48.item;
        lista8.item = objArray53;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        lista55.imprime();
        int int58 = lista55.ultimo;
        int int59 = lista55.pos;
        java.lang.Object[] objArray60 = lista55.item;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista61.item = objArray67;
        lista55.item = objArray67;
        lista8.item = objArray67;
        lista0.insere((java.lang.Object) lista8);
        int int72 = lista0.pos;
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
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista8.item = objArray14;
        lista8.pos = 0;
        lista8.imprime();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista20.pos = 0;
        java.lang.Class<?> wildcardClass30 = lista20.getClass();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista31.item = objArray37;
        lista31.primeiro = (short) -1;
        int int41 = lista31.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1), lista20, lista31 };
        lista8.item = objArray42;
        lista8.ultimo = (byte) 1;
        lista8.imprime();
        int int47 = lista8.ultimo;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        boolean boolean50 = lista48.vazia();
        int int51 = lista48.pos;
        int int52 = lista48.pos;
        java.lang.Object[] objArray53 = lista48.item;
        lista8.item = objArray53;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        lista55.imprime();
        int int58 = lista55.ultimo;
        int int59 = lista55.pos;
        java.lang.Object[] objArray60 = lista55.item;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista61.item = objArray67;
        lista55.item = objArray67;
        lista8.item = objArray67;
        lista0.insere((java.lang.Object) lista8);
        int int72 = lista0.ultimo;
        java.lang.Object[] objArray73 = lista0.item;
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
        lista0.ultimo = 10;
        lista0.insere((java.lang.Object) (-1L));
        lista0.pos = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = 35;
        java.lang.Object[] objArray16 = lista0.item;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        int int20 = lista17.pos;
        lista17.ultimo = '#';
        int int23 = lista17.primeiro;
        java.lang.Object[] objArray24 = lista17.item;
        lista0.item = objArray24;
        lista0.pos = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = (short) 1;
        int int3 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = 10;
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
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista9.pos = (-1);
        lista9.ultimo = '4';
        lista9.pos = 36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista9.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        int int8 = lista0.pos;
        lista0.pos = (byte) 0;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = 'a';
        lista0.primeiro = 11;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        int int19 = lista16.pos;
        lista16.ultimo = '#';
        int int22 = lista16.primeiro;
        lista16.ultimo = 100;
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        boolean boolean27 = lista25.vazia();
        int int28 = lista25.primeiro;
        lista16.insere((java.lang.Object) lista25);
        lista16.ultimo = 35;
        java.lang.Object[] objArray32 = lista16.item;
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        boolean boolean35 = lista33.vazia();
        int int36 = lista33.pos;
        lista33.ultimo = '#';
        int int39 = lista33.primeiro;
        java.lang.Object[] objArray40 = lista33.item;
        lista16.item = objArray40;
        lista0.item = objArray40;
        int int43 = lista0.pos;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        int int23 = lista15.pos;
        lista15.pos = (byte) 0;
        lista15.pos = 'a';
        lista15.primeiro = (-1);
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        lista30.primeiro = (byte) 0;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        lista35.primeiro = (byte) 0;
        lista30.insere((java.lang.Object) lista35);
        boolean boolean41 = lista35.vazia();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        java.lang.Object[] objArray48 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista42.item = objArray48;
        lista42.pos = 0;
        lista42.imprime();
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        java.lang.Object[] objArray60 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista54.item = objArray60;
        lista54.pos = 0;
        java.lang.Class<?> wildcardClass64 = lista54.getClass();
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        java.lang.Object[] objArray71 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista65.item = objArray71;
        lista65.primeiro = (short) -1;
        int int75 = lista65.ultimo;
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1), lista54, lista65 };
        lista42.item = objArray76;
        lista35.item = objArray76;
        lista15.item = objArray76;
        int int80 = lista15.pos;
        lista15.primeiro = (byte) 100;
        int int83 = lista15.ultimo;
        ds.Lista lista84 = new ds.Lista();
        boolean boolean85 = lista84.vazia();
        boolean boolean86 = lista84.vazia();
        int int87 = lista84.pos;
        int int88 = lista84.pos;
        int int89 = lista84.ultimo;
        lista84.imprime();
        java.lang.Object[] objArray91 = lista84.item;
        lista15.item = objArray91;
        lista0.item = objArray91;
        lista0.ultimo = ' ';
        int int96 = lista0.pos;
        int int97 = lista0.ultimo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = 35;
        java.lang.Object[] objArray16 = lista0.item;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        int int20 = lista17.pos;
        lista17.ultimo = '#';
        int int23 = lista17.primeiro;
        java.lang.Object[] objArray24 = lista17.item;
        lista0.item = objArray24;
        lista0.ultimo = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        int int12 = lista0.ultimo;
        lista0.pos = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista15.item = objArray21;
        int int23 = lista15.pos;
        lista15.pos = (byte) 0;
        lista15.pos = 'a';
        lista15.primeiro = (-1);
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        lista30.primeiro = (byte) 0;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        lista35.primeiro = (byte) 0;
        lista30.insere((java.lang.Object) lista35);
        boolean boolean41 = lista35.vazia();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        java.lang.Object[] objArray48 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista42.item = objArray48;
        lista42.pos = 0;
        lista42.imprime();
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        java.lang.Object[] objArray60 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista54.item = objArray60;
        lista54.pos = 0;
        java.lang.Class<?> wildcardClass64 = lista54.getClass();
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        java.lang.Object[] objArray71 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista65.item = objArray71;
        lista65.primeiro = (short) -1;
        int int75 = lista65.ultimo;
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1), lista54, lista65 };
        lista42.item = objArray76;
        lista35.item = objArray76;
        lista15.item = objArray76;
        int int80 = lista15.pos;
        lista15.primeiro = (byte) 100;
        int int83 = lista15.ultimo;
        ds.Lista lista84 = new ds.Lista();
        boolean boolean85 = lista84.vazia();
        boolean boolean86 = lista84.vazia();
        int int87 = lista84.pos;
        int int88 = lista84.pos;
        int int89 = lista84.ultimo;
        lista84.imprime();
        java.lang.Object[] objArray91 = lista84.item;
        lista15.item = objArray91;
        lista0.item = objArray91;
        lista0.ultimo = ' ';
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
        lista0.ultimo = 10;
        boolean boolean5 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.primeiro;
        lista0.ultimo = 100;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        int int12 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        lista9.pos = (-1);
        lista9.ultimo = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista9.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista0.item = objArray6;
        lista0.pos = 0;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista12.item = objArray18;
        lista12.pos = 0;
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista23.item = objArray29;
        lista23.primeiro = (short) -1;
        int int33 = lista23.ultimo;
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1), lista12, lista23 };
        lista0.item = objArray34;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        int int39 = lista0.ultimo;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        boolean boolean42 = lista40.vazia();
        int int43 = lista40.pos;
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = lista40.item;
        lista0.item = objArray45;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = '#';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista8.item = objArray14;
        lista8.pos = 0;
        lista8.imprime();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista20.item = objArray26;
        lista20.pos = 0;
        java.lang.Class<?> wildcardClass30 = lista20.getClass();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista31.item = objArray37;
        lista31.primeiro = (short) -1;
        int int41 = lista31.ultimo;
        java.lang.Object[] objArray42 = new java.lang.Object[] { (-1), lista20, lista31 };
        lista8.item = objArray42;
        lista8.ultimo = (byte) 1;
        lista8.imprime();
        int int47 = lista8.ultimo;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        boolean boolean50 = lista48.vazia();
        int int51 = lista48.pos;
        int int52 = lista48.pos;
        java.lang.Object[] objArray53 = lista48.item;
        lista8.item = objArray53;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        lista55.imprime();
        int int58 = lista55.ultimo;
        int int59 = lista55.pos;
        java.lang.Object[] objArray60 = lista55.item;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        java.lang.Object[] objArray67 = new java.lang.Object[] { "", 1L, 1L, 0L };
        lista61.item = objArray67;
        lista55.item = objArray67;
        lista8.item = objArray67;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray72 = lista0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        lista0.ultimo = '#';
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        int int10 = lista8.pos;
        java.lang.Object[] objArray11 = lista8.item;
        lista0.insere((java.lang.Object) objArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

