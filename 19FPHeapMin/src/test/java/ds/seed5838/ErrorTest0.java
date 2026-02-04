package ds.seed5838;

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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(1, (java.lang.Object) 1L);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin8.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin13);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin8.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        fPHeapMin8.copia(itemArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin8);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '4');
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        fPHeapMin11.copia(itemArray32);
        fPHeapMin8.copia(itemArray32);
        fPHeapMin5.copia(itemArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin5);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) '4', (int) (byte) 0);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item13 = fPHeapMin12.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(0);
        fPHeapMin17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin21.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin21.copia(itemArray23);
        fPHeapMin15.copia(itemArray23);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin12.copia(itemArray27);
        java.lang.Class<?> wildcardClass32 = fPHeapMin12.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin12);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fPHeapMin1.refaz((int) (byte) 1, 100);
    }
}

