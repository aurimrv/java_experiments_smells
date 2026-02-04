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
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        fila0.tras = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        fila0.frente = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila0.item = objArray19;
        int int21 = fila0.tras;
        fila0.tras = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) 0;
        fila0.tras = (short) 10;
        java.lang.Object obj35 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 1;
        ds.Fila fila3 = new ds.Fila();
        fila3.frente = (short) 1;
        fila3.tras = 0;
        boolean boolean8 = fila3.vazia();
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.tras = (short) 10;
        java.lang.Object[] objArray16 = fila9.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        java.lang.Object[] objArray23 = fila18.item;
        fila5.item = objArray23;
        fila0.item = objArray23;
        int int26 = fila0.frente;
        int int27 = fila0.frente;
        fila0.tras = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila0.item = objArray19;
        boolean boolean21 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = (short) 1;
        java.lang.Object[] objArray9 = fila6.item;
        fila0.item = objArray9;
        fila0.frente = 32;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = fila13.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.frente = (-1);
        java.lang.Object[] objArray26 = fila22.item;
        fila22.tras = (short) 10;
        java.lang.Object[] objArray29 = fila22.item;
        fila18.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.frente = (-1);
        java.lang.Object[] objArray35 = fila31.item;
        java.lang.Object[] objArray36 = fila31.item;
        fila18.item = objArray36;
        fila13.item = objArray36;
        java.lang.Object[] objArray39 = fila13.item;
        fila0.item = objArray39;
        int int41 = fila0.tras;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

