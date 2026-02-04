package ds.seed9121;

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
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        lista0.imprime();
    }
}

