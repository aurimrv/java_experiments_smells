package ds.seed5503;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test001");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 0.0f };
        lista0.item = objArray4;
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 0.0f };
        lista0.item = objArray4;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        boolean boolean12 = lista2.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 10;
        java.lang.Class<?> wildcardClass13 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass19 = lista13.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        lista0.imprime();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        boolean boolean6 = lista0.vazia();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Object[] objArray20 = lista0.item;
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        lista2.pos = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        int int6 = lista0.pos;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.pos = 10;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        int int25 = lista0.pos;
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        int int6 = lista4.pos;
        lista4.primeiro = 100;
        java.lang.Object[] objArray9 = lista4.item;
        lista0.item = objArray9;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista11.pos = (short) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista0.item = objArray18;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        boolean boolean8 = lista0.vazia();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        int int26 = lista18.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        int int5 = lista0.primeiro;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 0.0f };
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0.0]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        int int6 = lista0.pos;
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        lista0.pos = (short) 1;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.imprime();
        lista5.pos = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        boolean boolean12 = lista5.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Object[] objArray20 = lista0.item;
        boolean boolean21 = lista0.vazia();
        lista0.insere((java.lang.Object) 100.0d);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista24.imprime();
        int int27 = lista24.ultimo;
        lista24.ultimo = (byte) 10;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1L, 0.0f };
        lista35.item = objArray39;
        lista32.item = objArray39;
        lista30.item = objArray39;
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        lista43.imprime();
        lista43.primeiro = '4';
        lista30.insere((java.lang.Object) lista43);
        int int49 = lista43.primeiro;
        java.lang.Object[] objArray50 = lista43.item;
        lista24.item = objArray50;
        java.lang.Object[] objArray52 = lista24.item;
        lista0.item = objArray52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        int int40 = lista0.ultimo;
        lista0.pos = (short) 10;
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista5.pos;
        lista5.insere((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        int int15 = lista12.ultimo;
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        lista8.primeiro = '4';
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        boolean boolean17 = lista13.vazia();
        lista8.insere((java.lang.Object) lista13);
        lista13.ultimo = 0;
        java.lang.Class<?> wildcardClass21 = lista13.getClass();
        lista0.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass23 = lista13.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        java.lang.Class<?> wildcardClass14 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        java.lang.Object[] objArray16 = lista10.item;
        lista0.item = objArray16;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Class<?> wildcardClass13 = lista2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        int int25 = lista0.pos;
        int int26 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 100;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Class<?> wildcardClass12 = lista2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        lista0.pos = (short) 0;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 0.0f };
        lista3.item = objArray7;
        lista0.item = objArray7;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        int int26 = lista18.ultimo;
        java.lang.Object[] objArray27 = lista18.item;
        java.lang.Class<?> wildcardClass28 = objArray27.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1L, 0.0f };
        lista29.item = objArray33;
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista22.item = objArray33;
        lista14.item = objArray33;
        int int39 = lista14.pos;
        boolean boolean40 = lista14.vazia();
        lista2.insere((java.lang.Object) boolean40);
        java.lang.Class<?> wildcardClass42 = lista2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        int int19 = lista7.pos;
        lista7.primeiro = (short) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.pos;
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        int int14 = lista2.primeiro;
        int int15 = lista2.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        lista0.pos = (short) 0;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        lista5.insere((java.lang.Object) objArray20);
        int int22 = lista5.ultimo;
        java.lang.Class<?> wildcardClass23 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        int int25 = lista0.primeiro;
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        int int14 = lista5.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = 100;
        int int7 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 100;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        int int9 = lista7.ultimo;
        lista0.insere((java.lang.Object) int9);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        int int20 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        lista5.primeiro = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        int int19 = lista7.pos;
        int int20 = lista7.pos;
        int int21 = lista7.ultimo;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = '#';
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.ultimo;
        int int8 = lista0.pos;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        int int9 = lista5.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista5.item = objArray11;
        int int13 = lista5.primeiro;
        boolean boolean14 = lista5.vazia();
        lista0.insere((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista42.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 1L, 0.0f };
        lista45.item = objArray49;
        lista42.item = objArray49;
        lista40.item = objArray49;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        lista53.imprime();
        lista53.primeiro = '4';
        lista40.insere((java.lang.Object) lista53);
        java.lang.Object[] objArray59 = lista40.item;
        java.lang.Object[] objArray60 = lista40.item;
        int int61 = lista40.pos;
        lista0.insere((java.lang.Object) lista40);
        java.lang.Class<?> wildcardClass63 = lista40.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1L, 0.0f };
        lista29.item = objArray33;
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista22.item = objArray33;
        lista14.item = objArray33;
        int int39 = lista14.pos;
        boolean boolean40 = lista14.vazia();
        lista2.insere((java.lang.Object) boolean40);
        int int42 = lista2.pos;
        int int43 = lista2.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        int int5 = lista0.ultimo;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        lista0.ultimo = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = 100;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        lista0.pos = 10;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.pos = 'a';
        int int30 = lista26.primeiro;
        lista18.insere((java.lang.Object) lista26);
        int int32 = lista26.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        lista0.pos = (byte) 10;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        lista11.ultimo = '4';
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 0.0f };
        lista21.item = objArray25;
        lista18.item = objArray25;
        lista16.item = objArray25;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        lista29.primeiro = '4';
        lista16.insere((java.lang.Object) lista29);
        lista11.insere((java.lang.Object) lista29);
        int int36 = lista29.primeiro;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1L, 0.0f };
        lista42.item = objArray46;
        lista39.item = objArray46;
        lista37.item = objArray46;
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        lista50.imprime();
        lista50.primeiro = '4';
        lista37.insere((java.lang.Object) lista50);
        java.lang.Object[] objArray56 = lista37.item;
        lista29.item = objArray56;
        lista0.insere((java.lang.Object) lista29);
        int int59 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.insere((java.lang.Object) objArray9);
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        lista12.ultimo = '4';
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 1L, 0.0f };
        lista22.item = objArray26;
        lista19.item = objArray26;
        lista17.item = objArray26;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.primeiro = '4';
        lista17.insere((java.lang.Object) lista30);
        lista12.insere((java.lang.Object) lista30);
        java.lang.Object[] objArray37 = lista30.item;
        lista0.insere((java.lang.Object) objArray37);
        lista0.pos = (byte) 100;
        int int41 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Object[] objArray20 = lista0.item;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        int int24 = lista21.primeiro;
        lista21.pos = 100;
        java.lang.Object[] objArray27 = lista21.item;
        lista21.imprime();
        lista21.pos = (short) 0;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.primeiro;
        lista31.pos = 100;
        java.lang.Object[] objArray37 = lista31.item;
        lista21.item = objArray37;
        lista0.item = objArray37;
        java.lang.Class<?> wildcardClass40 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista3.imprime();
        int int6 = lista3.primeiro;
        lista3.pos = 100;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 10;
        int int14 = lista11.ultimo;
        java.lang.Object[] objArray15 = lista11.item;
        lista0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        lista0.pos = (short) 1;
        lista0.imprime();
        int int10 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.primeiro = '4';
        lista10.insere((java.lang.Object) lista23);
        lista5.insere((java.lang.Object) lista23);
        java.lang.Object[] objArray30 = lista23.item;
        lista0.insere((java.lang.Object) objArray30);
        int int32 = lista0.primeiro;
        int int33 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        lista0.primeiro = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 0.0f };
        lista4.item = objArray8;
        lista0.item = objArray8;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0.0]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        int int6 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.pos = 0;
        boolean boolean13 = lista0.vazia();
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray25 = lista18.item;
        int int26 = lista18.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        lista27.ultimo = '4';
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista34.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.imprime();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 1L, 0.0f };
        lista37.item = objArray41;
        lista34.item = objArray41;
        lista32.item = objArray41;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        lista45.primeiro = '4';
        lista32.insere((java.lang.Object) lista45);
        lista27.insere((java.lang.Object) lista45);
        int int52 = lista45.ultimo;
        lista45.pos = '#';
        int int55 = lista45.ultimo;
        lista18.insere((java.lang.Object) int55);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        int int14 = lista2.primeiro;
        lista2.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        boolean boolean5 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        lista0.ultimo = 1;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.pos;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.pos = 0;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        lista0.ultimo = (-1);
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        java.lang.Object[] objArray14 = lista11.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.primeiro = '4';
        lista22.pos = (-1);
        lista22.insere((java.lang.Object) 1L);
        lista22.pos = (byte) 10;
        lista0.insere((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.ultimo = (byte) 1;
        lista0.ultimo = 100;
        java.lang.Object[] objArray25 = lista0.item;
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 0.0f };
        lista31.item = objArray35;
        lista28.item = objArray35;
        lista26.item = objArray35;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        lista26.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray45 = lista26.item;
        lista18.item = objArray45;
        lista18.imprime();
        int int48 = lista18.ultimo;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        lista49.imprime();
        lista49.ultimo = '4';
        java.lang.Object[] objArray54 = lista49.item;
        lista49.primeiro = '4';
        int int57 = lista49.pos;
        java.lang.Object[] objArray58 = lista49.item;
        lista18.insere((java.lang.Object) objArray58);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        int int6 = lista4.pos;
        lista4.primeiro = 100;
        java.lang.Object[] objArray9 = lista4.item;
        lista0.item = objArray9;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = 100;
        lista0.ultimo = 0;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.imprime();
        int int12 = lista9.ultimo;
        lista9.ultimo = (byte) 10;
        boolean boolean15 = lista9.vazia();
        int int16 = lista9.primeiro;
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.primeiro = '4';
        lista10.insere((java.lang.Object) lista23);
        lista5.insere((java.lang.Object) lista23);
        java.lang.Object[] objArray30 = lista23.item;
        lista0.insere((java.lang.Object) objArray30);
        int int32 = lista0.ultimo;
        int int33 = lista0.primeiro;
        boolean boolean34 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        lista5.insere((java.lang.Object) objArray20);
        lista5.ultimo = 32;
        lista5.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        int int21 = lista13.primeiro;
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = 10;
        lista22.ultimo = (short) -1;
        lista22.ultimo = (byte) 1;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        int int31 = lista29.pos;
        java.lang.Object[] objArray32 = lista29.item;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1L, 0.0f };
        lista33.item = objArray37;
        lista29.item = objArray37;
        lista22.insere((java.lang.Object) lista29);
        java.lang.Object[] objArray41 = lista29.item;
        lista13.item = objArray41;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 0.0]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        lista6.pos = 100;
        int int12 = lista6.pos;
        int int13 = lista6.ultimo;
        lista6.ultimo = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        lista5.pos = (-1);
        lista5.primeiro = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        int int10 = lista6.ultimo;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista6.item = objArray12;
        lista6.ultimo = (-1);
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        int int18 = lista6.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        lista13.pos = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        lista2.primeiro = (short) 100;
        java.lang.Class<?> wildcardClass18 = lista2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = (byte) 0;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        int int15 = lista2.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        lista19.ultimo = 10;
        lista17.insere((java.lang.Object) lista19);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        int int26 = lista23.primeiro;
        int int27 = lista23.primeiro;
        lista19.insere((java.lang.Object) int27);
        java.lang.Object[] objArray29 = lista19.item;
        java.lang.Object[] objArray30 = lista19.item;
        java.lang.Object[] objArray31 = lista19.item;
        lista0.item = objArray31;
        int int33 = lista0.primeiro;
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.ultimo;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        int int19 = lista7.pos;
        int int20 = lista7.pos;
        lista7.pos = '4';
        lista7.ultimo = (short) 10;
        lista7.pos = 1;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista19.primeiro;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.item = objArray26;
        lista0.primeiro = (byte) 100;
        int int30 = lista0.primeiro;
        int int31 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        int int16 = lista0.ultimo;
        int int17 = lista0.ultimo;
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        int int22 = lista0.pos;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.ultimo = '4';
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1L, 0.0f };
        lista33.item = objArray37;
        lista30.item = objArray37;
        lista28.item = objArray37;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista41.imprime();
        lista41.primeiro = '4';
        lista28.insere((java.lang.Object) lista41);
        lista23.insere((java.lang.Object) lista41);
        int int48 = lista41.primeiro;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista51.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.imprime();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 1L, 0.0f };
        lista54.item = objArray58;
        lista51.item = objArray58;
        lista49.item = objArray58;
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        lista62.imprime();
        lista62.primeiro = '4';
        lista49.insere((java.lang.Object) lista62);
        java.lang.Object[] objArray68 = lista49.item;
        lista41.item = objArray68;
        lista0.item = objArray68;
        int int71 = lista0.ultimo;
        java.lang.Class<?> wildcardClass72 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        java.lang.Object[] objArray12 = lista5.item;
        int int13 = lista5.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.primeiro = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        boolean boolean14 = lista10.vazia();
        lista5.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray16 = lista10.item;
        lista10.pos = 0;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.primeiro;
        lista19.pos = 100;
        java.lang.Object[] objArray25 = lista19.item;
        lista10.insere((java.lang.Object) objArray25);
        lista0.item = objArray25;
        lista0.pos = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        int int15 = lista12.ultimo;
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        int int24 = lista20.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        lista25.ultimo = '4';
        java.lang.Object[] objArray30 = lista25.item;
        lista20.item = objArray30;
        int int32 = lista20.primeiro;
        int int33 = lista20.primeiro;
        int int34 = lista20.ultimo;
        lista20.primeiro = 32;
        lista20.imprime();
        java.lang.Object[] objArray38 = lista20.item;
        lista0.insere((java.lang.Object) lista20);
        int int40 = lista20.ultimo;
        lista20.imprime();
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista42.imprime();
        lista42.primeiro = '4';
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        lista47.imprime();
        int int50 = lista47.ultimo;
        boolean boolean51 = lista47.vazia();
        lista42.insere((java.lang.Object) lista47);
        lista47.ultimo = 10;
        lista47.ultimo = ' ';
        lista20.insere((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        lista2.primeiro = '4';
        lista2.pos = 97;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.ultimo = 10;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        int int15 = lista13.pos;
        lista13.primeiro = 100;
        lista13.pos = (short) -1;
        int int20 = lista13.pos;
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        int int25 = lista22.ultimo;
        int int26 = lista22.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        lista27.ultimo = '4';
        java.lang.Object[] objArray32 = lista27.item;
        lista22.item = objArray32;
        int int34 = lista22.primeiro;
        int int35 = lista22.primeiro;
        int int36 = lista22.ultimo;
        lista22.imprime();
        int int38 = lista22.primeiro;
        lista13.insere((java.lang.Object) int38);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.primeiro;
        int int9 = lista5.primeiro;
        lista5.pos = (short) -1;
        java.lang.Object[] objArray12 = lista5.item;
        lista0.item = objArray12;
        lista0.imprime();
        int int15 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        int int15 = lista12.ultimo;
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        int int20 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        int int10 = lista7.ultimo;
        java.lang.Object[] objArray11 = lista7.item;
        lista0.item = objArray11;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        int int10 = lista8.primeiro;
        lista0.insere((java.lang.Object) int10);
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.ultimo;
        int int19 = lista15.pos;
        lista15.primeiro = 'a';
        java.lang.Object[] objArray22 = lista15.item;
        lista2.item = objArray22;
        int int24 = lista2.ultimo;
        lista2.ultimo = (short) 10;
        lista2.pos = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object obj6 = null;
        lista0.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.insere((java.lang.Object) objArray9);
        lista0.primeiro = 52;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        lista0.imprime();
        lista0.ultimo = (short) 0;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        int int26 = lista18.ultimo;
        java.lang.Object[] objArray27 = lista18.item;
        java.lang.Class<?> wildcardClass28 = lista18.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        boolean boolean15 = lista5.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        lista0.primeiro = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 0;
        lista5.pos = (short) 100;
        boolean boolean15 = lista5.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (short) 1;
        lista0.imprime();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        lista0.ultimo = 32;
        int int19 = lista0.primeiro;
        int int20 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        int int10 = lista6.ultimo;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista6.item = objArray12;
        lista6.ultimo = (-1);
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        lista10.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 10;
        lista15.insere((java.lang.Object) lista17);
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        int int24 = lista21.primeiro;
        int int25 = lista21.primeiro;
        lista17.insere((java.lang.Object) int25);
        java.lang.Object[] objArray27 = lista17.item;
        lista10.item = objArray27;
        lista0.item = objArray27;
        java.lang.Class<?> wildcardClass30 = objArray27.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.pos = (short) 0;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        int int5 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        int int5 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        boolean boolean17 = lista0.vazia();
        int int18 = lista0.pos;
        int int19 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        java.lang.Object[] objArray41 = lista38.item;
        lista38.primeiro = (byte) -1;
        java.lang.Object[] objArray44 = lista38.item;
        lista0.item = objArray44;
        java.lang.Class<?> wildcardClass46 = objArray44.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        lista8.primeiro = '4';
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        boolean boolean17 = lista13.vazia();
        lista8.insere((java.lang.Object) lista13);
        lista13.ultimo = 0;
        java.lang.Class<?> wildcardClass21 = lista13.getClass();
        lista0.insere((java.lang.Object) lista13);
        int int23 = lista0.pos;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        lista0.primeiro = 11;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.pos = 'a';
        int int25 = lista21.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        lista26.ultimo = '4';
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista33.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 1L, 0.0f };
        lista36.item = objArray40;
        lista33.item = objArray40;
        lista31.item = objArray40;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        lista44.primeiro = '4';
        lista31.insere((java.lang.Object) lista44);
        lista26.insere((java.lang.Object) lista44);
        java.lang.Object[] objArray51 = lista44.item;
        lista21.insere((java.lang.Object) objArray51);
        lista13.item = objArray51;
        boolean boolean54 = lista13.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.insere((java.lang.Object) objArray9);
        lista0.primeiro = 52;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        lista14.primeiro = '4';
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.ultimo;
        boolean boolean23 = lista19.vazia();
        lista14.insere((java.lang.Object) lista19);
        java.lang.Object[] objArray25 = lista19.item;
        java.lang.Object[] objArray26 = lista19.item;
        boolean boolean27 = lista19.vazia();
        lista19.pos = (-1);
        lista0.insere((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        int int19 = lista16.ultimo;
        lista16.ultimo = (byte) 10;
        lista16.primeiro = 100;
        lista16.pos = (short) 1;
        lista2.insere((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        int int7 = lista0.primeiro;
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 10;
        lista7.insere((java.lang.Object) lista9);
        lista9.primeiro = '4';
        lista0.insere((java.lang.Object) lista9);
        int int16 = lista9.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        boolean boolean12 = lista0.vazia();
        lista0.ultimo = 1;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        java.lang.Object[] objArray17 = lista15.item;
        lista15.ultimo = (byte) 1;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        lista24.primeiro = 100;
        java.lang.Object[] objArray29 = lista24.item;
        lista20.item = objArray29;
        lista15.item = objArray29;
        int int32 = lista15.primeiro;
        java.lang.Object[] objArray33 = lista15.item;
        lista0.item = objArray33;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.pos = 'a';
        int int30 = lista26.primeiro;
        lista18.insere((java.lang.Object) lista26);
        int int32 = lista18.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.pos = 'a';
        int int25 = lista21.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        lista26.ultimo = '4';
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista33.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 1L, 0.0f };
        lista36.item = objArray40;
        lista33.item = objArray40;
        lista31.item = objArray40;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        lista44.primeiro = '4';
        lista31.insere((java.lang.Object) lista44);
        lista26.insere((java.lang.Object) lista44);
        java.lang.Object[] objArray51 = lista44.item;
        lista21.insere((java.lang.Object) objArray51);
        lista13.item = objArray51;
        java.lang.Object[] objArray54 = lista13.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        int int15 = lista12.ultimo;
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        int int24 = lista20.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        lista25.ultimo = '4';
        java.lang.Object[] objArray30 = lista25.item;
        lista20.item = objArray30;
        int int32 = lista20.primeiro;
        int int33 = lista20.primeiro;
        int int34 = lista20.ultimo;
        lista20.primeiro = 32;
        lista20.imprime();
        java.lang.Object[] objArray38 = lista20.item;
        lista0.insere((java.lang.Object) lista20);
        int int40 = lista0.pos;
        boolean boolean41 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        lista12.ultimo = 10;
        lista10.insere((java.lang.Object) lista12);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        int int19 = lista16.primeiro;
        int int20 = lista16.primeiro;
        lista12.insere((java.lang.Object) int20);
        java.lang.Object[] objArray22 = lista12.item;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        int int26 = lista23.ultimo;
        lista23.imprime();
        lista12.insere((java.lang.Object) lista23);
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.ultimo;
        lista29.imprime();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 10;
        lista34.insere((java.lang.Object) lista36);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista40.imprime();
        int int43 = lista40.primeiro;
        int int44 = lista40.primeiro;
        lista36.insere((java.lang.Object) int44);
        java.lang.Object[] objArray46 = lista36.item;
        lista29.item = objArray46;
        lista29.primeiro = ' ';
        int int50 = lista29.pos;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista51.imprime();
        int int54 = lista51.ultimo;
        int int55 = lista51.pos;
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        lista56.imprime();
        lista56.ultimo = '4';
        java.lang.Object[] objArray61 = lista56.item;
        lista51.item = objArray61;
        int int63 = lista51.primeiro;
        int int64 = lista51.primeiro;
        int int65 = lista51.ultimo;
        lista51.primeiro = 32;
        lista51.imprime();
        java.lang.Object[] objArray69 = lista51.item;
        lista29.item = objArray69;
        lista12.item = objArray69;
        lista0.item = objArray69;
        int int73 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        int int21 = lista13.primeiro;
        int int22 = lista13.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        boolean boolean21 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        lista0.pos = (byte) 1;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        int int12 = lista8.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.ultimo = '4';
        java.lang.Object[] objArray18 = lista13.item;
        lista8.item = objArray18;
        lista0.insere((java.lang.Object) lista8);
        lista0.ultimo = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        lista5.pos = (short) -1;
        java.lang.Class<?> wildcardClass16 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1L, 0.0f };
        lista9.item = objArray13;
        lista6.item = objArray13;
        lista4.item = objArray13;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        lista17.primeiro = '4';
        lista4.insere((java.lang.Object) lista17);
        int int23 = lista17.primeiro;
        boolean boolean24 = lista17.vazia();
        int int25 = lista17.primeiro;
        lista17.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = (byte) 0;
        boolean boolean13 = lista5.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 0;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        lista0.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        int int19 = lista15.primeiro;
        lista15.ultimo = (byte) 100;
        lista2.insere((java.lang.Object) (byte) 100);
        lista2.ultimo = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        lista8.ultimo = '4';
        java.lang.Object[] objArray13 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        int int40 = lista0.ultimo;
        int int41 = lista0.ultimo;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        java.lang.Object[] objArray44 = lista42.item;
        lista42.ultimo = (byte) 1;
        lista42.pos = 100;
        int int49 = lista42.ultimo;
        lista0.insere((java.lang.Object) int49);
        java.lang.Object[] objArray51 = lista0.item;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista3.imprime();
        int int6 = lista3.primeiro;
        lista3.pos = 100;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        lista0.primeiro = (byte) -1;
        int int13 = lista0.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        int int8 = lista0.primeiro;
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        lista10.primeiro = 100;
        java.lang.Class<?> wildcardClass15 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray25 = lista18.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1L, 0.0f };
        lista33.item = objArray37;
        lista30.item = objArray37;
        lista28.item = objArray37;
        lista26.item = objArray37;
        boolean boolean42 = lista26.vazia();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        lista45.ultimo = 10;
        lista43.insere((java.lang.Object) lista45);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        lista49.imprime();
        int int52 = lista49.primeiro;
        int int53 = lista49.primeiro;
        lista45.insere((java.lang.Object) int53);
        java.lang.Object[] objArray55 = lista45.item;
        java.lang.Object[] objArray56 = lista45.item;
        java.lang.Object[] objArray57 = lista45.item;
        lista26.item = objArray57;
        int int59 = lista26.primeiro;
        lista18.insere((java.lang.Object) lista26);
        lista18.pos = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.primeiro;
        int int9 = lista5.primeiro;
        lista5.pos = (short) -1;
        java.lang.Object[] objArray12 = lista5.item;
        lista0.item = objArray12;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = '#';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = 10;
        lista20.insere((java.lang.Object) lista22);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.ultimo;
        lista26.ultimo = (byte) 10;
        lista26.primeiro = 100;
        lista22.insere((java.lang.Object) 100);
        java.lang.Object[] objArray35 = lista22.item;
        lista0.item = objArray35;
        lista0.pos = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 0;
        int int6 = lista0.ultimo;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        lista8.imprime();
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 10;
        lista13.insere((java.lang.Object) lista15);
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.primeiro;
        int int23 = lista19.primeiro;
        lista15.insere((java.lang.Object) int23);
        java.lang.Object[] objArray25 = lista15.item;
        lista8.item = objArray25;
        lista8.primeiro = ' ';
        int int29 = lista8.primeiro;
        int int30 = lista8.pos;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        lista31.ultimo = '4';
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista38.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 1L, 0.0f };
        lista41.item = objArray45;
        lista38.item = objArray45;
        lista36.item = objArray45;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        lista49.imprime();
        lista49.primeiro = '4';
        lista36.insere((java.lang.Object) lista49);
        lista31.insere((java.lang.Object) lista49);
        int int56 = lista49.primeiro;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        lista59.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.imprime();
        java.lang.Object[] objArray66 = new java.lang.Object[] { 1L, 0.0f };
        lista62.item = objArray66;
        lista59.item = objArray66;
        lista57.item = objArray66;
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        lista70.imprime();
        lista70.primeiro = '4';
        lista57.insere((java.lang.Object) lista70);
        java.lang.Object[] objArray76 = lista57.item;
        lista49.item = objArray76;
        lista8.item = objArray76;
        lista0.item = objArray76;
        java.lang.Class<?> wildcardClass80 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista3.imprime();
        int int6 = lista3.ultimo;
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        lista10.ultimo = 10;
        lista8.insere((java.lang.Object) lista10);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        int int18 = lista14.primeiro;
        lista10.insere((java.lang.Object) int18);
        java.lang.Object[] objArray20 = lista10.item;
        lista3.item = objArray20;
        lista3.primeiro = ' ';
        int int24 = lista3.primeiro;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 10;
        lista25.insere((java.lang.Object) lista27);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.primeiro;
        int int35 = lista31.primeiro;
        lista27.insere((java.lang.Object) int35);
        java.lang.Object[] objArray37 = lista27.item;
        java.lang.Object[] objArray38 = lista27.item;
        java.lang.Object[] objArray39 = lista27.item;
        lista3.item = objArray39;
        lista3.primeiro = 1;
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.imprime();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 1L, 0.0f };
        lista48.item = objArray52;
        lista45.item = objArray52;
        lista43.item = objArray52;
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        lista56.imprime();
        lista56.primeiro = '4';
        lista43.insere((java.lang.Object) lista56);
        java.lang.Object[] objArray62 = lista43.item;
        java.lang.Object[] objArray63 = lista43.item;
        int int64 = lista43.pos;
        lista3.insere((java.lang.Object) lista43);
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        lista67.imprime();
        int int70 = lista67.primeiro;
        int int71 = lista67.primeiro;
        lista67.pos = (short) -1;
        lista67.pos = (short) 1;
        int int76 = lista67.primeiro;
        lista3.insere((java.lang.Object) int76);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        int int10 = lista8.primeiro;
        lista0.insere((java.lang.Object) int10);
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        lista2.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista19.primeiro;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.item = objArray26;
        boolean boolean28 = lista0.vazia();
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.ultimo = 10;
        lista4.insere((java.lang.Object) lista6);
        int int10 = lista4.primeiro;
        java.lang.Object[] objArray11 = lista4.item;
        lista0.item = objArray11;
        int int13 = lista0.ultimo;
        lista0.imprime();
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.pos = '4';
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.insere((java.lang.Object) 100);
        lista5.primeiro = '4';
        lista5.ultimo = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        int int15 = lista12.ultimo;
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        int int24 = lista20.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        lista25.ultimo = '4';
        java.lang.Object[] objArray30 = lista25.item;
        lista20.item = objArray30;
        int int32 = lista20.primeiro;
        int int33 = lista20.primeiro;
        int int34 = lista20.ultimo;
        lista20.primeiro = 32;
        lista20.imprime();
        java.lang.Object[] objArray38 = lista20.item;
        lista0.insere((java.lang.Object) lista20);
        int int40 = lista20.ultimo;
        lista20.imprime();
        lista20.primeiro = 0;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        int int47 = lista44.primeiro;
        lista44.pos = 100;
        java.lang.Object[] objArray50 = lista44.item;
        lista44.imprime();
        lista44.pos = (short) 0;
        java.lang.Object[] objArray54 = lista44.item;
        lista20.insere((java.lang.Object) objArray54);
        boolean boolean56 = lista20.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.ultimo;
        java.lang.Object[] objArray9 = lista5.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        int int16 = lista10.pos;
        int int17 = lista10.ultimo;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        int int22 = lista18.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1L, 0.0f };
        lista23.item = objArray27;
        lista18.insere((java.lang.Object) objArray27);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.ultimo = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista37.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, 0.0f };
        lista40.item = objArray44;
        lista37.item = objArray44;
        lista35.item = objArray44;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        lista48.primeiro = '4';
        lista35.insere((java.lang.Object) lista48);
        lista30.insere((java.lang.Object) lista48);
        java.lang.Object[] objArray55 = lista48.item;
        lista18.insere((java.lang.Object) objArray55);
        lista10.item = objArray55;
        lista5.item = objArray55;
        int int59 = lista5.pos;
        lista0.insere((java.lang.Object) lista5);
        int int61 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.imprime();
        int int12 = lista9.primeiro;
        int int13 = lista9.primeiro;
        lista9.pos = (short) -1;
        lista9.pos = (short) 1;
        lista9.imprime();
        java.lang.Object[] objArray19 = lista9.item;
        lista0.item = objArray19;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        lista0.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.pos = (short) 0;
        lista0.ultimo = 1;
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        int int10 = lista7.ultimo;
        boolean boolean11 = lista7.vazia();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        lista12.ultimo = '4';
        lista7.insere((java.lang.Object) '4');
        int int18 = lista7.primeiro;
        int int19 = lista7.ultimo;
        lista7.pos = 'a';
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.primeiro = '4';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        boolean boolean31 = lista27.vazia();
        lista22.insere((java.lang.Object) lista27);
        java.lang.Object[] objArray33 = lista27.item;
        lista27.pos = 0;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista36.imprime();
        int int39 = lista36.primeiro;
        lista36.pos = 100;
        java.lang.Object[] objArray42 = lista36.item;
        lista27.insere((java.lang.Object) objArray42);
        lista7.item = objArray42;
        int int45 = lista7.pos;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.ultimo = 10;
        lista46.insere((java.lang.Object) lista48);
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        lista52.imprime();
        int int55 = lista52.primeiro;
        int int56 = lista52.primeiro;
        lista48.insere((java.lang.Object) int56);
        java.lang.Object[] objArray58 = lista48.item;
        java.lang.Object[] objArray59 = lista48.item;
        java.lang.Object[] objArray60 = lista48.item;
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        lista61.imprime();
        int int64 = lista61.primeiro;
        lista61.pos = 100;
        java.lang.Object[] objArray67 = lista61.item;
        lista48.item = objArray67;
        lista7.item = objArray67;
        lista0.item = objArray67;
        int int71 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.pos = 'a';
        int int9 = lista5.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.ultimo = '4';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1L, 0.0f };
        lista20.item = objArray24;
        lista17.item = objArray24;
        lista15.item = objArray24;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        lista28.primeiro = '4';
        lista15.insere((java.lang.Object) lista28);
        lista10.insere((java.lang.Object) lista28);
        java.lang.Object[] objArray35 = lista28.item;
        lista5.insere((java.lang.Object) objArray35);
        int int37 = lista5.ultimo;
        lista0.insere((java.lang.Object) lista5);
        lista5.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        int int5 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.ultimo;
        java.lang.Object[] objArray9 = lista5.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        int int16 = lista10.pos;
        int int17 = lista10.ultimo;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        int int22 = lista18.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1L, 0.0f };
        lista23.item = objArray27;
        lista18.insere((java.lang.Object) objArray27);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.ultimo = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista37.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, 0.0f };
        lista40.item = objArray44;
        lista37.item = objArray44;
        lista35.item = objArray44;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        lista48.primeiro = '4';
        lista35.insere((java.lang.Object) lista48);
        lista30.insere((java.lang.Object) lista48);
        java.lang.Object[] objArray55 = lista48.item;
        lista18.insere((java.lang.Object) objArray55);
        lista10.item = objArray55;
        lista5.item = objArray55;
        int int59 = lista5.pos;
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        lista61.imprime();
        int int64 = lista61.ultimo;
        int int65 = lista61.ultimo;
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        lista66.pos = 'a';
        int int70 = lista66.pos;
        ds.Lista lista71 = new ds.Lista();
        java.lang.Object[] objArray72 = lista71.item;
        lista71.imprime();
        lista71.ultimo = '4';
        ds.Lista lista76 = new ds.Lista();
        java.lang.Object[] objArray77 = lista76.item;
        ds.Lista lista78 = new ds.Lista();
        java.lang.Object[] objArray79 = lista78.item;
        lista78.imprime();
        ds.Lista lista81 = new ds.Lista();
        lista81.imprime();
        java.lang.Object[] objArray85 = new java.lang.Object[] { 1L, 0.0f };
        lista81.item = objArray85;
        lista78.item = objArray85;
        lista76.item = objArray85;
        ds.Lista lista89 = new ds.Lista();
        java.lang.Object[] objArray90 = lista89.item;
        lista89.imprime();
        lista89.primeiro = '4';
        lista76.insere((java.lang.Object) lista89);
        lista71.insere((java.lang.Object) lista89);
        java.lang.Object[] objArray96 = lista89.item;
        lista66.insere((java.lang.Object) objArray96);
        lista61.insere((java.lang.Object) objArray96);
        lista0.item = objArray96;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        lista18.pos = '#';
        int int28 = lista18.ultimo;
        int int29 = lista18.ultimo;
        lista18.primeiro = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        lista0.pos = 'a';
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        int int18 = lista0.pos;
        lista0.pos = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.ultimo;
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.primeiro = '4';
        lista10.insere((java.lang.Object) lista23);
        lista5.insere((java.lang.Object) lista23);
        java.lang.Object[] objArray30 = lista23.item;
        lista0.insere((java.lang.Object) objArray30);
        int int32 = lista0.ultimo;
        int int33 = lista0.primeiro;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        lista0.ultimo = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        int int21 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        int int7 = lista4.ultimo;
        lista4.imprime();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 10;
        lista9.insere((java.lang.Object) lista11);
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        int int19 = lista15.primeiro;
        lista11.insere((java.lang.Object) int19);
        java.lang.Object[] objArray21 = lista11.item;
        lista4.item = objArray21;
        lista4.primeiro = ' ';
        int int25 = lista4.primeiro;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 10;
        lista26.insere((java.lang.Object) lista28);
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.primeiro;
        int int36 = lista32.primeiro;
        lista28.insere((java.lang.Object) int36);
        java.lang.Object[] objArray38 = lista28.item;
        java.lang.Object[] objArray39 = lista28.item;
        java.lang.Object[] objArray40 = lista28.item;
        lista4.item = objArray40;
        lista0.item = objArray40;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        java.lang.Object[] objArray12 = lista5.item;
        lista5.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.pos = (short) 0;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 10;
        int int8 = lista5.ultimo;
        lista5.pos = (byte) 1;
        boolean boolean11 = lista5.vazia();
        boolean boolean12 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        int int14 = lista5.pos;
        boolean boolean15 = lista5.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.pos = 'a';
        int int9 = lista5.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.ultimo = '4';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1L, 0.0f };
        lista20.item = objArray24;
        lista17.item = objArray24;
        lista15.item = objArray24;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        lista28.primeiro = '4';
        lista15.insere((java.lang.Object) lista28);
        lista10.insere((java.lang.Object) lista28);
        java.lang.Object[] objArray35 = lista28.item;
        lista5.insere((java.lang.Object) objArray35);
        int int37 = lista5.ultimo;
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.insere((java.lang.Object) 100);
        lista5.pos = '4';
        java.lang.Object[] objArray15 = lista5.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        int int15 = lista0.pos;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        boolean boolean15 = lista13.vazia();
        int int16 = lista13.ultimo;
        java.lang.Object[] objArray17 = lista13.item;
        lista0.item = objArray17;
        lista0.pos = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        int int14 = lista2.primeiro;
        int int15 = lista2.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista5.pos;
        int int12 = lista5.ultimo;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        int int17 = lista13.pos;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.ultimo = '4';
        java.lang.Object[] objArray23 = lista18.item;
        lista13.item = objArray23;
        int int25 = lista13.primeiro;
        int int26 = lista13.primeiro;
        int int27 = lista13.ultimo;
        lista5.insere((java.lang.Object) int27);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        int int10 = lista6.ultimo;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista6.item = objArray12;
        lista6.ultimo = (-1);
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 10;
        lista18.insere((java.lang.Object) lista20);
        lista20.primeiro = (short) 100;
        int int26 = lista20.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista6.insere((java.lang.Object) lista20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.ultimo;
        int int10 = lista6.ultimo;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista6.item = objArray12;
        lista6.ultimo = (-1);
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        lista6.pos = 'a';
        int int20 = lista6.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        java.lang.Object[] objArray12 = lista5.item;
        boolean boolean13 = lista5.vazia();
        java.lang.Class<?> wildcardClass14 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.primeiro = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        boolean boolean14 = lista10.vazia();
        lista5.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray16 = lista10.item;
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        lista10.pos = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.primeiro = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        boolean boolean14 = lista10.vazia();
        lista5.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray16 = lista10.item;
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        int int19 = lista10.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        boolean boolean12 = lista10.vazia();
        lista10.pos = (short) 0;
        int int15 = lista10.pos;
        int int16 = lista10.ultimo;
        lista10.ultimo = (short) 0;
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.primeiro = '4';
        lista10.pos = (-1);
        lista10.insere((java.lang.Object) 1L);
        lista10.imprime();
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        lista0.ultimo = 0;
        lista0.pos = (short) 10;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = 100;
        int int7 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        lista0.pos = (byte) 10;
        lista0.primeiro = '4';
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.ultimo = 10;
        int int20 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.insere((java.lang.Object) objArray9);
        lista0.primeiro = 52;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        lista8.ultimo = '4';
        java.lang.Object[] objArray13 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        boolean boolean15 = lista8.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        lista0.pos = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.ultimo = '4';
        java.lang.Object[] objArray15 = lista10.item;
        lista10.primeiro = '4';
        int int18 = lista10.pos;
        java.lang.Object[] objArray19 = lista10.item;
        lista0.item = objArray19;
        int int21 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        java.lang.Object[] objArray12 = lista5.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        java.lang.Object[] objArray15 = lista13.item;
        lista13.ultimo = (byte) 1;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        int int24 = lista22.pos;
        lista22.primeiro = 100;
        java.lang.Object[] objArray27 = lista22.item;
        lista18.item = objArray27;
        lista13.item = objArray27;
        lista5.item = objArray27;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.primeiro = '4';
        lista10.pos = (-1);
        lista10.insere((java.lang.Object) 1L);
        lista10.imprime();
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        lista0.imprime();
        int int23 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.primeiro = 11;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.pos = (byte) 10;
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        lista0.pos = (byte) 1;
        int int9 = lista0.ultimo;
        lista0.pos = 32;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        lista18.pos = (byte) 1;
        int int27 = lista18.pos;
        java.lang.Class<?> wildcardClass28 = lista18.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.ultimo;
        int int25 = lista2.primeiro;
        lista2.primeiro = ' ';
        boolean boolean28 = lista2.vazia();
        lista2.primeiro = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.primeiro;
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        lista0.insere((java.lang.Object) 32);
        lista0.pos = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        int int8 = lista0.pos;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        int int7 = lista4.ultimo;
        lista4.imprime();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 10;
        lista9.insere((java.lang.Object) lista11);
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        int int19 = lista15.primeiro;
        lista11.insere((java.lang.Object) int19);
        java.lang.Object[] objArray21 = lista11.item;
        lista4.item = objArray21;
        lista4.primeiro = ' ';
        int int25 = lista4.primeiro;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 10;
        lista26.insere((java.lang.Object) lista28);
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.primeiro;
        int int36 = lista32.primeiro;
        lista28.insere((java.lang.Object) int36);
        java.lang.Object[] objArray38 = lista28.item;
        java.lang.Object[] objArray39 = lista28.item;
        java.lang.Object[] objArray40 = lista28.item;
        lista4.item = objArray40;
        lista0.item = objArray40;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        boolean boolean17 = lista0.vazia();
        boolean boolean18 = lista0.vazia();
        lista0.pos = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        lista0.pos = (short) 0;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.pos = 52;
        lista0.imprime();
        int int14 = lista0.ultimo;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        lista0.ultimo = 100;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista6.primeiro;
        int int26 = lista6.ultimo;
        lista0.insere((java.lang.Object) lista6);
        int int28 = lista0.primeiro;
        int int29 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        lista7.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        int int15 = lista12.ultimo;
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray18 = lista12.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        int int24 = lista20.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        lista25.ultimo = '4';
        java.lang.Object[] objArray30 = lista25.item;
        lista20.item = objArray30;
        int int32 = lista20.primeiro;
        int int33 = lista20.primeiro;
        int int34 = lista20.ultimo;
        lista20.primeiro = 32;
        lista20.imprime();
        java.lang.Object[] objArray38 = lista20.item;
        lista0.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass40 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        lista0.ultimo = (short) 10;
        lista0.primeiro = (byte) 100;
        boolean boolean29 = lista0.vazia();
        int int30 = lista0.ultimo;
        int int31 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.ultimo;
        int int25 = lista2.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        lista0.ultimo = (-1);
        int int10 = lista0.pos;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.ultimo;
        lista0.ultimo = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.ultimo = (byte) 1;
        lista0.ultimo = 100;
        int int25 = lista0.pos;
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object obj6 = null;
        lista0.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista0.insere((java.lang.Object) lista8);
        int int11 = lista8.ultimo;
        boolean boolean12 = lista8.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        lista13.ultimo = (byte) 1;
        int int23 = lista13.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.ultimo;
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 10;
        lista24.insere((java.lang.Object) lista26);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        int int33 = lista30.primeiro;
        int int34 = lista30.primeiro;
        lista26.insere((java.lang.Object) int34);
        java.lang.Object[] objArray36 = lista26.item;
        lista19.item = objArray36;
        lista19.primeiro = ' ';
        int int40 = lista19.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista41.imprime();
        int int44 = lista41.ultimo;
        int int45 = lista41.pos;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        lista46.imprime();
        lista46.ultimo = '4';
        java.lang.Object[] objArray51 = lista46.item;
        lista41.item = objArray51;
        int int53 = lista41.primeiro;
        int int54 = lista41.primeiro;
        int int55 = lista41.ultimo;
        lista41.primeiro = 32;
        lista41.imprime();
        java.lang.Object[] objArray59 = lista41.item;
        lista19.item = objArray59;
        lista2.item = objArray59;
        java.lang.Class<?> wildcardClass62 = objArray59.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        int int13 = lista11.pos;
        lista11.primeiro = 100;
        lista11.pos = (short) -1;
        int int18 = lista11.pos;
        int int19 = lista11.pos;
        lista11.imprime();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        int int24 = lista21.ultimo;
        lista21.imprime();
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 10;
        lista26.insere((java.lang.Object) lista28);
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.primeiro;
        int int36 = lista32.primeiro;
        lista28.insere((java.lang.Object) int36);
        java.lang.Object[] objArray38 = lista28.item;
        lista21.item = objArray38;
        lista11.item = objArray38;
        lista0.item = objArray38;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = '#';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = 10;
        lista20.insere((java.lang.Object) lista22);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.ultimo;
        lista26.ultimo = (byte) 10;
        lista26.primeiro = 100;
        lista22.insere((java.lang.Object) 100);
        java.lang.Object[] objArray35 = lista22.item;
        lista0.item = objArray35;
        int int37 = lista0.primeiro;
        java.lang.Object[] objArray38 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray8 = null;
        lista0.item = objArray8;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = '4';
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.primeiro = '4';
        lista5.pos = (-1);
        lista5.pos = (byte) 10;
        boolean boolean14 = lista5.vazia();
        lista0.insere((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        int int7 = lista4.ultimo;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        lista8.primeiro = 100;
        java.lang.Object[] objArray13 = lista8.item;
        lista4.item = objArray13;
        lista0.insere((java.lang.Object) lista4);
        int int16 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.ultimo = 52;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        lista0.primeiro = (short) -1;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        boolean boolean3 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        java.lang.Object[] objArray18 = lista0.item;
        lista0.imprime();
        int int20 = lista0.pos;
        int int21 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        int int25 = lista0.pos;
        boolean boolean26 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista6.primeiro;
        int int26 = lista6.ultimo;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.ultimo;
        int int32 = lista28.ultimo;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista28.item = objArray34;
        java.lang.Object[] objArray36 = lista28.item;
        lista28.primeiro = (-1);
        lista6.insere((java.lang.Object) lista28);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista40.imprime();
        int int43 = lista40.ultimo;
        int int44 = lista40.pos;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        lista45.ultimo = '4';
        java.lang.Object[] objArray50 = lista45.item;
        lista40.item = objArray50;
        int int52 = lista40.primeiro;
        int int53 = lista40.primeiro;
        int int54 = lista40.ultimo;
        lista40.primeiro = 32;
        int int57 = lista40.pos;
        int int58 = lista40.primeiro;
        lista28.insere((java.lang.Object) int58);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 32 + "'", int58 == 32);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        boolean boolean14 = lista2.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.ultimo;
        int int19 = lista15.pos;
        lista15.primeiro = 'a';
        java.lang.Object[] objArray22 = lista15.item;
        lista2.item = objArray22;
        int int24 = lista2.ultimo;
        java.lang.Object obj25 = null;
        lista2.insere(obj25);
        lista2.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = '4';
        lista0.ultimo = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista11.pos = (short) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.ultimo = (byte) 1;
        lista0.ultimo = 100;
        java.lang.Object[] objArray25 = lista0.item;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 0;
        lista5.imprime();
        boolean boolean14 = lista5.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, 0.0f };
        lista19.item = objArray23;
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista12.item = objArray23;
        int int28 = lista12.ultimo;
        lista12.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean32 = lista0.vazia();
        lista0.imprime();
        int int34 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, 0.0f };
        lista19.item = objArray23;
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista12.item = objArray23;
        int int28 = lista12.ultimo;
        lista12.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean32 = lista0.vazia();
        lista0.imprime();
        boolean boolean34 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        lista0.primeiro = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1L, 0.0f };
        lista29.item = objArray33;
        lista26.item = objArray33;
        lista24.item = objArray33;
        lista22.item = objArray33;
        lista14.item = objArray33;
        int int39 = lista14.pos;
        boolean boolean40 = lista14.vazia();
        lista2.insere((java.lang.Object) boolean40);
        int int42 = lista2.pos;
        int int43 = lista2.ultimo;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        lista46.imprime();
        ds.Lista lista49 = new ds.Lista();
        lista49.imprime();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 1L, 0.0f };
        lista49.item = objArray53;
        lista46.item = objArray53;
        lista44.item = objArray53;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        lista57.imprime();
        lista57.primeiro = '4';
        lista44.insere((java.lang.Object) lista57);
        java.lang.Object[] objArray63 = lista44.item;
        java.lang.Object[] objArray64 = lista44.item;
        boolean boolean65 = lista44.vazia();
        lista2.insere((java.lang.Object) boolean65);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 12 + "'", int43 == 12);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        boolean boolean25 = lista0.vazia();
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.primeiro;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        int int33 = lista26.pos;
        lista0.insere((java.lang.Object) lista26);
        java.lang.Class<?> wildcardClass35 = lista26.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 0;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        lista2.primeiro = '4';
        lista2.primeiro = 32;
        lista2.primeiro = 'a';
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        boolean boolean16 = lista0.vazia();
        lista0.ultimo = 32;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 10;
        lista19.insere((java.lang.Object) lista21);
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista25.imprime();
        int int28 = lista25.primeiro;
        int int29 = lista25.primeiro;
        lista21.insere((java.lang.Object) int29);
        lista21.primeiro = (byte) 0;
        lista21.pos = 'a';
        int int35 = lista21.pos;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista36.imprime();
        int int39 = lista36.ultimo;
        int int40 = lista36.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista41.imprime();
        lista41.ultimo = '4';
        java.lang.Object[] objArray46 = lista41.item;
        lista36.item = objArray46;
        int int48 = lista36.primeiro;
        int int49 = lista36.primeiro;
        int int50 = lista36.ultimo;
        lista36.primeiro = 32;
        lista36.imprime();
        java.lang.Object[] objArray54 = lista36.item;
        lista36.imprime();
        lista21.insere((java.lang.Object) lista36);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista36);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        int int7 = lista4.ultimo;
        int int8 = lista4.ultimo;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista4.item = objArray10;
        lista0.item = objArray10;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 10;
        int int8 = lista5.ultimo;
        lista5.pos = (byte) 1;
        boolean boolean11 = lista5.vazia();
        boolean boolean12 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 0.0f };
        lista21.item = objArray25;
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista14.item = objArray25;
        lista14.imprime();
        lista14.ultimo = (short) 0;
        lista0.insere((java.lang.Object) (short) 0);
        int int34 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        int int21 = lista13.primeiro;
        lista13.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        int int16 = lista2.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.ultimo;
        int int21 = lista17.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.ultimo = '4';
        java.lang.Object[] objArray27 = lista22.item;
        lista17.item = objArray27;
        int int29 = lista17.primeiro;
        int int30 = lista17.primeiro;
        int int31 = lista17.ultimo;
        lista17.primeiro = 32;
        lista17.imprime();
        java.lang.Object[] objArray35 = lista17.item;
        lista17.imprime();
        lista2.insere((java.lang.Object) lista17);
        int int38 = lista2.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 12 + "'", int38 == 12);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.primeiro;
        lista8.pos = 100;
        java.lang.Object[] objArray14 = lista8.item;
        lista8.imprime();
        lista8.pos = (short) 0;
        lista8.imprime();
        int int19 = lista8.pos;
        lista8.primeiro = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.primeiro = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.imprime();
        int int11 = lista0.pos;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = 100;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.primeiro = 'a';
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.ultimo;
        int int12 = lista8.ultimo;
        int int13 = lista8.pos;
        lista8.pos = 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 10;
        lista16.ultimo = (short) -1;
        lista16.ultimo = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        java.lang.Object[] objArray26 = lista23.item;
        lista16.item = objArray26;
        lista8.item = objArray26;
        lista0.item = objArray26;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        int int16 = lista2.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        boolean boolean19 = lista17.vazia();
        java.lang.Object[] objArray20 = lista17.item;
        java.lang.Object[] objArray21 = lista17.item;
        lista2.insere((java.lang.Object) lista17);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        int int26 = lista23.ultimo;
        lista23.imprime();
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        lista30.ultimo = 10;
        lista28.insere((java.lang.Object) lista30);
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista34.imprime();
        int int37 = lista34.primeiro;
        int int38 = lista34.primeiro;
        lista30.insere((java.lang.Object) int38);
        java.lang.Object[] objArray40 = lista30.item;
        lista23.item = objArray40;
        lista23.primeiro = ' ';
        int int44 = lista23.primeiro;
        int int45 = lista23.pos;
        java.lang.Class<?> wildcardClass46 = lista23.getClass();
        lista2.insere((java.lang.Object) wildcardClass46);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        lista0.ultimo = 100;
        int int11 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista19.primeiro;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.item = objArray26;
        lista0.primeiro = (byte) 100;
        lista0.pos = '#';
        lista0.primeiro = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        int int16 = lista2.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.ultimo;
        int int21 = lista17.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        lista22.ultimo = '4';
        java.lang.Object[] objArray27 = lista22.item;
        lista17.item = objArray27;
        int int29 = lista17.primeiro;
        int int30 = lista17.primeiro;
        int int31 = lista17.ultimo;
        lista17.primeiro = 32;
        lista17.imprime();
        java.lang.Object[] objArray35 = lista17.item;
        lista17.imprime();
        lista2.insere((java.lang.Object) lista17);
        lista17.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.primeiro = 52;
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        boolean boolean19 = lista0.vazia();
        lista0.primeiro = 'a';
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista22.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1L, 0.0f };
        lista25.item = objArray29;
        lista22.item = objArray29;
        lista0.insere((java.lang.Object) objArray29);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 0.0]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        int int40 = lista0.ultimo;
        int int41 = lista0.ultimo;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        java.lang.Object[] objArray44 = lista42.item;
        lista42.ultimo = (byte) 1;
        lista42.pos = 100;
        int int49 = lista42.ultimo;
        lista0.insere((java.lang.Object) int49);
        java.lang.Object[] objArray51 = lista0.item;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = (byte) 0;
        int int13 = lista5.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        int int12 = lista0.pos;
        lista0.pos = 97;
        int int15 = lista0.ultimo;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        lista0.imprime();
        lista0.pos = (-1);
        int int12 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.imprime();
        int int16 = lista0.primeiro;
        lista0.primeiro = 52;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.ultimo;
        int int15 = lista11.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista11.item = objArray17;
        lista0.item = objArray17;
        int int20 = lista0.ultimo;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.pos = 10;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.ultimo = (byte) 1;
        lista0.ultimo = 100;
        java.lang.Object[] objArray25 = lista0.item;
        lista0.primeiro = (short) -1;
        int int28 = lista0.ultimo;
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.ultimo;
        int int25 = lista2.primeiro;
        int int26 = lista2.pos;
        lista2.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista7.item = objArray15;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray19 = lista7.item;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        boolean boolean24 = lista20.vazia();
        lista20.pos = (byte) 0;
        int int27 = lista20.ultimo;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        lista28.pos = 100;
        java.lang.Object[] objArray34 = lista28.item;
        int int35 = lista28.pos;
        int int36 = lista28.ultimo;
        lista28.imprime();
        lista20.insere((java.lang.Object) lista28);
        java.lang.Object[] objArray39 = lista20.item;
        lista7.item = objArray39;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        java.lang.Object[] objArray43 = lista41.item;
        lista41.pos = 1;
        java.lang.Object[] objArray46 = lista41.item;
        lista7.item = objArray46;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        int int4 = lista0.ultimo;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        int int40 = lista0.ultimo;
        int int41 = lista0.ultimo;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        java.lang.Object[] objArray44 = lista42.item;
        lista42.ultimo = (byte) 1;
        lista42.pos = 100;
        int int49 = lista42.ultimo;
        lista0.insere((java.lang.Object) int49);
        lista0.pos = (short) 100;
        java.lang.Object[] objArray53 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.ultimo = (short) 10;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        int int21 = lista13.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        lista5.pos = (short) -1;
        int int16 = lista5.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 0.0f };
        lista7.item = objArray11;
        lista4.item = objArray11;
        lista2.item = objArray11;
        lista0.item = objArray11;
        int int16 = lista0.ultimo;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        int int14 = lista12.primeiro;
        int int15 = lista12.primeiro;
        java.lang.Object[] objArray16 = lista12.item;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.primeiro;
        int int21 = lista17.primeiro;
        lista17.pos = (short) -1;
        java.lang.Object[] objArray24 = lista17.item;
        lista12.item = objArray24;
        lista12.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 10;
        lista27.ultimo = (short) -1;
        int int32 = lista27.ultimo;
        lista27.imprime();
        lista27.primeiro = (byte) -1;
        lista12.insere((java.lang.Object) (byte) -1);
        lista5.insere((java.lang.Object) lista12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.ultimo = 52;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = 100;
        lista0.ultimo = 0;
        lista0.ultimo = 11;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        lista13.imprime();
        lista2.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        lista13.ultimo = '#';
        lista13.ultimo = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 10;
        int int8 = lista5.ultimo;
        lista5.pos = (byte) 1;
        boolean boolean11 = lista5.vazia();
        boolean boolean12 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        boolean boolean14 = lista0.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        java.lang.Object[] objArray17 = lista15.item;
        lista15.ultimo = (byte) 1;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        lista24.primeiro = 100;
        java.lang.Object[] objArray29 = lista24.item;
        lista20.item = objArray29;
        lista15.item = objArray29;
        int int32 = lista15.primeiro;
        lista0.insere((java.lang.Object) int32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        lista5.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = 100;
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        int int3 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        boolean boolean7 = lista0.vazia();
        lista0.insere((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.imprime();
        int int19 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        int int6 = lista4.pos;
        lista4.primeiro = 100;
        java.lang.Object[] objArray9 = lista4.item;
        lista0.item = objArray9;
        int int11 = lista0.pos;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        lista12.primeiro = '4';
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.ultimo;
        boolean boolean21 = lista17.vazia();
        lista12.insere((java.lang.Object) lista17);
        lista17.ultimo = 0;
        lista17.imprime();
        java.lang.Object[] objArray26 = lista17.item;
        lista0.insere((java.lang.Object) objArray26);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        lista2.pos = 2;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        int int11 = lista8.primeiro;
        lista8.pos = 100;
        int int14 = lista8.pos;
        int int15 = lista8.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        int int19 = lista16.ultimo;
        int int20 = lista16.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 0.0f };
        lista21.item = objArray25;
        lista16.insere((java.lang.Object) objArray25);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        lista28.ultimo = '4';
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 1L, 0.0f };
        lista38.item = objArray42;
        lista35.item = objArray42;
        lista33.item = objArray42;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        lista46.imprime();
        lista46.primeiro = '4';
        lista33.insere((java.lang.Object) lista46);
        lista28.insere((java.lang.Object) lista46);
        java.lang.Object[] objArray53 = lista46.item;
        lista16.insere((java.lang.Object) objArray53);
        lista8.item = objArray53;
        lista2.item = objArray53;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object obj6 = null;
        lista0.insere(obj6);
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1L, 0.0f };
        lista12.item = objArray16;
        lista9.item = objArray16;
        lista7.item = objArray16;
        lista5.item = objArray16;
        int int21 = lista5.ultimo;
        java.lang.Object[] objArray22 = lista5.item;
        lista0.item = objArray22;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 0.0]");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        lista25.primeiro = 100;
        lista25.ultimo = (short) 10;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        lista32.primeiro = '4';
        lista32.pos = (-1);
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista44.imprime();
        int int47 = lista44.ultimo;
        boolean boolean48 = lista44.vazia();
        lista39.insere((java.lang.Object) lista44);
        java.lang.Object[] objArray50 = lista44.item;
        lista32.item = objArray50;
        lista25.item = objArray50;
        lista0.item = objArray50;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.pos = (-1);
        lista0.insere((java.lang.Object) 1L);
        lista0.pos = (byte) 10;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        lista11.ultimo = '4';
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 0.0f };
        lista21.item = objArray25;
        lista18.item = objArray25;
        lista16.item = objArray25;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        lista29.primeiro = '4';
        lista16.insere((java.lang.Object) lista29);
        lista11.insere((java.lang.Object) lista29);
        int int36 = lista29.primeiro;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1L, 0.0f };
        lista42.item = objArray46;
        lista39.item = objArray46;
        lista37.item = objArray46;
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        lista50.imprime();
        lista50.primeiro = '4';
        lista37.insere((java.lang.Object) lista50);
        java.lang.Object[] objArray56 = lista37.item;
        lista29.item = objArray56;
        lista0.insere((java.lang.Object) lista29);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        int int17 = lista14.primeiro;
        lista14.pos = 100;
        java.lang.Object[] objArray20 = lista14.item;
        lista5.insere((java.lang.Object) objArray20);
        lista5.ultimo = 32;
        boolean boolean24 = lista5.vazia();
        lista5.ultimo = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista19.primeiro;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.item = objArray26;
        int int28 = lista0.ultimo;
        lista0.primeiro = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        lista0.ultimo = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.pos = '4';
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        java.lang.Object[] objArray31 = lista29.item;
        lista29.ultimo = (byte) 1;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista34.imprime();
        int int37 = lista34.ultimo;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        lista38.primeiro = 100;
        java.lang.Object[] objArray43 = lista38.item;
        lista34.item = objArray43;
        lista29.item = objArray43;
        int int46 = lista29.primeiro;
        java.lang.Object[] objArray47 = lista29.item;
        lista0.insere((java.lang.Object) objArray47);
        lista0.imprime();
        int int50 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = (byte) 0;
        lista0.ultimo = 12;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        boolean boolean5 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1L, 0.0f };
        lista13.item = objArray17;
        lista10.item = objArray17;
        lista8.item = objArray17;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        lista21.primeiro = '4';
        lista8.insere((java.lang.Object) lista21);
        int int27 = lista21.primeiro;
        boolean boolean28 = lista21.vazia();
        lista0.insere((java.lang.Object) boolean28);
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        lista0.pos = 'a';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        lista15.primeiro = '4';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        boolean boolean24 = lista20.vazia();
        lista15.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray26 = lista20.item;
        lista20.pos = 0;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.primeiro;
        lista29.pos = 100;
        java.lang.Object[] objArray35 = lista29.item;
        lista20.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        lista0.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        lista2.primeiro = '4';
        lista2.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 10;
        lista5.ultimo = ' ';
        int int15 = lista5.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        int int19 = lista16.primeiro;
        int int20 = lista16.primeiro;
        lista16.pos = (short) -1;
        java.lang.Object[] objArray23 = lista16.item;
        java.lang.Object[] objArray24 = lista16.item;
        boolean boolean25 = lista16.vazia();
        lista5.insere((java.lang.Object) lista16);
        lista16.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.ultimo = (-1);
        int int13 = lista0.ultimo;
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.pos = 52;
        lista0.imprime();
        int int14 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        lista5.pos = (-1);
        lista5.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        lista2.pos = (short) 10;
        java.lang.Object obj17 = null;
        lista2.insere(obj17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.primeiro = '4';
        lista10.pos = (-1);
        lista10.insere((java.lang.Object) 1L);
        lista10.imprime();
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        lista0.imprime();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        ds.Lista lista25 = new ds.Lista();
        lista25.ultimo = 10;
        lista23.insere((java.lang.Object) lista25);
        int int29 = lista23.ultimo;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        int int33 = lista30.ultimo;
        boolean boolean34 = lista30.vazia();
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        lista35.ultimo = '4';
        lista30.insere((java.lang.Object) '4');
        int int41 = lista30.primeiro;
        int int42 = lista30.ultimo;
        lista30.pos = 'a';
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista45.imprime();
        lista45.primeiro = '4';
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        lista50.imprime();
        int int53 = lista50.ultimo;
        boolean boolean54 = lista50.vazia();
        lista45.insere((java.lang.Object) lista50);
        java.lang.Object[] objArray56 = lista50.item;
        lista50.pos = 0;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        lista59.imprime();
        int int62 = lista59.primeiro;
        lista59.pos = 100;
        java.lang.Object[] objArray65 = lista59.item;
        lista50.insere((java.lang.Object) objArray65);
        lista30.item = objArray65;
        int int68 = lista30.pos;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        ds.Lista lista71 = new ds.Lista();
        lista71.ultimo = 10;
        lista69.insere((java.lang.Object) lista71);
        ds.Lista lista75 = new ds.Lista();
        java.lang.Object[] objArray76 = lista75.item;
        lista75.imprime();
        int int78 = lista75.primeiro;
        int int79 = lista75.primeiro;
        lista71.insere((java.lang.Object) int79);
        java.lang.Object[] objArray81 = lista71.item;
        java.lang.Object[] objArray82 = lista71.item;
        java.lang.Object[] objArray83 = lista71.item;
        ds.Lista lista84 = new ds.Lista();
        java.lang.Object[] objArray85 = lista84.item;
        lista84.imprime();
        int int87 = lista84.primeiro;
        lista84.pos = 100;
        java.lang.Object[] objArray90 = lista84.item;
        lista71.item = objArray90;
        lista30.item = objArray90;
        lista23.item = objArray90;
        lista0.item = objArray90;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(objArray90);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = '4';
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        lista0.primeiro = 'a';
        int int15 = lista0.pos;
        lista0.pos = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        int int11 = lista5.pos;
        int int12 = lista5.ultimo;
        lista5.pos = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        lista0.ultimo = (short) 10;
        lista0.pos = 1;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.primeiro = '4';
        lista10.pos = (-1);
        lista10.insere((java.lang.Object) 1L);
        lista10.imprime();
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        java.lang.Object[] objArray22 = lista0.item;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        int int26 = lista23.ultimo;
        int int27 = lista23.ultimo;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista23.item = objArray29;
        int int31 = lista23.primeiro;
        java.lang.Class<?> wildcardClass32 = lista23.getClass();
        lista0.insere((java.lang.Object) wildcardClass32);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        lista18.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        int int22 = lista0.pos;
        java.lang.Object[] objArray23 = lista0.item;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista24.imprime();
        int int27 = lista24.primeiro;
        int int28 = lista24.primeiro;
        lista24.pos = (short) -1;
        java.lang.Object[] objArray31 = lista24.item;
        lista0.item = objArray31;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista0.item = objArray6;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        lista10.ultimo = (byte) 10;
        boolean boolean16 = lista10.vazia();
        int int17 = lista10.primeiro;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        int int22 = lista18.pos;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.ultimo = '4';
        java.lang.Object[] objArray28 = lista23.item;
        lista18.item = objArray28;
        lista10.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        int int6 = lista0.primeiro;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        int int9 = lista5.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.ultimo = '4';
        java.lang.Object[] objArray15 = lista10.item;
        lista5.item = objArray15;
        int int17 = lista5.primeiro;
        int int18 = lista5.primeiro;
        int int19 = lista5.ultimo;
        lista5.primeiro = 32;
        lista5.imprime();
        java.lang.Object[] objArray23 = lista5.item;
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        int int40 = lista0.ultimo;
        int int41 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        lista0.pos = (byte) 1;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        lista14.primeiro = '4';
        lista14.pos = (-1);
        lista14.insere((java.lang.Object) 1L);
        lista14.imprime();
        java.lang.Object[] objArray24 = lista14.item;
        lista5.item = objArray24;
        lista5.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, 0.0f };
        lista19.item = objArray23;
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista12.item = objArray23;
        int int28 = lista12.ultimo;
        lista12.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass32 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.insere((java.lang.Object) 100);
        lista5.primeiro = '4';
        boolean boolean15 = lista5.vazia();
        lista5.ultimo = '#';
        lista5.pos = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.primeiro = '#';
        boolean boolean7 = lista0.vazia();
        lista0.pos = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        lista18.pos = '#';
        int int28 = lista18.ultimo;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        boolean boolean31 = lista29.vazia();
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        int int35 = lista32.primeiro;
        lista32.pos = 100;
        java.lang.Object[] objArray38 = lista32.item;
        lista29.item = objArray38;
        lista18.item = objArray38;
        int int41 = lista18.pos;
        lista18.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        lista0.pos = (short) 1;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista19.primeiro;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.item = objArray26;
        lista0.primeiro = (byte) 100;
        int int30 = lista0.primeiro;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.ultimo;
        lista31.ultimo = (byte) 10;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1L, 0.0f };
        lista42.item = objArray46;
        lista39.item = objArray46;
        lista37.item = objArray46;
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        lista50.imprime();
        lista50.primeiro = '4';
        lista37.insere((java.lang.Object) lista50);
        int int56 = lista50.primeiro;
        java.lang.Object[] objArray57 = lista50.item;
        lista31.item = objArray57;
        java.lang.Object[] objArray59 = lista31.item;
        lista0.item = objArray59;
        java.lang.Object[] objArray61 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        int int22 = lista0.pos;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        lista23.ultimo = '4';
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1L, 0.0f };
        lista33.item = objArray37;
        lista30.item = objArray37;
        lista28.item = objArray37;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista41.imprime();
        lista41.primeiro = '4';
        lista28.insere((java.lang.Object) lista41);
        lista23.insere((java.lang.Object) lista41);
        int int48 = lista41.primeiro;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista51.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.imprime();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 1L, 0.0f };
        lista54.item = objArray58;
        lista51.item = objArray58;
        lista49.item = objArray58;
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        lista62.imprime();
        lista62.primeiro = '4';
        lista49.insere((java.lang.Object) lista62);
        java.lang.Object[] objArray68 = lista49.item;
        lista41.item = objArray68;
        lista0.item = objArray68;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        int int10 = lista7.ultimo;
        java.lang.Object[] objArray11 = lista7.item;
        lista0.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        boolean boolean22 = lista18.vazia();
        lista13.insere((java.lang.Object) lista18);
        lista18.ultimo = 10;
        lista18.ultimo = ' ';
        lista0.insere((java.lang.Object) lista18);
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.primeiro = '4';
        lista10.pos = (-1);
        lista10.insere((java.lang.Object) 1L);
        lista10.imprime();
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        java.lang.Object[] objArray22 = lista0.item;
        int int23 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 10;
        lista16.ultimo = (short) -1;
        lista16.ultimo = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        java.lang.Object[] objArray26 = lista23.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 1L, 0.0f };
        lista27.item = objArray31;
        lista23.item = objArray31;
        lista16.insere((java.lang.Object) lista23);
        java.lang.Object[] objArray35 = lista23.item;
        lista0.item = objArray35;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 0.0]");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 100;
        boolean boolean14 = lista5.vazia();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 10;
        lista15.insere((java.lang.Object) lista17);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista5.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista24.imprime();
        int int27 = lista24.ultimo;
        lista24.imprime();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 10;
        lista29.insere((java.lang.Object) lista31);
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        int int38 = lista35.primeiro;
        int int39 = lista35.primeiro;
        lista31.insere((java.lang.Object) int39);
        java.lang.Object[] objArray41 = lista31.item;
        lista24.item = objArray41;
        lista24.primeiro = ' ';
        lista24.pos = 10;
        lista24.pos = (byte) 0;
        lista5.insere((java.lang.Object) lista24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        java.lang.Object[] objArray18 = lista0.item;
        lista0.imprime();
        int int20 = lista0.pos;
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.pos;
        lista0.primeiro = (byte) 100;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        lista0.primeiro = (short) 10;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        java.lang.Object obj11 = null;
        lista0.insere(obj11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray25 = lista18.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1L, 0.0f };
        lista33.item = objArray37;
        lista30.item = objArray37;
        lista28.item = objArray37;
        lista26.item = objArray37;
        boolean boolean42 = lista26.vazia();
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        lista45.ultimo = 10;
        lista43.insere((java.lang.Object) lista45);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        lista49.imprime();
        int int52 = lista49.primeiro;
        int int53 = lista49.primeiro;
        lista45.insere((java.lang.Object) int53);
        java.lang.Object[] objArray55 = lista45.item;
        java.lang.Object[] objArray56 = lista45.item;
        java.lang.Object[] objArray57 = lista45.item;
        lista26.item = objArray57;
        int int59 = lista26.primeiro;
        lista18.insere((java.lang.Object) lista26);
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        int int63 = lista61.pos;
        lista61.primeiro = 100;
        lista61.pos = (short) -1;
        java.lang.Class<?> wildcardClass68 = lista61.getClass();
        lista18.insere((java.lang.Object) lista61);
        java.lang.Object[] objArray70 = lista61.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, 0.0f };
        lista19.item = objArray23;
        lista16.item = objArray23;
        lista14.item = objArray23;
        lista12.item = objArray23;
        int int28 = lista12.ultimo;
        lista12.pos = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean32 = lista0.vazia();
        lista0.pos = 100;
        int int35 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.imprime();
        int int11 = lista0.pos;
        lista0.primeiro = '4';
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.pos;
        lista0.pos = 12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        lista0.ultimo = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.pos;
        java.lang.Object[] objArray10 = lista7.item;
        lista0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        int int10 = lista7.ultimo;
        java.lang.Object[] objArray11 = lista7.item;
        lista0.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        boolean boolean22 = lista18.vazia();
        lista13.insere((java.lang.Object) lista18);
        lista18.ultimo = 10;
        lista18.ultimo = ' ';
        lista0.insere((java.lang.Object) lista18);
        java.lang.Class<?> wildcardClass29 = lista18.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.pos = (byte) 0;
        int int7 = lista0.ultimo;
        int int8 = lista0.pos;
        lista0.primeiro = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        boolean boolean20 = lista13.vazia();
        lista13.ultimo = (byte) 1;
        int int23 = lista13.primeiro;
        boolean boolean24 = lista13.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        int int7 = lista0.pos;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        lista2.primeiro = (byte) 0;
        lista2.pos = 'a';
        lista2.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 0.0f };
        lista15.item = objArray19;
        lista12.item = objArray19;
        lista10.item = objArray19;
        lista8.item = objArray19;
        lista0.item = objArray19;
        boolean boolean25 = lista0.vazia();
        lista0.pos = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.ultimo;
        boolean boolean25 = lista2.vazia();
        int int26 = lista2.primeiro;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        int int29 = lista27.primeiro;
        lista27.imprime();
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.ultimo;
        int int35 = lista31.ultimo;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista31.item = objArray37;
        lista27.item = objArray37;
        lista2.insere((java.lang.Object) lista27);
        int int41 = lista2.ultimo;
        lista2.ultimo = 11;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 12 + "'", int41 == 12);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = ' ';
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        int int10 = lista7.ultimo;
        java.lang.Object[] objArray11 = lista7.item;
        lista0.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        boolean boolean22 = lista18.vazia();
        lista13.insere((java.lang.Object) lista18);
        lista18.ultimo = 10;
        lista18.ultimo = ' ';
        lista0.insere((java.lang.Object) lista18);
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.pos = (byte) 10;
        int int23 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = '4';
        int int7 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        lista0.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.pos;
        lista0.primeiro = (byte) 100;
        int int24 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.primeiro = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.ultimo;
        boolean boolean14 = lista10.vazia();
        lista5.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray16 = lista10.item;
        lista10.pos = 0;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        int int22 = lista19.primeiro;
        lista19.pos = 100;
        java.lang.Object[] objArray25 = lista19.item;
        lista10.insere((java.lang.Object) objArray25);
        lista0.item = objArray25;
        lista0.primeiro = 'a';
        boolean boolean30 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.ultimo;
        lista18.pos = '#';
        int int28 = lista18.ultimo;
        java.lang.Object[] objArray29 = lista18.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.ultimo = (byte) 0;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        lista0.ultimo = 10;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        int int15 = lista13.pos;
        lista13.primeiro = 100;
        lista13.pos = (short) -1;
        int int20 = lista13.pos;
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        java.lang.Object[] objArray24 = lista22.item;
        lista22.ultimo = (byte) 1;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista27.imprime();
        int int30 = lista27.ultimo;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        lista31.primeiro = 100;
        java.lang.Object[] objArray36 = lista31.item;
        lista27.item = objArray36;
        lista22.item = objArray36;
        lista13.item = objArray36;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista3.imprime();
        int int6 = lista3.primeiro;
        lista3.pos = 100;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.ultimo = 0;
        lista5.imprime();
        java.lang.Class<?> wildcardClass14 = lista5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = (-1);
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        lista6.pos = 100;
        int int12 = lista6.pos;
        int int13 = lista6.ultimo;
        lista6.ultimo = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        lista0.primeiro = '4';
        int int19 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        lista21.primeiro = '4';
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.ultimo;
        boolean boolean30 = lista26.vazia();
        lista21.insere((java.lang.Object) lista26);
        java.lang.Object[] objArray32 = lista26.item;
        java.lang.Object[] objArray33 = lista26.item;
        lista0.insere((java.lang.Object) lista26);
        int int35 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 12 + "'", int35 == 12);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 10;
        lista5.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.imprime();
        int int14 = lista11.primeiro;
        int int15 = lista11.primeiro;
        lista7.insere((java.lang.Object) int15);
        java.lang.Object[] objArray17 = lista7.item;
        lista0.item = objArray17;
        lista0.primeiro = ' ';
        int int21 = lista0.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 10;
        lista22.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        int int31 = lista28.primeiro;
        int int32 = lista28.primeiro;
        lista24.insere((java.lang.Object) int32);
        java.lang.Object[] objArray34 = lista24.item;
        java.lang.Object[] objArray35 = lista24.item;
        java.lang.Object[] objArray36 = lista24.item;
        lista0.item = objArray36;
        lista0.primeiro = 1;
        int int40 = lista0.primeiro;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 0.0f };
        lista31.item = objArray35;
        lista28.item = objArray35;
        lista26.item = objArray35;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        lista39.primeiro = '4';
        lista26.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray45 = lista26.item;
        lista18.item = objArray45;
        java.lang.Class<?> wildcardClass47 = lista18.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.insere((java.lang.Object) objArray9);
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        lista12.imprime();
        lista12.ultimo = '4';
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 1L, 0.0f };
        lista22.item = objArray26;
        lista19.item = objArray26;
        lista17.item = objArray26;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.primeiro = '4';
        lista17.insere((java.lang.Object) lista30);
        lista12.insere((java.lang.Object) lista30);
        java.lang.Object[] objArray37 = lista30.item;
        lista0.insere((java.lang.Object) objArray37);
        int int39 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        lista6.pos = 100;
        int int12 = lista6.pos;
        int int13 = lista6.ultimo;
        lista6.ultimo = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        lista0.primeiro = '4';
        int int19 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        lista21.primeiro = '4';
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.ultimo;
        boolean boolean30 = lista26.vazia();
        lista21.insere((java.lang.Object) lista26);
        java.lang.Object[] objArray32 = lista26.item;
        java.lang.Object[] objArray33 = lista26.item;
        lista0.insere((java.lang.Object) lista26);
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        int int38 = lista35.primeiro;
        lista35.pos = 100;
        int int41 = lista35.pos;
        int int42 = lista35.ultimo;
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        lista43.imprime();
        int int46 = lista43.ultimo;
        int int47 = lista43.ultimo;
        ds.Lista lista48 = new ds.Lista();
        lista48.imprime();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 1L, 0.0f };
        lista48.item = objArray52;
        lista43.insere((java.lang.Object) objArray52);
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista55.imprime();
        lista55.ultimo = '4';
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        lista62.imprime();
        ds.Lista lista65 = new ds.Lista();
        lista65.imprime();
        java.lang.Object[] objArray69 = new java.lang.Object[] { 1L, 0.0f };
        lista65.item = objArray69;
        lista62.item = objArray69;
        lista60.item = objArray69;
        ds.Lista lista73 = new ds.Lista();
        java.lang.Object[] objArray74 = lista73.item;
        lista73.imprime();
        lista73.primeiro = '4';
        lista60.insere((java.lang.Object) lista73);
        lista55.insere((java.lang.Object) lista73);
        java.lang.Object[] objArray80 = lista73.item;
        lista43.insere((java.lang.Object) objArray80);
        lista35.item = objArray80;
        lista0.item = objArray80;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.ultimo;
        lista0.pos = 10;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 10;
        lista11.insere((java.lang.Object) lista13);
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista17.imprime();
        int int20 = lista17.primeiro;
        int int21 = lista17.primeiro;
        lista13.insere((java.lang.Object) int21);
        java.lang.Object[] objArray23 = lista13.item;
        java.lang.Object[] objArray24 = lista13.item;
        java.lang.Object[] objArray25 = lista13.item;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista26.imprime();
        int int29 = lista26.primeiro;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista13.item = objArray32;
        boolean boolean34 = lista13.vazia();
        int int35 = lista13.ultimo;
        int int36 = lista13.primeiro;
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        ds.Lista lista40 = new ds.Lista();
        lista40.ultimo = 10;
        lista38.insere((java.lang.Object) lista40);
        int int44 = lista38.primeiro;
        java.lang.Object[] objArray45 = lista38.item;
        java.lang.Object[] objArray46 = lista38.item;
        lista13.item = objArray46;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        int int7 = lista0.pos;
        lista0.primeiro = '4';
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = 100;
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = '4';
        int int12 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista3.imprime();
        int int6 = lista3.ultimo;
        lista3.ultimo = (byte) 10;
        lista3.primeiro = 100;
        lista3.pos = (short) 1;
        lista3.primeiro = (byte) -1;
        int int15 = lista3.ultimo;
        lista3.pos = 0;
        lista0.insere((java.lang.Object) lista3);
        int int19 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        lista0.insere((java.lang.Object) '4');
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        lista0.pos = 'a';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        lista15.primeiro = '4';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.ultimo;
        boolean boolean24 = lista20.vazia();
        lista15.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray26 = lista20.item;
        lista20.pos = 0;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista29.imprime();
        int int32 = lista29.primeiro;
        lista29.pos = 100;
        java.lang.Object[] objArray35 = lista29.item;
        lista20.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        boolean boolean38 = lista0.vazia();
        lista0.ultimo = 12;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = 10;
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        lista0.pos = 0;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.primeiro = '4';
        lista10.pos = (-1);
        lista10.insere((java.lang.Object) 1L);
        lista10.imprime();
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        java.lang.Object[] objArray22 = lista0.item;
        int int23 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 0.0f };
        lista10.item = objArray14;
        lista7.item = objArray14;
        lista5.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        lista18.primeiro = '4';
        lista5.insere((java.lang.Object) lista18);
        lista0.insere((java.lang.Object) lista18);
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.pos = 'a';
        int int30 = lista26.primeiro;
        lista18.insere((java.lang.Object) lista26);
        lista18.pos = 100;
        int int34 = lista18.ultimo;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista35.imprime();
        int int38 = lista35.primeiro;
        lista35.pos = 100;
        java.lang.Object[] objArray41 = lista35.item;
        int int42 = lista35.pos;
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        lista47.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        java.lang.Object[] objArray54 = new java.lang.Object[] { 1L, 0.0f };
        lista50.item = objArray54;
        lista47.item = objArray54;
        lista45.item = objArray54;
        lista43.item = objArray54;
        lista35.item = objArray54;
        lista35.ultimo = (short) 10;
        boolean boolean62 = lista35.vazia();
        lista18.insere((java.lang.Object) boolean62);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 0.0f };
        lista4.item = objArray8;
        lista0.item = objArray8;
        lista0.imprime();
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.ultimo = 10;
        int int20 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.primeiro = 32;
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 10;
        lista21.ultimo = (short) -1;
        lista21.ultimo = (byte) 1;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        int int30 = lista28.pos;
        java.lang.Object[] objArray31 = lista28.item;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 1L, 0.0f };
        lista32.item = objArray36;
        lista28.item = objArray36;
        lista21.insere((java.lang.Object) lista28);
        int int40 = lista28.pos;
        int int41 = lista28.pos;
        lista28.pos = '4';
        lista28.ultimo = (short) 10;
        boolean boolean46 = lista28.vazia();
        lista0.insere((java.lang.Object) lista28);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        lista5.ultimo = '4';
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        int int14 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = 100;
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.ultimo;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista23.imprime();
        int int26 = lista23.primeiro;
        int int27 = lista23.primeiro;
        lista23.pos = (short) -1;
        java.lang.Object[] objArray30 = lista23.item;
        int int31 = lista23.ultimo;
        lista23.pos = 10;
        lista21.insere((java.lang.Object) 10);
        java.lang.Object[] objArray35 = lista21.item;
        lista0.insere((java.lang.Object) objArray35);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 0.0f };
        lista3.item = objArray7;
        lista0.item = objArray7;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        int int16 = lista10.pos;
        int int17 = lista10.ultimo;
        lista10.ultimo = (short) 100;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista20.imprime();
        int int23 = lista20.primeiro;
        int int24 = lista20.primeiro;
        lista20.pos = (short) -1;
        lista20.pos = (short) 1;
        lista20.imprime();
        java.lang.Object[] objArray30 = lista20.item;
        java.lang.Class<?> wildcardClass31 = objArray30.getClass();
        lista10.insere((java.lang.Object) wildcardClass31);
        int int33 = lista10.primeiro;
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        lista5.pos = (short) -1;
        lista5.primeiro = 11;
        lista5.pos = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        java.lang.Object[] objArray3 = lista2.item;
        lista2.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista2.item = objArray9;
        lista0.item = objArray9;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        lista13.primeiro = '4';
        lista0.insere((java.lang.Object) lista13);
        int int19 = lista13.primeiro;
        java.lang.Object[] objArray20 = lista13.item;
        boolean boolean21 = lista13.vazia();
        boolean boolean22 = lista13.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 10;
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        lista6.imprime();
        int int9 = lista6.primeiro;
        int int10 = lista6.primeiro;
        lista2.insere((java.lang.Object) int10);
        java.lang.Object[] objArray12 = lista2.item;
        java.lang.Object[] objArray13 = lista2.item;
        java.lang.Object[] objArray14 = lista2.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        lista15.pos = 100;
        java.lang.Object[] objArray21 = lista15.item;
        lista2.item = objArray21;
        boolean boolean23 = lista2.vazia();
        int int24 = lista2.ultimo;
        lista2.ultimo = 10;
        int int27 = lista2.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        lista10.primeiro = '4';
        lista10.pos = (-1);
        lista10.insere((java.lang.Object) 1L);
        lista10.imprime();
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        int int22 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.ultimo;
        java.lang.Object[] objArray9 = lista5.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista10.imprime();
        int int13 = lista10.primeiro;
        lista10.pos = 100;
        int int16 = lista10.pos;
        int int17 = lista10.ultimo;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.ultimo;
        int int22 = lista18.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1L, 0.0f };
        lista23.item = objArray27;
        lista18.insere((java.lang.Object) objArray27);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista30.imprime();
        lista30.ultimo = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista37.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, 0.0f };
        lista40.item = objArray44;
        lista37.item = objArray44;
        lista35.item = objArray44;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista48.imprime();
        lista48.primeiro = '4';
        lista35.insere((java.lang.Object) lista48);
        lista30.insere((java.lang.Object) lista48);
        java.lang.Object[] objArray55 = lista48.item;
        lista18.insere((java.lang.Object) objArray55);
        lista10.item = objArray55;
        lista5.item = objArray55;
        int int59 = lista5.pos;
        lista0.insere((java.lang.Object) lista5);
        int int61 = lista5.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 0.0f };
        lista5.item = objArray9;
        lista0.insere((java.lang.Object) objArray9);
        int int12 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = (byte) 1;
        lista0.pos = 100;
        lista0.ultimo = 0;
        int int9 = lista0.ultimo;
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '4';
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.ultimo = 10;
        lista4.insere((java.lang.Object) lista6);
        int int10 = lista4.primeiro;
        java.lang.Object[] objArray11 = lista4.item;
        lista0.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista13.imprime();
        int int16 = lista13.ultimo;
        int int17 = lista13.pos;
        lista13.primeiro = 'a';
        int int20 = lista13.primeiro;
        java.lang.Object[] objArray21 = lista13.item;
        lista0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        lista8.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 0.0f };
        lista11.item = objArray15;
        lista8.item = objArray15;
        lista6.item = objArray15;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista19.imprime();
        lista19.primeiro = '4';
        lista6.insere((java.lang.Object) lista19);
        int int25 = lista19.primeiro;
        java.lang.Object[] objArray26 = lista19.item;
        lista0.item = objArray26;
        lista0.primeiro = (byte) 100;
        int int30 = lista0.primeiro;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista31.imprime();
        int int34 = lista31.ultimo;
        lista31.ultimo = (byte) 10;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1L, 0.0f };
        lista42.item = objArray46;
        lista39.item = objArray46;
        lista37.item = objArray46;
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        lista50.imprime();
        lista50.primeiro = '4';
        lista37.insere((java.lang.Object) lista50);
        int int56 = lista50.primeiro;
        java.lang.Object[] objArray57 = lista50.item;
        lista31.item = objArray57;
        java.lang.Object[] objArray59 = lista31.item;
        lista0.item = objArray59;
        int int61 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        lista0.insere((java.lang.Object) (short) 1);
        lista0.primeiro = (short) 10;
        lista0.ultimo = 52;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        lista0.imprime();
        lista0.pos = (-1);
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = '4';
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        lista7.imprime();
        int int10 = lista7.ultimo;
        lista7.imprime();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray13 = lista12.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 10;
        lista12.insere((java.lang.Object) lista14);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        int int21 = lista18.primeiro;
        int int22 = lista18.primeiro;
        lista14.insere((java.lang.Object) int22);
        java.lang.Object[] objArray24 = lista14.item;
        lista7.item = objArray24;
        lista7.primeiro = ' ';
        int int28 = lista7.primeiro;
        lista0.insere((java.lang.Object) lista7);
        lista7.primeiro = 2;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.pos = (short) -1;
        lista0.pos = (short) 1;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 10;
        lista9.insere((java.lang.Object) lista11);
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        lista15.imprime();
        int int18 = lista15.primeiro;
        int int19 = lista15.primeiro;
        lista11.insere((java.lang.Object) int19);
        java.lang.Object[] objArray21 = lista11.item;
        java.lang.Object[] objArray22 = lista11.item;
        java.lang.Object[] objArray23 = lista11.item;
        lista0.item = objArray23;
        int int25 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.pos = (short) 0;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        int int13 = lista0.pos;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.pos = 'a';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 10;
        int int8 = lista5.ultimo;
        lista5.pos = (byte) 1;
        boolean boolean11 = lista5.vazia();
        boolean boolean12 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 0.0f };
        lista21.item = objArray25;
        lista18.item = objArray25;
        lista16.item = objArray25;
        lista14.item = objArray25;
        lista14.imprime();
        lista14.ultimo = (short) 0;
        lista0.insere((java.lang.Object) (short) 0);
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 0.0]");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        lista0.ultimo = (byte) 100;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.pos = 'a';
        int int13 = lista9.pos;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista14.imprime();
        lista14.ultimo = '4';
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista21.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, 0.0f };
        lista24.item = objArray28;
        lista21.item = objArray28;
        lista19.item = objArray28;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        lista32.imprime();
        lista32.primeiro = '4';
        lista19.insere((java.lang.Object) lista32);
        lista14.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray39 = lista32.item;
        lista9.insere((java.lang.Object) objArray39);
        lista0.item = objArray39;
        lista0.ultimo = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        lista5.imprime();
        int int8 = lista5.ultimo;
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Object[] objArray11 = lista5.item;
        lista5.pos = 0;
        int int14 = lista5.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 10;
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.pos = (short) 0;
        lista0.ultimo = 1;
        int int9 = lista0.primeiro;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray5 = lista4.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.ultimo = 10;
        lista4.insere((java.lang.Object) lista6);
        int int10 = lista4.primeiro;
        java.lang.Object[] objArray11 = lista4.item;
        lista0.item = objArray11;
        int int13 = lista0.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 10;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        java.lang.Object[] objArray20 = lista17.item;
        lista17.primeiro = (byte) -1;
        java.lang.Object[] objArray23 = lista17.item;
        lista14.item = objArray23;
        lista0.item = objArray23;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
    }
}

