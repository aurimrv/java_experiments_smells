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
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        boolean boolean3 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        int int16 = fila14.frente;
        int int17 = fila14.frente;
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.frente = (-1);
        fila14.enfileira((java.lang.Object) fila18);
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = '#';
        java.lang.Object[] objArray26 = fila23.item;
        fila14.enfileira((java.lang.Object) fila23);
        java.lang.Object[] objArray28 = fila23.item;
        fila0.item = objArray28;
        boolean boolean30 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila5.tras = '#';
        int int10 = fila5.frente;
        int int11 = fila5.tras;
        fila5.tras = (byte) 0;
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = 1;
        fila5.enfileira((java.lang.Object) 1);
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila5.item = objArray21;
        fila0.item = objArray21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        int int15 = fila9.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila9.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.tras = 35;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        int int10 = fila8.frente;
        int int11 = fila8.frente;
        java.lang.Object[] objArray12 = fila8.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = '#';
        fila8.enfileira((java.lang.Object) '#');
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.frente = (-1);
        int int21 = fila17.frente;
        fila8.enfileira((java.lang.Object) fila17);
        int int23 = fila17.frente;
        java.lang.Object[] objArray24 = fila17.item;
        fila4.item = objArray24;
        fila0.item = objArray24;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila9.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        int int15 = fila9.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila9.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 10;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        java.lang.Object[] objArray8 = fila4.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        fila4.enfileira((java.lang.Object) '#');
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        int int17 = fila13.frente;
        fila4.enfileira((java.lang.Object) fila13);
        int int19 = fila13.frente;
        java.lang.Object[] objArray20 = fila13.item;
        fila0.item = objArray20;
        fila0.frente = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

