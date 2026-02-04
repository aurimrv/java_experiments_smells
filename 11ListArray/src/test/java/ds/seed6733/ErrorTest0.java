package ds.seed6733;

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
        lista0.ultimo = (byte) 1;
        lista0.pos = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = 0;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.insere((java.lang.Object) objArray6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 'a', objArray13, 100.0d, (-1), 0.0d };
        lista10.item = objArray17;
        lista8.item = objArray17;
        lista8.insere((java.lang.Object) (byte) -1);
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista8.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista8.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        java.lang.Object[] objArray38 = new java.lang.Object[] { 'a', objArray34, 100.0d, (-1), 0.0d };
        lista31.item = objArray38;
        lista29.item = objArray38;
        java.lang.Object[] objArray41 = lista29.item;
        lista29.pos = (byte) 0;
        int int44 = lista29.ultimo;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 'a', objArray50, 100.0d, (-1), 0.0d };
        lista47.item = objArray54;
        lista45.item = objArray54;
        lista45.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray59 = lista45.item;
        lista29.item = objArray59;
        lista0.insere((java.lang.Object) lista29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        boolean boolean17 = lista0.vazia();
        int int18 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        boolean boolean17 = lista0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', objArray5, 100.0d, (-1), 0.0d };
        lista2.item = objArray9;
        lista0.item = objArray9;
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        java.lang.Object[] objArray17 = lista0.item;
        int int18 = lista0.primeiro;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

