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
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        boolean boolean6 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        fila6.item = objArray9;
        java.lang.Object[] objArray11 = fila6.item;
        int int12 = fila6.tras;
        java.lang.Object[] objArray13 = fila6.item;
        fila6.tras = (byte) -1;
        java.lang.Object[] objArray16 = fila6.item;
        fila6.tras = '4';
        java.lang.Class<?> wildcardClass19 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = (byte) 10;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        int int5 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        fila0.tras = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = 0;
        fila9.frente = 0;
        java.lang.Object[] objArray14 = fila9.item;
        fila9.imprime();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        fila16.item = objArray19;
        java.lang.Object[] objArray21 = fila16.item;
        int int22 = fila16.tras;
        java.lang.Object[] objArray23 = fila16.item;
        fila9.item = objArray23;
        fila0.item = objArray23;
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila26.frente = 0;
        fila26.tras = (byte) 1;
        fila26.tras = (short) 1;
        java.lang.Object[] objArray34 = fila26.item;
        fila0.item = objArray34;
        java.lang.Object obj36 = fila0.desenfileira();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.tras = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        boolean boolean3 = fila0.vazia();
        fila0.frente = '#';
        int int6 = fila0.frente;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.tras = 10;
        boolean boolean5 = fila0.vazia();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        fila0.frente = (short) 10;
        fila0.tras = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        fila0.tras = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        fila0.frente = 2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.tras = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (short) 100;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = 0;
        fila0.enfileira((java.lang.Object) fila4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        fila0.tras = (byte) 1;
        fila0.frente = 0;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        int int10 = fila0.tras;
        java.lang.Object[] objArray11 = fila0.item;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        fila0.item = objArray3;
        fila0.enfileira((java.lang.Object) (short) -1);
        int int7 = fila0.tras;
        fila0.imprime();
        fila0.frente = 100;
        ds.Fila fila11 = new ds.Fila();
        fila11.frente = 0;
        boolean boolean14 = fila11.vazia();
        fila11.frente = '#';
        fila11.tras = (byte) 10;
        boolean boolean19 = fila11.vazia();
        java.lang.Object[] objArray20 = fila11.item;
        fila0.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        int int24 = fila22.frente;
        int int25 = fila22.tras;
        fila0.enfileira((java.lang.Object) int25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fila0.imprime();
    }
}

