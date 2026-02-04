package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1001");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        tabela7.registros = itemArray16;
        ds.Item[] itemArray18 = tabela7.registros;
        tabela0.registros = itemArray18;
        int int20 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        ds.Item[] itemArray14 = tabela6.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        ds.Item item17 = null;
        tabela0.insere(item17);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tabela0.pesquisa(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Item[] itemArray18 = tabela12.registros;
        ds.Item item19 = null;
        int int20 = tabela12.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela21.registros = itemArray32;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        int int41 = tabela37.n;
        int int42 = tabela37.n;
        int int43 = tabela37.n;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        int int47 = tabela44.n;
        ds.Item[] itemArray48 = tabela44.registros;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela37.registros = itemArray49;
        tabela37.n = (byte) -1;
        ds.Item[] itemArray53 = tabela37.registros;
        tabela0.registros = itemArray53;
        java.lang.Class<?> wildcardClass55 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        ds.Tabela tabela3 = new ds.Tabela();
        ds.Item item4 = null;
        tabela3.insere(item4);
        int int6 = tabela3.n;
        int int7 = tabela3.n;
        tabela3.n = (byte) 100;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item[] itemArray15 = tabela10.registros;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        tabela10.registros = itemArray22;
        tabela3.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int26 = tabela0.n;
        java.lang.Class<?> wildcardClass27 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        int int13 = tabela9.n;
        int int14 = tabela9.n;
        int int15 = tabela9.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item[] itemArray21 = tabela16.registros;
        tabela9.registros = itemArray21;
        tabela0.registros = itemArray21;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        tabela24.registros = itemArray26;
        ds.Item[] itemArray28 = tabela24.registros;
        ds.Item item29 = null;
        int int30 = tabela24.binaria(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        ds.Item item34 = null;
        tabela31.insere(item34);
        int int36 = tabela31.n;
        ds.Item item37 = null;
        tabela31.insere(item37);
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        int int42 = tabela39.n;
        ds.Item[] itemArray43 = tabela39.registros;
        ds.Item[] itemArray44 = tabela39.registros;
        tabela31.registros = itemArray44;
        tabela24.registros = itemArray44;
        tabela0.registros = itemArray44;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        tabela49.insere(item50);
        int int52 = tabela49.n;
        int int53 = tabela49.n;
        int int54 = tabela49.n;
        int int55 = tabela49.n;
        tabela49.n = (short) 10;
        int int58 = tabela49.n;
        tabela49.n = 'a';
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        tabela61.insere(item62);
        ds.Item item64 = null;
        tabela61.insere(item64);
        int int66 = tabela61.n;
        tabela61.n = (short) -1;
        ds.Tabela tabela69 = new ds.Tabela();
        ds.Item item70 = null;
        tabela69.insere(item70);
        ds.Item item72 = null;
        tabela69.insere(item72);
        int int74 = tabela69.n;
        ds.Tabela tabela75 = new ds.Tabela();
        ds.Item item76 = null;
        tabela75.insere(item76);
        int int78 = tabela75.n;
        ds.Item[] itemArray79 = tabela75.registros;
        ds.Tabela tabela80 = new ds.Tabela();
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        tabela80.registros = itemArray82;
        tabela75.registros = itemArray82;
        tabela69.registros = itemArray82;
        ds.Item[] itemArray86 = tabela69.registros;
        tabela61.registros = itemArray86;
        tabela49.registros = itemArray86;
        tabela49.n = (byte) -1;
        ds.Item[] itemArray91 = tabela49.registros;
        tabela0.registros = itemArray91;
        tabela0.n = (byte) -1;
        tabela0.n = 'a';
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        int int17 = tabela14.n;
        int int18 = tabela14.n;
        int int19 = tabela14.n;
        int int20 = tabela14.n;
        tabela14.n = (short) 10;
        int int23 = tabela14.n;
        tabela14.n = 'a';
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item item29 = null;
        tabela26.insere(item29);
        int int31 = tabela26.n;
        tabela26.n = (short) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        int int43 = tabela40.n;
        ds.Item[] itemArray44 = tabela40.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela45.registros = itemArray47;
        tabela40.registros = itemArray47;
        tabela34.registros = itemArray47;
        ds.Item[] itemArray51 = tabela34.registros;
        tabela26.registros = itemArray51;
        tabela14.registros = itemArray51;
        tabela14.n = (byte) -1;
        ds.Item[] itemArray56 = tabela14.registros;
        tabela0.registros = itemArray56;
        int int58 = tabela0.n;
        tabela0.n = (byte) -1;
        tabela0.n = (-1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 2;
        int int16 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        int int17 = tabela12.n;
        tabela12.n = (short) -1;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item item23 = null;
        tabela20.insere(item23);
        int int25 = tabela20.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela31.registros = itemArray33;
        tabela26.registros = itemArray33;
        tabela20.registros = itemArray33;
        ds.Item[] itemArray37 = tabela20.registros;
        tabela12.registros = itemArray37;
        tabela0.registros = itemArray37;
        tabela0.n = (byte) -1;
        int int42 = tabela0.n;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        tabela43.insere(item44);
        ds.Item item46 = null;
        tabela43.insere(item46);
        int int48 = tabela43.n;
        tabela43.n = (short) -1;
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item item52 = null;
        tabela51.insere(item52);
        ds.Item item54 = null;
        tabela51.insere(item54);
        int int56 = tabela51.n;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        tabela57.insere(item58);
        int int60 = tabela57.n;
        ds.Item[] itemArray61 = tabela57.registros;
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        tabela62.registros = itemArray64;
        tabela57.registros = itemArray64;
        tabela51.registros = itemArray64;
        ds.Item[] itemArray68 = tabela51.registros;
        tabela43.registros = itemArray68;
        tabela0.registros = itemArray68;
        ds.Item[] itemArray71 = tabela0.registros;
        ds.Item item72 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int73 = tabela0.binaria(item72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        tabela0.n = 0;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item item7 = null;
        tabela4.insere(item7);
        int int9 = tabela4.n;
        tabela4.n = (byte) 100;
        int int12 = tabela4.n;
        ds.Item[] itemArray13 = tabela4.registros;
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela15.registros = itemArray17;
        ds.Item[] itemArray19 = tabela15.registros;
        ds.Item[] itemArray20 = tabela15.registros;
        tabela15.n = 100;
        tabela15.n = (short) 10;
        ds.Item[] itemArray25 = tabela15.registros;
        ds.Item[] itemArray26 = tabela15.registros;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        ds.Item item30 = null;
        tabela27.insere(item30);
        ds.Item[] itemArray32 = tabela27.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        ds.Item item36 = null;
        tabela33.insere(item36);
        int int38 = tabela33.n;
        ds.Item item39 = null;
        tabela33.insere(item39);
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item item42 = null;
        tabela41.insere(item42);
        int int44 = tabela41.n;
        ds.Item[] itemArray45 = tabela41.registros;
        ds.Item[] itemArray46 = tabela41.registros;
        tabela33.registros = itemArray46;
        tabela27.registros = itemArray46;
        tabela15.registros = itemArray46;
        ds.Item[] itemArray50 = tabela15.registros;
        tabela0.registros = itemArray50;
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = tabela0.pesquisa(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        tabela0.n = (short) 1;
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        int int17 = tabela12.n;
        tabela12.n = (short) -1;
        ds.Item[] itemArray20 = tabela12.registros;
        tabela12.n = 0;
        ds.Item[] itemArray23 = tabela12.registros;
        tabela0.registros = itemArray23;
        int int25 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = ' ';
        ds.Item[] itemArray14 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        int int24 = tabela21.n;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela26.registros = itemArray28;
        tabela21.registros = itemArray28;
        tabela15.registros = itemArray28;
        tabela15.n = ' ';
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        ds.Item[] itemArray39 = tabela34.registros;
        tabela15.registros = itemArray39;
        tabela12.registros = itemArray39;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        tabela42.insere(item43);
        ds.Item item45 = null;
        tabela42.insere(item45);
        int int47 = tabela42.n;
        ds.Item item48 = null;
        tabela42.insere(item48);
        int int50 = tabela42.n;
        ds.Item item51 = null;
        tabela42.insere(item51);
        ds.Item item53 = null;
        tabela42.insere(item53);
        ds.Item[] itemArray55 = tabela42.registros;
        tabela12.registros = itemArray55;
        tabela0.registros = itemArray55;
        ds.Item item58 = null;
        int int59 = tabela0.binaria(item58);
        ds.Item item60 = null;
        int int61 = tabela0.binaria(item60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        tabela0.n = 0;
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Item[] itemArray18 = tabela12.registros;
        ds.Item item19 = null;
        int int20 = tabela12.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela21.registros = itemArray32;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray36 = tabela0.registros;
        int int37 = tabela0.n;
        tabela0.n = 1;
        tabela0.n = '4';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        ds.Item item14 = null;
        tabela0.insere(item14);
        int int16 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        tabela0.n = (byte) 10;
        tabela0.n = 4;
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = tabela0.pesquisa(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tabela0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = 10;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        int int26 = tabela21.n;
        ds.Item item27 = null;
        tabela21.insere(item27);
        int int29 = tabela21.n;
        ds.Item item30 = null;
        tabela21.insere(item30);
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        tabela32.insere(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        int int37 = tabela32.n;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        tabela38.insere(item39);
        int int41 = tabela38.n;
        ds.Item[] itemArray42 = tabela38.registros;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela43.registros = itemArray45;
        tabela38.registros = itemArray45;
        tabela32.registros = itemArray45;
        tabela32.n = ' ';
        ds.Item[] itemArray51 = tabela32.registros;
        tabela21.registros = itemArray51;
        tabela21.n = (byte) -1;
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        tabela55.registros = itemArray57;
        ds.Item[] itemArray59 = tabela55.registros;
        ds.Item[] itemArray60 = tabela55.registros;
        ds.Item[] itemArray61 = tabela55.registros;
        tabela21.registros = itemArray61;
        ds.Item[] itemArray63 = tabela21.registros;
        tabela0.registros = itemArray63;
        ds.Item item65 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = tabela0.pesquisa(item65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        tabela4.n = (short) 100;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela4.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        tabela0.n = '4';
        int int19 = tabela0.n;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tabela0.binaria(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        ds.Item[] itemArray12 = tabela0.registros;
        int int13 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        tabela15.n = (byte) 10;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        ds.Item[] itemArray26 = tabela22.registros;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Item[] itemArray28 = tabela22.registros;
        ds.Item[] itemArray29 = tabela22.registros;
        tabela15.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = 6;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = '4';
        ds.Item[] itemArray9 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int29 = tabela0.n;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        tabela30.insere(item31);
        int int33 = tabela30.n;
        int int34 = tabela30.n;
        int int35 = tabela30.n;
        int int36 = tabela30.n;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        ds.Item[] itemArray41 = tabela37.registros;
        ds.Item[] itemArray42 = tabela37.registros;
        tabela30.registros = itemArray42;
        tabela30.n = (byte) -1;
        ds.Item[] itemArray46 = tabela30.registros;
        ds.Item item47 = null;
        tabela30.insere(item47);
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        tabela49.insere(item50);
        int int52 = tabela49.n;
        int int53 = tabela49.n;
        tabela49.n = (byte) 100;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item item57 = null;
        tabela56.insere(item57);
        int int59 = tabela56.n;
        ds.Item[] itemArray60 = tabela56.registros;
        ds.Item[] itemArray61 = tabela56.registros;
        int int62 = tabela56.n;
        ds.Tabela tabela63 = new ds.Tabela();
        ds.Item item64 = null;
        tabela63.insere(item64);
        int int66 = tabela63.n;
        ds.Item[] itemArray67 = tabela63.registros;
        ds.Item[] itemArray68 = tabela63.registros;
        tabela56.registros = itemArray68;
        tabela49.registros = itemArray68;
        tabela30.registros = itemArray68;
        tabela0.registros = itemArray68;
        ds.Item[] itemArray73 = tabela0.registros;
        ds.Item item74 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int75 = tabela0.pesquisa(item74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray16 = tabela0.registros;
        ds.Item item17 = null;
        tabela0.insere(item17);
        tabela0.n = 100;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.pesquisa(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        ds.Item[] itemArray48 = tabela0.registros;
        tabela0.n = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela15.registros = itemArray28;
        tabela9.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        tabela32.registros = itemArray34;
        ds.Item[] itemArray36 = tabela32.registros;
        ds.Item[] itemArray37 = tabela32.registros;
        ds.Item[] itemArray38 = tabela32.registros;
        ds.Item item39 = null;
        int int40 = tabela32.binaria(item39);
        tabela32.n = 0;
        int int43 = tabela32.n;
        ds.Item item44 = null;
        int int45 = tabela32.binaria(item44);
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        ds.Item item49 = null;
        tabela46.insere(item49);
        int int51 = tabela46.n;
        ds.Item item52 = null;
        tabela46.insere(item52);
        int int54 = tabela46.n;
        ds.Item item55 = null;
        tabela46.insere(item55);
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        tabela57.insere(item58);
        ds.Item item60 = null;
        tabela57.insere(item60);
        int int62 = tabela57.n;
        ds.Tabela tabela63 = new ds.Tabela();
        ds.Item item64 = null;
        tabela63.insere(item64);
        int int66 = tabela63.n;
        ds.Item[] itemArray67 = tabela63.registros;
        ds.Tabela tabela68 = new ds.Tabela();
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        tabela68.registros = itemArray70;
        tabela63.registros = itemArray70;
        tabela57.registros = itemArray70;
        tabela57.n = ' ';
        ds.Item[] itemArray76 = tabela57.registros;
        tabela46.registros = itemArray76;
        tabela46.n = (byte) -1;
        ds.Tabela tabela80 = new ds.Tabela();
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        tabela80.registros = itemArray82;
        ds.Item[] itemArray84 = tabela80.registros;
        ds.Item[] itemArray85 = tabela80.registros;
        ds.Item[] itemArray86 = tabela80.registros;
        tabela46.registros = itemArray86;
        tabela32.registros = itemArray86;
        tabela0.registros = itemArray86;
        ds.Item[] itemArray90 = tabela0.registros;
        ds.Tabela tabela91 = new ds.Tabela();
        ds.Item item92 = null;
        tabela91.insere(item92);
        int int94 = tabela91.n;
        ds.Item[] itemArray95 = tabela91.registros;
        tabela0.registros = itemArray95;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertNotNull(itemArray90);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(itemArray95);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        tabela34.n = (byte) 100;
        int int42 = tabela34.n;
        int int43 = tabela34.n;
        ds.Item[] itemArray44 = tabela34.registros;
        tabela0.registros = itemArray44;
        java.lang.Class<?> wildcardClass46 = itemArray44.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tabela0.binaria(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        tabela8.registros = itemArray10;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela8.n = 100;
        tabela8.n = (short) 10;
        ds.Item[] itemArray18 = tabela8.registros;
        ds.Item[] itemArray19 = tabela8.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item item23 = null;
        tabela20.insere(item23);
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        ds.Item item29 = null;
        tabela26.insere(item29);
        int int31 = tabela26.n;
        ds.Item item32 = null;
        tabela26.insere(item32);
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        ds.Item[] itemArray39 = tabela34.registros;
        tabela26.registros = itemArray39;
        tabela20.registros = itemArray39;
        tabela8.registros = itemArray39;
        tabela0.registros = itemArray39;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int29 = tabela0.n;
        tabela0.n = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Item[] itemArray18 = tabela12.registros;
        ds.Item item19 = null;
        int int20 = tabela12.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela21.registros = itemArray32;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        int int41 = tabela37.n;
        int int42 = tabela37.n;
        int int43 = tabela37.n;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        int int47 = tabela44.n;
        ds.Item[] itemArray48 = tabela44.registros;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela37.registros = itemArray49;
        tabela37.n = (byte) -1;
        ds.Item[] itemArray53 = tabela37.registros;
        tabela0.registros = itemArray53;
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        tabela55.insere(item56);
        int int58 = tabela55.n;
        ds.Item[] itemArray59 = tabela55.registros;
        ds.Item[] itemArray60 = tabela55.registros;
        int int61 = tabela55.n;
        tabela55.n = ' ';
        ds.Tabela tabela64 = new ds.Tabela();
        ds.Item item65 = null;
        tabela64.insere(item65);
        ds.Item item67 = null;
        tabela64.insere(item67);
        tabela64.n = (byte) 10;
        ds.Tabela tabela71 = new ds.Tabela();
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        tabela71.registros = itemArray73;
        ds.Item[] itemArray75 = tabela71.registros;
        ds.Item[] itemArray76 = tabela71.registros;
        ds.Item[] itemArray77 = tabela71.registros;
        ds.Item[] itemArray78 = tabela71.registros;
        tabela64.registros = itemArray78;
        tabela55.registros = itemArray78;
        tabela0.registros = itemArray78;
        tabela0.n = 10;
        ds.Item item84 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int85 = tabela0.binaria(item84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        tabela7.n = (byte) 100;
        tabela7.n = 1;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        tabela7.registros = itemArray30;
        tabela0.registros = itemArray30;
        int int34 = tabela0.n;
        int int35 = tabela0.n;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        tabela36.insere(item37);
        ds.Item item39 = null;
        tabela36.insere(item39);
        tabela36.n = (byte) 10;
        ds.Item[] itemArray43 = tabela36.registros;
        tabela0.registros = itemArray43;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela15.registros = itemArray28;
        tabela9.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Item[] itemArray32 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        tabela8.registros = itemArray10;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela14.registros = itemArray16;
        ds.Item[] itemArray18 = tabela14.registros;
        ds.Item[] itemArray19 = tabela14.registros;
        ds.Item[] itemArray20 = tabela14.registros;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela8.registros = itemArray21;
        tabela0.registros = itemArray21;
        int int24 = tabela0.n;
        ds.Item[] itemArray25 = tabela0.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela26.registros = itemArray28;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Item[] itemArray31 = tabela26.registros;
        ds.Item[] itemArray32 = tabela26.registros;
        int int33 = tabela26.n;
        ds.Item[] itemArray34 = tabela26.registros;
        tabela0.registros = itemArray34;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        tabela36.insere(item37);
        ds.Item item39 = null;
        tabela36.insere(item39);
        int int41 = tabela36.n;
        ds.Item item42 = null;
        tabela36.insere(item42);
        int int44 = tabela36.n;
        ds.Item item45 = null;
        tabela36.insere(item45);
        ds.Item item47 = null;
        tabela36.insere(item47);
        tabela36.n = 3;
        ds.Item item51 = null;
        tabela36.insere(item51);
        ds.Item[] itemArray53 = tabela36.registros;
        tabela0.registros = itemArray53;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        int int9 = tabela0.n;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        tabela0.n = 4;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.binaria(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        tabela0.n = 0;
        tabela0.n = (short) -1;
        int int15 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        tabela0.n = ' ';
        int int14 = tabela0.n;
        tabela0.n = (short) 10;
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tabela0.binaria(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Item item19 = null;
        tabela13.insere(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Item[] itemArray28 = tabela21.registros;
        tabela13.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Item item31 = null;
        tabela0.insere(item31);
        ds.Item[] itemArray33 = null;
        tabela0.registros = itemArray33;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        tabela0.n = (-1);
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        tabela0.n = 'a';
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        tabela8.registros = itemArray10;
        tabela0.registros = itemArray10;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        int int18 = tabela13.n;
        ds.Item[] itemArray19 = tabela13.registros;
        tabela0.registros = itemArray19;
        ds.Item item21 = null;
        tabela0.insere(item21);
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tabela0.pesquisa(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        ds.Item[] itemArray14 = tabela0.registros;
        tabela0.n = (short) 100;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(itemArray14);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        ds.Item[] itemArray14 = tabela6.registros;
        tabela0.registros = itemArray14;
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tabela0.pesquisa(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item item14 = null;
        int int15 = tabela0.binaria(item14);
        ds.Item item16 = null;
        int int17 = tabela0.binaria(item16);
        int int18 = tabela0.n;
        ds.Item[] itemArray19 = tabela0.registros;
        ds.Item[] itemArray20 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(itemArray19);
        org.junit.Assert.assertNull(itemArray20);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        tabela0.n = 1;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        tabela10.registros = itemArray12;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item[] itemArray15 = tabela10.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela16.registros = itemArray18;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Item[] itemArray22 = tabela16.registros;
        ds.Item[] itemArray23 = tabela16.registros;
        tabela10.registros = itemArray23;
        tabela0.registros = itemArray23;
        int int26 = tabela0.n;
        java.lang.Class<?> wildcardClass27 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        int int17 = tabela12.n;
        tabela12.n = (short) -1;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item item23 = null;
        tabela20.insere(item23);
        int int25 = tabela20.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela31.registros = itemArray33;
        tabela26.registros = itemArray33;
        tabela20.registros = itemArray33;
        ds.Item[] itemArray37 = tabela20.registros;
        tabela12.registros = itemArray37;
        tabela0.registros = itemArray37;
        tabela0.n = (byte) -1;
        int int42 = tabela0.n;
        int int43 = tabela0.n;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.binaria(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        int int13 = tabela7.n;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        int int17 = tabela14.n;
        ds.Item[] itemArray18 = tabela14.registros;
        ds.Item[] itemArray19 = tabela14.registros;
        tabela7.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        tabela22.insere(item23);
        int int25 = tabela22.n;
        int int26 = tabela22.n;
        int int27 = tabela22.n;
        ds.Item item28 = null;
        tabela22.insere(item28);
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        tabela30.insere(item31);
        int int33 = tabela30.n;
        int int34 = tabela30.n;
        int int35 = tabela30.n;
        int int36 = tabela30.n;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        ds.Item[] itemArray41 = tabela37.registros;
        ds.Item[] itemArray42 = tabela37.registros;
        tabela30.registros = itemArray42;
        ds.Item[] itemArray44 = tabela30.registros;
        tabela22.registros = itemArray44;
        tabela0.registros = itemArray44;
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        int int12 = tabela6.n;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela6.n = (byte) 1;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item item19 = null;
        tabela16.insere(item19);
        int int21 = tabela16.n;
        ds.Item item22 = null;
        tabela16.insere(item22);
        int int24 = tabela16.n;
        ds.Item item25 = null;
        tabela16.insere(item25);
        ds.Item[] itemArray27 = tabela16.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        tabela28.registros = itemArray30;
        ds.Item[] itemArray32 = tabela28.registros;
        ds.Item[] itemArray33 = tabela28.registros;
        ds.Item[] itemArray34 = tabela28.registros;
        ds.Item item35 = null;
        int int36 = tabela28.binaria(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        ds.Item item40 = null;
        tabela37.insere(item40);
        ds.Item item42 = null;
        tabela37.insere(item42);
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        int int47 = tabela44.n;
        ds.Item[] itemArray48 = tabela44.registros;
        tabela37.registros = itemArray48;
        tabela28.registros = itemArray48;
        tabela16.registros = itemArray48;
        ds.Item[] itemArray52 = tabela16.registros;
        tabela6.registros = itemArray52;
        tabela0.registros = itemArray52;
        ds.Item[] itemArray55 = tabela0.registros;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item item57 = null;
        tabela56.insere(item57);
        ds.Item item59 = null;
        tabela56.insere(item59);
        int int61 = tabela56.n;
        ds.Item[] itemArray62 = tabela56.registros;
        tabela0.registros = itemArray62;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        tabela34.n = (byte) 100;
        int int42 = tabela34.n;
        int int43 = tabela34.n;
        ds.Item[] itemArray44 = tabela34.registros;
        tabela0.registros = itemArray44;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        ds.Item item49 = null;
        tabela46.insere(item49);
        int int51 = tabela46.n;
        ds.Item item52 = null;
        tabela46.insere(item52);
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Item[] itemArray59 = tabela54.registros;
        tabela46.registros = itemArray59;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        tabela61.registros = itemArray63;
        ds.Item[] itemArray65 = tabela61.registros;
        ds.Item[] itemArray66 = tabela61.registros;
        ds.Item[] itemArray67 = tabela61.registros;
        tabela46.registros = itemArray67;
        tabela0.registros = itemArray67;
        ds.Item item70 = null;
        tabela0.insere(item70);
        ds.Item[] itemArray72 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = 35;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        tabela10.n = (short) 0;
        ds.Item item13 = null;
        tabela10.insere(item13);
        ds.Item[] itemArray15 = tabela10.registros;
        tabela0.registros = itemArray15;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        tabela39.registros = itemArray41;
        tabela34.registros = itemArray41;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        ds.Item item47 = null;
        tabela44.insere(item47);
        int int49 = tabela44.n;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        int int53 = tabela50.n;
        ds.Item[] itemArray54 = tabela50.registros;
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        tabela55.registros = itemArray57;
        tabela50.registros = itemArray57;
        tabela44.registros = itemArray57;
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        tabela44.registros = itemArray62;
        tabela34.registros = itemArray62;
        tabela0.registros = itemArray62;
        int int66 = tabela0.n;
        ds.Item item67 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int68 = tabela0.pesquisa(item67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        int int14 = tabela9.n;
        ds.Item item15 = null;
        tabela9.insere(item15);
        int int17 = tabela9.n;
        ds.Item[] itemArray18 = tabela9.registros;
        int int19 = tabela9.n;
        ds.Item[] itemArray20 = tabela9.registros;
        tabela0.registros = itemArray20;
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = tabela0.pesquisa(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        tabela0.n = '4';
        int int19 = tabela0.n;
        tabela0.n = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        ds.Item item13 = null;
        tabela7.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        int int23 = tabela15.n;
        ds.Item[] itemArray24 = tabela15.registros;
        tabela7.registros = itemArray24;
        tabela0.registros = itemArray24;
        java.lang.Class<?> wildcardClass27 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        ds.Item item13 = null;
        tabela7.insere(item13);
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        int int23 = tabela15.n;
        ds.Item[] itemArray24 = tabela15.registros;
        tabela7.registros = itemArray24;
        tabela0.registros = itemArray24;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        int int30 = tabela27.n;
        ds.Item[] itemArray31 = tabela27.registros;
        ds.Item[] itemArray32 = tabela27.registros;
        int int33 = tabela27.n;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        ds.Item[] itemArray39 = tabela34.registros;
        tabela27.registros = itemArray39;
        ds.Tabela tabela41 = new ds.Tabela();
        ds.Item item42 = null;
        tabela41.insere(item42);
        int int44 = tabela41.n;
        ds.Item[] itemArray45 = tabela41.registros;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        tabela46.registros = itemArray48;
        tabela41.registros = itemArray48;
        tabela27.registros = itemArray48;
        tabela0.registros = itemArray48;
        ds.Item item53 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        tabela0.n = (byte) 100;
        tabela0.n = (short) 0;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        int int24 = tabela21.n;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        tabela26.registros = itemArray28;
        tabela21.registros = itemArray28;
        tabela15.registros = itemArray28;
        tabela15.n = ' ';
        ds.Item[] itemArray34 = tabela15.registros;
        tabela0.registros = itemArray34;
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = tabela0.pesquisa(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        tabela34.n = (byte) 100;
        int int42 = tabela34.n;
        int int43 = tabela34.n;
        ds.Item[] itemArray44 = tabela34.registros;
        tabela0.registros = itemArray44;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        ds.Item item49 = null;
        tabela46.insere(item49);
        int int51 = tabela46.n;
        ds.Item item52 = null;
        tabela46.insere(item52);
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Item[] itemArray59 = tabela54.registros;
        tabela46.registros = itemArray59;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        tabela61.registros = itemArray63;
        ds.Item[] itemArray65 = tabela61.registros;
        ds.Item[] itemArray66 = tabela61.registros;
        ds.Item[] itemArray67 = tabela61.registros;
        tabela46.registros = itemArray67;
        tabela0.registros = itemArray67;
        ds.Item item70 = null;
        tabela0.insere(item70);
        int int72 = tabela0.n;
        tabela0.n = (short) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        int int12 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        int int9 = tabela0.binaria(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.pesquisa(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 100;
        tabela0.n = 32;
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        tabela7.n = (short) 0;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        tabela10.n = (byte) 100;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        int int23 = tabela17.n;
        ds.Tabela tabela24 = new ds.Tabela();
        ds.Item item25 = null;
        tabela24.insere(item25);
        int int27 = tabela24.n;
        ds.Item[] itemArray28 = tabela24.registros;
        ds.Item[] itemArray29 = tabela24.registros;
        tabela17.registros = itemArray29;
        tabela10.registros = itemArray29;
        tabela7.registros = itemArray29;
        tabela0.registros = itemArray29;
        int int34 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        tabela8.registros = itemArray10;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela14.registros = itemArray16;
        ds.Item[] itemArray18 = tabela14.registros;
        ds.Item[] itemArray19 = tabela14.registros;
        ds.Item[] itemArray20 = tabela14.registros;
        ds.Item[] itemArray21 = tabela14.registros;
        tabela8.registros = itemArray21;
        tabela0.registros = itemArray21;
        int int24 = tabela0.n;
        ds.Item[] itemArray25 = tabela0.registros;
        tabela0.n = 35;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = (byte) -1;
        tabela0.n = 4;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        tabela0.n = 32;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = null;
        tabela0.registros = itemArray12;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Item[] itemArray18 = tabela12.registros;
        ds.Item item19 = null;
        int int20 = tabela12.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela21.registros = itemArray32;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Item item37 = null;
        tabela0.insere(item37);
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        ds.Item item42 = null;
        tabela39.insere(item42);
        int int44 = tabela39.n;
        tabela39.n = (byte) 100;
        ds.Item[] itemArray47 = tabela39.registros;
        int int48 = tabela39.n;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        tabela49.insere(item50);
        int int52 = tabela49.n;
        int int53 = tabela49.n;
        int int54 = tabela49.n;
        int int55 = tabela49.n;
        tabela49.n = (short) 10;
        ds.Item[] itemArray58 = tabela49.registros;
        tabela39.registros = itemArray58;
        tabela0.registros = itemArray58;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        tabela61.insere(item62);
        int int64 = tabela61.n;
        int int65 = tabela61.n;
        int int66 = tabela61.n;
        ds.Item item67 = null;
        tabela61.insere(item67);
        ds.Tabela tabela69 = new ds.Tabela();
        ds.Item item70 = null;
        tabela69.insere(item70);
        int int72 = tabela69.n;
        int int73 = tabela69.n;
        int int74 = tabela69.n;
        int int75 = tabela69.n;
        ds.Tabela tabela76 = new ds.Tabela();
        ds.Item item77 = null;
        tabela76.insere(item77);
        int int79 = tabela76.n;
        ds.Item[] itemArray80 = tabela76.registros;
        ds.Item[] itemArray81 = tabela76.registros;
        tabela69.registros = itemArray81;
        ds.Item[] itemArray83 = tabela69.registros;
        tabela61.registros = itemArray83;
        tabela0.registros = itemArray83;
        ds.Item item86 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int87 = tabela0.pesquisa(item86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        int int17 = tabela12.n;
        tabela12.n = (short) -1;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item item23 = null;
        tabela20.insere(item23);
        int int25 = tabela20.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela31.registros = itemArray33;
        tabela26.registros = itemArray33;
        tabela20.registros = itemArray33;
        ds.Item[] itemArray37 = tabela20.registros;
        tabela12.registros = itemArray37;
        tabela0.registros = itemArray37;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray42 = tabela0.registros;
        ds.Item item43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = tabela0.binaria(item43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tabela0.binaria(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        tabela0.n = (byte) -1;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item item19 = null;
        tabela16.insere(item19);
        int int21 = tabela16.n;
        ds.Item item22 = null;
        tabela16.insere(item22);
        int int24 = tabela16.n;
        ds.Item item25 = null;
        tabela16.insere(item25);
        int int27 = tabela16.n;
        int int28 = tabela16.n;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        tabela29.insere(item30);
        ds.Item item32 = null;
        tabela29.insere(item32);
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Item item35 = null;
        tabela29.insere(item35);
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        ds.Item item40 = null;
        tabela37.insere(item40);
        ds.Item[] itemArray42 = tabela37.registros;
        ds.Item[] itemArray43 = tabela37.registros;
        ds.Item[] itemArray44 = tabela37.registros;
        tabela29.registros = itemArray44;
        tabela16.registros = itemArray44;
        int int47 = tabela16.n;
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        tabela48.registros = itemArray50;
        ds.Item[] itemArray52 = tabela48.registros;
        ds.Item[] itemArray53 = tabela48.registros;
        ds.Item[] itemArray54 = tabela48.registros;
        ds.Item[] itemArray55 = tabela48.registros;
        ds.Item[] itemArray56 = tabela48.registros;
        tabela16.registros = itemArray56;
        tabela0.registros = itemArray56;
        ds.Item item59 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int60 = tabela0.pesquisa(item59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        tabela0.n = '4';
        int int19 = tabela0.n;
        ds.Item[] itemArray20 = tabela0.registros;
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tabela0.binaria(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        int int14 = tabela0.n;
        ds.Item item15 = null;
        tabela0.insere(item15);
        int int17 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        tabela4.n = (short) 100;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela4.registros = itemArray15;
        tabela0.registros = itemArray15;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        tabela0.insere(item19);
        ds.Item item21 = null;
        tabela0.insere(item21);
        ds.Item item23 = null;
        tabela0.insere(item23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item item10 = null;
        tabela0.insere(item10);
        ds.Item item12 = null;
        tabela0.insere(item12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) 10;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        int int13 = tabela0.n;
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        tabela0.n = 0;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        ds.Item item7 = null;
        tabela4.insere(item7);
        int int9 = tabela4.n;
        tabela4.n = (byte) 100;
        int int12 = tabela4.n;
        ds.Item[] itemArray13 = tabela4.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        int int16 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        ds.Item item14 = null;
        tabela9.insere(item14);
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela9.registros = itemArray20;
        tabela0.registros = itemArray20;
        tabela0.n = (byte) 100;
        tabela0.n = 35;
        ds.Tabela tabela27 = new ds.Tabela();
        tabela27.n = (short) 0;
        ds.Item item30 = null;
        tabela27.insere(item30);
        ds.Item item32 = null;
        tabela27.insere(item32);
        ds.Item[] itemArray34 = tabela27.registros;
        tabela0.registros = itemArray34;
        int int36 = tabela0.n;
        java.lang.Class<?> wildcardClass37 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 10;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        ds.Item item10 = null;
        tabela7.insere(item10);
        int int12 = tabela7.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        int int16 = tabela13.n;
        ds.Item[] itemArray17 = tabela13.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        tabela18.registros = itemArray20;
        tabela13.registros = itemArray20;
        tabela7.registros = itemArray20;
        tabela0.registros = itemArray20;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        tabela0.n = 4;
        tabela0.n = '#';
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        ds.Item item21 = null;
        tabela18.insere(item21);
        int int23 = tabela18.n;
        ds.Item item24 = null;
        tabela18.insere(item24);
        ds.Item item26 = null;
        tabela18.insere(item26);
        ds.Item[] itemArray28 = tabela18.registros;
        tabela0.registros = itemArray28;
        ds.Tabela tabela30 = new ds.Tabela();
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        tabela30.registros = itemArray32;
        ds.Item[] itemArray34 = tabela30.registros;
        ds.Item[] itemArray35 = tabela30.registros;
        ds.Item[] itemArray36 = tabela30.registros;
        ds.Item[] itemArray37 = tabela30.registros;
        ds.Item[] itemArray38 = tabela30.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        int int42 = tabela39.n;
        int int43 = tabela39.n;
        int int44 = tabela39.n;
        int int45 = tabela39.n;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        int int49 = tabela46.n;
        ds.Item[] itemArray50 = tabela46.registros;
        ds.Item[] itemArray51 = tabela46.registros;
        tabela39.registros = itemArray51;
        tabela30.registros = itemArray51;
        tabela0.registros = itemArray51;
        int int55 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (short) 1;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item item11 = null;
        tabela0.insere(item11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        tabela0.n = 32;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item[] itemArray16 = tabela11.registros;
        tabela11.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        tabela11.registros = itemArray22;
        tabela0.registros = itemArray22;
        int int26 = tabela0.n;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.binaria(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        int int14 = tabela8.n;
        ds.Item[] itemArray15 = tabela8.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        ds.Item[] itemArray20 = tabela16.registros;
        tabela8.registros = itemArray20;
        tabela0.registros = itemArray20;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        ds.Item[] itemArray31 = tabela23.registros;
        ds.Item item32 = null;
        int int33 = tabela23.binaria(item32);
        ds.Item item34 = null;
        int int35 = tabela23.binaria(item34);
        int int36 = tabela23.n;
        ds.Item item37 = null;
        int int38 = tabela23.binaria(item37);
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        ds.Item item42 = null;
        tabela39.insere(item42);
        int int44 = tabela39.n;
        ds.Item item45 = null;
        tabela39.insere(item45);
        int int47 = tabela39.n;
        ds.Item[] itemArray48 = tabela39.registros;
        ds.Item item49 = null;
        tabela39.insere(item49);
        ds.Tabela tabela51 = new ds.Tabela();
        ds.Item item52 = null;
        tabela51.insere(item52);
        int int54 = tabela51.n;
        ds.Item[] itemArray55 = tabela51.registros;
        ds.Item[] itemArray56 = tabela51.registros;
        int int57 = tabela51.n;
        ds.Tabela tabela58 = new ds.Tabela();
        ds.Item item59 = null;
        tabela58.insere(item59);
        int int61 = tabela58.n;
        ds.Item[] itemArray62 = tabela58.registros;
        ds.Item[] itemArray63 = tabela58.registros;
        tabela51.registros = itemArray63;
        ds.Item[] itemArray65 = tabela51.registros;
        tabela39.registros = itemArray65;
        ds.Item[] itemArray67 = tabela39.registros;
        tabela23.registros = itemArray67;
        tabela0.registros = itemArray67;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        int int12 = tabela8.n;
        int int13 = tabela8.n;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        int int18 = tabela15.n;
        ds.Item[] itemArray19 = tabela15.registros;
        ds.Item[] itemArray20 = tabela15.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        tabela0.n = (short) -1;
        int int26 = tabela0.n;
        java.lang.Class<?> wildcardClass27 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        tabela34.n = (byte) 100;
        int int42 = tabela34.n;
        int int43 = tabela34.n;
        ds.Item[] itemArray44 = tabela34.registros;
        tabela0.registros = itemArray44;
        tabela0.n = (short) 10;
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = tabela0.pesquisa(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Item[] itemArray10 = tabela0.registros;
        java.lang.Class<?> wildcardClass11 = itemArray10.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        int int13 = tabela0.n;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        tabela14.registros = itemArray16;
        ds.Item[] itemArray18 = tabela14.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        int int22 = tabela19.n;
        ds.Item[] itemArray23 = tabela19.registros;
        tabela14.registros = itemArray23;
        ds.Item item25 = null;
        tabela14.insere(item25);
        ds.Item[] itemArray27 = tabela14.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        int int32 = tabela28.n;
        int int33 = tabela28.n;
        int int34 = tabela28.n;
        tabela28.n = (short) 10;
        int int37 = tabela28.n;
        tabela28.n = 'a';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item item43 = null;
        tabela40.insere(item43);
        int int45 = tabela40.n;
        tabela40.n = (short) -1;
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item item49 = null;
        tabela48.insere(item49);
        ds.Item item51 = null;
        tabela48.insere(item51);
        int int53 = tabela48.n;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Tabela tabela59 = new ds.Tabela();
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        tabela59.registros = itemArray61;
        tabela54.registros = itemArray61;
        tabela48.registros = itemArray61;
        ds.Item[] itemArray65 = tabela48.registros;
        tabela40.registros = itemArray65;
        tabela28.registros = itemArray65;
        tabela28.n = (byte) -1;
        ds.Item[] itemArray70 = tabela28.registros;
        tabela14.registros = itemArray70;
        tabela0.registros = itemArray70;
        ds.Item[] itemArray73 = tabela0.registros;
        ds.Item[] itemArray74 = tabela0.registros;
        int int75 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item9 = null;
        tabela0.insere(item9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Item[] itemArray18 = tabela12.registros;
        ds.Item item19 = null;
        int int20 = tabela12.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela21.registros = itemArray32;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        int int41 = tabela37.n;
        int int42 = tabela37.n;
        int int43 = tabela37.n;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        int int47 = tabela44.n;
        ds.Item[] itemArray48 = tabela44.registros;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela37.registros = itemArray49;
        tabela37.n = (byte) -1;
        ds.Item[] itemArray53 = tabela37.registros;
        tabela0.registros = itemArray53;
        tabela0.n = 0;
        ds.Item[] itemArray57 = tabela0.registros;
        java.lang.Class<?> wildcardClass58 = itemArray57.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        int int12 = tabela8.n;
        int int13 = tabela8.n;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        int int18 = tabela15.n;
        ds.Item[] itemArray19 = tabela15.registros;
        ds.Item[] itemArray20 = tabela15.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        tabela0.n = (short) -1;
        int int26 = tabela0.n;
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = tabela0.binaria(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        tabela0.n = 32;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        int int13 = tabela11.binaria(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        ds.Item[] itemArray16 = tabela11.registros;
        tabela11.n = '#';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item[] itemArray22 = new ds.Item[] {};
        tabela19.registros = itemArray22;
        tabela11.registros = itemArray22;
        tabela0.registros = itemArray22;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        int int30 = tabela26.n;
        int int31 = tabela26.n;
        int int32 = tabela26.n;
        tabela26.n = (short) 10;
        int int35 = tabela26.n;
        tabela26.n = 'a';
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        tabela38.insere(item39);
        ds.Item item41 = null;
        tabela38.insere(item41);
        int int43 = tabela38.n;
        tabela38.n = (short) -1;
        ds.Tabela tabela46 = new ds.Tabela();
        ds.Item item47 = null;
        tabela46.insere(item47);
        ds.Item item49 = null;
        tabela46.insere(item49);
        int int51 = tabela46.n;
        ds.Tabela tabela52 = new ds.Tabela();
        ds.Item item53 = null;
        tabela52.insere(item53);
        int int55 = tabela52.n;
        ds.Item[] itemArray56 = tabela52.registros;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        tabela57.registros = itemArray59;
        tabela52.registros = itemArray59;
        tabela46.registros = itemArray59;
        ds.Item[] itemArray63 = tabela46.registros;
        tabela38.registros = itemArray63;
        tabela26.registros = itemArray63;
        tabela26.n = (byte) -1;
        ds.Item[] itemArray68 = tabela26.registros;
        tabela0.registros = itemArray68;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 10;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tabela0.binaria(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        tabela0.n = (short) 100;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela5.registros = itemArray7;
        ds.Item[] itemArray9 = tabela5.registros;
        ds.Item[] itemArray10 = tabela5.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        ds.Item[] itemArray15 = tabela11.registros;
        ds.Item[] itemArray16 = tabela11.registros;
        ds.Item[] itemArray17 = tabela11.registros;
        ds.Item[] itemArray18 = tabela11.registros;
        tabela5.registros = itemArray18;
        ds.Item[] itemArray20 = tabela5.registros;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item[] itemArray26 = tabela21.registros;
        tabela5.registros = itemArray26;
        tabela0.registros = itemArray26;
        int int29 = tabela0.n;
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = tabela0.binaria(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Item[] itemArray18 = tabela12.registros;
        ds.Item item19 = null;
        int int20 = tabela12.binaria(item19);
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        ds.Item item26 = null;
        tabela21.insere(item26);
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        tabela21.registros = itemArray32;
        tabela12.registros = itemArray32;
        tabela0.registros = itemArray32;
        ds.Item[] itemArray36 = tabela0.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        int int41 = tabela37.n;
        int int42 = tabela37.n;
        int int43 = tabela37.n;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        int int47 = tabela44.n;
        ds.Item[] itemArray48 = tabela44.registros;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela37.registros = itemArray49;
        tabela37.n = (byte) -1;
        ds.Item[] itemArray53 = tabela37.registros;
        tabela0.registros = itemArray53;
        tabela0.n = 0;
        ds.Item[] itemArray57 = tabela0.registros;
        tabela0.n = 0;
        ds.Item item60 = null;
        int int61 = tabela0.binaria(item60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item[] itemArray18 = tabela0.registros;
        tabela0.n = 10;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        int int26 = tabela21.n;
        ds.Item item27 = null;
        tabela21.insere(item27);
        int int29 = tabela21.n;
        ds.Item item30 = null;
        tabela21.insere(item30);
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        tabela32.insere(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        int int37 = tabela32.n;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        tabela38.insere(item39);
        int int41 = tabela38.n;
        ds.Item[] itemArray42 = tabela38.registros;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela43.registros = itemArray45;
        tabela38.registros = itemArray45;
        tabela32.registros = itemArray45;
        tabela32.n = ' ';
        ds.Item[] itemArray51 = tabela32.registros;
        tabela21.registros = itemArray51;
        tabela21.n = (byte) -1;
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        tabela55.registros = itemArray57;
        ds.Item[] itemArray59 = tabela55.registros;
        ds.Item[] itemArray60 = tabela55.registros;
        ds.Item[] itemArray61 = tabela55.registros;
        tabela21.registros = itemArray61;
        ds.Item[] itemArray63 = tabela21.registros;
        tabela0.registros = itemArray63;
        ds.Item item65 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = tabela0.binaria(item65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        tabela0.insere(item18);
        ds.Item item20 = null;
        tabela0.insere(item20);
        tabela0.n = 6;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela5.registros = itemArray7;
        tabela0.registros = itemArray7;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        int int16 = tabela13.n;
        ds.Item[] itemArray17 = tabela13.registros;
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Item[] itemArray19 = tabela13.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        int int23 = tabela20.n;
        ds.Item[] itemArray24 = tabela20.registros;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Item[] itemArray26 = tabela20.registros;
        ds.Item[] itemArray27 = tabela20.registros;
        tabela13.registros = itemArray27;
        tabela13.n = 32;
        ds.Item[] itemArray31 = tabela13.registros;
        int int32 = tabela13.n;
        ds.Item[] itemArray33 = tabela13.registros;
        tabela0.registros = itemArray33;
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tabela0.binaria(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        tabela0.n = (-1);
        int int6 = tabela0.n;
        ds.Item item7 = null;
        tabela0.insere(item7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tabela0.pesquisa(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        java.lang.Class<?> wildcardClass7 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        int int9 = tabela0.n;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        tabela10.n = (short) 10;
        ds.Item[] itemArray19 = tabela10.registros;
        tabela0.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        ds.Item item24 = null;
        tabela21.insere(item24);
        int int26 = tabela21.n;
        ds.Item item27 = null;
        tabela21.insere(item27);
        int int29 = tabela21.n;
        ds.Item item30 = null;
        tabela21.insere(item30);
        int int32 = tabela21.n;
        ds.Item[] itemArray33 = tabela21.registros;
        tabela0.registros = itemArray33;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        tabela35.insere(item36);
        ds.Item item38 = null;
        tabela35.insere(item38);
        int int40 = tabela35.n;
        tabela35.n = (short) -1;
        ds.Item[] itemArray43 = tabela35.registros;
        tabela35.n = 0;
        ds.Item[] itemArray46 = tabela35.registros;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        ds.Item item53 = null;
        tabela50.insere(item53);
        int int55 = tabela50.n;
        ds.Tabela tabela56 = new ds.Tabela();
        ds.Item item57 = null;
        tabela56.insere(item57);
        int int59 = tabela56.n;
        ds.Item[] itemArray60 = tabela56.registros;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        tabela61.registros = itemArray63;
        tabela56.registros = itemArray63;
        tabela50.registros = itemArray63;
        tabela50.n = ' ';
        ds.Tabela tabela69 = new ds.Tabela();
        ds.Item item70 = null;
        tabela69.insere(item70);
        ds.Item item72 = null;
        tabela69.insere(item72);
        ds.Item[] itemArray74 = tabela69.registros;
        tabela50.registros = itemArray74;
        tabela47.registros = itemArray74;
        ds.Tabela tabela77 = new ds.Tabela();
        ds.Item item78 = null;
        tabela77.insere(item78);
        ds.Item item80 = null;
        tabela77.insere(item80);
        int int82 = tabela77.n;
        ds.Item item83 = null;
        tabela77.insere(item83);
        int int85 = tabela77.n;
        ds.Item item86 = null;
        tabela77.insere(item86);
        ds.Item item88 = null;
        tabela77.insere(item88);
        ds.Item[] itemArray90 = tabela77.registros;
        tabela47.registros = itemArray90;
        tabela35.registros = itemArray90;
        tabela0.registros = itemArray90;
        ds.Item[] itemArray94 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 3 + "'", int85 == 3);
        org.junit.Assert.assertNotNull(itemArray90);
        org.junit.Assert.assertNotNull(itemArray94);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        tabela0.n = ' ';
        tabela0.n = '4';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        ds.Item[] itemArray7 = tabela0.registros;
        int int8 = tabela0.n;
        int int9 = tabela0.n;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        tabela11.n = (short) 0;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        int int17 = tabela14.n;
        int int18 = tabela14.n;
        tabela14.n = (byte) 100;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        tabela21.insere(item22);
        int int24 = tabela21.n;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item[] itemArray26 = tabela21.registros;
        int int27 = tabela21.n;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        ds.Item[] itemArray33 = tabela28.registros;
        tabela21.registros = itemArray33;
        tabela14.registros = itemArray33;
        tabela11.registros = itemArray33;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        ds.Item item40 = null;
        tabela37.insere(item40);
        int int42 = tabela37.n;
        ds.Item item43 = null;
        tabela37.insere(item43);
        int int45 = tabela37.n;
        ds.Item item46 = null;
        tabela37.insere(item46);
        ds.Tabela tabela48 = new ds.Tabela();
        ds.Item item49 = null;
        tabela48.insere(item49);
        ds.Item item51 = null;
        tabela48.insere(item51);
        int int53 = tabela48.n;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Tabela tabela59 = new ds.Tabela();
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        tabela59.registros = itemArray61;
        tabela54.registros = itemArray61;
        tabela48.registros = itemArray61;
        tabela48.n = ' ';
        ds.Item[] itemArray67 = tabela48.registros;
        tabela37.registros = itemArray67;
        tabela11.registros = itemArray67;
        tabela0.registros = itemArray67;
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        tabela8.registros = itemArray10;
        tabela0.registros = itemArray10;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        int int18 = tabela13.n;
        ds.Item[] itemArray19 = tabela13.registros;
        tabela0.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela21.registros = itemArray23;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        tabela28.registros = itemArray30;
        ds.Item[] itemArray32 = tabela28.registros;
        ds.Item[] itemArray33 = tabela28.registros;
        ds.Item[] itemArray34 = tabela28.registros;
        ds.Item[] itemArray35 = tabela28.registros;
        ds.Item[] itemArray36 = tabela28.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        int int41 = tabela37.n;
        int int42 = tabela37.n;
        int int43 = tabela37.n;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        int int47 = tabela44.n;
        ds.Item[] itemArray48 = tabela44.registros;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela37.registros = itemArray49;
        tabela28.registros = itemArray49;
        tabela21.registros = itemArray49;
        tabela0.registros = itemArray49;
        ds.Item[] itemArray54 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item item5 = null;
        int int6 = tabela0.binaria(item5);
        int int7 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        int int10 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = (short) 10;
        tabela0.n = 'a';
        ds.Item[] itemArray21 = tabela0.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        ds.Item[] itemArray26 = tabela22.registros;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Item[] itemArray28 = tabela22.registros;
        ds.Item item29 = null;
        int int30 = tabela22.binaria(item29);
        ds.Item[] itemArray31 = tabela22.registros;
        ds.Item[] itemArray32 = tabela22.registros;
        tabela0.registros = itemArray32;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) 10;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        ds.Item item21 = null;
        tabela18.insere(item21);
        int int23 = tabela18.n;
        ds.Item item24 = null;
        tabela18.insere(item24);
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Item[] itemArray31 = tabela26.registros;
        tabela18.registros = itemArray31;
        tabela12.registros = itemArray31;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) -1;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        ds.Item item40 = null;
        tabela37.insere(item40);
        int int42 = tabela37.n;
        tabela37.n = (short) -1;
        ds.Item[] itemArray45 = tabela37.registros;
        tabela0.registros = itemArray45;
        ds.Item[] itemArray47 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        tabela0.n = '4';
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 10;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        int int16 = tabela0.n;
        int int17 = tabela0.n;
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tabela0.binaria(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        tabela0.n = 32;
        ds.Item[] itemArray18 = tabela0.registros;
        int int19 = tabela0.n;
        tabela0.n = '4';
        tabela0.n = (byte) 10;
        tabela0.n = '4';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        tabela4.n = (short) 100;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela4.registros = itemArray15;
        tabela0.registros = itemArray15;
        ds.Item[] itemArray18 = tabela0.registros;
        ds.Item item19 = null;
        tabela0.insere(item19);
        tabela0.n = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        tabela32.insere(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        int int37 = tabela32.n;
        ds.Item item38 = null;
        tabela32.insere(item38);
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        int int43 = tabela40.n;
        ds.Item[] itemArray44 = tabela40.registros;
        ds.Item[] itemArray45 = tabela40.registros;
        tabela32.registros = itemArray45;
        tabela0.registros = itemArray45;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = 100;
        tabela0.n = (short) 10;
        ds.Item[] itemArray10 = tabela0.registros;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        ds.Item[] itemArray17 = tabela12.registros;
        ds.Tabela tabela18 = new ds.Tabela();
        ds.Item item19 = null;
        tabela18.insere(item19);
        ds.Item item21 = null;
        tabela18.insere(item21);
        int int23 = tabela18.n;
        ds.Item item24 = null;
        tabela18.insere(item24);
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Item[] itemArray31 = tabela26.registros;
        tabela18.registros = itemArray31;
        tabela12.registros = itemArray31;
        tabela0.registros = itemArray31;
        tabela0.n = (byte) -1;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        ds.Item item40 = null;
        tabela37.insere(item40);
        int int42 = tabela37.n;
        tabela37.n = (short) -1;
        ds.Item[] itemArray45 = tabela37.registros;
        tabela0.registros = itemArray45;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        int int50 = tabela47.n;
        int int51 = tabela47.n;
        int int52 = tabela47.n;
        int int53 = tabela47.n;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Item[] itemArray59 = tabela54.registros;
        tabela47.registros = itemArray59;
        tabela47.n = (byte) -1;
        ds.Item[] itemArray63 = tabela47.registros;
        ds.Item item64 = null;
        tabela47.insere(item64);
        ds.Tabela tabela66 = new ds.Tabela();
        ds.Item item67 = null;
        tabela66.insere(item67);
        int int69 = tabela66.n;
        int int70 = tabela66.n;
        tabela66.n = (byte) 100;
        ds.Tabela tabela73 = new ds.Tabela();
        ds.Item item74 = null;
        tabela73.insere(item74);
        int int76 = tabela73.n;
        ds.Item[] itemArray77 = tabela73.registros;
        ds.Item[] itemArray78 = tabela73.registros;
        int int79 = tabela73.n;
        ds.Tabela tabela80 = new ds.Tabela();
        ds.Item item81 = null;
        tabela80.insere(item81);
        int int83 = tabela80.n;
        ds.Item[] itemArray84 = tabela80.registros;
        ds.Item[] itemArray85 = tabela80.registros;
        tabela73.registros = itemArray85;
        tabela66.registros = itemArray85;
        tabela47.registros = itemArray85;
        tabela0.registros = itemArray85;
        tabela0.n = 10;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
        ds.Tabela tabela0 = new ds.Tabela();
        tabela0.n = (short) 0;
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        tabela4.registros = itemArray6;
        ds.Item[] itemArray8 = tabela4.registros;
        ds.Item[] itemArray9 = tabela4.registros;
        ds.Item[] itemArray10 = tabela4.registros;
        ds.Item[] itemArray11 = tabela4.registros;
        ds.Item[] itemArray12 = tabela4.registros;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        ds.Item item25 = null;
        tabela19.insere(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        int int30 = tabela27.n;
        ds.Item[] itemArray31 = tabela27.registros;
        ds.Item[] itemArray32 = tabela27.registros;
        tabela19.registros = itemArray32;
        tabela13.registros = itemArray32;
        tabela4.registros = itemArray32;
        ds.Tabela tabela36 = new ds.Tabela();
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        tabela36.registros = itemArray38;
        ds.Item[] itemArray40 = tabela36.registros;
        ds.Item[] itemArray41 = tabela36.registros;
        ds.Item[] itemArray42 = tabela36.registros;
        ds.Item item43 = null;
        int int44 = tabela36.binaria(item43);
        tabela36.n = 0;
        int int47 = tabela36.n;
        ds.Item item48 = null;
        int int49 = tabela36.binaria(item48);
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        ds.Item item53 = null;
        tabela50.insere(item53);
        int int55 = tabela50.n;
        ds.Item item56 = null;
        tabela50.insere(item56);
        int int58 = tabela50.n;
        ds.Item item59 = null;
        tabela50.insere(item59);
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        tabela61.insere(item62);
        ds.Item item64 = null;
        tabela61.insere(item64);
        int int66 = tabela61.n;
        ds.Tabela tabela67 = new ds.Tabela();
        ds.Item item68 = null;
        tabela67.insere(item68);
        int int70 = tabela67.n;
        ds.Item[] itemArray71 = tabela67.registros;
        ds.Tabela tabela72 = new ds.Tabela();
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        tabela72.registros = itemArray74;
        tabela67.registros = itemArray74;
        tabela61.registros = itemArray74;
        tabela61.n = ' ';
        ds.Item[] itemArray80 = tabela61.registros;
        tabela50.registros = itemArray80;
        tabela50.n = (byte) -1;
        ds.Tabela tabela84 = new ds.Tabela();
        ds.Item item85 = null;
        ds.Item[] itemArray86 = new ds.Item[] { item85 };
        tabela84.registros = itemArray86;
        ds.Item[] itemArray88 = tabela84.registros;
        ds.Item[] itemArray89 = tabela84.registros;
        ds.Item[] itemArray90 = tabela84.registros;
        tabela50.registros = itemArray90;
        tabela36.registros = itemArray90;
        tabela4.registros = itemArray90;
        ds.Item[] itemArray94 = tabela4.registros;
        tabela0.registros = itemArray94;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(itemArray86);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray89);
        org.junit.Assert.assertNotNull(itemArray90);
        org.junit.Assert.assertNotNull(itemArray94);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        int int14 = tabela0.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        int int18 = tabela15.n;
        ds.Item[] itemArray19 = tabela15.registros;
        tabela15.n = (byte) 0;
        ds.Item[] itemArray22 = tabela15.registros;
        tabela0.registros = itemArray22;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        tabela0.n = 0;
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = tabela0.pesquisa(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        ds.Item item15 = null;
        tabela12.insere(item15);
        int int17 = tabela12.n;
        tabela12.n = (short) -1;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        ds.Item item23 = null;
        tabela20.insere(item23);
        int int25 = tabela20.n;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        tabela26.insere(item27);
        int int29 = tabela26.n;
        ds.Item[] itemArray30 = tabela26.registros;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela31.registros = itemArray33;
        tabela26.registros = itemArray33;
        tabela20.registros = itemArray33;
        ds.Item[] itemArray37 = tabela20.registros;
        tabela12.registros = itemArray37;
        tabela0.registros = itemArray37;
        tabela0.n = (byte) -1;
        ds.Item[] itemArray42 = tabela0.registros;
        int int43 = tabela0.n;
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = tabela0.binaria(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item item11 = null;
        tabela8.insere(item11);
        ds.Item[] itemArray13 = tabela8.registros;
        ds.Item[] itemArray14 = tabela8.registros;
        ds.Item[] itemArray15 = tabela8.registros;
        tabela0.registros = itemArray15;
        java.lang.Class<?> wildcardClass17 = tabela0.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        int int18 = tabela0.n;
        ds.Item item19 = null;
        tabela0.insere(item19);
        tabela0.n = (byte) 100;
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        tabela5.insere(item6);
        int int8 = tabela5.n;
        ds.Item[] itemArray9 = tabela5.registros;
        tabela0.registros = itemArray9;
        ds.Item[] itemArray11 = null;
        tabela0.registros = itemArray11;
        int int13 = tabela0.n;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        tabela15.registros = itemArray17;
        ds.Item[] itemArray19 = tabela15.registros;
        ds.Item[] itemArray20 = tabela15.registros;
        ds.Item[] itemArray21 = tabela15.registros;
        ds.Item[] itemArray22 = tabela15.registros;
        ds.Item[] itemArray23 = tabela15.registros;
        ds.Item item24 = null;
        int int25 = tabela15.binaria(item24);
        ds.Item item26 = null;
        int int27 = tabela15.binaria(item26);
        int int28 = tabela15.n;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        int int37 = tabela34.n;
        ds.Item[] itemArray38 = tabela34.registros;
        tabela29.registros = itemArray38;
        ds.Item item40 = null;
        tabela29.insere(item40);
        ds.Item[] itemArray42 = tabela29.registros;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        tabela43.insere(item44);
        int int46 = tabela43.n;
        int int47 = tabela43.n;
        int int48 = tabela43.n;
        int int49 = tabela43.n;
        tabela43.n = (short) 10;
        int int52 = tabela43.n;
        tabela43.n = 'a';
        ds.Tabela tabela55 = new ds.Tabela();
        ds.Item item56 = null;
        tabela55.insere(item56);
        ds.Item item58 = null;
        tabela55.insere(item58);
        int int60 = tabela55.n;
        tabela55.n = (short) -1;
        ds.Tabela tabela63 = new ds.Tabela();
        ds.Item item64 = null;
        tabela63.insere(item64);
        ds.Item item66 = null;
        tabela63.insere(item66);
        int int68 = tabela63.n;
        ds.Tabela tabela69 = new ds.Tabela();
        ds.Item item70 = null;
        tabela69.insere(item70);
        int int72 = tabela69.n;
        ds.Item[] itemArray73 = tabela69.registros;
        ds.Tabela tabela74 = new ds.Tabela();
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        tabela74.registros = itemArray76;
        tabela69.registros = itemArray76;
        tabela63.registros = itemArray76;
        ds.Item[] itemArray80 = tabela63.registros;
        tabela55.registros = itemArray80;
        tabela43.registros = itemArray80;
        tabela43.n = (byte) -1;
        ds.Item[] itemArray85 = tabela43.registros;
        tabela29.registros = itemArray85;
        tabela15.registros = itemArray85;
        ds.Item[] itemArray88 = tabela15.registros;
        tabela0.registros = itemArray88;
        tabela0.n = 4;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        tabela0.n = (byte) 1;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item item13 = null;
        tabela10.insere(item13);
        int int15 = tabela10.n;
        ds.Item item16 = null;
        tabela10.insere(item16);
        int int18 = tabela10.n;
        ds.Item item19 = null;
        tabela10.insere(item19);
        ds.Item[] itemArray21 = tabela10.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        ds.Item[] itemArray26 = tabela22.registros;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Item[] itemArray28 = tabela22.registros;
        ds.Item item29 = null;
        int int30 = tabela22.binaria(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        ds.Item item34 = null;
        tabela31.insere(item34);
        ds.Item item36 = null;
        tabela31.insere(item36);
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        tabela38.insere(item39);
        int int41 = tabela38.n;
        ds.Item[] itemArray42 = tabela38.registros;
        tabela31.registros = itemArray42;
        tabela22.registros = itemArray42;
        tabela10.registros = itemArray42;
        ds.Item[] itemArray46 = tabela10.registros;
        tabela0.registros = itemArray46;
        ds.Item item48 = null;
        tabela0.insere(item48);
        ds.Item item50 = null;
        tabela0.insere(item50);
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int53 = tabela0.binaria(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        tabela11.insere(item12);
        ds.Item item14 = null;
        tabela11.insere(item14);
        int int16 = tabela11.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela11.registros = itemArray24;
        tabela11.n = ' ';
        ds.Item[] itemArray30 = tabela11.registros;
        tabela0.registros = itemArray30;
        tabela0.n = (byte) -1;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        tabela34.registros = itemArray36;
        ds.Item[] itemArray38 = tabela34.registros;
        ds.Item[] itemArray39 = tabela34.registros;
        ds.Item[] itemArray40 = tabela34.registros;
        tabela0.registros = itemArray40;
        ds.Item[] itemArray42 = tabela0.registros;
        ds.Item item43 = null;
        tabela0.insere(item43);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela5.registros = itemArray7;
        tabela0.registros = itemArray7;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        tabela10.registros = itemArray12;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item[] itemArray15 = tabela10.registros;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        tabela17.registros = itemArray19;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Item[] itemArray22 = tabela17.registros;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        tabela23.registros = itemArray25;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        ds.Item[] itemArray29 = tabela23.registros;
        ds.Item[] itemArray30 = tabela23.registros;
        tabela17.registros = itemArray30;
        ds.Item item32 = null;
        int int33 = tabela17.binaria(item32);
        ds.Item[] itemArray34 = tabela17.registros;
        tabela10.registros = itemArray34;
        tabela0.registros = itemArray34;
        tabela0.n = ' ';
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int29 = tabela0.n;
        int int30 = tabela0.n;
        tabela0.n = '4';
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        int int36 = tabela33.n;
        int int37 = tabela33.n;
        tabela33.n = 100;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        int int43 = tabela40.n;
        ds.Item[] itemArray44 = tabela40.registros;
        ds.Item[] itemArray45 = tabela40.registros;
        tabela33.registros = itemArray45;
        ds.Item[] itemArray47 = tabela33.registros;
        tabela0.registros = itemArray47;
        java.lang.Class<?> wildcardClass49 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Item item15 = null;
        tabela0.insere(item15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = (short) 0;
        tabela0.n = 0;
        ds.Item[] itemArray13 = tabela0.registros;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        int int17 = tabela15.binaria(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        ds.Item[] itemArray20 = tabela15.registros;
        tabela15.n = '#';
        ds.Item[] itemArray23 = tabela15.registros;
        tabela0.registros = itemArray23;
        tabela0.n = 'a';
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        tabela15.n = (byte) 10;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        ds.Item[] itemArray26 = tabela22.registros;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Item[] itemArray28 = tabela22.registros;
        ds.Item[] itemArray29 = tabela22.registros;
        tabela15.registros = itemArray29;
        tabela0.registros = itemArray29;
        tabela0.n = 4;
        ds.Tabela tabela34 = new ds.Tabela();
        ds.Item item35 = null;
        tabela34.insere(item35);
        ds.Item item37 = null;
        tabela34.insere(item37);
        int int39 = tabela34.n;
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        int int43 = tabela40.n;
        ds.Item[] itemArray44 = tabela40.registros;
        ds.Tabela tabela45 = new ds.Tabela();
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        tabela45.registros = itemArray47;
        tabela40.registros = itemArray47;
        tabela34.registros = itemArray47;
        tabela34.n = ' ';
        ds.Tabela tabela53 = new ds.Tabela();
        ds.Item item54 = null;
        tabela53.insere(item54);
        ds.Item item56 = null;
        tabela53.insere(item56);
        ds.Item[] itemArray58 = tabela53.registros;
        tabela34.registros = itemArray58;
        ds.Item[] itemArray60 = tabela34.registros;
        tabela0.registros = itemArray60;
        ds.Tabela tabela62 = new ds.Tabela();
        ds.Item item63 = null;
        tabela62.insere(item63);
        int int65 = tabela62.n;
        ds.Item[] itemArray66 = tabela62.registros;
        ds.Item[] itemArray67 = tabela62.registros;
        ds.Item[] itemArray68 = tabela62.registros;
        ds.Tabela tabela69 = new ds.Tabela();
        ds.Item item70 = null;
        int int71 = tabela69.binaria(item70);
        ds.Item item72 = null;
        tabela69.insere(item72);
        tabela69.n = (byte) 0;
        tabela69.n = '#';
        tabela69.n = 32;
        ds.Item[] itemArray80 = tabela69.registros;
        tabela62.registros = itemArray80;
        tabela0.registros = itemArray80;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        tabela0.insere(item18);
        ds.Item[] itemArray20 = null;
        tabela0.registros = itemArray20;
        java.lang.Class<?> wildcardClass22 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        int int4 = tabela0.binaria(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Item item8 = null;
        tabela0.insere(item8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        tabela0.n = '#';
        tabela0.n = 32;
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        tabela0.n = (short) -1;
        ds.Item item16 = null;
        tabela0.insere(item16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        tabela0.n = ' ';
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        ds.Item[] itemArray24 = tabela19.registros;
        tabela0.registros = itemArray24;
        ds.Item[] itemArray26 = tabela0.registros;
        ds.Item[] itemArray27 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        int int7 = tabela0.n;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        int int13 = tabela0.n;
        int int14 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        tabela6.insere(item7);
        int int9 = tabela6.n;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Tabela tabela11 = new ds.Tabela();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        tabela11.registros = itemArray13;
        tabela6.registros = itemArray13;
        tabela0.registros = itemArray13;
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela0.registros = itemArray18;
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        tabela0.n = 0;
        int int11 = tabela0.n;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        tabela12.registros = itemArray14;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        tabela12.registros = itemArray21;
        ds.Item item23 = null;
        tabela12.insere(item23);
        ds.Item[] itemArray25 = tabela12.registros;
        ds.Tabela tabela26 = new ds.Tabela();
        ds.Item item27 = null;
        int int28 = tabela26.binaria(item27);
        ds.Item item29 = null;
        tabela26.insere(item29);
        tabela26.n = (byte) 0;
        ds.Item item33 = null;
        int int34 = tabela26.binaria(item33);
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        tabela35.insere(item36);
        int int38 = tabela35.n;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela26.registros = itemArray42;
        tabela12.registros = itemArray42;
        tabela0.registros = itemArray42;
        ds.Item item46 = null;
        int int47 = tabela0.binaria(item46);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        tabela0.n = (byte) 1;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item item19 = null;
        tabela16.insere(item19);
        int int21 = tabela16.n;
        ds.Item item22 = null;
        tabela16.insere(item22);
        int int24 = tabela16.n;
        ds.Item item25 = null;
        tabela16.insere(item25);
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        tabela27.insere(item28);
        ds.Item item30 = null;
        tabela27.insere(item30);
        int int32 = tabela27.n;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        int int36 = tabela33.n;
        ds.Item[] itemArray37 = tabela33.registros;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        tabela38.registros = itemArray40;
        tabela33.registros = itemArray40;
        tabela27.registros = itemArray40;
        tabela27.n = ' ';
        ds.Item[] itemArray46 = tabela27.registros;
        tabela16.registros = itemArray46;
        tabela16.n = (byte) -1;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        ds.Item item53 = null;
        tabela50.insere(item53);
        int int55 = tabela50.n;
        tabela50.n = (byte) 100;
        int int58 = tabela50.n;
        int int59 = tabela50.n;
        ds.Item[] itemArray60 = tabela50.registros;
        tabela16.registros = itemArray60;
        tabela0.registros = itemArray60;
        int int63 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        int int13 = tabela7.n;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        int int17 = tabela14.n;
        ds.Item[] itemArray18 = tabela14.registros;
        ds.Item[] itemArray19 = tabela14.registros;
        tabela7.registros = itemArray19;
        tabela0.registros = itemArray19;
        ds.Item[] itemArray22 = tabela0.registros;
        tabela0.n = '4';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        tabela0.n = ' ';
        int int15 = tabela0.n;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        int int18 = tabela16.binaria(item17);
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item[] itemArray21 = tabela16.registros;
        tabela16.n = '#';
        tabela16.n = 35;
        ds.Item[] itemArray26 = tabela16.registros;
        tabela0.registros = itemArray26;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (short) -1;
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = 0;
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item item12 = null;
        tabela0.insere(item12);
        ds.Item[] itemArray14 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray6 = tabela0.registros;
        tabela0.n = (byte) 1;
        tabela0.n = 4;
        ds.Item[] itemArray11 = tabela0.registros;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        tabela32.insere(item33);
        int int35 = tabela32.n;
        ds.Item[] itemArray36 = tabela32.registros;
        ds.Item[] itemArray37 = tabela32.registros;
        int int38 = tabela32.n;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        ds.Item item42 = null;
        tabela39.insere(item42);
        int int44 = tabela39.n;
        ds.Item item45 = null;
        tabela39.insere(item45);
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        ds.Item item50 = null;
        tabela47.insere(item50);
        int int52 = tabela47.n;
        ds.Item item53 = null;
        tabela47.insere(item53);
        int int55 = tabela47.n;
        ds.Item[] itemArray56 = tabela47.registros;
        tabela39.registros = itemArray56;
        tabela32.registros = itemArray56;
        ds.Tabela tabela59 = new ds.Tabela();
        ds.Item item60 = null;
        tabela59.insere(item60);
        int int62 = tabela59.n;
        ds.Item[] itemArray63 = tabela59.registros;
        ds.Item[] itemArray64 = tabela59.registros;
        int int65 = tabela59.n;
        ds.Tabela tabela66 = new ds.Tabela();
        ds.Item item67 = null;
        tabela66.insere(item67);
        int int69 = tabela66.n;
        ds.Item[] itemArray70 = tabela66.registros;
        ds.Item[] itemArray71 = tabela66.registros;
        tabela59.registros = itemArray71;
        ds.Tabela tabela73 = new ds.Tabela();
        ds.Item item74 = null;
        tabela73.insere(item74);
        int int76 = tabela73.n;
        ds.Item[] itemArray77 = tabela73.registros;
        ds.Tabela tabela78 = new ds.Tabela();
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        tabela78.registros = itemArray80;
        tabela73.registros = itemArray80;
        tabela59.registros = itemArray80;
        tabela32.registros = itemArray80;
        tabela0.registros = itemArray80;
        ds.Item item86 = null;
        // The following exception was thrown during execution in test generation
        try {
            tabela0.insere(item86);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A tabela esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        ds.Item item11 = null;
        tabela8.insere(item11);
        int int13 = tabela8.n;
        ds.Item item14 = null;
        tabela8.insere(item14);
        int int16 = tabela8.n;
        ds.Item[] itemArray17 = tabela8.registros;
        tabela0.registros = itemArray17;
        ds.Item item19 = null;
        tabela0.insere(item19);
        java.lang.Class<?> wildcardClass21 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = '#';
        int int8 = tabela0.n;
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item[] itemArray37 = tabela32.registros;
        tabela32.n = '#';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        tabela40.registros = itemArray43;
        tabela32.registros = itemArray43;
        tabela0.registros = itemArray43;
        ds.Item[] itemArray47 = tabela0.registros;
        ds.Item[] itemArray48 = tabela0.registros;
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = tabela0.pesquisa(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        tabela0.n = (byte) 10;
        tabela0.n = 32;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        ds.Item item12 = null;
        tabela9.insere(item12);
        int int14 = tabela9.n;
        ds.Item item15 = null;
        tabela9.insere(item15);
        int int17 = tabela9.n;
        ds.Item item18 = null;
        tabela9.insere(item18);
        ds.Item[] itemArray20 = tabela9.registros;
        ds.Item[] itemArray21 = tabela9.registros;
        ds.Item[] itemArray22 = tabela9.registros;
        tabela0.registros = itemArray22;
        tabela0.n = 5;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        tabela0.insere(item18);
        ds.Item[] itemArray20 = null;
        tabela0.registros = itemArray20;
        ds.Item[] itemArray22 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(itemArray22);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        java.lang.Class<?> wildcardClass9 = itemArray8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        ds.Item[] itemArray13 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Tabela tabela5 = new ds.Tabela();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        tabela5.registros = itemArray7;
        tabela0.registros = itemArray7;
        int int10 = tabela0.n;
        int int11 = tabela0.n;
        int int12 = tabela0.n;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        int int16 = tabela13.n;
        ds.Item[] itemArray17 = tabela13.registros;
        ds.Item[] itemArray18 = tabela13.registros;
        ds.Item[] itemArray19 = tabela13.registros;
        ds.Tabela tabela20 = new ds.Tabela();
        ds.Item item21 = null;
        tabela20.insere(item21);
        int int23 = tabela20.n;
        ds.Item[] itemArray24 = tabela20.registros;
        ds.Item[] itemArray25 = tabela20.registros;
        ds.Item[] itemArray26 = tabela20.registros;
        ds.Item[] itemArray27 = tabela20.registros;
        tabela13.registros = itemArray27;
        tabela13.n = 32;
        ds.Item[] itemArray31 = tabela13.registros;
        int int32 = tabela13.n;
        ds.Item[] itemArray33 = tabela13.registros;
        tabela0.registros = itemArray33;
        ds.Item item35 = null;
        tabela0.insere(item35);
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = tabela0.binaria(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        tabela0.n = (short) 10;
        int int9 = tabela0.n;
        tabela0.n = 'a';
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        ds.Item[] itemArray17 = tabela12.registros;
        int int18 = tabela12.n;
        ds.Tabela tabela19 = new ds.Tabela();
        ds.Item item20 = null;
        tabela19.insere(item20);
        ds.Item item22 = null;
        tabela19.insere(item22);
        int int24 = tabela19.n;
        tabela19.n = (byte) 100;
        tabela19.n = 1;
        ds.Tabela tabela29 = new ds.Tabela();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        tabela29.registros = itemArray31;
        ds.Item[] itemArray33 = tabela29.registros;
        ds.Item[] itemArray34 = tabela29.registros;
        ds.Tabela tabela35 = new ds.Tabela();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        tabela35.registros = itemArray37;
        ds.Item[] itemArray39 = tabela35.registros;
        ds.Item[] itemArray40 = tabela35.registros;
        ds.Item[] itemArray41 = tabela35.registros;
        ds.Item[] itemArray42 = tabela35.registros;
        tabela29.registros = itemArray42;
        tabela19.registros = itemArray42;
        tabela12.registros = itemArray42;
        ds.Item[] itemArray46 = tabela12.registros;
        tabela0.registros = itemArray46;
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = tabela0.binaria(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item[] itemArray13 = tabela0.registros;
        int int14 = tabela0.n;
        int int15 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        ds.Item item15 = null;
        tabela0.insere(item15);
        ds.Item[] itemArray17 = tabela0.registros;
        ds.Item item18 = null;
        tabela0.insere(item18);
        ds.Item item20 = null;
        tabela0.insere(item20);
        tabela0.n = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        tabela0.n = (byte) 100;
        tabela0.n = 1;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        tabela10.registros = itemArray12;
        ds.Item[] itemArray14 = tabela10.registros;
        ds.Item[] itemArray15 = tabela10.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        tabela16.registros = itemArray18;
        ds.Item[] itemArray20 = tabela16.registros;
        ds.Item[] itemArray21 = tabela16.registros;
        ds.Item[] itemArray22 = tabela16.registros;
        ds.Item[] itemArray23 = tabela16.registros;
        tabela10.registros = itemArray23;
        tabela0.registros = itemArray23;
        int int26 = tabela0.n;
        ds.Tabela tabela27 = new ds.Tabela();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        tabela27.registros = itemArray29;
        ds.Item[] itemArray31 = tabela27.registros;
        ds.Item[] itemArray32 = tabela27.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela33.registros = itemArray35;
        ds.Item[] itemArray37 = tabela33.registros;
        ds.Item[] itemArray38 = tabela33.registros;
        ds.Item[] itemArray39 = tabela33.registros;
        ds.Item[] itemArray40 = tabela33.registros;
        tabela27.registros = itemArray40;
        ds.Item[] itemArray42 = tabela27.registros;
        ds.Tabela tabela43 = new ds.Tabela();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        tabela43.registros = itemArray45;
        ds.Item[] itemArray47 = tabela43.registros;
        ds.Item[] itemArray48 = tabela43.registros;
        ds.Item[] itemArray49 = tabela43.registros;
        int int50 = tabela43.n;
        ds.Item[] itemArray51 = tabela43.registros;
        ds.Item item52 = null;
        int int53 = tabela43.binaria(item52);
        ds.Item[] itemArray54 = tabela43.registros;
        tabela27.registros = itemArray54;
        tabela0.registros = itemArray54;
        java.lang.Class<?> wildcardClass57 = itemArray54.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        tabela0.registros = itemArray14;
        tabela0.n = 2;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        tabela0.n = (byte) 100;
        ds.Item[] itemArray9 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        tabela7.insere(item8);
        int int10 = tabela7.n;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        tabela0.registros = itemArray12;
        ds.Item[] itemArray14 = tabela0.registros;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        ds.Item item18 = null;
        tabela15.insere(item18);
        int int20 = tabela15.n;
        ds.Item item21 = null;
        tabela15.insere(item21);
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela15.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        tabela31.registros = itemArray33;
        ds.Item[] itemArray35 = tabela31.registros;
        ds.Item[] itemArray36 = tabela31.registros;
        ds.Item[] itemArray37 = tabela31.registros;
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        tabela38.registros = itemArray40;
        ds.Item[] itemArray42 = tabela38.registros;
        ds.Item[] itemArray43 = tabela38.registros;
        ds.Item[] itemArray44 = tabela38.registros;
        ds.Item[] itemArray45 = tabela38.registros;
        ds.Item[] itemArray46 = tabela38.registros;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        int int50 = tabela47.n;
        int int51 = tabela47.n;
        int int52 = tabela47.n;
        int int53 = tabela47.n;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Item[] itemArray59 = tabela54.registros;
        tabela47.registros = itemArray59;
        tabela38.registros = itemArray59;
        tabela31.registros = itemArray59;
        ds.Tabela tabela63 = new ds.Tabela();
        ds.Item item64 = null;
        int int65 = tabela63.binaria(item64);
        ds.Item item66 = null;
        tabela63.insere(item66);
        ds.Item[] itemArray68 = tabela63.registros;
        tabela63.n = '#';
        ds.Tabela tabela71 = new ds.Tabela();
        ds.Item item72 = null;
        tabela71.insere(item72);
        ds.Item[] itemArray74 = new ds.Item[] {};
        tabela71.registros = itemArray74;
        tabela63.registros = itemArray74;
        tabela31.registros = itemArray74;
        int int78 = tabela31.n;
        ds.Item[] itemArray79 = tabela31.registros;
        tabela0.registros = itemArray79;
        java.lang.Class<?> wildcardClass81 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item item6 = null;
        int int7 = tabela0.binaria(item6);
        ds.Item[] itemArray8 = tabela0.registros;
        tabela0.n = '4';
        ds.Item[] itemArray11 = tabela0.registros;
        ds.Item[] itemArray12 = tabela0.registros;
        java.lang.Class<?> wildcardClass13 = itemArray12.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1163");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = '#';
        tabela0.n = 35;
        tabela0.n = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1164");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        int int8 = tabela0.n;
        ds.Item item9 = null;
        tabela0.insere(item9);
        ds.Item item11 = null;
        tabela0.insere(item11);
        ds.Item item13 = null;
        tabela0.insere(item13);
        ds.Item[] itemArray15 = null;
        tabela0.registros = itemArray15;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1165");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Tabela tabela12 = new ds.Tabela();
        ds.Item item13 = null;
        tabela12.insere(item13);
        int int15 = tabela12.n;
        ds.Item[] itemArray16 = tabela12.registros;
        tabela7.registros = itemArray16;
        ds.Item[] itemArray18 = tabela7.registros;
        tabela0.registros = itemArray18;
        ds.Item item20 = null;
        tabela0.insere(item20);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1166");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 0;
        ds.Item item7 = null;
        int int8 = tabela0.binaria(item7);
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Item[] itemArray15 = tabela9.registros;
        ds.Item[] itemArray16 = tabela9.registros;
        tabela0.registros = itemArray16;
        ds.Item[] itemArray18 = tabela0.registros;
        java.lang.Class<?> wildcardClass19 = itemArray18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1167");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item item9 = null;
        int int10 = tabela0.binaria(item9);
        ds.Item item11 = null;
        int int12 = tabela0.binaria(item11);
        int int13 = tabela0.n;
        ds.Tabela tabela14 = new ds.Tabela();
        ds.Item item15 = null;
        tabela14.insere(item15);
        ds.Item item17 = null;
        tabela14.insere(item17);
        int int19 = tabela14.n;
        tabela14.n = (short) -1;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        tabela22.insere(item23);
        ds.Item item25 = null;
        tabela22.insere(item25);
        int int27 = tabela22.n;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        tabela28.insere(item29);
        int int31 = tabela28.n;
        ds.Item[] itemArray32 = tabela28.registros;
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        tabela33.registros = itemArray35;
        tabela28.registros = itemArray35;
        tabela22.registros = itemArray35;
        ds.Item[] itemArray39 = tabela22.registros;
        tabela14.registros = itemArray39;
        tabela0.registros = itemArray39;
        ds.Tabela tabela42 = new ds.Tabela();
        ds.Item item43 = null;
        tabela42.insere(item43);
        ds.Item item45 = null;
        tabela42.insere(item45);
        ds.Item item47 = null;
        tabela42.insere(item47);
        int int49 = tabela42.n;
        ds.Tabela tabela50 = new ds.Tabela();
        ds.Item item51 = null;
        tabela50.insere(item51);
        int int53 = tabela50.n;
        int int54 = tabela50.n;
        int int55 = tabela50.n;
        int int56 = tabela50.n;
        ds.Tabela tabela57 = new ds.Tabela();
        ds.Item item58 = null;
        tabela57.insere(item58);
        int int60 = tabela57.n;
        ds.Item[] itemArray61 = tabela57.registros;
        ds.Item[] itemArray62 = tabela57.registros;
        tabela50.registros = itemArray62;
        ds.Item[] itemArray64 = tabela50.registros;
        ds.Item item65 = null;
        tabela50.insere(item65);
        ds.Item[] itemArray67 = tabela50.registros;
        tabela42.registros = itemArray67;
        tabela0.registros = itemArray67;
        tabela0.n = 0;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1168");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Tabela tabela4 = new ds.Tabela();
        ds.Item item5 = null;
        tabela4.insere(item5);
        tabela4.n = (short) 100;
        ds.Tabela tabela9 = new ds.Tabela();
        ds.Item item10 = null;
        tabela9.insere(item10);
        int int12 = tabela9.n;
        ds.Item[] itemArray13 = tabela9.registros;
        ds.Item[] itemArray14 = tabela9.registros;
        ds.Item[] itemArray15 = tabela9.registros;
        tabela4.registros = itemArray15;
        tabela0.registros = itemArray15;
        int int18 = tabela0.n;
        tabela0.n = (byte) 1;
        tabela0.n = (byte) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1169");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item item5 = null;
        tabela0.insere(item5);
        int int7 = tabela0.n;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        int int12 = tabela8.n;
        int int13 = tabela8.n;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        int int18 = tabela15.n;
        ds.Item[] itemArray19 = tabela15.registros;
        ds.Item[] itemArray20 = tabela15.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        ds.Item item23 = null;
        tabela8.insere(item23);
        ds.Item[] itemArray25 = tabela8.registros;
        tabela0.registros = itemArray25;
        int int27 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1170");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Tabela tabela7 = new ds.Tabela();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        tabela7.registros = itemArray9;
        ds.Item[] itemArray11 = tabela7.registros;
        ds.Item[] itemArray12 = tabela7.registros;
        ds.Item[] itemArray13 = tabela7.registros;
        ds.Item[] itemArray14 = tabela7.registros;
        ds.Item[] itemArray15 = tabela7.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        int int19 = tabela16.n;
        int int20 = tabela16.n;
        int int21 = tabela16.n;
        int int22 = tabela16.n;
        ds.Tabela tabela23 = new ds.Tabela();
        ds.Item item24 = null;
        tabela23.insere(item24);
        int int26 = tabela23.n;
        ds.Item[] itemArray27 = tabela23.registros;
        ds.Item[] itemArray28 = tabela23.registros;
        tabela16.registros = itemArray28;
        tabela7.registros = itemArray28;
        tabela0.registros = itemArray28;
        ds.Tabela tabela32 = new ds.Tabela();
        ds.Item item33 = null;
        int int34 = tabela32.binaria(item33);
        ds.Item item35 = null;
        tabela32.insere(item35);
        ds.Item[] itemArray37 = tabela32.registros;
        tabela32.n = '#';
        ds.Tabela tabela40 = new ds.Tabela();
        ds.Item item41 = null;
        tabela40.insere(item41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        tabela40.registros = itemArray43;
        tabela32.registros = itemArray43;
        tabela0.registros = itemArray43;
        int int47 = tabela0.n;
        tabela0.n = (byte) 10;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1171");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        tabela0.n = (byte) 10;
        ds.Item[] itemArray7 = tabela0.registros;
        java.lang.Class<?> wildcardClass8 = itemArray7.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1172");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Item[] itemArray6 = tabela0.registros;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        tabela8.registros = itemArray10;
        tabela0.registros = itemArray10;
        ds.Tabela tabela13 = new ds.Tabela();
        ds.Item item14 = null;
        tabela13.insere(item14);
        ds.Item item16 = null;
        tabela13.insere(item16);
        int int18 = tabela13.n;
        ds.Item[] itemArray19 = tabela13.registros;
        tabela0.registros = itemArray19;
        ds.Tabela tabela21 = new ds.Tabela();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        tabela21.registros = itemArray23;
        ds.Item[] itemArray25 = tabela21.registros;
        ds.Item[] itemArray26 = tabela21.registros;
        ds.Item[] itemArray27 = tabela21.registros;
        ds.Tabela tabela28 = new ds.Tabela();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        tabela28.registros = itemArray30;
        ds.Item[] itemArray32 = tabela28.registros;
        ds.Item[] itemArray33 = tabela28.registros;
        ds.Item[] itemArray34 = tabela28.registros;
        ds.Item[] itemArray35 = tabela28.registros;
        ds.Item[] itemArray36 = tabela28.registros;
        ds.Tabela tabela37 = new ds.Tabela();
        ds.Item item38 = null;
        tabela37.insere(item38);
        int int40 = tabela37.n;
        int int41 = tabela37.n;
        int int42 = tabela37.n;
        int int43 = tabela37.n;
        ds.Tabela tabela44 = new ds.Tabela();
        ds.Item item45 = null;
        tabela44.insere(item45);
        int int47 = tabela44.n;
        ds.Item[] itemArray48 = tabela44.registros;
        ds.Item[] itemArray49 = tabela44.registros;
        tabela37.registros = itemArray49;
        tabela28.registros = itemArray49;
        tabela21.registros = itemArray49;
        tabela0.registros = itemArray49;
        int int54 = tabela0.n;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1173");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        ds.Item[] itemArray12 = tabela8.registros;
        ds.Item[] itemArray13 = tabela8.registros;
        tabela0.registros = itemArray13;
        tabela0.n = (-1);
        ds.Item[] itemArray17 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1174");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        ds.Item[] itemArray2 = new ds.Item[] { item1 };
        tabela0.registros = itemArray2;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        ds.Tabela tabela6 = new ds.Tabela();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        tabela6.registros = itemArray8;
        ds.Item[] itemArray10 = tabela6.registros;
        ds.Item[] itemArray11 = tabela6.registros;
        ds.Item[] itemArray12 = tabela6.registros;
        ds.Item[] itemArray13 = tabela6.registros;
        tabela0.registros = itemArray13;
        ds.Item[] itemArray15 = tabela0.registros;
        ds.Tabela tabela16 = new ds.Tabela();
        ds.Item item17 = null;
        tabela16.insere(item17);
        ds.Item item19 = null;
        tabela16.insere(item19);
        ds.Item[] itemArray21 = tabela16.registros;
        tabela0.registros = itemArray21;
        ds.Item item23 = null;
        int int24 = tabela0.binaria(item23);
        ds.Item[] itemArray25 = tabela0.registros;
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1175");
        ds.Tabela tabela0 = new ds.Tabela();
        int int1 = tabela0.n;
        ds.Item[] itemArray2 = tabela0.registros;
        ds.Item item3 = null;
        tabela0.insere(item3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1176");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        ds.Item item6 = null;
        tabela0.insere(item6);
        ds.Tabela tabela8 = new ds.Tabela();
        ds.Item item9 = null;
        tabela8.insere(item9);
        int int11 = tabela8.n;
        int int12 = tabela8.n;
        int int13 = tabela8.n;
        int int14 = tabela8.n;
        ds.Tabela tabela15 = new ds.Tabela();
        ds.Item item16 = null;
        tabela15.insere(item16);
        int int18 = tabela15.n;
        ds.Item[] itemArray19 = tabela15.registros;
        ds.Item[] itemArray20 = tabela15.registros;
        tabela8.registros = itemArray20;
        ds.Item[] itemArray22 = tabela8.registros;
        tabela0.registros = itemArray22;
        tabela0.n = (short) -1;
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tabela0.pesquisa(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1177");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        int int2 = tabela0.binaria(item1);
        ds.Item item3 = null;
        tabela0.insere(item3);
        ds.Item[] itemArray5 = tabela0.registros;
        tabela0.n = '#';
        ds.Item[] itemArray8 = tabela0.registros;
        ds.Item[] itemArray9 = tabela0.registros;
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        ds.Item item13 = null;
        tabela10.insere(item13);
        int int15 = tabela10.n;
        ds.Item item16 = null;
        tabela10.insere(item16);
        int int18 = tabela10.n;
        ds.Item item19 = null;
        tabela10.insere(item19);
        ds.Item[] itemArray21 = tabela10.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        ds.Item[] itemArray26 = tabela22.registros;
        ds.Item[] itemArray27 = tabela22.registros;
        ds.Item[] itemArray28 = tabela22.registros;
        ds.Item item29 = null;
        int int30 = tabela22.binaria(item29);
        ds.Tabela tabela31 = new ds.Tabela();
        ds.Item item32 = null;
        tabela31.insere(item32);
        ds.Item item34 = null;
        tabela31.insere(item34);
        ds.Item item36 = null;
        tabela31.insere(item36);
        ds.Tabela tabela38 = new ds.Tabela();
        ds.Item item39 = null;
        tabela38.insere(item39);
        int int41 = tabela38.n;
        ds.Item[] itemArray42 = tabela38.registros;
        tabela31.registros = itemArray42;
        tabela22.registros = itemArray42;
        tabela10.registros = itemArray42;
        ds.Item[] itemArray46 = tabela10.registros;
        ds.Tabela tabela47 = new ds.Tabela();
        ds.Item item48 = null;
        tabela47.insere(item48);
        int int50 = tabela47.n;
        int int51 = tabela47.n;
        int int52 = tabela47.n;
        int int53 = tabela47.n;
        ds.Tabela tabela54 = new ds.Tabela();
        ds.Item item55 = null;
        tabela54.insere(item55);
        int int57 = tabela54.n;
        ds.Item[] itemArray58 = tabela54.registros;
        ds.Item[] itemArray59 = tabela54.registros;
        tabela47.registros = itemArray59;
        tabela47.n = (byte) -1;
        ds.Item[] itemArray63 = tabela47.registros;
        tabela10.registros = itemArray63;
        tabela0.registros = itemArray63;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1178");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        ds.Item[] itemArray4 = tabela0.registros;
        ds.Item[] itemArray5 = tabela0.registros;
        int int6 = tabela0.n;
        ds.Item[] itemArray7 = tabela0.registros;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Item[] itemArray10 = tabela0.registros;
        int int11 = tabela0.n;
        java.lang.Class<?> wildcardClass12 = tabela0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1179");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int29 = tabela0.n;
        int int30 = tabela0.n;
        tabela0.n = (-1);
        ds.Tabela tabela33 = new ds.Tabela();
        ds.Item item34 = null;
        tabela33.insere(item34);
        int int36 = tabela33.n;
        ds.Item[] itemArray37 = tabela33.registros;
        ds.Item[] itemArray38 = tabela33.registros;
        ds.Tabela tabela39 = new ds.Tabela();
        ds.Item item40 = null;
        tabela39.insere(item40);
        int int42 = tabela39.n;
        ds.Item[] itemArray43 = tabela39.registros;
        ds.Item[] itemArray44 = tabela39.registros;
        int int45 = tabela39.n;
        ds.Item[] itemArray46 = tabela39.registros;
        tabela39.n = (byte) 1;
        ds.Tabela tabela49 = new ds.Tabela();
        ds.Item item50 = null;
        tabela49.insere(item50);
        ds.Item item52 = null;
        tabela49.insere(item52);
        int int54 = tabela49.n;
        ds.Item item55 = null;
        tabela49.insere(item55);
        int int57 = tabela49.n;
        ds.Item item58 = null;
        tabela49.insere(item58);
        ds.Item[] itemArray60 = tabela49.registros;
        ds.Tabela tabela61 = new ds.Tabela();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        tabela61.registros = itemArray63;
        ds.Item[] itemArray65 = tabela61.registros;
        ds.Item[] itemArray66 = tabela61.registros;
        ds.Item[] itemArray67 = tabela61.registros;
        ds.Item item68 = null;
        int int69 = tabela61.binaria(item68);
        ds.Tabela tabela70 = new ds.Tabela();
        ds.Item item71 = null;
        tabela70.insere(item71);
        ds.Item item73 = null;
        tabela70.insere(item73);
        ds.Item item75 = null;
        tabela70.insere(item75);
        ds.Tabela tabela77 = new ds.Tabela();
        ds.Item item78 = null;
        tabela77.insere(item78);
        int int80 = tabela77.n;
        ds.Item[] itemArray81 = tabela77.registros;
        tabela70.registros = itemArray81;
        tabela61.registros = itemArray81;
        tabela49.registros = itemArray81;
        ds.Item[] itemArray85 = tabela49.registros;
        tabela39.registros = itemArray85;
        tabela33.registros = itemArray85;
        tabela0.registros = itemArray85;
        ds.Item item89 = null;
        tabela0.insere(item89);
        ds.Item item91 = null;
        int int92 = tabela0.binaria(item91);
        ds.Item[] itemArray93 = tabela0.registros;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(itemArray93);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1180");
        ds.Tabela tabela0 = new ds.Tabela();
        ds.Item item1 = null;
        tabela0.insere(item1);
        int int3 = tabela0.n;
        int int4 = tabela0.n;
        int int5 = tabela0.n;
        int int6 = tabela0.n;
        int int7 = tabela0.n;
        ds.Item item8 = null;
        tabela0.insere(item8);
        ds.Tabela tabela10 = new ds.Tabela();
        ds.Item item11 = null;
        tabela10.insere(item11);
        int int13 = tabela10.n;
        int int14 = tabela10.n;
        int int15 = tabela10.n;
        int int16 = tabela10.n;
        ds.Tabela tabela17 = new ds.Tabela();
        ds.Item item18 = null;
        tabela17.insere(item18);
        int int20 = tabela17.n;
        ds.Item[] itemArray21 = tabela17.registros;
        ds.Tabela tabela22 = new ds.Tabela();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        tabela22.registros = itemArray24;
        tabela17.registros = itemArray24;
        tabela10.registros = itemArray24;
        tabela0.registros = itemArray24;
        int int29 = tabela0.n;
        int int30 = tabela0.n;
        tabela0.n = '4';
        tabela0.n = (short) 10;
        int int35 = tabela0.n;
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = tabela0.pesquisa(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }
}

