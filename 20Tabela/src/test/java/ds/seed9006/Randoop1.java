package ds.seed9006;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test501");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item[] itemArray1 = tabela0.registros;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Tabela tabela5 = new ds.Tabela();
        int int6 = tabela5.n;
        int int7 = tabela5.n;
        ds.Item item8 = null;
        int int9 = tabela5.binaria(item8);
        ds.Item[] itemArray10 = new ds.Item[] {};
        tabela5.registros = itemArray10;
        ds.Tabela tabela12 = new ds.Tabela();
        int int13 = tabela12.n;
        int int14 = tabela12.n;
        ds.Item item15 = null;
        int int16 = tabela12.binaria(item15);
        ds.Item[] itemArray17 = new ds.Item[] {};
        tabela12.registros = itemArray17;
        ds.Tabela tabela19 = new ds.Tabela();
        int int20 = tabela19.n;
        int int21 = tabela19.n;
        int int22 = tabela19.n;
        int int23 = tabela19.n;
        ds.Item item24 = null;
        int int25 = tabela19.binaria(item24);
        ds.Item[] itemArray26 = tabela19.registros;
        tabela12.registros = itemArray26;
        tabela5.registros = itemArray26;
        tabela0.registros = itemArray26;
        ds.Item item30 = null;
        int int31 = tabela0.binaria(item30);
        ds.Item[] itemArray32 = tabela0.registros;
        int int33 = tabela0.n;
        int int34 = tabela0.n;
        ds.Item[] itemArray35 = null;
        tabela0.registros = itemArray35;
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        int int9 = tabela7.n;
        ds.Item item10 = null;
        int int11 = tabela7.binaria(item10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        tabela7.registros = itemArray12;
        ds.Tabela tabela14 = new ds.Tabela();
        int int15 = tabela14.n;
        int int16 = tabela14.n;
        int int17 = tabela14.n;
        int int18 = tabela14.n;
        ds.Item item19 = null;
        int int20 = tabela14.binaria(item19);
        ds.Item[] itemArray21 = tabela14.registros;
        tabela7.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Item item24 = null;
        int int25 = tabela0.binaria(item24);
        ds.Item item26 = null;
        int int27 = tabela0.binaria(item26);
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tabela0.pesquisa(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        int int2 = tabela0.n;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item[] itemArray5 = new ds.Item[] {};
        tabela0.registros = itemArray5;
        ds.Tabela tabela7 = new ds.Tabela();
        int int8 = tabela7.n;
        int int9 = tabela7.n;
        int int10 = tabela7.n;
        int int11 = tabela7.n;
        ds.Item item12 = null;
        int int13 = tabela7.binaria(item12);
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        tabela0.n = 0;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item[] itemArray20 = tabela19.registros;
        tabela0.registros = itemArray20;
        ds.Tabela tabela22 = new ds.Tabela();
        int int23 = tabela22.n;
        int int24 = tabela22.n;
        ds.Item item25 = null;
        int int26 = tabela22.binaria(item25);
        ds.Item[] itemArray27 = new ds.Item[] {};
        tabela22.registros = itemArray27;
        ds.Tabela tabela29 = new ds.Tabela();
        int int30 = tabela29.n;
        int int31 = tabela29.n;
        int int32 = tabela29.n;
        int int33 = tabela29.n;
        ds.Item item34 = null;
        int int35 = tabela29.binaria(item34);
        ds.Item[] itemArray36 = tabela29.registros;
        tabela22.registros = itemArray36;
        tabela0.registros = itemArray36;
        ds.Tabela tabela39 = new ds.Tabela();
        int int40 = tabela39.n;
        int int41 = tabela39.n;
        int int42 = tabela39.n;
        int int43 = tabela39.n;
        ds.Item item44 = null;
        int int45 = tabela39.binaria(item44);
        ds.Item[] itemArray46 = tabela39.registros;
        ds.Item[] itemArray47 = tabela39.registros;
        ds.Item item48 = null;
        tabela39.insere(item48);
        ds.Item item50 = null;
        tabela39.insere(item50);
        ds.Tabela tabela52 = new ds.Tabela();
        ds.Item[] itemArray53 = tabela52.registros;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item[] itemArray55 = tabela54.registros;
        int int56 = tabela54.n;
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        tabela52.registros = itemArray58;
        ds.Item[] itemArray60 = tabela52.registros;
        tabela39.registros = itemArray60;
        tabela0.registros = itemArray60;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray60);
    }
}

