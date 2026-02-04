package ds.seed9006;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1501");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.insere(item3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }
}

