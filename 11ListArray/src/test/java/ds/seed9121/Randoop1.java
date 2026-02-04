package ds.seed9121;

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
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (byte) 1;
        int int13 = lista0.ultimo;
        int int14 = lista0.ultimo;
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        lista0.ultimo = 35;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray12 = lista0.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        int int20 = lista13.pos;
        int int21 = lista13.primeiro;
        int int22 = lista13.pos;
        java.lang.Object[] objArray23 = lista13.item;
        lista13.imprime();
        lista0.insere((java.lang.Object) lista13);
        lista0.pos = ' ';
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista28.item = objArray33;
        int int35 = lista28.pos;
        lista28.ultimo = (byte) 100;
        lista28.ultimo = (short) 1;
        lista28.imprime();
        lista28.primeiro = '#';
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista43.item = objArray48;
        lista43.ultimo = '4';
        int int52 = lista43.primeiro;
        boolean boolean53 = lista43.vazia();
        int int54 = lista43.pos;
        java.lang.Object[] objArray55 = lista43.item;
        lista28.insere((java.lang.Object) lista43);
        boolean boolean57 = lista28.vazia();
        lista0.insere((java.lang.Object) boolean57);
        java.lang.Class<?> wildcardClass59 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        boolean boolean19 = lista12.vazia();
        int int20 = lista12.ultimo;
        int int21 = lista12.ultimo;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista22.item = objArray27;
        lista22.ultimo = '4';
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista22.item = objArray36;
        int int39 = lista22.pos;
        lista22.pos = 'a';
        java.lang.Object[] objArray42 = lista22.item;
        lista12.item = objArray42;
        lista0.item = objArray42;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.pos;
        lista0.ultimo = 52;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        java.lang.Object obj21 = null;
        lista9.insere(obj21);
        int int23 = lista9.primeiro;
        lista9.primeiro = (byte) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, null, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, null, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = (byte) 100;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista6.item = objArray11;
        int int13 = lista6.pos;
        boolean boolean14 = lista6.vazia();
        java.lang.Object[] objArray15 = lista6.item;
        lista0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = objArray15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.pos = (short) 0;
        lista0.ultimo = (-1);
        int int12 = lista0.primeiro;
        lista0.primeiro = '#';
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        lista11.pos = (short) 100;
        lista11.primeiro = 10;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista41.item = objArray46;
        lista41.ultimo = '4';
        int int50 = lista41.primeiro;
        java.lang.Object[] objArray51 = null;
        lista41.item = objArray51;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista53.item = objArray58;
        lista53.ultimo = '4';
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray67 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista62.item = objArray67;
        lista53.item = objArray67;
        int int70 = lista53.primeiro;
        java.lang.Object[] objArray71 = lista53.item;
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray77 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista72.item = objArray77;
        lista53.item = objArray77;
        lista41.item = objArray77;
        boolean boolean81 = lista41.vazia();
        java.lang.Object[] objArray82 = lista41.item;
        int int83 = lista41.ultimo;
        java.lang.Object[] objArray84 = lista41.item;
        lista11.item = objArray84;
        java.lang.Class<?> wildcardClass86 = objArray84.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 52 + "'", int83 == 52);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.insere((java.lang.Object) 1);
        lista0.imprime();
        int int16 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        java.lang.Object obj21 = null;
        lista9.insere(obj21);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista23.item = objArray28;
        int int30 = lista23.pos;
        int int31 = lista23.primeiro;
        lista23.imprime();
        java.lang.Object[] objArray33 = lista23.item;
        lista9.item = objArray33;
        java.lang.Object[] objArray35 = lista9.item;
        int int36 = lista9.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, null, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, null, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.ultimo;
        java.lang.Object[] objArray37 = lista11.item;
        int int38 = lista11.pos;
        java.lang.Object[] objArray39 = lista11.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        int int8 = lista5.pos;
        int int9 = lista5.primeiro;
        lista5.imprime();
        lista5.primeiro = (byte) 0;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        lista13.ultimo = '4';
        lista13.pos = 'a';
        java.lang.Object[] objArray24 = lista13.item;
        lista5.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista26.item = objArray31;
        lista26.ultimo = '4';
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista35.item = objArray40;
        int int42 = lista35.pos;
        int int43 = lista35.primeiro;
        int int44 = lista35.pos;
        java.lang.Object[] objArray45 = lista35.item;
        java.lang.Object[] objArray46 = lista35.item;
        java.lang.Object[] objArray47 = lista35.item;
        lista26.item = objArray47;
        lista5.item = objArray47;
        lista0.insere((java.lang.Object) lista5);
        int int51 = lista5.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        lista0.primeiro = 1;
        int int15 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        lista0.primeiro = ' ';
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista22.item = objArray27;
        lista22.ultimo = '4';
        int int31 = lista22.primeiro;
        boolean boolean32 = lista22.vazia();
        lista22.ultimo = 97;
        int int35 = lista22.pos;
        lista22.primeiro = (short) 100;
        int int38 = lista22.ultimo;
        lista22.pos = 100;
        java.lang.Object[] objArray41 = lista22.item;
        boolean boolean42 = lista22.vazia();
        lista0.insere((java.lang.Object) boolean42);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista19.item = objArray24;
        lista0.item = objArray24;
        boolean boolean27 = lista0.vazia();
        int int28 = lista0.pos;
        java.lang.Object[] objArray29 = lista0.item;
        boolean boolean30 = lista0.vazia();
        int int31 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (short) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.pos = 52;
        int int13 = lista0.pos;
        int int14 = lista0.ultimo;
        int int15 = lista0.primeiro;
        int int16 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        lista10.ultimo = '4';
        int int19 = lista10.primeiro;
        int int20 = lista10.ultimo;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista21.ultimo = '4';
        int int30 = lista21.primeiro;
        boolean boolean31 = lista21.vazia();
        int int32 = lista21.pos;
        java.lang.Object[] objArray33 = lista21.item;
        lista10.item = objArray33;
        lista0.item = objArray33;
        int int36 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        int int10 = lista0.ultimo;
        boolean boolean11 = lista0.vazia();
        lista0.primeiro = ' ';
        int int14 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        lista9.imprime();
        lista9.primeiro = (short) -1;
        lista9.primeiro = ' ';
        lista9.imprime();
        lista9.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.imprime();
        lista0.pos = 97;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.pos;
        int int25 = lista15.pos;
        int int26 = lista15.primeiro;
        java.lang.Object[] objArray27 = lista15.item;
        int int28 = lista15.primeiro;
        lista15.imprime();
        lista0.insere((java.lang.Object) lista15);
        int int31 = lista15.pos;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista32.item = objArray37;
        lista32.ultimo = '4';
        int int41 = lista32.primeiro;
        boolean boolean42 = lista32.vazia();
        int int43 = lista32.pos;
        boolean boolean44 = lista32.vazia();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista45.item = objArray50;
        int int52 = lista45.pos;
        int int53 = lista45.primeiro;
        int int54 = lista45.pos;
        int int55 = lista45.pos;
        int int56 = lista45.primeiro;
        java.lang.Object[] objArray57 = lista45.item;
        int int58 = lista45.primeiro;
        lista45.imprime();
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray65 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista60.item = objArray65;
        int int67 = lista60.pos;
        lista60.imprime();
        lista60.imprime();
        java.lang.Object[] objArray70 = lista60.item;
        lista45.item = objArray70;
        lista32.item = objArray70;
        lista15.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray74 = lista15.item;
        java.lang.Object[] objArray75 = lista15.item;
        int int76 = lista15.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.primeiro;
        java.lang.Object[] objArray30 = lista12.item;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista12.item = objArray36;
        lista0.item = objArray36;
        boolean boolean40 = lista0.vazia();
        lista0.primeiro = 97;
        lista0.pos = '#';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        boolean boolean9 = lista0.vazia();
        lista0.pos = 100;
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        lista15.ultimo = '4';
        int int24 = lista15.primeiro;
        int int25 = lista15.ultimo;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista26.item = objArray31;
        lista26.ultimo = '4';
        int int35 = lista26.primeiro;
        boolean boolean36 = lista26.vazia();
        int int37 = lista26.pos;
        java.lang.Object[] objArray38 = lista26.item;
        lista15.item = objArray38;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.primeiro;
        lista0.ultimo = (short) 0;
        lista0.pos = (byte) 100;
        lista0.ultimo = ' ';
        lista0.pos = '4';
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.imprime();
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = 'a';
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 1;
        boolean boolean10 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        int int24 = lista11.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        lista11.primeiro = 97;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista27.item = objArray32;
        lista27.ultimo = '4';
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        lista27.item = objArray41;
        int int44 = lista27.pos;
        lista27.pos = 'a';
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista47.item = objArray52;
        int int54 = lista47.pos;
        int int55 = lista47.primeiro;
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista56.item = objArray61;
        int int63 = lista56.pos;
        lista56.ultimo = (short) 1;
        lista47.insere((java.lang.Object) lista56);
        lista47.ultimo = '#';
        java.lang.Object[] objArray69 = lista47.item;
        lista27.item = objArray69;
        boolean boolean71 = lista27.vazia();
        lista27.primeiro = (short) 10;
        ds.Lista lista74 = new ds.Lista();
        java.lang.Object[] objArray79 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista74.item = objArray79;
        int int81 = lista74.pos;
        lista74.ultimo = (short) 1;
        lista74.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray86 = lista74.item;
        lista27.item = objArray86;
        lista11.item = objArray86;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[10, -1, 0, 100.0]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.pos = (short) 0;
        lista0.ultimo = (-1);
        int int12 = lista0.primeiro;
        lista0.primeiro = '#';
        int int15 = lista0.ultimo;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista16.item = objArray21;
        lista16.ultimo = '4';
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista16.item = objArray30;
        int int33 = lista16.primeiro;
        int int34 = lista16.pos;
        int int35 = lista16.ultimo;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        int int43 = lista36.pos;
        int int44 = lista36.primeiro;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista45.item = objArray50;
        int int52 = lista45.pos;
        lista45.ultimo = (short) 1;
        lista36.insere((java.lang.Object) lista45);
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista56.item = objArray61;
        java.lang.Object[] objArray63 = lista56.item;
        lista56.pos = (short) 1;
        java.lang.Object[] objArray66 = lista56.item;
        lista45.item = objArray66;
        lista16.item = objArray66;
        lista0.item = objArray66;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.imprime();
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista6.item = objArray11;
        int int13 = lista6.pos;
        int int14 = lista6.primeiro;
        int int15 = lista6.pos;
        int int16 = lista6.primeiro;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista17.item = objArray22;
        int int24 = lista17.pos;
        lista17.imprime();
        lista17.imprime();
        java.lang.Object[] objArray27 = lista17.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista28.item = objArray33;
        int int35 = lista28.pos;
        lista28.ultimo = (short) 1;
        lista28.primeiro = 1;
        lista17.insere((java.lang.Object) lista28);
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista41.item = objArray46;
        int int48 = lista41.pos;
        lista41.imprime();
        lista41.imprime();
        java.lang.Object[] objArray51 = lista41.item;
        lista28.item = objArray51;
        lista6.item = objArray51;
        lista0.insere((java.lang.Object) objArray51);
        int int55 = lista0.pos;
        lista0.primeiro = 2;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 1;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista6.item = objArray11;
        int int13 = lista6.pos;
        int int14 = lista6.primeiro;
        int int15 = lista6.pos;
        int int16 = lista6.pos;
        int int17 = lista6.primeiro;
        java.lang.Object[] objArray18 = lista6.item;
        int int19 = lista6.primeiro;
        boolean boolean20 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean20);
        lista0.primeiro = '4';
        boolean boolean24 = lista0.vazia();
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        int int32 = lista25.pos;
        int int33 = lista25.primeiro;
        int int34 = lista25.pos;
        int int35 = lista25.pos;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        lista36.ultimo = (short) 0;
        java.lang.Object[] objArray45 = lista36.item;
        lista25.item = objArray45;
        lista0.item = objArray45;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.primeiro = 'a';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        lista15.imprime();
        lista15.imprime();
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        lista0.imprime();
        boolean boolean28 = lista0.vazia();
        int int29 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista19.item = objArray24;
        lista0.item = objArray24;
        boolean boolean27 = lista0.vazia();
        int int28 = lista0.pos;
        java.lang.Object[] objArray29 = lista0.item;
        java.lang.Object[] objArray30 = lista0.item;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista31.ultimo = (short) 0;
        java.lang.Object[] objArray40 = lista31.item;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista41.item = objArray46;
        int int48 = lista41.pos;
        lista41.ultimo = (short) 1;
        lista41.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray53 = lista41.item;
        lista31.insere((java.lang.Object) lista41);
        java.lang.Object[] objArray55 = lista41.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, -1, 0, 100.0]");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.imprime();
        lista0.pos = (byte) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        lista0.primeiro = (-1);
        java.lang.Object[] objArray15 = lista0.item;
        boolean boolean16 = lista0.vazia();
        lista0.ultimo = (byte) 1;
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.pos = 52;
        int int13 = lista0.pos;
        int int14 = lista0.ultimo;
        lista0.ultimo = 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        boolean boolean10 = lista0.vazia();
        lista0.pos = 97;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.primeiro = 10;
        lista0.pos = ' ';
        lista0.ultimo = 100;
        int int20 = lista0.primeiro;
        int int21 = lista0.pos;
        int int22 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        int int17 = lista9.primeiro;
        int int18 = lista9.pos;
        java.lang.Object[] objArray19 = lista9.item;
        java.lang.Object[] objArray20 = lista9.item;
        java.lang.Object[] objArray21 = lista9.item;
        lista0.item = objArray21;
        lista0.pos = (short) 10;
        int int25 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        int int19 = lista12.pos;
        lista12.ultimo = (short) 1;
        lista12.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray24 = lista12.item;
        lista0.item = objArray24;
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = (short) 0;
        lista0.ultimo = (short) 0;
        lista0.ultimo = (-1);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista16.item = objArray21;
        lista16.ultimo = '4';
        boolean boolean25 = lista16.vazia();
        lista16.pos = 100;
        boolean boolean28 = lista16.vazia();
        lista16.primeiro = (byte) 1;
        int int31 = lista16.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.primeiro = 'a';
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = (short) -1;
        lista0.pos = (byte) -1;
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.pos;
        lista0.pos = 'a';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista20.item = objArray25;
        int int27 = lista20.pos;
        int int28 = lista20.primeiro;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista29.item = objArray34;
        int int36 = lista29.pos;
        lista29.ultimo = (short) 1;
        lista20.insere((java.lang.Object) lista29);
        lista20.ultimo = '#';
        java.lang.Object[] objArray42 = lista20.item;
        lista0.item = objArray42;
        boolean boolean44 = lista0.vazia();
        lista0.primeiro = (short) 10;
        lista0.primeiro = 35;
        lista0.ultimo = 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        int int17 = lista10.pos;
        int int18 = lista10.primeiro;
        int int19 = lista10.pos;
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        int int22 = lista0.pos;
        int int23 = lista0.primeiro;
        int int24 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.pos = 100;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista8.item = objArray13;
        int int15 = lista8.pos;
        int int16 = lista8.primeiro;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista17.item = objArray22;
        int int24 = lista17.pos;
        lista17.ultimo = (short) 1;
        lista8.insere((java.lang.Object) lista17);
        lista8.primeiro = ' ';
        java.lang.Object[] objArray30 = lista8.item;
        lista0.item = objArray30;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        lista9.ultimo = (short) 1;
        lista9.pos = 100;
        int int24 = lista9.ultimo;
        lista9.primeiro = 35;
        lista9.pos = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.primeiro = 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.pos;
        lista12.pos = 'a';
        java.lang.Object[] objArray32 = lista12.item;
        lista0.item = objArray32;
        int int34 = lista0.pos;
        java.lang.Class<?> wildcardClass35 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista19.item = objArray24;
        lista0.item = objArray24;
        lista0.primeiro = 100;
        lista0.imprime();
        lista0.pos = 100;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.imprime();
        lista0.ultimo = (short) 100;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        lista13.ultimo = '4';
        int int22 = lista13.primeiro;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.item = objArray23;
        int int25 = lista0.ultimo;
        lista0.pos = (short) 1;
        lista0.pos = (short) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        lista0.ultimo = (byte) 100;
        int int19 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        lista13.ultimo = '4';
        int int22 = lista13.primeiro;
        java.lang.Object[] objArray23 = null;
        lista13.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista25.ultimo = '4';
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista34.item = objArray39;
        lista25.item = objArray39;
        int int42 = lista25.primeiro;
        java.lang.Object[] objArray43 = lista25.item;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista44.item = objArray49;
        lista25.item = objArray49;
        lista13.item = objArray49;
        lista0.item = objArray49;
        java.lang.Object[] objArray54 = lista0.item;
        int int55 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (short) 1;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista7.item = objArray12;
        int int14 = lista7.pos;
        lista7.ultimo = (byte) 100;
        lista7.ultimo = (short) 1;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.ultimo = (-1);
        boolean boolean23 = lista19.vazia();
        lista7.insere((java.lang.Object) boolean23);
        int int25 = lista7.primeiro;
        java.lang.Object[] objArray26 = lista7.item;
        lista0.item = objArray26;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, false, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, false, 0, 100.0]");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        int int20 = lista13.pos;
        int int21 = lista13.primeiro;
        int int22 = lista13.pos;
        java.lang.Object[] objArray23 = lista13.item;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray26 = lista13.item;
        lista0.insere((java.lang.Object) lista13);
        lista0.ultimo = (byte) 0;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista30.item = objArray35;
        int int37 = lista30.pos;
        lista30.ultimo = (short) 1;
        lista30.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray42 = lista30.item;
        lista0.insere((java.lang.Object) objArray42);
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.primeiro;
        lista44.primeiro = (short) -1;
        int int48 = lista44.ultimo;
        lista44.primeiro = (short) 1;
        int int51 = lista44.ultimo;
        lista44.primeiro = '#';
        int int54 = lista44.primeiro;
        java.lang.Object[] objArray55 = lista44.item;
        lista0.item = objArray55;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[[10, -1, 0, 100.0], hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[[10, -1, 0, 100.0], hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (byte) 100;
        int int13 = lista0.ultimo;
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = lista0.item;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.ultimo = (-1);
        boolean boolean16 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean16);
        int int18 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, false, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.ultimo = 97;
        lista0.primeiro = 10;
        lista0.ultimo = 0;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int14 = lista0.ultimo;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        lista0.ultimo = '4';
        int int14 = lista0.primeiro;
        lista0.primeiro = 0;
        boolean boolean17 = lista0.vazia();
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        lista11.imprime();
        lista11.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        int int19 = lista12.pos;
        int int20 = lista12.primeiro;
        int int21 = lista12.pos;
        java.lang.Object[] objArray22 = lista12.item;
        lista12.pos = (byte) 100;
        java.lang.Object[] objArray25 = lista12.item;
        lista0.item = objArray25;
        java.lang.Object[] objArray27 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.insere((java.lang.Object) 1);
        lista0.pos = 97;
        int int17 = lista0.primeiro;
        boolean boolean18 = lista0.vazia();
        lista0.ultimo = 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int14 = lista0.ultimo;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista16.item = objArray21;
        lista16.ultimo = '4';
        int int25 = lista16.primeiro;
        int int26 = lista16.ultimo;
        boolean boolean27 = lista16.vazia();
        lista16.primeiro = ' ';
        lista16.ultimo = (byte) 1;
        boolean boolean32 = lista16.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) boolean32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.pos = 52;
        int int13 = lista0.pos;
        int int14 = lista0.ultimo;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        int int17 = lista0.pos;
        java.lang.Object[] objArray18 = lista0.item;
        int int19 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista5.item = objArray10;
        int int12 = lista5.pos;
        int int13 = lista5.primeiro;
        lista5.imprime();
        java.lang.Object[] objArray15 = lista5.item;
        lista0.item = objArray15;
        lista0.primeiro = (short) -1;
        int int19 = lista0.primeiro;
        int int20 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = 0;
        boolean boolean13 = lista0.vazia();
        java.lang.Object[] objArray14 = lista0.item;
        lista0.pos = (short) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (short) 0;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.primeiro;
        lista0.ultimo = (short) 0;
        lista0.pos = (byte) 100;
        lista0.primeiro = ' ';
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.insere((java.lang.Object) 1);
        lista0.imprime();
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista16.item = objArray21;
        lista16.ultimo = '4';
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista16.item = objArray30;
        int int33 = lista16.primeiro;
        java.lang.Object[] objArray34 = lista16.item;
        lista0.item = objArray34;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = null;
        lista0.item = objArray6;
        lista0.primeiro = (byte) 100;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        int int17 = lista10.pos;
        int int18 = lista10.primeiro;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista19.item = objArray24;
        int int26 = lista19.pos;
        lista19.ultimo = (short) 1;
        lista10.insere((java.lang.Object) lista19);
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista30.item = objArray35;
        java.lang.Object[] objArray37 = lista30.item;
        lista30.pos = (short) 1;
        java.lang.Object[] objArray40 = lista30.item;
        lista19.item = objArray40;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        int int19 = lista12.pos;
        int int20 = lista12.primeiro;
        int int21 = lista12.pos;
        java.lang.Object[] objArray22 = lista12.item;
        lista12.pos = (byte) 100;
        java.lang.Object[] objArray25 = lista12.item;
        lista0.item = objArray25;
        lista0.primeiro = ' ';
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.imprime();
        lista0.primeiro = ' ';
        lista0.primeiro = 100;
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.insere((java.lang.Object) (short) -1);
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        lista12.pos = 'a';
        int int23 = lista12.ultimo;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.ultimo = (byte) 100;
        java.lang.Object[] objArray34 = lista24.item;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista35.item = objArray40;
        int int42 = lista35.pos;
        lista35.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray34, lista35 };
        lista12.item = objArray34;
        lista0.item = objArray34;
        java.lang.Object[] objArray47 = lista0.item;
        int int48 = lista0.pos;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista49.item = objArray54;
        int int56 = lista49.pos;
        lista49.pos = (short) 0;
        lista49.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista49);
        java.lang.Class<?> wildcardClass62 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.pos = 52;
        int int13 = lista0.pos;
        int int14 = lista0.ultimo;
        lista0.ultimo = 35;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        lista0.imprime();
        lista0.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        lista15.ultimo = '4';
        int int24 = lista15.primeiro;
        boolean boolean25 = lista15.vazia();
        int int26 = lista15.pos;
        java.lang.Object[] objArray27 = lista15.item;
        lista0.insere((java.lang.Object) lista15);
        int int29 = lista15.pos;
        int int30 = lista15.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.pos;
        int int25 = lista15.pos;
        int int26 = lista15.primeiro;
        java.lang.Object[] objArray27 = lista15.item;
        int int28 = lista15.primeiro;
        lista15.imprime();
        lista0.insere((java.lang.Object) lista15);
        int int31 = lista15.pos;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista32.item = objArray37;
        lista32.ultimo = '4';
        int int41 = lista32.primeiro;
        boolean boolean42 = lista32.vazia();
        int int43 = lista32.pos;
        boolean boolean44 = lista32.vazia();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista45.item = objArray50;
        int int52 = lista45.pos;
        int int53 = lista45.primeiro;
        int int54 = lista45.pos;
        int int55 = lista45.pos;
        int int56 = lista45.primeiro;
        java.lang.Object[] objArray57 = lista45.item;
        int int58 = lista45.primeiro;
        lista45.imprime();
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray65 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista60.item = objArray65;
        int int67 = lista60.pos;
        lista60.imprime();
        lista60.imprime();
        java.lang.Object[] objArray70 = lista60.item;
        lista45.item = objArray70;
        lista32.item = objArray70;
        lista15.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray74 = lista15.item;
        java.lang.Object[] objArray75 = lista15.item;
        java.lang.Class<?> wildcardClass76 = lista15.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.primeiro;
        lista0.ultimo = (short) 0;
        lista0.pos = (byte) 100;
        lista0.ultimo = ' ';
        lista0.ultimo = 52;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (byte) -1;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.ultimo;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista14.item = objArray19;
        int int21 = lista14.pos;
        int int22 = lista14.primeiro;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista23.item = objArray28;
        int int30 = lista23.pos;
        lista23.ultimo = (short) 1;
        lista14.insere((java.lang.Object) lista23);
        int int34 = lista23.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista35.item = objArray40;
        int int42 = lista35.pos;
        int int43 = lista35.primeiro;
        int int44 = lista35.pos;
        java.lang.Object[] objArray45 = lista35.item;
        lista35.pos = (byte) 100;
        java.lang.Object[] objArray48 = lista35.item;
        lista23.item = objArray48;
        int int50 = lista23.ultimo;
        lista23.pos = (short) 10;
        int int53 = lista23.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista23);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        java.lang.Object[] objArray16 = lista0.item;
        java.lang.Object[] objArray17 = lista0.item;
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.primeiro = 1;
        int int12 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.insere((java.lang.Object) "");
        lista0.pos = 'a';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, , 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, , 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        lista0.primeiro = (-1);
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.ultimo;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        int int32 = lista25.pos;
        lista25.imprime();
        int int34 = lista25.ultimo;
        java.lang.Object[] objArray35 = lista25.item;
        lista15.item = objArray35;
        lista0.item = objArray35;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        int int41 = lista38.pos;
        int int42 = lista38.primeiro;
        lista38.pos = 100;
        int int45 = lista38.primeiro;
        lista38.imprime();
        lista38.pos = 0;
        lista38.primeiro = (short) 100;
        java.lang.Object[] objArray51 = lista38.item;
        ds.Lista lista52 = new ds.Lista();
        int int53 = lista52.primeiro;
        int int54 = lista52.primeiro;
        java.lang.Object[] objArray55 = lista52.item;
        lista38.insere((java.lang.Object) objArray55);
        lista0.item = objArray55;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista6.item = objArray11;
        int int13 = lista6.pos;
        int int14 = lista6.primeiro;
        int int15 = lista6.pos;
        int int16 = lista6.primeiro;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista17.item = objArray22;
        int int24 = lista17.pos;
        lista17.imprime();
        lista17.imprime();
        java.lang.Object[] objArray27 = lista17.item;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista28.item = objArray33;
        int int35 = lista28.pos;
        lista28.ultimo = (short) 1;
        lista28.primeiro = 1;
        lista17.insere((java.lang.Object) lista28);
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista41.item = objArray46;
        int int48 = lista41.pos;
        lista41.imprime();
        lista41.imprime();
        java.lang.Object[] objArray51 = lista41.item;
        lista28.item = objArray51;
        lista6.item = objArray51;
        lista0.insere((java.lang.Object) objArray51);
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        lista15.imprime();
        lista15.imprime();
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        lista0.imprime();
        lista0.ultimo = (short) 10;
        java.lang.Object[] objArray30 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.primeiro = 1;
        int int12 = lista0.pos;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.ultimo = (-1);
        lista0.imprime();
        lista0.pos = 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        lista0.item = objArray26;
        lista0.pos = 32;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        lista11.pos = (short) 100;
        java.lang.Object[] objArray39 = lista11.item;
        lista11.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        lista15.imprime();
        lista15.imprime();
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        lista0.imprime();
        lista0.ultimo = (short) 10;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 10;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Object[] objArray2 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        java.lang.Object[] objArray3 = lista0.item;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.pos = 100;
        int int7 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 0;
        lista0.primeiro = (short) 100;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.pos = 100;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (byte) 1;
        int int13 = lista0.ultimo;
        int int14 = lista0.ultimo;
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.imprime();
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.pos;
        lista0.pos = 'a';
        java.lang.Object[] objArray20 = lista0.item;
        int int21 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        lista0.ultimo = 52;
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        lista13.ultimo = '4';
        int int22 = lista13.primeiro;
        java.lang.Object[] objArray23 = null;
        lista13.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista25.ultimo = '4';
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista34.item = objArray39;
        lista25.item = objArray39;
        int int42 = lista25.primeiro;
        java.lang.Object[] objArray43 = lista25.item;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista44.item = objArray49;
        lista25.item = objArray49;
        lista13.item = objArray49;
        lista0.item = objArray49;
        java.lang.Object[] objArray54 = lista0.item;
        lista0.ultimo = 35;
        java.lang.Class<?> wildcardClass57 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        lista0.imprime();
        lista0.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        boolean boolean22 = lista15.vazia();
        java.lang.Object[] objArray23 = lista15.item;
        lista0.item = objArray23;
        lista0.pos = 32;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista27.item = objArray32;
        lista27.ultimo = '4';
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        lista27.item = objArray41;
        int int44 = lista27.primeiro;
        int int45 = lista27.pos;
        int int46 = lista27.ultimo;
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista47.item = objArray52;
        int int54 = lista47.pos;
        int int55 = lista47.primeiro;
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista56.item = objArray61;
        int int63 = lista56.pos;
        lista56.ultimo = (short) 1;
        lista47.insere((java.lang.Object) lista56);
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray72 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista67.item = objArray72;
        java.lang.Object[] objArray74 = lista67.item;
        lista67.pos = (short) 1;
        java.lang.Object[] objArray77 = lista67.item;
        lista56.item = objArray77;
        lista27.item = objArray77;
        lista0.insere((java.lang.Object) lista27);
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.primeiro = 'a';
        lista0.primeiro = 35;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        int int16 = lista0.ultimo;
        lista0.pos = 100;
        java.lang.Object[] objArray19 = lista0.item;
        boolean boolean20 = lista0.vazia();
        int int21 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.pos;
        int int13 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        lista0.primeiro = 1;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        lista15.imprime();
        lista15.imprime();
        java.lang.Object[] objArray25 = lista15.item;
        lista15.ultimo = 0;
        boolean boolean28 = lista15.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista15);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.pos = 100;
        int int7 = lista0.primeiro;
        lista0.imprime();
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object obj10 = null;
        lista0.insere(obj10);
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.primeiro = (short) -1;
        boolean boolean17 = lista13.vazia();
        int int18 = lista13.primeiro;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista19.item = objArray24;
        int int26 = lista19.pos;
        int int27 = lista19.primeiro;
        int int28 = lista19.pos;
        int int29 = lista19.primeiro;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista30.item = objArray35;
        int int37 = lista30.pos;
        lista30.imprime();
        lista30.imprime();
        java.lang.Object[] objArray40 = lista30.item;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista41.item = objArray46;
        int int48 = lista41.pos;
        lista41.ultimo = (short) 1;
        lista41.primeiro = 1;
        lista30.insere((java.lang.Object) lista41);
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray59 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista54.item = objArray59;
        int int61 = lista54.pos;
        lista54.imprime();
        lista54.imprime();
        java.lang.Object[] objArray64 = lista54.item;
        lista41.item = objArray64;
        lista19.item = objArray64;
        lista13.insere((java.lang.Object) objArray64);
        lista0.item = objArray64;
        int int69 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.ultimo;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.pos;
        int int25 = lista15.pos;
        lista0.insere((java.lang.Object) int25);
        int int27 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        lista0.primeiro = (-1);
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.ultimo;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        int int32 = lista25.pos;
        lista25.imprime();
        int int34 = lista25.ultimo;
        java.lang.Object[] objArray35 = lista25.item;
        lista15.item = objArray35;
        lista0.item = objArray35;
        int int38 = lista0.ultimo;
        int int39 = lista0.primeiro;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.primeiro;
        lista40.primeiro = (short) -1;
        int int44 = lista40.ultimo;
        lista40.primeiro = (short) 1;
        int int47 = lista40.ultimo;
        lista40.primeiro = '#';
        int int50 = lista40.primeiro;
        java.lang.Object[] objArray51 = lista40.item;
        java.lang.Object[] objArray52 = lista40.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista40);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        lista9.imprime();
        lista9.primeiro = (short) -1;
        java.lang.Object[] objArray24 = null;
        lista9.item = objArray24;
        boolean boolean26 = lista9.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        int int16 = lista0.ultimo;
        lista0.pos = 100;
        java.lang.Object[] objArray19 = lista0.item;
        boolean boolean20 = lista0.vazia();
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        java.lang.Object[] objArray12 = null;
        lista0.item = objArray12;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        lista0.ultimo = 0;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.ultimo = (-1);
        boolean boolean16 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista18.item = objArray23;
        lista18.ultimo = '4';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista27.item = objArray32;
        lista18.item = objArray32;
        int int35 = lista18.primeiro;
        java.lang.Object[] objArray36 = lista18.item;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista37.item = objArray42;
        lista18.item = objArray42;
        boolean boolean45 = lista18.vazia();
        int int46 = lista18.pos;
        java.lang.Object[] objArray47 = lista18.item;
        lista0.insere((java.lang.Object) objArray47);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, false, [10, hi!, 0, 100.0], 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        int int28 = lista21.pos;
        int int29 = lista21.primeiro;
        int int30 = lista21.pos;
        java.lang.Object[] objArray31 = lista21.item;
        lista21.pos = (byte) 100;
        java.lang.Object[] objArray34 = lista21.item;
        lista9.item = objArray34;
        int int36 = lista9.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista37.item = objArray42;
        int int44 = lista37.pos;
        lista37.ultimo = (byte) 100;
        lista37.ultimo = (short) 1;
        lista37.imprime();
        lista37.primeiro = '#';
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray57 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista52.item = objArray57;
        boolean boolean59 = lista52.vazia();
        java.lang.Object[] objArray60 = lista52.item;
        lista37.item = objArray60;
        lista9.insere((java.lang.Object) objArray60);
        java.lang.Object[] objArray63 = lista9.item;
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray69 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista64.item = objArray69;
        int int71 = lista64.pos;
        lista64.ultimo = (short) 1;
        lista64.primeiro = 1;
        int int76 = lista64.primeiro;
        lista64.pos = (byte) 1;
        ds.Lista lista79 = new ds.Lista();
        java.lang.Object[] objArray84 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista79.item = objArray84;
        lista79.ultimo = '4';
        ds.Lista lista88 = new ds.Lista();
        java.lang.Object[] objArray93 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista88.item = objArray93;
        lista79.item = objArray93;
        lista64.item = objArray93;
        lista9.item = objArray93;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        lista0.pos = ' ';
        lista0.ultimo = (short) 0;
        int int11 = lista0.pos;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.primeiro = 10;
        lista0.pos = ' ';
        lista0.ultimo = 100;
        lista0.pos = (short) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        int int20 = lista13.pos;
        int int21 = lista13.primeiro;
        int int22 = lista13.pos;
        java.lang.Object[] objArray23 = lista13.item;
        lista13.pos = (byte) 100;
        java.lang.Object[] objArray26 = lista13.item;
        lista0.insere((java.lang.Object) lista13);
        lista0.ultimo = (byte) 0;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        lista0.imprime();
        lista0.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        lista15.ultimo = '4';
        int int24 = lista15.primeiro;
        boolean boolean25 = lista15.vazia();
        int int26 = lista15.pos;
        java.lang.Object[] objArray27 = lista15.item;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray29 = null;
        lista15.item = objArray29;
        lista15.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.primeiro;
        lista0.ultimo = (short) 0;
        lista0.pos = (byte) 100;
        lista0.ultimo = ' ';
        lista0.pos = '4';
        int int20 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        lista13.ultimo = '4';
        int int22 = lista13.primeiro;
        java.lang.Object[] objArray23 = null;
        lista13.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista25.ultimo = '4';
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista34.item = objArray39;
        lista25.item = objArray39;
        int int42 = lista25.primeiro;
        java.lang.Object[] objArray43 = lista25.item;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista44.item = objArray49;
        lista25.item = objArray49;
        lista13.item = objArray49;
        lista0.item = objArray49;
        java.lang.Object[] objArray54 = lista0.item;
        int int55 = lista0.ultimo;
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista56.item = objArray61;
        java.lang.Object[] objArray63 = lista56.item;
        lista56.primeiro = 'a';
        lista56.primeiro = 35;
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray73 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista68.item = objArray73;
        int int75 = lista68.pos;
        lista68.ultimo = (short) 1;
        lista68.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray80 = lista68.item;
        lista56.item = objArray80;
        lista0.insere((java.lang.Object) lista56);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[10, -1, 0, 100.0]");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        lista0.primeiro = (-1);
        java.lang.Object[] objArray15 = lista0.item;
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        int int18 = lista0.primeiro;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        int int20 = lista13.pos;
        lista13.ultimo = (byte) 100;
        lista13.ultimo = (short) 1;
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        lista25.ultimo = (-1);
        boolean boolean29 = lista25.vazia();
        lista13.insere((java.lang.Object) boolean29);
        int int31 = lista13.primeiro;
        java.lang.Object[] objArray32 = lista13.item;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.primeiro;
        int int35 = lista33.primeiro;
        lista33.imprime();
        lista13.insere((java.lang.Object) lista33);
        lista0.insere((java.lang.Object) lista33);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        boolean boolean14 = lista0.vazia();
        int int15 = lista0.ultimo;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        int int9 = lista0.ultimo;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (byte) 1;
        int int13 = lista0.ultimo;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista14.item = objArray19;
        int int21 = lista14.pos;
        lista14.imprime();
        lista14.imprime();
        java.lang.Object[] objArray24 = lista14.item;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        int int32 = lista25.pos;
        lista25.ultimo = (short) 1;
        lista25.primeiro = 1;
        lista14.insere((java.lang.Object) lista25);
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista38.item = objArray43;
        int int45 = lista38.pos;
        lista38.imprime();
        lista38.imprime();
        java.lang.Object[] objArray48 = lista38.item;
        lista25.item = objArray48;
        lista0.item = objArray48;
        boolean boolean51 = lista0.vazia();
        int int52 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (byte) 100;
        int int13 = lista0.ultimo;
        int int14 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (byte) 100;
        int int13 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        boolean boolean14 = lista0.vazia();
        int int15 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        lista0.item = objArray26;
        int int30 = lista0.pos;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        int int38 = lista31.pos;
        lista31.imprime();
        lista31.imprime();
        lista31.primeiro = (short) 0;
        int int43 = lista31.pos;
        lista31.primeiro = (byte) 1;
        lista0.insere((java.lang.Object) lista31);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.pos = (short) 0;
        lista0.ultimo = (-1);
        lista0.primeiro = 97;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista14.item = objArray19;
        int int21 = lista14.pos;
        int int22 = lista14.primeiro;
        int int23 = lista14.pos;
        int int24 = lista14.pos;
        boolean boolean25 = lista14.vazia();
        int int26 = lista14.ultimo;
        lista14.insere((java.lang.Object) 1);
        lista14.imprime();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista30.item = objArray35;
        lista30.ultimo = '4';
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista39.item = objArray44;
        lista30.item = objArray44;
        int int47 = lista30.primeiro;
        java.lang.Object[] objArray48 = lista30.item;
        lista14.item = objArray48;
        lista0.item = objArray48;
        int int51 = lista0.primeiro;
        lista0.pos = 32;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = '#';
        java.lang.Object[] objArray22 = lista0.item;
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        lista0.pos = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista8.item = objArray13;
        int int15 = lista8.pos;
        lista8.ultimo = (byte) 100;
        lista8.ultimo = (short) 1;
        lista8.imprime();
        lista8.primeiro = '#';
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista23.item = objArray28;
        lista23.ultimo = '4';
        int int32 = lista23.primeiro;
        boolean boolean33 = lista23.vazia();
        int int34 = lista23.pos;
        java.lang.Object[] objArray35 = lista23.item;
        lista8.insere((java.lang.Object) lista23);
        lista0.insere((java.lang.Object) lista23);
        int int38 = lista23.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.insere((java.lang.Object) (short) -1);
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        lista12.pos = 'a';
        int int23 = lista12.ultimo;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.ultimo = (byte) 100;
        java.lang.Object[] objArray34 = lista24.item;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista35.item = objArray40;
        int int42 = lista35.pos;
        lista35.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray34, lista35 };
        lista12.item = objArray34;
        lista0.item = objArray34;
        java.lang.Object[] objArray47 = lista0.item;
        int int48 = lista0.pos;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista49.item = objArray54;
        int int56 = lista49.pos;
        lista49.pos = (short) 0;
        lista49.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista49);
        int int62 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.ultimo = (-1);
        boolean boolean16 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean16);
        int int18 = lista0.primeiro;
        lista0.pos = (short) 100;
        int int21 = lista0.pos;
        lista0.imprime();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista23.item = objArray28;
        int int30 = lista23.pos;
        lista23.pos = (short) 0;
        lista23.ultimo = (-1);
        lista23.primeiro = 97;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista37.item = objArray42;
        int int44 = lista37.pos;
        int int45 = lista37.primeiro;
        int int46 = lista37.pos;
        int int47 = lista37.pos;
        boolean boolean48 = lista37.vazia();
        int int49 = lista37.ultimo;
        lista37.insere((java.lang.Object) 1);
        lista37.imprime();
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista53.item = objArray58;
        lista53.ultimo = '4';
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray67 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista62.item = objArray67;
        lista53.item = objArray67;
        int int70 = lista53.primeiro;
        java.lang.Object[] objArray71 = lista53.item;
        lista37.item = objArray71;
        lista23.item = objArray71;
        lista0.item = objArray71;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, false, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.ultimo = (-1);
        boolean boolean16 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean16);
        int int18 = lista0.primeiro;
        lista0.pos = (short) 100;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        int int28 = lista21.pos;
        int int29 = lista21.primeiro;
        int int30 = lista21.pos;
        int int31 = lista21.pos;
        int int32 = lista21.primeiro;
        java.lang.Object[] objArray33 = lista21.item;
        int int34 = lista21.primeiro;
        lista21.imprime();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        int int43 = lista36.pos;
        lista36.imprime();
        lista36.imprime();
        java.lang.Object[] objArray46 = lista36.item;
        lista21.item = objArray46;
        lista21.ultimo = ' ';
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray55 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista50.item = objArray55;
        lista50.ultimo = '4';
        int int59 = lista50.primeiro;
        java.lang.Object[] objArray60 = null;
        lista50.item = objArray60;
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray67 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista62.item = objArray67;
        lista62.ultimo = '4';
        ds.Lista lista71 = new ds.Lista();
        java.lang.Object[] objArray76 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista71.item = objArray76;
        lista62.item = objArray76;
        int int79 = lista62.primeiro;
        java.lang.Object[] objArray80 = lista62.item;
        ds.Lista lista81 = new ds.Lista();
        java.lang.Object[] objArray86 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista81.item = objArray86;
        lista62.item = objArray86;
        lista50.item = objArray86;
        lista21.item = objArray86;
        lista0.insere((java.lang.Object) lista21);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        boolean boolean16 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        boolean boolean23 = lista15.vazia();
        java.lang.Object[] objArray24 = lista15.item;
        lista0.insere((java.lang.Object) objArray24);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (byte) 100;
        int int13 = lista0.ultimo;
        java.lang.Object[] objArray14 = lista0.item;
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.pos;
        lista0.pos = 'a';
        lista0.pos = (short) 10;
        int int22 = lista0.ultimo;
        java.lang.Object[] objArray23 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = (byte) 0;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista37.item = objArray42;
        lista37.ultimo = '4';
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista46.item = objArray51;
        lista37.item = objArray51;
        int int54 = lista37.pos;
        lista37.pos = 'a';
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista57.item = objArray62;
        int int64 = lista57.pos;
        int int65 = lista57.primeiro;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista66.item = objArray71;
        int int73 = lista66.pos;
        lista66.ultimo = (short) 1;
        lista57.insere((java.lang.Object) lista66);
        lista57.ultimo = '#';
        java.lang.Object[] objArray79 = lista57.item;
        lista37.item = objArray79;
        boolean boolean81 = lista37.vazia();
        lista37.primeiro = (short) 10;
        lista11.insere((java.lang.Object) lista37);
        lista37.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        lista0.pos = ' ';
        lista0.ultimo = (short) 0;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (byte) 100;
        lista11.ultimo = (short) 1;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.ultimo = (-1);
        boolean boolean27 = lista23.vazia();
        lista11.insere((java.lang.Object) boolean27);
        int int29 = lista11.primeiro;
        java.lang.Object[] objArray30 = lista11.item;
        lista0.insere((java.lang.Object) objArray30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, false, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, false, 0, 100.0]");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = null;
        lista0.item = objArray6;
        lista0.primeiro = (byte) 100;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = (short) 0;
        lista0.ultimo = (short) 0;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (byte) 100;
        lista0.ultimo = 1;
        lista0.imprime();
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.primeiro = 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.pos;
        lista12.pos = 'a';
        java.lang.Object[] objArray32 = lista12.item;
        lista0.item = objArray32;
        int int34 = lista0.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista35.item = objArray40;
        lista35.ultimo = '4';
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista44.item = objArray49;
        lista35.item = objArray49;
        int int52 = lista35.pos;
        lista35.primeiro = (-1);
        int int55 = lista35.primeiro;
        lista0.insere((java.lang.Object) lista35);
        lista35.pos = 52;
        int int59 = lista35.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 52 + "'", int59 == 52);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.pos;
        int int25 = lista15.pos;
        lista0.insere((java.lang.Object) int25);
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista27.item = objArray32;
        lista27.ultimo = '4';
        int int36 = lista27.primeiro;
        int int37 = lista27.primeiro;
        lista0.insere((java.lang.Object) int37);
        java.lang.Object[] objArray39 = lista0.item;
        java.lang.Object[] objArray40 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 0, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 0, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 0, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 0, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1, 0, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1, 0, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1, 0, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1, 0, 0, 100.0]");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        lista0.ultimo = 35;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        java.lang.Object[] objArray20 = lista13.item;
        lista13.pos = (short) 1;
        java.lang.Object[] objArray23 = lista13.item;
        lista0.item = objArray23;
        java.lang.Class<?> wildcardClass25 = objArray23.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        lista9.imprime();
        int int22 = lista9.primeiro;
        lista9.pos = 100;
        lista9.ultimo = (byte) 100;
        lista9.ultimo = (byte) 1;
        boolean boolean29 = lista9.vazia();
        int int30 = lista9.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        int int10 = lista0.pos;
        lista0.primeiro = 52;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        lista0.pos = (byte) 1;
        boolean boolean14 = lista0.vazia();
        lista0.pos = 32;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        java.lang.Object obj5 = null;
        lista0.insere(obj5);
        lista0.ultimo = (byte) -1;
        lista0.ultimo = 35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        lista15.imprime();
        int int24 = lista15.ultimo;
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        java.lang.Object[] objArray16 = lista0.item;
        java.lang.Object[] objArray17 = lista0.item;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista18.item = objArray23;
        int int25 = lista18.pos;
        int int26 = lista18.primeiro;
        int int27 = lista18.pos;
        int int28 = lista18.pos;
        boolean boolean29 = lista18.vazia();
        int int30 = lista18.pos;
        lista18.ultimo = (short) 100;
        lista18.primeiro = (short) -1;
        int int35 = lista18.ultimo;
        boolean boolean36 = lista18.vazia();
        java.lang.Object[] objArray37 = lista18.item;
        lista0.item = objArray37;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        java.lang.Object[] objArray17 = lista14.item;
        lista0.item = objArray17;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = 0;
        lista0.ultimo = 32;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.primeiro = 10;
        lista0.pos = ' ';
        lista0.ultimo = 100;
        int int20 = lista0.primeiro;
        int int21 = lista0.pos;
        int int22 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        lista0.item = objArray26;
        lista0.pos = 0;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista32.item = objArray37;
        int int39 = lista32.pos;
        lista32.ultimo = (byte) 100;
        lista32.ultimo = (short) 1;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista44.item = objArray49;
        lista44.ultimo = '4';
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista53.item = objArray58;
        lista44.item = objArray58;
        lista32.item = objArray58;
        java.lang.Object[] objArray62 = lista32.item;
        lista0.insere((java.lang.Object) objArray62);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista37.item = objArray42;
        lista37.ultimo = '4';
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista46.item = objArray51;
        lista37.item = objArray51;
        int int54 = lista37.pos;
        lista37.pos = 'a';
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista57.item = objArray62;
        int int64 = lista57.pos;
        int int65 = lista57.primeiro;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista66.item = objArray71;
        int int73 = lista66.pos;
        lista66.ultimo = (short) 1;
        lista57.insere((java.lang.Object) lista66);
        lista57.ultimo = '#';
        java.lang.Object[] objArray79 = lista57.item;
        lista37.item = objArray79;
        boolean boolean81 = lista37.vazia();
        lista37.primeiro = (short) 10;
        lista11.insere((java.lang.Object) lista37);
        java.lang.Class<?> wildcardClass85 = lista37.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.insere((java.lang.Object) (short) -1);
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        lista12.pos = 'a';
        int int23 = lista12.ultimo;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.ultimo = (byte) 100;
        java.lang.Object[] objArray34 = lista24.item;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista35.item = objArray40;
        int int42 = lista35.pos;
        lista35.imprime();
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray34, lista35 };
        lista12.item = objArray34;
        lista0.item = objArray34;
        java.lang.Object[] objArray47 = lista0.item;
        int int48 = lista0.pos;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista49.item = objArray54;
        int int56 = lista49.pos;
        lista49.pos = (short) 0;
        lista49.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) lista49);
        lista49.pos = (short) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        lista0.primeiro = (-1);
        int int15 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.pos = 100;
        int int7 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (byte) 100;
        lista0.primeiro = 97;
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        lista11.ultimo = 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.primeiro = (short) -1;
        int int17 = lista13.ultimo;
        int int18 = lista13.ultimo;
        java.lang.Object[] objArray19 = null;
        lista13.item = objArray19;
        lista13.primeiro = (byte) 100;
        lista13.imprime();
        boolean boolean24 = lista13.vazia();
        lista13.ultimo = 2;
        lista0.insere((java.lang.Object) lista13);
        boolean boolean28 = lista13.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista8.item = objArray13;
        int int15 = lista8.pos;
        int int16 = lista8.primeiro;
        int int17 = lista8.pos;
        java.lang.Object[] objArray18 = lista8.item;
        java.lang.Object[] objArray19 = lista8.item;
        java.lang.Object[] objArray20 = lista8.item;
        java.lang.Class<?> wildcardClass21 = lista8.getClass();
        lista0.insere((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[class ds.Lista, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[class ds.Lista, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class ds.Lista, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class ds.Lista, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        boolean boolean14 = lista0.vazia();
        boolean boolean15 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.pos = (short) 0;
        lista0.ultimo = (-1);
        int int12 = lista0.primeiro;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        int int20 = lista13.pos;
        int int21 = lista13.primeiro;
        int int22 = lista13.pos;
        int int23 = lista13.pos;
        int int24 = lista13.primeiro;
        boolean boolean25 = lista13.vazia();
        lista13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista5.item = objArray10;
        int int12 = lista5.pos;
        int int13 = lista5.primeiro;
        lista5.imprime();
        java.lang.Object[] objArray15 = lista5.item;
        lista0.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista17.item = objArray22;
        lista17.ultimo = '4';
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista26.item = objArray31;
        lista26.ultimo = '4';
        int int35 = lista26.primeiro;
        boolean boolean36 = lista26.vazia();
        int int37 = lista26.pos;
        boolean boolean38 = lista26.vazia();
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista39.item = objArray44;
        int int46 = lista39.pos;
        int int47 = lista39.primeiro;
        int int48 = lista39.pos;
        int int49 = lista39.pos;
        int int50 = lista39.primeiro;
        java.lang.Object[] objArray51 = lista39.item;
        int int52 = lista39.primeiro;
        lista39.imprime();
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray59 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista54.item = objArray59;
        int int61 = lista54.pos;
        lista54.imprime();
        lista54.imprime();
        java.lang.Object[] objArray64 = lista54.item;
        lista39.item = objArray64;
        lista26.item = objArray64;
        lista17.item = objArray64;
        lista0.item = objArray64;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 1;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.primeiro = 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        lista0.pos = (byte) 1;
        boolean boolean14 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.pos = 'a';
        int int19 = lista0.pos;
        int int20 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.ultimo = (-1);
        boolean boolean16 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean16);
        int int18 = lista0.primeiro;
        java.lang.Object[] objArray19 = lista0.item;
        int int20 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, false, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, false, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        int int17 = lista10.pos;
        lista10.ultimo = (short) 1;
        lista10.insere((java.lang.Object) (short) -1);
        int int22 = lista10.pos;
        lista10.primeiro = 97;
        lista0.insere((java.lang.Object) lista10);
        int int26 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = 100;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        int int21 = lista12.primeiro;
        boolean boolean22 = lista12.vazia();
        lista12.ultimo = 97;
        int int25 = lista12.pos;
        lista12.primeiro = (short) 100;
        java.lang.Object[] objArray28 = lista12.item;
        lista0.item = objArray28;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.pos = 1;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista14.item = objArray19;
        lista14.ultimo = '4';
        int int23 = lista14.primeiro;
        boolean boolean24 = lista14.vazia();
        lista14.ultimo = 97;
        int int27 = lista14.pos;
        lista14.primeiro = (short) 100;
        int int30 = lista14.ultimo;
        lista14.pos = 100;
        java.lang.Object[] objArray33 = lista14.item;
        boolean boolean34 = lista14.vazia();
        int int35 = lista14.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista8.item = objArray13;
        lista8.ultimo = '4';
        lista8.pos = 'a';
        java.lang.Object[] objArray19 = lista8.item;
        lista0.item = objArray19;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista21.ultimo = '4';
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista30.item = objArray35;
        int int37 = lista30.pos;
        int int38 = lista30.primeiro;
        int int39 = lista30.pos;
        java.lang.Object[] objArray40 = lista30.item;
        java.lang.Object[] objArray41 = lista30.item;
        java.lang.Object[] objArray42 = lista30.item;
        lista21.item = objArray42;
        lista0.item = objArray42;
        java.lang.Object[] objArray45 = lista0.item;
        lista0.pos = 3;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        int int2 = lista0.primeiro;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.primeiro;
        lista0.ultimo = (short) 0;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (byte) -1;
        lista0.imprime();
        lista0.primeiro = '#';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = (byte) 100;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        int int19 = lista0.pos;
        lista0.ultimo = 0;
        lista0.primeiro = (short) -1;
        lista0.ultimo = ' ';
        lista0.pos = '#';
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        boolean boolean14 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object obj12 = null;
        lista0.insere(obj12);
        lista0.pos = 'a';
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        int int16 = lista0.ultimo;
        lista0.pos = 100;
        java.lang.Object[] objArray19 = lista0.item;
        boolean boolean20 = lista0.vazia();
        java.lang.Object[] objArray21 = lista0.item;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.primeiro = 1;
        int int12 = lista0.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        lista13.ultimo = '4';
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista22.item = objArray27;
        lista13.item = objArray27;
        int int30 = lista13.primeiro;
        int int31 = lista13.pos;
        int int32 = lista13.ultimo;
        int int33 = lista13.pos;
        java.lang.Object[] objArray34 = lista13.item;
        lista0.item = objArray34;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        lista0.primeiro = 1;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista6.item = objArray11;
        int int13 = lista6.pos;
        int int14 = lista6.primeiro;
        int int15 = lista6.pos;
        int int16 = lista6.pos;
        int int17 = lista6.primeiro;
        java.lang.Object[] objArray18 = lista6.item;
        int int19 = lista6.primeiro;
        boolean boolean20 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean20);
        lista0.primeiro = '4';
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.pos;
        lista0.imprime();
        int int14 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        lista0.ultimo = 52;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        int int28 = lista21.pos;
        int int29 = lista21.primeiro;
        int int30 = lista21.pos;
        java.lang.Object[] objArray31 = lista21.item;
        lista21.pos = (byte) 100;
        java.lang.Object[] objArray34 = lista21.item;
        lista9.item = objArray34;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        int int43 = lista36.pos;
        int int44 = lista36.primeiro;
        int int45 = lista36.pos;
        java.lang.Object[] objArray46 = lista36.item;
        lista36.pos = (byte) 100;
        java.lang.Object[] objArray49 = lista36.item;
        lista9.item = objArray49;
        boolean boolean51 = lista9.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        lista0.pos = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista8.item = objArray13;
        int int15 = lista8.pos;
        lista8.ultimo = (byte) 100;
        lista8.ultimo = (short) 1;
        lista8.imprime();
        lista8.primeiro = '#';
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista23.item = objArray28;
        lista23.ultimo = '4';
        int int32 = lista23.primeiro;
        boolean boolean33 = lista23.vazia();
        int int34 = lista23.pos;
        java.lang.Object[] objArray35 = lista23.item;
        lista8.insere((java.lang.Object) lista23);
        lista0.insere((java.lang.Object) lista23);
        int int38 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.primeiro = 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.pos;
        lista12.pos = 'a';
        java.lang.Object[] objArray32 = lista12.item;
        lista0.item = objArray32;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista34.item = objArray39;
        lista34.ultimo = '4';
        lista34.pos = 'a';
        int int45 = lista34.ultimo;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista46.item = objArray51;
        int int53 = lista46.pos;
        lista46.ultimo = (byte) 100;
        java.lang.Object[] objArray56 = lista46.item;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista57.item = objArray62;
        int int64 = lista57.pos;
        lista57.imprime();
        java.lang.Object[] objArray66 = new java.lang.Object[] { objArray56, lista57 };
        lista34.item = objArray56;
        lista34.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        lista0.ultimo = '4';
        int int73 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        lista0.pos = ' ';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        lista0.imprime();
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        java.lang.Object[] objArray19 = lista12.item;
        lista12.pos = (short) 1;
        java.lang.Object[] objArray22 = lista12.item;
        lista11.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        lista24.ultimo = '4';
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray38 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista33.item = objArray38;
        lista24.item = objArray38;
        int int41 = lista24.primeiro;
        int int42 = lista24.pos;
        int int43 = lista24.ultimo;
        boolean boolean44 = lista24.vazia();
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista45.item = objArray50;
        int int52 = lista45.pos;
        int int53 = lista45.primeiro;
        int int54 = lista45.pos;
        java.lang.Object[] objArray55 = lista45.item;
        lista24.item = objArray55;
        lista11.item = objArray55;
        lista0.item = objArray55;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray64 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista59.item = objArray64;
        lista59.ultimo = (short) 0;
        java.lang.Object[] objArray68 = lista59.item;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray74 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista69.item = objArray74;
        int int76 = lista69.pos;
        lista69.ultimo = (short) 1;
        lista69.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray81 = lista69.item;
        lista59.insere((java.lang.Object) lista69);
        lista0.insere((java.lang.Object) lista69);
        lista69.ultimo = (short) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[10, -1, 0, 100.0]");
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.primeiro;
        java.lang.Object[] objArray30 = lista12.item;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista12.item = objArray36;
        lista0.item = objArray36;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista40.item = objArray45;
        int int47 = lista40.pos;
        int int48 = lista40.primeiro;
        int int49 = lista40.pos;
        int int50 = lista40.pos;
        boolean boolean51 = lista40.vazia();
        lista40.ultimo = '4';
        int int54 = lista40.primeiro;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        int int58 = lista55.pos;
        int int59 = lista55.primeiro;
        lista55.ultimo = 97;
        lista55.primeiro = 10;
        java.lang.Object[] objArray64 = lista55.item;
        lista40.item = objArray64;
        lista0.item = objArray64;
        java.lang.Class<?> wildcardClass67 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.primeiro = 10;
        lista0.pos = ' ';
        boolean boolean18 = lista0.vazia();
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista19.item = objArray24;
        int int26 = lista19.pos;
        lista19.ultimo = (byte) 100;
        lista19.ultimo = (short) 1;
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.ultimo = (-1);
        boolean boolean35 = lista31.vazia();
        lista19.insere((java.lang.Object) boolean35);
        int int37 = lista19.primeiro;
        lista0.insere((java.lang.Object) int37);
        lista0.imprime();
        int int40 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, false, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, false, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        lista0.ultimo = (short) 10;
        int int21 = lista0.pos;
        lista0.pos = 35;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        int int33 = lista24.ultimo;
        java.lang.Object[] objArray34 = lista24.item;
        lista24.ultimo = (byte) 1;
        int int37 = lista24.ultimo;
        int int38 = lista24.ultimo;
        java.lang.Object[] objArray39 = lista24.item;
        java.lang.Object[] objArray40 = lista24.item;
        lista0.item = objArray40;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista42.item = objArray47;
        int int49 = lista42.pos;
        lista42.ultimo = (short) 1;
        lista42.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray54 = lista42.item;
        lista0.item = objArray54;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, -1, 0, 100.0]");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        int int19 = lista0.pos;
        lista0.ultimo = 0;
        lista0.primeiro = (short) -1;
        lista0.ultimo = ' ';
        lista0.pos = '#';
        int int28 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.pos = (short) 0;
        lista0.ultimo = (byte) 100;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        int int21 = lista12.primeiro;
        int int22 = lista12.ultimo;
        boolean boolean23 = lista12.vazia();
        lista12.pos = 'a';
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        int int14 = lista0.primeiro;
        lista0.ultimo = (byte) 1;
        lista0.pos = 35;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        int int22 = lista19.pos;
        int int23 = lista19.primeiro;
        lista19.imprime();
        lista19.primeiro = (byte) 0;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista27.item = objArray32;
        lista27.ultimo = '4';
        lista27.pos = 'a';
        java.lang.Object[] objArray38 = lista27.item;
        lista19.item = objArray38;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista40.item = objArray45;
        lista40.ultimo = '4';
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista49.item = objArray54;
        int int56 = lista49.pos;
        int int57 = lista49.primeiro;
        int int58 = lista49.pos;
        java.lang.Object[] objArray59 = lista49.item;
        java.lang.Object[] objArray60 = lista49.item;
        java.lang.Object[] objArray61 = lista49.item;
        lista40.item = objArray61;
        lista19.item = objArray61;
        java.lang.Object[] objArray64 = lista19.item;
        lista0.item = objArray64;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        int int17 = lista10.pos;
        lista10.ultimo = (byte) 100;
        lista10.ultimo = (short) 1;
        lista10.imprime();
        lista10.primeiro = '#';
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista25.ultimo = '4';
        int int34 = lista25.primeiro;
        boolean boolean35 = lista25.vazia();
        int int36 = lista25.pos;
        java.lang.Object[] objArray37 = lista25.item;
        lista10.insere((java.lang.Object) lista25);
        boolean boolean39 = lista10.vazia();
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.primeiro;
        lista40.primeiro = (short) -1;
        lista40.primeiro = 1;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista46.item = objArray51;
        int int53 = lista46.pos;
        int int54 = lista46.primeiro;
        int int55 = lista46.pos;
        int int56 = lista46.pos;
        int int57 = lista46.primeiro;
        java.lang.Object[] objArray58 = lista46.item;
        int int59 = lista46.primeiro;
        boolean boolean60 = lista46.vazia();
        lista40.insere((java.lang.Object) boolean60);
        lista40.primeiro = '4';
        boolean boolean64 = lista40.vazia();
        java.lang.Object[] objArray65 = lista40.item;
        lista10.item = objArray65;
        lista0.item = objArray65;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista1.item = objArray6;
        java.lang.Object[] objArray8 = lista1.item;
        lista1.pos = (short) 1;
        java.lang.Object[] objArray11 = lista1.item;
        lista0.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        lista13.ultimo = '4';
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista22.item = objArray27;
        lista13.item = objArray27;
        int int30 = lista13.primeiro;
        int int31 = lista13.pos;
        int int32 = lista13.ultimo;
        boolean boolean33 = lista13.vazia();
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista34.item = objArray39;
        int int41 = lista34.pos;
        int int42 = lista34.primeiro;
        int int43 = lista34.pos;
        java.lang.Object[] objArray44 = lista34.item;
        lista13.item = objArray44;
        lista0.item = objArray44;
        int int47 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        java.lang.Object[] objArray50 = lista0.item;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.primeiro = 35;
        int int11 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista14.item = objArray19;
        int int21 = lista14.pos;
        int int22 = lista14.primeiro;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista23.item = objArray28;
        int int30 = lista23.pos;
        lista23.ultimo = (short) 1;
        lista14.insere((java.lang.Object) lista23);
        int int34 = lista23.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista35.item = objArray40;
        int int42 = lista35.pos;
        int int43 = lista35.primeiro;
        int int44 = lista35.pos;
        java.lang.Object[] objArray45 = lista35.item;
        lista35.pos = (byte) 100;
        java.lang.Object[] objArray48 = lista35.item;
        lista23.item = objArray48;
        int int50 = lista23.pos;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista51.item = objArray56;
        int int58 = lista51.pos;
        lista51.ultimo = (byte) 100;
        lista51.ultimo = (short) 1;
        lista51.imprime();
        lista51.primeiro = '#';
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista66.item = objArray71;
        boolean boolean73 = lista66.vazia();
        java.lang.Object[] objArray74 = lista66.item;
        lista51.item = objArray74;
        lista23.insere((java.lang.Object) objArray74);
        lista0.item = objArray74;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = (short) 0;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.ultimo = (-1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        lista0.primeiro = (short) 100;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.primeiro = 'a';
        lista0.primeiro = 35;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        lista12.pos = 'a';
        int int23 = lista12.ultimo;
        lista12.ultimo = 1;
        lista12.pos = 1;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista28.item = objArray33;
        lista28.ultimo = '4';
        lista28.pos = 'a';
        int int39 = lista28.ultimo;
        int int40 = lista28.pos;
        boolean boolean41 = lista28.vazia();
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista42.item = objArray47;
        java.lang.Object[] objArray49 = lista42.item;
        lista28.item = objArray49;
        lista12.item = objArray49;
        boolean boolean52 = lista12.vazia();
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        lista12.imprime();
        java.lang.Object[] objArray56 = null;
        lista12.item = objArray56;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        java.lang.Object[] objArray11 = lista0.item;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista14.item = objArray19;
        int int21 = lista14.pos;
        lista14.ultimo = (short) 1;
        lista14.primeiro = 1;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista26.item = objArray31;
        lista26.ultimo = '4';
        lista26.pos = 'a';
        int int37 = lista26.ultimo;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista38.item = objArray43;
        int int45 = lista38.pos;
        lista38.ultimo = (byte) 100;
        java.lang.Object[] objArray48 = lista38.item;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista49.item = objArray54;
        int int56 = lista49.pos;
        lista49.imprime();
        java.lang.Object[] objArray58 = new java.lang.Object[] { objArray48, lista49 };
        lista26.item = objArray48;
        lista14.item = objArray48;
        lista0.item = objArray48;
        java.lang.Object[] objArray62 = lista0.item;
        lista0.primeiro = 2;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.ultimo = 97;
        int int7 = lista0.pos;
        lista0.primeiro = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        lista10.ultimo = '4';
        int int19 = lista10.primeiro;
        java.lang.Object[] objArray20 = null;
        lista10.item = objArray20;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista22.item = objArray27;
        lista22.ultimo = '4';
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista22.item = objArray36;
        int int39 = lista22.primeiro;
        java.lang.Object[] objArray40 = lista22.item;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista41.item = objArray46;
        lista22.item = objArray46;
        lista10.item = objArray46;
        boolean boolean50 = lista10.vazia();
        lista10.primeiro = 97;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista53.item = objArray58;
        java.lang.Object[] objArray60 = lista53.item;
        lista10.item = objArray60;
        lista0.insere((java.lang.Object) lista10);
        boolean boolean63 = lista0.vazia();
        java.lang.Object[] objArray64 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        lista0.primeiro = 1;
        lista0.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = (short) -1;
        int int15 = lista0.pos;
        java.lang.Object[] objArray16 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.insere((java.lang.Object) 1);
        lista0.imprime();
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista16.item = objArray21;
        lista16.ultimo = '4';
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista16.item = objArray30;
        int int33 = lista16.primeiro;
        java.lang.Object[] objArray34 = lista16.item;
        lista0.item = objArray34;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        lista36.ultimo = '4';
        int int45 = lista36.primeiro;
        java.lang.Object[] objArray46 = null;
        lista36.item = objArray46;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista48.item = objArray53;
        lista48.ultimo = '4';
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista57.item = objArray62;
        lista48.item = objArray62;
        int int65 = lista48.primeiro;
        java.lang.Object[] objArray66 = lista48.item;
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray72 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista67.item = objArray72;
        lista48.item = objArray72;
        lista36.item = objArray72;
        boolean boolean76 = lista36.vazia();
        java.lang.Object[] objArray77 = lista36.item;
        int int78 = lista36.ultimo;
        lista0.insere((java.lang.Object) lista36);
        ds.Lista lista80 = new ds.Lista();
        java.lang.Object[] objArray85 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista80.item = objArray85;
        lista80.ultimo = '4';
        lista80.pos = 'a';
        int int91 = lista80.primeiro;
        lista80.ultimo = (short) 0;
        lista80.pos = (byte) 100;
        java.lang.Object[] objArray96 = lista80.item;
        lista0.item = objArray96;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 52 + "'", int78 == 52);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray96), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray96), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int7 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.pos = 52;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        int int19 = lista12.pos;
        int int20 = lista12.primeiro;
        int int21 = lista12.pos;
        int int22 = lista12.pos;
        boolean boolean23 = lista12.vazia();
        int int24 = lista12.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista25.ultimo = '4';
        int int34 = lista25.primeiro;
        java.lang.Object[] objArray35 = null;
        lista25.item = objArray35;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista37.item = objArray42;
        lista37.ultimo = '4';
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista46.item = objArray51;
        lista37.item = objArray51;
        int int54 = lista37.primeiro;
        java.lang.Object[] objArray55 = lista37.item;
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista56.item = objArray61;
        lista37.item = objArray61;
        lista25.item = objArray61;
        lista12.item = objArray61;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista66.item = objArray71;
        lista66.ultimo = '4';
        ds.Lista lista75 = new ds.Lista();
        java.lang.Object[] objArray80 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista75.item = objArray80;
        lista66.item = objArray80;
        int int83 = lista66.primeiro;
        java.lang.Object[] objArray84 = lista66.item;
        int int85 = lista66.primeiro;
        ds.Lista lista86 = new ds.Lista();
        java.lang.Object[] objArray91 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista86.item = objArray91;
        int int93 = lista86.pos;
        int int94 = lista86.primeiro;
        lista86.imprime();
        java.lang.Object[] objArray96 = lista86.item;
        lista66.item = objArray96;
        lista12.item = objArray96;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray96), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray96), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.insere((java.lang.Object) 1);
        lista0.primeiro = 35;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        boolean boolean14 = lista0.vazia();
        int int15 = lista0.ultimo;
        lista0.primeiro = 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.pos;
        lista0.pos = 'a';
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista20.item = objArray25;
        int int27 = lista20.pos;
        int int28 = lista20.primeiro;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista29.item = objArray34;
        int int36 = lista29.pos;
        lista29.ultimo = (short) 1;
        lista20.insere((java.lang.Object) lista29);
        lista20.ultimo = '#';
        java.lang.Object[] objArray42 = lista20.item;
        lista0.item = objArray42;
        boolean boolean44 = lista0.vazia();
        lista0.primeiro = (short) 10;
        java.lang.Class<?> wildcardClass47 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        java.lang.Object[] objArray13 = lista0.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (byte) -1;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        lista0.ultimo = (short) 10;
        int int21 = lista0.pos;
        lista0.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        lista0.primeiro = (byte) 0;
        int int13 = lista0.pos;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        lista15.imprime();
        lista15.imprime();
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        int int27 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        lista0.ultimo = 35;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.pos;
        lista0.ultimo = (byte) 1;
        lista0.pos = (byte) 10;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista37.item = objArray42;
        lista37.ultimo = '4';
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista46.item = objArray51;
        lista37.item = objArray51;
        int int54 = lista37.pos;
        lista37.pos = 'a';
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista57.item = objArray62;
        int int64 = lista57.pos;
        int int65 = lista57.primeiro;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista66.item = objArray71;
        int int73 = lista66.pos;
        lista66.ultimo = (short) 1;
        lista57.insere((java.lang.Object) lista66);
        lista57.ultimo = '#';
        java.lang.Object[] objArray79 = lista57.item;
        lista37.item = objArray79;
        boolean boolean81 = lista37.vazia();
        lista37.primeiro = (short) 10;
        lista11.insere((java.lang.Object) lista37);
        lista11.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.primeiro = 'a';
        lista0.primeiro = 35;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        int int19 = lista12.pos;
        lista12.ultimo = (short) 1;
        lista12.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray24 = lista12.item;
        lista0.item = objArray24;
        lista0.primeiro = 'a';
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, 0, 100.0]");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        int int19 = lista12.pos;
        lista12.ultimo = (byte) 100;
        java.lang.Object[] objArray22 = lista12.item;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista23.item = objArray28;
        int int30 = lista23.pos;
        lista23.imprime();
        java.lang.Object[] objArray32 = new java.lang.Object[] { objArray22, lista23 };
        lista0.item = objArray22;
        java.lang.Object[] objArray34 = lista0.item;
        boolean boolean35 = lista0.vazia();
        lista0.pos = (byte) 1;
        boolean boolean38 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        int int19 = lista0.primeiro;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista20.item = objArray25;
        int int27 = lista20.pos;
        int int28 = lista20.primeiro;
        lista20.imprime();
        java.lang.Object[] objArray30 = lista20.item;
        lista0.item = objArray30;
        boolean boolean32 = lista0.vazia();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray38 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista33.item = objArray38;
        int int40 = lista33.pos;
        int int41 = lista33.primeiro;
        int int42 = lista33.pos;
        int int43 = lista33.pos;
        int int44 = lista33.primeiro;
        int int45 = lista33.primeiro;
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista46.item = objArray51;
        lista46.ultimo = '4';
        int int55 = lista46.primeiro;
        java.lang.Object[] objArray56 = lista46.item;
        lista33.item = objArray56;
        lista0.item = objArray56;
        java.lang.Class<?> wildcardClass59 = objArray56.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.pos;
        int int18 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.primeiro = 35;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.ultimo = 0;
        java.lang.Object[] objArray14 = null;
        lista0.item = objArray14;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        int int18 = lista0.pos;
        int int19 = lista0.ultimo;
        int int20 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.pos;
        lista0.imprime();
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        lista0.ultimo = '#';
        java.lang.Object[] objArray22 = lista0.item;
        lista0.primeiro = (short) 1;
        lista0.primeiro = 52;
        boolean boolean27 = lista0.vazia();
        java.lang.Object[] objArray28 = lista0.item;
        int int29 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        int int16 = lista0.ultimo;
        lista0.pos = 100;
        int int19 = lista0.primeiro;
        java.lang.Object[] objArray20 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.pos = 1;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista16.item = objArray21;
        lista16.ultimo = '4';
        lista16.pos = 'a';
        int int27 = lista16.ultimo;
        int int28 = lista16.pos;
        boolean boolean29 = lista16.vazia();
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista30.item = objArray35;
        java.lang.Object[] objArray37 = lista30.item;
        lista16.item = objArray37;
        lista0.item = objArray37;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista40.item = objArray45;
        java.lang.Object[] objArray47 = lista40.item;
        lista40.pos = (short) 1;
        java.lang.Object[] objArray50 = lista40.item;
        int int51 = lista40.ultimo;
        int int52 = lista40.ultimo;
        int int53 = lista40.ultimo;
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray59 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista54.item = objArray59;
        int int61 = lista54.pos;
        int int62 = lista54.primeiro;
        ds.Lista lista63 = new ds.Lista();
        java.lang.Object[] objArray68 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista63.item = objArray68;
        int int70 = lista63.pos;
        lista63.ultimo = (short) 1;
        lista54.insere((java.lang.Object) lista63);
        int int74 = lista63.pos;
        lista63.imprime();
        int int76 = lista63.primeiro;
        lista40.insere((java.lang.Object) int76);
        lista0.insere((java.lang.Object) lista40);
        lista40.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[0, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[0, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[0, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[0, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        int int16 = lista0.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista17.item = objArray22;
        lista17.ultimo = '4';
        int int26 = lista17.primeiro;
        java.lang.Object[] objArray27 = null;
        lista17.item = objArray27;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista29.item = objArray34;
        lista29.ultimo = '4';
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista38.item = objArray43;
        lista29.item = objArray43;
        int int46 = lista29.primeiro;
        java.lang.Object[] objArray47 = lista29.item;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista48.item = objArray53;
        lista29.item = objArray53;
        lista17.item = objArray53;
        boolean boolean57 = lista17.vazia();
        java.lang.Object[] objArray58 = lista17.item;
        lista0.item = objArray58;
        int int60 = lista0.pos;
        int int61 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        lista15.imprime();
        lista15.imprime();
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        lista0.imprime();
        boolean boolean28 = lista0.vazia();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista29.item = objArray34;
        lista29.ultimo = '4';
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista38.item = objArray43;
        lista29.item = objArray43;
        int int46 = lista29.primeiro;
        java.lang.Object[] objArray47 = lista29.item;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista48.item = objArray53;
        lista29.item = objArray53;
        lista29.primeiro = 100;
        lista0.insere((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.insere((java.lang.Object) 1);
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        lista15.ultimo = '4';
        lista15.pos = 'a';
        int int26 = lista15.ultimo;
        lista15.ultimo = 1;
        lista15.primeiro = 10;
        lista15.pos = ' ';
        boolean boolean33 = lista15.vazia();
        lista15.primeiro = (byte) 10;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        int int43 = lista36.pos;
        int int44 = lista36.primeiro;
        int int45 = lista36.pos;
        int int46 = lista36.pos;
        int int47 = lista36.primeiro;
        java.lang.Object[] objArray48 = lista36.item;
        int int49 = lista36.primeiro;
        lista36.imprime();
        lista15.insere((java.lang.Object) lista36);
        lista0.insere((java.lang.Object) lista36);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (byte) -1;
        int int13 = lista0.primeiro;
        lista0.primeiro = 35;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        lista11.pos = (short) 100;
        int int39 = lista11.ultimo;
        java.lang.Class<?> wildcardClass40 = lista11.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.ultimo = 1;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.imprime();
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista19.item = objArray24;
        lista0.item = objArray24;
        boolean boolean27 = lista0.vazia();
        int int28 = lista0.pos;
        java.lang.Object[] objArray29 = lista0.item;
        java.lang.Object[] objArray30 = lista0.item;
        lista0.ultimo = 100;
        int int33 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.ultimo = (-1);
        boolean boolean16 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean16);
        int int18 = lista0.primeiro;
        java.lang.Object[] objArray19 = lista0.item;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.primeiro;
        int int22 = lista20.primeiro;
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        int int32 = lista25.pos;
        int int33 = lista25.primeiro;
        int int34 = lista25.pos;
        int int35 = lista25.pos;
        int int36 = lista25.primeiro;
        boolean boolean37 = lista25.vazia();
        lista25.imprime();
        lista20.insere((java.lang.Object) lista25);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        lista11.primeiro = '4';
        int int27 = lista11.pos;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista28.item = objArray33;
        int int35 = lista28.pos;
        int int36 = lista28.primeiro;
        int int37 = lista28.pos;
        int int38 = lista28.pos;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista39.item = objArray44;
        int int46 = lista39.pos;
        lista39.imprime();
        lista39.imprime();
        java.lang.Object[] objArray49 = lista39.item;
        lista28.item = objArray49;
        lista11.item = objArray49;
        java.lang.Object[] objArray52 = lista11.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        int int17 = lista10.pos;
        int int18 = lista10.primeiro;
        int int19 = lista10.pos;
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        boolean boolean22 = lista0.vazia();
        boolean boolean23 = lista0.vazia();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        lista24.ultimo = '4';
        lista24.pos = 'a';
        int int35 = lista24.ultimo;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        int int43 = lista36.pos;
        lista36.ultimo = (byte) 100;
        java.lang.Object[] objArray46 = lista36.item;
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista47.item = objArray52;
        int int54 = lista47.pos;
        lista47.imprime();
        java.lang.Object[] objArray56 = new java.lang.Object[] { objArray46, lista47 };
        lista24.item = objArray46;
        lista24.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) lista24);
        int int61 = lista24.ultimo;
        int int62 = lista24.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.primeiro;
        java.lang.Object[] objArray30 = lista12.item;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista12.item = objArray36;
        lista0.item = objArray36;
        boolean boolean40 = lista0.vazia();
        java.lang.Object[] objArray41 = lista0.item;
        int int42 = lista0.ultimo;
        java.lang.Object[] objArray43 = lista0.item;
        lista0.pos = (byte) 1;
        lista0.pos = 2;
        int int48 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        int int17 = lista10.pos;
        lista10.ultimo = (short) 1;
        lista10.primeiro = 1;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista22.item = objArray27;
        lista22.ultimo = '4';
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista22.item = objArray36;
        int int39 = lista22.pos;
        lista22.pos = 'a';
        java.lang.Object[] objArray42 = lista22.item;
        lista10.item = objArray42;
        lista0.insere((java.lang.Object) lista10);
        lista0.imprime();
        lista0.ultimo = 35;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista48.item = objArray53;
        int int55 = lista48.pos;
        int int56 = lista48.primeiro;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista57.item = objArray62;
        int int64 = lista57.pos;
        lista57.ultimo = (short) 1;
        lista48.insere((java.lang.Object) lista57);
        lista48.ultimo = '#';
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista48);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (short) 1;
        lista0.primeiro = 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.pos;
        lista12.pos = 'a';
        java.lang.Object[] objArray32 = lista12.item;
        lista0.item = objArray32;
        int int34 = lista0.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista35.item = objArray40;
        lista35.ultimo = '4';
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista44.item = objArray49;
        lista35.item = objArray49;
        int int52 = lista35.pos;
        lista35.primeiro = (-1);
        int int55 = lista35.primeiro;
        lista0.insere((java.lang.Object) lista35);
        lista35.pos = 52;
        lista35.primeiro = 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        int int14 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.primeiro = 35;
        int int11 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int14 = lista0.pos;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        lista15.ultimo = '4';
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        lista15.item = objArray29;
        int int32 = lista15.primeiro;
        int int33 = lista15.pos;
        int int34 = lista15.ultimo;
        int int35 = lista15.pos;
        java.lang.Object[] objArray36 = lista15.item;
        lista0.item = objArray36;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.pos = (short) 0;
        lista0.ultimo = (-1);
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        lista0.ultimo = (byte) 0;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista16.item = objArray21;
        int int23 = lista16.pos;
        lista16.imprime();
        lista16.imprime();
        java.lang.Object[] objArray26 = lista16.item;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista27.item = objArray32;
        int int34 = lista27.pos;
        lista27.ultimo = (short) 1;
        lista27.primeiro = 1;
        lista16.insere((java.lang.Object) lista27);
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista40.item = objArray45;
        int int47 = lista40.pos;
        lista40.imprime();
        lista40.imprime();
        java.lang.Object[] objArray50 = lista40.item;
        lista27.item = objArray50;
        int int52 = lista27.pos;
        lista27.primeiro = 0;
        lista0.insere((java.lang.Object) lista27);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        int int18 = lista0.pos;
        int int19 = lista0.ultimo;
        int int20 = lista0.pos;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        lista0.ultimo = (byte) 0;
        lista0.ultimo = 32;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.primeiro;
        lista0.ultimo = (short) 0;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        int int28 = lista21.pos;
        int int29 = lista21.primeiro;
        int int30 = lista21.pos;
        java.lang.Object[] objArray31 = lista21.item;
        lista21.pos = (byte) 100;
        java.lang.Object[] objArray34 = lista21.item;
        lista9.item = objArray34;
        int int36 = lista9.ultimo;
        lista9.pos = (short) 10;
        int int39 = lista9.primeiro;
        int int40 = lista9.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.ultimo;
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.primeiro;
        java.lang.Object[] objArray30 = lista12.item;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista12.item = objArray36;
        lista0.item = objArray36;
        boolean boolean40 = lista0.vazia();
        java.lang.Object[] objArray41 = lista0.item;
        int int42 = lista0.ultimo;
        lista0.primeiro = (-1);
        int int45 = lista0.primeiro;
        int int46 = lista0.ultimo;
        int int47 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        lista0.imprime();
        lista0.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        lista15.ultimo = '4';
        int int24 = lista15.primeiro;
        boolean boolean25 = lista15.vazia();
        int int26 = lista15.pos;
        java.lang.Object[] objArray27 = lista15.item;
        lista0.insere((java.lang.Object) lista15);
        int int29 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.pos = 52;
        int int13 = lista0.pos;
        lista0.ultimo = 1;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista16.item = objArray21;
        lista16.ultimo = '4';
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista25.item = objArray30;
        lista16.item = objArray30;
        int int33 = lista16.primeiro;
        java.lang.Object[] objArray34 = lista16.item;
        lista0.item = objArray34;
        int int36 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        int int16 = lista9.pos;
        lista9.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista9);
        int int20 = lista9.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        int int28 = lista21.pos;
        int int29 = lista21.primeiro;
        int int30 = lista21.pos;
        java.lang.Object[] objArray31 = lista21.item;
        lista21.pos = (byte) 100;
        java.lang.Object[] objArray34 = lista21.item;
        lista9.item = objArray34;
        int int36 = lista9.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista37.item = objArray42;
        int int44 = lista37.pos;
        lista37.ultimo = (byte) 100;
        lista37.ultimo = (short) 1;
        lista37.imprime();
        lista37.primeiro = '#';
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray57 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista52.item = objArray57;
        boolean boolean59 = lista52.vazia();
        java.lang.Object[] objArray60 = lista52.item;
        lista37.item = objArray60;
        lista9.insere((java.lang.Object) objArray60);
        java.lang.Object[] objArray63 = lista9.item;
        boolean boolean64 = lista9.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[10, [10, hi!, 0, 100.0], 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 1;
        lista0.pos = (short) -1;
        lista0.imprime();
        lista0.primeiro = (byte) -1;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista22.item = objArray27;
        java.lang.Object[] objArray29 = lista22.item;
        lista22.primeiro = 'a';
        lista22.primeiro = 35;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista34.item = objArray39;
        int int41 = lista34.pos;
        lista34.ultimo = (short) 1;
        lista34.insere((java.lang.Object) (short) -1);
        java.lang.Object[] objArray46 = lista34.item;
        lista22.item = objArray46;
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista49.item = objArray54;
        lista49.ultimo = '4';
        int int58 = lista49.primeiro;
        boolean boolean59 = lista49.vazia();
        lista49.ultimo = 97;
        lista49.primeiro = (-1);
        lista22.insere((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1, -1, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-1, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[-1, -1, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        int int29 = lista12.primeiro;
        java.lang.Object[] objArray30 = lista12.item;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista31.item = objArray36;
        lista12.item = objArray36;
        lista0.item = objArray36;
        boolean boolean40 = lista0.vazia();
        java.lang.Object[] objArray41 = lista0.item;
        int int42 = lista0.ultimo;
        lista0.primeiro = (-1);
        int int45 = lista0.primeiro;
        int int46 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        lista0.pos = 'a';
        int int11 = lista0.ultimo;
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = (short) 0;
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista13.item = objArray18;
        lista13.ultimo = '4';
        lista13.pos = 'a';
        int int24 = lista13.ultimo;
        lista13.ultimo = 1;
        lista13.primeiro = 10;
        lista13.pos = ' ';
        boolean boolean31 = lista13.vazia();
        lista13.primeiro = (byte) 10;
        lista0.insere((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.ultimo = (short) -1;
        lista0.pos = (byte) -1;
        boolean boolean17 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.ultimo = 1;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.imprime();
        int int18 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        lista0.pos = (byte) 1;
        boolean boolean14 = lista0.vazia();
        lista0.primeiro = (short) 1;
        lista0.imprime();
        lista0.pos = (short) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista12.item = objArray17;
        lista12.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        lista12.item = objArray26;
        lista0.item = objArray26;
        lista0.pos = 0;
        int int32 = lista0.pos;
        java.lang.Class<?> wildcardClass33 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        lista0.primeiro = (short) 1;
        boolean boolean12 = lista0.vazia();
        int int13 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista9.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.primeiro;
        java.lang.Object[] objArray18 = lista0.item;
        lista0.ultimo = (short) 10;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista21.item = objArray26;
        int int28 = lista21.pos;
        int int29 = lista21.primeiro;
        int int30 = lista21.pos;
        int int31 = lista21.pos;
        boolean boolean32 = lista21.vazia();
        lista21.pos = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.primeiro = (short) 100;
        int int16 = lista0.ultimo;
        lista0.pos = 100;
        int int19 = lista0.primeiro;
        int int20 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        lista0.primeiro = 100;
        lista0.pos = (short) -1;
        lista0.pos = 35;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista18.item = objArray23;
        lista18.ultimo = '4';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista27.item = objArray32;
        lista18.item = objArray32;
        int int35 = lista18.primeiro;
        java.lang.Object[] objArray36 = lista18.item;
        int int37 = lista18.primeiro;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista38.item = objArray43;
        int int45 = lista38.pos;
        int int46 = lista38.primeiro;
        lista38.imprime();
        java.lang.Object[] objArray48 = lista38.item;
        lista18.item = objArray48;
        lista0.item = objArray48;
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, hi!, 0, 100.0]");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = 97;
        int int13 = lista0.pos;
        lista0.ultimo = 1;
        int int16 = lista0.ultimo;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        int int22 = lista15.pos;
        int int23 = lista15.primeiro;
        int int24 = lista15.pos;
        int int25 = lista15.pos;
        int int26 = lista15.primeiro;
        java.lang.Object[] objArray27 = lista15.item;
        int int28 = lista15.primeiro;
        lista15.imprime();
        lista0.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass31 = lista15.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        lista0.ultimo = '4';
        boolean boolean9 = lista0.vazia();
        lista0.pos = 100;
        boolean boolean12 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        int int31 = lista24.pos;
        lista24.imprime();
        lista24.imprime();
        java.lang.Object[] objArray34 = lista24.item;
        lista11.item = objArray34;
        int int36 = lista11.pos;
        lista11.imprime();
        lista11.pos = 'a';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) 1;
        lista0.imprime();
        lista0.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista15.item = objArray20;
        lista15.ultimo = '4';
        int int24 = lista15.primeiro;
        boolean boolean25 = lista15.vazia();
        int int26 = lista15.pos;
        java.lang.Object[] objArray27 = lista15.item;
        lista0.insere((java.lang.Object) lista15);
        boolean boolean29 = lista0.vazia();
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.primeiro;
        lista30.primeiro = (short) -1;
        lista30.primeiro = 1;
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista36.item = objArray41;
        int int43 = lista36.pos;
        int int44 = lista36.primeiro;
        int int45 = lista36.pos;
        int int46 = lista36.pos;
        int int47 = lista36.primeiro;
        java.lang.Object[] objArray48 = lista36.item;
        int int49 = lista36.primeiro;
        boolean boolean50 = lista36.vazia();
        lista30.insere((java.lang.Object) boolean50);
        lista30.primeiro = '4';
        boolean boolean54 = lista30.vazia();
        java.lang.Object[] objArray55 = lista30.item;
        lista0.item = objArray55;
        int int57 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista11.item = objArray16;
        int int18 = lista11.pos;
        lista11.ultimo = (short) 1;
        lista11.primeiro = 1;
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        lista11.primeiro = '4';
        lista11.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista0.item = objArray5;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista10.item = objArray15;
        int int17 = lista10.pos;
        int int18 = lista10.primeiro;
        int int19 = lista10.pos;
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        boolean boolean22 = lista0.vazia();
        boolean boolean23 = lista0.vazia();
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista24.item = objArray29;
        lista24.ultimo = '4';
        lista24.pos = 'a';
        int int35 = lista24.ultimo;
        lista24.primeiro = (short) 1;
        int int38 = lista24.ultimo;
        int int39 = lista24.primeiro;
        int int40 = lista24.primeiro;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista41.item = objArray46;
        int int48 = lista41.pos;
        int int49 = lista41.primeiro;
        int int50 = lista41.pos;
        int int51 = lista41.pos;
        boolean boolean52 = lista41.vazia();
        int int53 = lista41.pos;
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray59 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista54.item = objArray59;
        lista54.ultimo = '4';
        int int63 = lista54.primeiro;
        java.lang.Object[] objArray64 = null;
        lista54.item = objArray64;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista66.item = objArray71;
        lista66.ultimo = '4';
        ds.Lista lista75 = new ds.Lista();
        java.lang.Object[] objArray80 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista75.item = objArray80;
        lista66.item = objArray80;
        int int83 = lista66.primeiro;
        java.lang.Object[] objArray84 = lista66.item;
        ds.Lista lista85 = new ds.Lista();
        java.lang.Object[] objArray90 = new java.lang.Object[] { 10, "hi!", (byte) 0, 100.0d };
        lista85.item = objArray90;
        lista66.item = objArray90;
        lista54.item = objArray90;
        lista41.item = objArray90;
        lista24.item = objArray90;
        lista24.pos = 10;
        lista0.insere((java.lang.Object) lista24);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[10, hi!, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[10, hi!, 0, 100.0]");
    }
}

