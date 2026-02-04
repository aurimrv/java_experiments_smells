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
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        lista14.imprime();
        java.lang.Object obj18 = null;
        lista14.insere(obj18);
        java.lang.Class<?> wildcardClass20 = lista14.getClass();
        lista5.insere((java.lang.Object) wildcardClass20);
        lista3.insere((java.lang.Object) lista5);
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.imprime();
        lista23.insere((java.lang.Object) false);
        lista23.insere((java.lang.Object) false);
        boolean boolean30 = lista23.vazia();
        boolean boolean31 = lista23.vazia();
        lista3.insere((java.lang.Object) lista23);
        lista23.imprime();
        boolean boolean34 = lista23.vazia();
        boolean boolean35 = lista23.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) lista15);
        boolean boolean19 = lista15.vazia();
        boolean boolean20 = lista15.vazia();
        java.lang.Class<?> wildcardClass21 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean19 = lista5.vazia();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 100.0f);
        boolean boolean28 = lista25.vazia();
        lista25.insere((java.lang.Object) 100);
        lista25.imprime();
        lista25.insere((java.lang.Object) 0L);
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        java.lang.Object obj38 = null;
        lista34.insere(obj38);
        java.lang.Class<?> wildcardClass40 = lista34.getClass();
        lista25.insere((java.lang.Object) wildcardClass40);
        lista23.insere((java.lang.Object) lista25);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.imprime();
        lista43.insere((java.lang.Object) false);
        lista43.insere((java.lang.Object) false);
        boolean boolean50 = lista43.vazia();
        boolean boolean51 = lista43.vazia();
        lista23.insere((java.lang.Object) lista43);
        lista43.imprime();
        lista5.insere((java.lang.Object) lista43);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 100.0f);
        lista55.insere((java.lang.Object) 10L);
        lista55.insere((java.lang.Object) (short) -1);
        boolean boolean62 = lista55.vazia();
        boolean boolean63 = lista55.vazia();
        lista55.insere((java.lang.Object) (-1));
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        boolean boolean68 = lista66.vazia();
        boolean boolean69 = lista66.vazia();
        java.lang.Object obj70 = new java.lang.Object();
        lista66.insere(obj70);
        lista66.imprime();
        lista66.imprime();
        lista55.insere((java.lang.Object) lista66);
        lista5.insere((java.lang.Object) lista55);
        lista5.imprime();
        boolean boolean77 = lista5.vazia();
        lista5.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        lista14.imprime();
        java.lang.Object obj18 = null;
        lista14.insere(obj18);
        java.lang.Class<?> wildcardClass20 = lista14.getClass();
        lista5.insere((java.lang.Object) wildcardClass20);
        lista3.insere((java.lang.Object) lista5);
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        boolean boolean25 = lista23.vazia();
        lista23.imprime();
        lista23.imprime();
        lista23.imprime();
        boolean boolean29 = lista23.vazia();
        lista23.imprime();
        lista5.insere((java.lang.Object) lista23);
        lista5.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        lista8.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        lista15.insere((java.lang.Object) 10L);
        lista15.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista15.vazia();
        boolean boolean23 = lista15.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 100.0f);
        boolean boolean27 = lista24.vazia();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        lista28.imprime();
        lista28.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) (byte) 100);
        lista15.insere((java.lang.Object) (byte) 100);
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        boolean boolean41 = lista39.vazia();
        boolean boolean42 = lista39.vazia();
        lista39.insere((java.lang.Object) 100L);
        lista39.imprime();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.imprime();
        lista46.insere((java.lang.Object) false);
        boolean boolean51 = lista46.vazia();
        java.lang.Class<?> wildcardClass52 = lista46.getClass();
        lista39.insere((java.lang.Object) wildcardClass52);
        lista39.imprime();
        lista15.insere((java.lang.Object) lista39);
        lista15.imprime();
        lista8.insere((java.lang.Object) lista15);
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 100.0f);
        lista58.insere((java.lang.Object) 10L);
        lista58.insere((java.lang.Object) (short) -1);
        boolean boolean65 = lista58.vazia();
        boolean boolean66 = lista58.vazia();
        lista58.insere((java.lang.Object) (-1));
        boolean boolean69 = lista58.vazia();
        boolean boolean70 = lista58.vazia();
        ds.Lista lista71 = new ds.Lista();
        lista71.insere((java.lang.Object) 100.0f);
        lista71.insere((java.lang.Object) 10L);
        lista71.imprime();
        lista71.imprime();
        ds.Lista lista78 = new ds.Lista();
        boolean boolean79 = lista78.vazia();
        boolean boolean80 = lista78.vazia();
        boolean boolean81 = lista78.vazia();
        lista78.insere((java.lang.Object) 100L);
        lista78.imprime();
        ds.Lista lista85 = new ds.Lista();
        boolean boolean86 = lista85.vazia();
        lista85.imprime();
        lista85.insere((java.lang.Object) false);
        boolean boolean90 = lista85.vazia();
        java.lang.Class<?> wildcardClass91 = lista85.getClass();
        lista78.insere((java.lang.Object) wildcardClass91);
        lista71.insere((java.lang.Object) wildcardClass91);
        java.lang.Class<?> wildcardClass94 = lista71.getClass();
        lista58.insere((java.lang.Object) wildcardClass94);
        lista15.insere((java.lang.Object) lista58);
        boolean boolean97 = lista15.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 100.0f);
        boolean boolean12 = lista9.vazia();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.imprime();
        lista13.insere((java.lang.Object) false);
        lista13.insere((java.lang.Object) false);
        lista9.insere((java.lang.Object) false);
        lista9.insere((java.lang.Object) (byte) 100);
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        boolean boolean27 = lista24.vazia();
        lista24.insere((java.lang.Object) 100L);
        lista24.imprime();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.imprime();
        lista31.insere((java.lang.Object) false);
        boolean boolean36 = lista31.vazia();
        java.lang.Class<?> wildcardClass37 = lista31.getClass();
        lista24.insere((java.lang.Object) wildcardClass37);
        lista24.imprime();
        lista0.insere((java.lang.Object) lista24);
        java.lang.Class<?> wildcardClass41 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean19 = lista5.vazia();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 100.0f);
        boolean boolean28 = lista25.vazia();
        lista25.insere((java.lang.Object) 100);
        lista25.imprime();
        lista25.insere((java.lang.Object) 0L);
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        java.lang.Object obj38 = null;
        lista34.insere(obj38);
        java.lang.Class<?> wildcardClass40 = lista34.getClass();
        lista25.insere((java.lang.Object) wildcardClass40);
        lista23.insere((java.lang.Object) lista25);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.imprime();
        lista43.insere((java.lang.Object) false);
        lista43.insere((java.lang.Object) false);
        boolean boolean50 = lista43.vazia();
        boolean boolean51 = lista43.vazia();
        lista23.insere((java.lang.Object) lista43);
        lista43.imprime();
        lista5.insere((java.lang.Object) lista43);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 100.0f);
        lista55.insere((java.lang.Object) 10L);
        lista55.insere((java.lang.Object) (short) -1);
        boolean boolean62 = lista55.vazia();
        boolean boolean63 = lista55.vazia();
        lista55.insere((java.lang.Object) (-1));
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        boolean boolean68 = lista66.vazia();
        boolean boolean69 = lista66.vazia();
        java.lang.Object obj70 = new java.lang.Object();
        lista66.insere(obj70);
        lista66.imprime();
        lista66.imprime();
        lista55.insere((java.lang.Object) lista66);
        lista5.insere((java.lang.Object) lista55);
        lista55.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        lista5.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        lista9.imprime();
        lista9.imprime();
        lista9.imprime();
        boolean boolean15 = lista9.vazia();
        lista5.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 100.0f);
        lista17.insere((java.lang.Object) 10L);
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean24 = lista17.vazia();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        lista25.imprime();
        lista17.insere((java.lang.Object) lista25);
        boolean boolean31 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        lista25.insere((java.lang.Object) lista33);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 100.0f);
        boolean boolean39 = lista36.vazia();
        lista36.insere((java.lang.Object) 100);
        lista36.imprime();
        boolean boolean43 = lista36.vazia();
        lista36.imprime();
        boolean boolean45 = lista36.vazia();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 100.0f);
        boolean boolean49 = lista46.vazia();
        lista46.insere((java.lang.Object) 100);
        lista46.imprime();
        lista46.insere((java.lang.Object) 0L);
        lista36.insere((java.lang.Object) 0L);
        lista36.imprime();
        ds.Lista lista57 = new ds.Lista();
        lista57.imprime();
        boolean boolean59 = lista57.vazia();
        boolean boolean60 = lista57.vazia();
        lista36.insere((java.lang.Object) boolean60);
        boolean boolean62 = lista36.vazia();
        lista33.insere((java.lang.Object) lista36);
        lista5.insere((java.lang.Object) lista36);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean66 = lista0.vazia();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        boolean boolean70 = lista0.vazia();
        java.lang.Class<?> wildcardClass71 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) false);
        boolean boolean13 = lista6.vazia();
        boolean boolean14 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        lista16.insere((java.lang.Object) false);
        boolean boolean21 = lista16.vazia();
        boolean boolean22 = lista16.vazia();
        boolean boolean23 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.imprime();
        java.lang.Object obj9 = null;
        lista5.insere(obj9);
        boolean boolean11 = lista5.vazia();
        boolean boolean12 = lista5.vazia();
        java.lang.Class<?> wildcardClass13 = lista5.getClass();
        lista0.insere((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 100.0f);
        boolean boolean12 = lista9.vazia();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.imprime();
        lista13.insere((java.lang.Object) false);
        lista13.insere((java.lang.Object) false);
        lista9.insere((java.lang.Object) false);
        lista9.insere((java.lang.Object) (byte) 100);
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        boolean boolean27 = lista24.vazia();
        lista24.insere((java.lang.Object) 100L);
        lista24.imprime();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.imprime();
        lista31.insere((java.lang.Object) false);
        boolean boolean36 = lista31.vazia();
        java.lang.Class<?> wildcardClass37 = lista31.getClass();
        lista24.insere((java.lang.Object) wildcardClass37);
        lista24.imprime();
        lista0.insere((java.lang.Object) lista24);
        lista24.imprime();
        boolean boolean42 = lista24.vazia();
        lista24.imprime();
        lista24.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        boolean boolean6 = lista4.vazia();
        lista4.imprime();
        lista4.imprime();
        lista4.imprime();
        boolean boolean10 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 100.0f);
        boolean boolean15 = lista12.vazia();
        lista12.insere((java.lang.Object) 100);
        lista12.imprime();
        java.lang.Class<?> wildcardClass19 = lista12.getClass();
        lista4.insere((java.lang.Object) wildcardClass19);
        boolean boolean21 = lista4.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        lista0.insere((java.lang.Object) (-1));
        boolean boolean11 = lista0.vazia();
        boolean boolean12 = lista0.vazia();
        boolean boolean13 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.imprime();
        java.lang.Class<?> wildcardClass8 = lista4.getClass();
        lista0.insere((java.lang.Object) lista4);
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        lista8.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        boolean boolean18 = lista15.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        lista19.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) false);
        boolean boolean27 = lista15.vazia();
        lista15.imprime();
        boolean boolean29 = lista15.vazia();
        lista8.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass31 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 1);
        lista7.imprime();
        boolean boolean11 = lista7.vazia();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        lista0.insere((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        lista8.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        lista15.insere((java.lang.Object) 10L);
        lista15.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista15.vazia();
        boolean boolean23 = lista15.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 100.0f);
        boolean boolean27 = lista24.vazia();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        lista28.imprime();
        lista28.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) (byte) 100);
        lista15.insere((java.lang.Object) (byte) 100);
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        boolean boolean41 = lista39.vazia();
        boolean boolean42 = lista39.vazia();
        lista39.insere((java.lang.Object) 100L);
        lista39.imprime();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.imprime();
        lista46.insere((java.lang.Object) false);
        boolean boolean51 = lista46.vazia();
        java.lang.Class<?> wildcardClass52 = lista46.getClass();
        lista39.insere((java.lang.Object) wildcardClass52);
        lista39.imprime();
        lista15.insere((java.lang.Object) lista39);
        lista15.imprime();
        lista8.insere((java.lang.Object) lista15);
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 100.0f);
        lista58.insere((java.lang.Object) 10L);
        lista58.insere((java.lang.Object) (short) -1);
        boolean boolean65 = lista58.vazia();
        boolean boolean66 = lista58.vazia();
        lista58.insere((java.lang.Object) (-1));
        boolean boolean69 = lista58.vazia();
        boolean boolean70 = lista58.vazia();
        ds.Lista lista71 = new ds.Lista();
        lista71.insere((java.lang.Object) 100.0f);
        lista71.insere((java.lang.Object) 10L);
        lista71.imprime();
        lista71.imprime();
        ds.Lista lista78 = new ds.Lista();
        boolean boolean79 = lista78.vazia();
        boolean boolean80 = lista78.vazia();
        boolean boolean81 = lista78.vazia();
        lista78.insere((java.lang.Object) 100L);
        lista78.imprime();
        ds.Lista lista85 = new ds.Lista();
        boolean boolean86 = lista85.vazia();
        lista85.imprime();
        lista85.insere((java.lang.Object) false);
        boolean boolean90 = lista85.vazia();
        java.lang.Class<?> wildcardClass91 = lista85.getClass();
        lista78.insere((java.lang.Object) wildcardClass91);
        lista71.insere((java.lang.Object) wildcardClass91);
        java.lang.Class<?> wildcardClass94 = lista71.getClass();
        lista58.insere((java.lang.Object) wildcardClass94);
        lista15.insere((java.lang.Object) lista58);
        boolean boolean97 = lista58.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 100.0f);
        boolean boolean11 = lista8.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista12.insere((java.lang.Object) false);
        lista8.insere((java.lang.Object) false);
        lista8.insere((java.lang.Object) (byte) 100);
        lista8.imprime();
        boolean boolean23 = lista8.vazia();
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        boolean boolean27 = lista24.vazia();
        java.lang.Object obj28 = new java.lang.Object();
        lista24.insere(obj28);
        lista24.imprime();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        boolean boolean33 = lista31.vazia();
        boolean boolean34 = lista31.vazia();
        lista31.insere((java.lang.Object) 100L);
        lista31.imprime();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        lista38.imprime();
        lista38.insere((java.lang.Object) false);
        boolean boolean43 = lista38.vazia();
        java.lang.Class<?> wildcardClass44 = lista38.getClass();
        lista31.insere((java.lang.Object) wildcardClass44);
        lista31.imprime();
        lista31.imprime();
        boolean boolean48 = lista31.vazia();
        lista24.insere((java.lang.Object) lista31);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 100.0f);
        boolean boolean53 = lista50.vazia();
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        lista54.imprime();
        lista54.insere((java.lang.Object) false);
        lista54.insere((java.lang.Object) false);
        lista50.insere((java.lang.Object) false);
        lista50.insere((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass64 = lista50.getClass();
        lista24.insere((java.lang.Object) lista50);
        boolean boolean66 = lista24.vazia();
        lista8.insere((java.lang.Object) lista24);
        lista0.insere((java.lang.Object) lista8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.insere((java.lang.Object) 10L);
        lista4.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 100.0f);
        lista13.insere((java.lang.Object) 10L);
        lista13.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista13.vazia();
        boolean boolean21 = lista13.vazia();
        lista13.insere((java.lang.Object) (-1));
        boolean boolean24 = lista13.vazia();
        lista4.insere((java.lang.Object) boolean24);
        boolean boolean26 = lista4.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 100.0f);
        lista27.insere((java.lang.Object) 10L);
        lista27.insere((java.lang.Object) (short) -1);
        boolean boolean34 = lista27.vazia();
        boolean boolean35 = lista27.vazia();
        lista27.insere((java.lang.Object) (-1));
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        boolean boolean41 = lista38.vazia();
        java.lang.Object obj42 = new java.lang.Object();
        lista38.insere(obj42);
        lista38.imprime();
        lista38.imprime();
        lista27.insere((java.lang.Object) lista38);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 100.0f);
        boolean boolean50 = lista47.vazia();
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        lista51.imprime();
        lista51.insere((java.lang.Object) false);
        lista51.insere((java.lang.Object) false);
        lista47.insere((java.lang.Object) false);
        lista47.insere((java.lang.Object) (byte) 100);
        lista38.insere((java.lang.Object) lista47);
        lista4.insere((java.lang.Object) lista38);
        lista4.imprime();
        lista4.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) (-1L));
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 100.0f);
        lista6.imprime();
        lista6.insere((java.lang.Object) 10.0f);
        lista0.insere((java.lang.Object) 10.0f);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        java.lang.Object obj17 = new java.lang.Object();
        lista13.insere(obj17);
        lista13.imprime();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        boolean boolean23 = lista20.vazia();
        lista20.insere((java.lang.Object) 100L);
        lista20.imprime();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.imprime();
        lista27.insere((java.lang.Object) false);
        boolean boolean32 = lista27.vazia();
        java.lang.Class<?> wildcardClass33 = lista27.getClass();
        lista20.insere((java.lang.Object) wildcardClass33);
        lista20.imprime();
        lista20.imprime();
        boolean boolean37 = lista20.vazia();
        lista13.insere((java.lang.Object) lista20);
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        lista41.imprime();
        lista41.insere((java.lang.Object) false);
        boolean boolean46 = lista41.vazia();
        boolean boolean47 = lista41.vazia();
        lista0.insere((java.lang.Object) boolean47);
        boolean boolean49 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.imprime();
        boolean boolean15 = lista0.vazia();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        boolean boolean19 = lista16.vazia();
        lista16.insere((java.lang.Object) 100L);
        lista16.imprime();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.imprime();
        lista23.insere((java.lang.Object) false);
        boolean boolean28 = lista23.vazia();
        java.lang.Class<?> wildcardClass29 = lista23.getClass();
        lista16.insere((java.lang.Object) wildcardClass29);
        lista16.insere((java.lang.Object) 0.0f);
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) 100.0f);
        boolean boolean36 = lista33.vazia();
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        lista37.imprime();
        lista37.insere((java.lang.Object) false);
        lista37.insere((java.lang.Object) false);
        lista33.insere((java.lang.Object) false);
        lista33.insere((java.lang.Object) (byte) 100);
        lista33.insere((java.lang.Object) 1);
        boolean boolean49 = lista33.vazia();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 100.0f);
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        boolean boolean55 = lista53.vazia();
        ds.Lista lista56 = new ds.Lista();
        lista53.insere((java.lang.Object) lista56);
        lista50.insere((java.lang.Object) lista56);
        lista33.insere((java.lang.Object) lista56);
        lista33.imprime();
        lista16.insere((java.lang.Object) lista33);
        lista16.imprime();
        java.lang.Class<?> wildcardClass63 = lista16.getClass();
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 100.0f);
        boolean boolean14 = lista11.vazia();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        lista15.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) false);
        lista11.insere((java.lang.Object) false);
        lista11.insere((java.lang.Object) (byte) 100);
        lista11.insere((java.lang.Object) 1);
        boolean boolean27 = lista11.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 100.0f);
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        boolean boolean33 = lista31.vazia();
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista28.insere((java.lang.Object) lista34);
        lista11.insere((java.lang.Object) lista34);
        lista11.imprime();
        boolean boolean39 = lista11.vazia();
        lista0.insere((java.lang.Object) lista11);
        lista0.imprime();
        boolean boolean42 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        lista0.insere((java.lang.Object) (-1));
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        boolean boolean14 = lista11.vazia();
        java.lang.Object obj15 = new java.lang.Object();
        lista11.insere(obj15);
        lista11.imprime();
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 100.0f);
        lista20.imprime();
        lista20.insere((java.lang.Object) 10.0f);
        java.lang.Object obj26 = null;
        lista20.insere(obj26);
        boolean boolean28 = lista20.vazia();
        lista0.insere((java.lang.Object) lista20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        lista8.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        lista15.insere((java.lang.Object) 10L);
        lista15.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista15.vazia();
        boolean boolean23 = lista15.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 100.0f);
        boolean boolean27 = lista24.vazia();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        lista28.imprime();
        lista28.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) (byte) 100);
        lista15.insere((java.lang.Object) (byte) 100);
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        boolean boolean41 = lista39.vazia();
        boolean boolean42 = lista39.vazia();
        lista39.insere((java.lang.Object) 100L);
        lista39.imprime();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.imprime();
        lista46.insere((java.lang.Object) false);
        boolean boolean51 = lista46.vazia();
        java.lang.Class<?> wildcardClass52 = lista46.getClass();
        lista39.insere((java.lang.Object) wildcardClass52);
        lista39.imprime();
        lista15.insere((java.lang.Object) lista39);
        lista15.imprime();
        lista8.insere((java.lang.Object) lista15);
        boolean boolean58 = lista8.vazia();
        boolean boolean59 = lista8.vazia();
        lista8.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.imprime();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 100.0f);
        boolean boolean13 = lista10.vazia();
        lista10.insere((java.lang.Object) 100);
        lista10.imprime();
        lista10.insere((java.lang.Object) 0L);
        lista0.insere((java.lang.Object) 0L);
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.insere((java.lang.Object) 1);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 100.0f);
        lista10.insere((java.lang.Object) 10L);
        lista10.insere((java.lang.Object) (short) -1);
        boolean boolean17 = lista10.vazia();
        boolean boolean18 = lista10.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 100.0f);
        boolean boolean22 = lista19.vazia();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.imprime();
        lista23.insere((java.lang.Object) false);
        lista23.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) (byte) 100);
        lista10.insere((java.lang.Object) (byte) 100);
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        boolean boolean36 = lista34.vazia();
        boolean boolean37 = lista34.vazia();
        lista34.insere((java.lang.Object) 100L);
        lista34.imprime();
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        lista41.imprime();
        lista41.insere((java.lang.Object) false);
        boolean boolean46 = lista41.vazia();
        java.lang.Class<?> wildcardClass47 = lista41.getClass();
        lista34.insere((java.lang.Object) wildcardClass47);
        lista34.imprime();
        lista10.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        boolean boolean54 = lista52.vazia();
        boolean boolean55 = lista52.vazia();
        java.lang.Object obj56 = new java.lang.Object();
        lista52.insere(obj56);
        java.lang.Class<?> wildcardClass58 = obj56.getClass();
        lista10.insere(obj56);
        boolean boolean60 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        lista7.insere((java.lang.Object) false);
        boolean boolean12 = lista7.vazia();
        java.lang.Class<?> wildcardClass13 = lista7.getClass();
        lista0.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) 0.0f);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 100.0f);
        boolean boolean20 = lista17.vazia();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.imprime();
        lista21.insere((java.lang.Object) false);
        lista21.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) (byte) 100);
        lista17.insere((java.lang.Object) 1);
        boolean boolean33 = lista17.vazia();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 100.0f);
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        boolean boolean39 = lista37.vazia();
        ds.Lista lista40 = new ds.Lista();
        lista37.insere((java.lang.Object) lista40);
        lista34.insere((java.lang.Object) lista40);
        lista17.insere((java.lang.Object) lista40);
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.imprime();
        lista46.insere((java.lang.Object) false);
        lista46.insere((java.lang.Object) false);
        boolean boolean53 = lista46.vazia();
        boolean boolean54 = lista46.vazia();
        boolean boolean55 = lista46.vazia();
        lista17.insere((java.lang.Object) lista46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 100.0f);
        lista6.insere((java.lang.Object) 10L);
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean13 = lista6.vazia();
        boolean boolean14 = lista6.vazia();
        lista6.insere((java.lang.Object) (-1));
        lista0.insere((java.lang.Object) (-1));
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 100.0f);
        lista18.insere((java.lang.Object) 10L);
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista18.vazia();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        lista26.imprime();
        lista18.insere((java.lang.Object) lista26);
        boolean boolean32 = lista26.vazia();
        lista26.imprime();
        lista0.insere((java.lang.Object) lista26);
        java.lang.Class<?> wildcardClass35 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.imprime();
        lista0.imprime();
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        lista5.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        lista9.imprime();
        lista9.imprime();
        lista9.imprime();
        boolean boolean15 = lista9.vazia();
        lista5.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 100.0f);
        lista17.insere((java.lang.Object) 10L);
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean24 = lista17.vazia();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        lista25.imprime();
        lista17.insere((java.lang.Object) lista25);
        boolean boolean31 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        lista25.insere((java.lang.Object) lista33);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 100.0f);
        boolean boolean39 = lista36.vazia();
        lista36.insere((java.lang.Object) 100);
        lista36.imprime();
        boolean boolean43 = lista36.vazia();
        lista36.imprime();
        boolean boolean45 = lista36.vazia();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 100.0f);
        boolean boolean49 = lista46.vazia();
        lista46.insere((java.lang.Object) 100);
        lista46.imprime();
        lista46.insere((java.lang.Object) 0L);
        lista36.insere((java.lang.Object) 0L);
        lista36.imprime();
        ds.Lista lista57 = new ds.Lista();
        lista57.imprime();
        boolean boolean59 = lista57.vazia();
        boolean boolean60 = lista57.vazia();
        lista36.insere((java.lang.Object) boolean60);
        boolean boolean62 = lista36.vazia();
        lista33.insere((java.lang.Object) lista36);
        lista5.insere((java.lang.Object) lista36);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean66 = lista0.vazia();
        boolean boolean67 = lista0.vazia();
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) 100.0f);
        boolean boolean71 = lista68.vazia();
        lista68.insere((java.lang.Object) 100);
        lista68.imprime();
        ds.Lista lista75 = new ds.Lista();
        boolean boolean76 = lista75.vazia();
        lista75.imprime();
        lista75.insere((java.lang.Object) false);
        lista68.insere((java.lang.Object) lista75);
        boolean boolean81 = lista75.vazia();
        lista0.insere((java.lang.Object) lista75);
        java.lang.Class<?> wildcardClass83 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 100.0f);
        boolean boolean13 = lista10.vazia();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista14.insere((java.lang.Object) false);
        lista14.insere((java.lang.Object) false);
        lista10.insere((java.lang.Object) false);
        lista10.insere((java.lang.Object) (byte) 100);
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (byte) 1);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 100.0f);
        lista28.insere((java.lang.Object) 10L);
        lista28.insere((java.lang.Object) (short) -1);
        boolean boolean35 = lista28.vazia();
        boolean boolean36 = lista28.vazia();
        boolean boolean37 = lista28.vazia();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        lista38.imprime();
        lista38.insere((java.lang.Object) 100.0f);
        lista38.imprime();
        lista38.imprime();
        lista28.insere((java.lang.Object) lista38);
        lista10.insere((java.lang.Object) lista38);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) (short) -1);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 100.0f);
        lista6.insere((java.lang.Object) 10L);
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean13 = lista6.vazia();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        lista14.imprime();
        lista14.imprime();
        lista6.insere((java.lang.Object) lista14);
        boolean boolean20 = lista14.vazia();
        lista14.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        lista14.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista0.insere((java.lang.Object) lista22);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.insere((java.lang.Object) 10L);
        lista4.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        lista4.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 100.0f);
        boolean boolean17 = lista14.vazia();
        lista14.insere((java.lang.Object) 100);
        lista14.imprime();
        boolean boolean21 = lista14.vazia();
        lista14.imprime();
        boolean boolean23 = lista14.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 100.0f);
        boolean boolean27 = lista24.vazia();
        lista24.insere((java.lang.Object) 100);
        lista24.imprime();
        lista24.insere((java.lang.Object) 0L);
        lista14.insere((java.lang.Object) 0L);
        lista14.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        boolean boolean37 = lista35.vazia();
        boolean boolean38 = lista35.vazia();
        lista14.insere((java.lang.Object) boolean38);
        lista14.imprime();
        lista4.insere((java.lang.Object) lista14);
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.imprime();
        lista42.insere((java.lang.Object) false);
        boolean boolean47 = lista42.vazia();
        lista42.imprime();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        boolean boolean52 = lista49.vazia();
        lista49.insere((java.lang.Object) 100L);
        lista49.imprime();
        lista42.insere((java.lang.Object) lista49);
        boolean boolean57 = lista42.vazia();
        lista4.insere((java.lang.Object) boolean57);
        boolean boolean59 = lista4.vazia();
        ds.Lista lista60 = new ds.Lista();
        boolean boolean61 = lista60.vazia();
        boolean boolean62 = lista60.vazia();
        lista60.imprime();
        java.lang.Object obj64 = null;
        lista60.insere(obj64);
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        boolean boolean68 = lista66.vazia();
        lista66.imprime();
        java.lang.Object obj70 = null;
        lista66.insere(obj70);
        lista60.insere(obj70);
        ds.Lista lista73 = new ds.Lista();
        boolean boolean74 = lista73.vazia();
        lista73.imprime();
        lista73.insere((java.lang.Object) 100.0f);
        lista73.imprime();
        lista73.imprime();
        java.lang.Class<?> wildcardClass80 = lista73.getClass();
        lista60.insere((java.lang.Object) wildcardClass80);
        lista4.insere((java.lang.Object) wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        boolean boolean9 = lista7.vazia();
        lista7.imprime();
        lista7.insere((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass13 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        boolean boolean17 = lista15.vazia();
        boolean boolean18 = lista15.vazia();
        lista15.insere((java.lang.Object) 100L);
        lista15.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 100.0f);
        lista22.insere((java.lang.Object) 10L);
        lista22.imprime();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista15.imprime();
        boolean boolean31 = lista15.vazia();
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) 100.0f);
        lista33.insere((java.lang.Object) 10L);
        lista33.imprime();
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.imprime();
        lista39.insere((java.lang.Object) false);
        lista39.insere((java.lang.Object) false);
        boolean boolean46 = lista39.vazia();
        boolean boolean47 = lista39.vazia();
        lista33.insere((java.lang.Object) lista39);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 100.0f);
        lista49.insere((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass54 = lista49.getClass();
        lista33.insere((java.lang.Object) wildcardClass54);
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) 100.0f);
        lista56.insere((java.lang.Object) 10L);
        lista56.imprime();
        ds.Lista lista62 = new ds.Lista();
        boolean boolean63 = lista62.vazia();
        lista62.imprime();
        lista62.insere((java.lang.Object) false);
        lista62.insere((java.lang.Object) false);
        boolean boolean69 = lista62.vazia();
        boolean boolean70 = lista62.vazia();
        lista56.insere((java.lang.Object) lista62);
        ds.Lista lista72 = new ds.Lista();
        lista72.insere((java.lang.Object) 100.0f);
        lista72.insere((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass77 = lista72.getClass();
        lista56.insere((java.lang.Object) wildcardClass77);
        lista56.imprime();
        lista33.insere((java.lang.Object) lista56);
        lista56.imprime();
        lista15.insere((java.lang.Object) lista56);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) (-1.0d));
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 100.0f);
        lista9.insere((java.lang.Object) 10L);
        lista9.insere((java.lang.Object) (short) -1);
        boolean boolean16 = lista9.vazia();
        boolean boolean17 = lista9.vazia();
        lista9.insere((java.lang.Object) (-1));
        boolean boolean20 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean20);
        lista0.imprime();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        boolean boolean25 = lista23.vazia();
        boolean boolean26 = lista23.vazia();
        lista23.insere((java.lang.Object) 100L);
        lista23.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 100.0f);
        lista30.insere((java.lang.Object) 10L);
        lista30.imprime();
        lista30.imprime();
        lista23.insere((java.lang.Object) lista30);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 100.0f);
        boolean boolean41 = lista38.vazia();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.imprime();
        lista42.insere((java.lang.Object) false);
        lista42.insere((java.lang.Object) false);
        lista38.insere((java.lang.Object) false);
        lista38.insere((java.lang.Object) (byte) 100);
        lista38.imprime();
        lista30.insere((java.lang.Object) lista38);
        lista38.imprime();
        lista0.insere((java.lang.Object) lista38);
        ds.Lista lista56 = new ds.Lista();
        boolean boolean57 = lista56.vazia();
        boolean boolean58 = lista56.vazia();
        lista56.imprime();
        lista56.insere((java.lang.Object) 100L);
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) 100.0f);
        lista62.insere((java.lang.Object) 10L);
        lista62.imprime();
        lista56.insere((java.lang.Object) lista62);
        ds.Lista lista69 = new ds.Lista();
        boolean boolean70 = lista69.vazia();
        boolean boolean71 = lista69.vazia();
        lista69.imprime();
        ds.Lista lista73 = new ds.Lista();
        lista73.insere((java.lang.Object) 100.0f);
        lista73.insere((java.lang.Object) 10L);
        lista73.insere((java.lang.Object) (short) -1);
        boolean boolean80 = lista73.vazia();
        lista69.insere((java.lang.Object) lista73);
        lista73.imprime();
        lista56.insere((java.lang.Object) lista73);
        java.lang.Class<?> wildcardClass84 = lista73.getClass();
        lista38.insere((java.lang.Object) wildcardClass84);
        java.lang.Class<?> wildcardClass86 = lista38.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        lista0.imprime();
        boolean boolean15 = lista0.vazia();
        lista0.imprime();
        boolean boolean17 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        boolean boolean22 = lista19.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 100.0f);
        lista23.imprime();
        java.lang.Class<?> wildcardClass27 = lista23.getClass();
        lista19.insere((java.lang.Object) wildcardClass27);
        lista5.insere((java.lang.Object) lista19);
        java.lang.Class<?> wildcardClass30 = lista19.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) 1);
        lista3.insere((java.lang.Object) 'a');
        boolean boolean8 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 100.0f);
        boolean boolean12 = lista9.vazia();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.imprime();
        lista13.insere((java.lang.Object) false);
        lista13.insere((java.lang.Object) false);
        lista9.insere((java.lang.Object) false);
        lista9.insere((java.lang.Object) (byte) 100);
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        boolean boolean27 = lista24.vazia();
        lista24.insere((java.lang.Object) 100L);
        lista24.imprime();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.imprime();
        lista31.insere((java.lang.Object) false);
        boolean boolean36 = lista31.vazia();
        java.lang.Class<?> wildcardClass37 = lista31.getClass();
        lista24.insere((java.lang.Object) wildcardClass37);
        lista24.imprime();
        lista0.insere((java.lang.Object) lista24);
        java.lang.Class<?> wildcardClass41 = lista24.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.imprime();
        boolean boolean15 = lista0.vazia();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        boolean boolean19 = lista16.vazia();
        java.lang.Object obj20 = new java.lang.Object();
        lista16.insere(obj20);
        lista16.imprime();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        boolean boolean25 = lista23.vazia();
        boolean boolean26 = lista23.vazia();
        lista23.insere((java.lang.Object) 100L);
        lista23.imprime();
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.imprime();
        lista30.insere((java.lang.Object) false);
        boolean boolean35 = lista30.vazia();
        java.lang.Class<?> wildcardClass36 = lista30.getClass();
        lista23.insere((java.lang.Object) wildcardClass36);
        lista23.imprime();
        lista23.imprime();
        boolean boolean40 = lista23.vazia();
        lista16.insere((java.lang.Object) lista23);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 100.0f);
        boolean boolean45 = lista42.vazia();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.imprime();
        lista46.insere((java.lang.Object) false);
        lista46.insere((java.lang.Object) false);
        lista42.insere((java.lang.Object) false);
        lista42.insere((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass56 = lista42.getClass();
        lista16.insere((java.lang.Object) lista42);
        boolean boolean58 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        lista0.imprime();
        java.lang.Class<?> wildcardClass61 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        lista5.insere((java.lang.Object) 10L);
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean12 = lista5.vazia();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        lista5.insere((java.lang.Object) lista13);
        boolean boolean19 = lista13.vazia();
        lista13.imprime();
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 100.0f);
        boolean boolean25 = lista22.vazia();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.imprime();
        lista26.insere((java.lang.Object) false);
        lista26.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) (byte) 100);
        lista22.imprime();
        boolean boolean37 = lista22.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 1);
        lista38.insere((java.lang.Object) 'a');
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 100.0f);
        boolean boolean46 = lista43.vazia();
        lista43.insere((java.lang.Object) 100);
        lista43.imprime();
        ds.Lista lista50 = new ds.Lista();
        boolean boolean51 = lista50.vazia();
        lista50.imprime();
        lista50.insere((java.lang.Object) false);
        lista43.insere((java.lang.Object) lista50);
        lista38.insere((java.lang.Object) lista43);
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        boolean boolean59 = lista57.vazia();
        boolean boolean60 = lista57.vazia();
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) 100.0f);
        lista61.imprime();
        java.lang.Class<?> wildcardClass65 = lista61.getClass();
        lista57.insere((java.lang.Object) wildcardClass65);
        lista43.insere((java.lang.Object) lista57);
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) 100.0f);
        lista68.imprime();
        lista43.insere((java.lang.Object) lista68);
        lista22.insere((java.lang.Object) lista68);
        lista13.insere((java.lang.Object) lista22);
        ds.Lista lista75 = new ds.Lista();
        lista75.insere((java.lang.Object) 100.0f);
        boolean boolean78 = lista75.vazia();
        ds.Lista lista79 = new ds.Lista();
        boolean boolean80 = lista79.vazia();
        lista79.imprime();
        lista79.insere((java.lang.Object) false);
        lista79.insere((java.lang.Object) false);
        lista75.insere((java.lang.Object) false);
        lista75.insere((java.lang.Object) (byte) 100);
        lista75.insere((java.lang.Object) 1);
        lista75.imprime();
        lista13.insere((java.lang.Object) lista75);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        lista7.insere((java.lang.Object) (-1L));
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean14 = lista7.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        lista1.imprime();
        lista1.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista1);
        boolean boolean7 = lista1.vazia();
        boolean boolean8 = lista1.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 100.0f);
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        lista13.imprime();
        boolean boolean19 = lista13.vazia();
        lista9.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 100.0f);
        boolean boolean24 = lista21.vazia();
        lista21.insere((java.lang.Object) 100);
        lista21.insere((java.lang.Object) 100.0d);
        lista13.insere((java.lang.Object) 100.0d);
        lista1.insere((java.lang.Object) 100.0d);
        boolean boolean31 = lista1.vazia();
        boolean boolean32 = lista1.vazia();
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        boolean boolean35 = lista33.vazia();
        lista33.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) 100.0f);
        lista37.insere((java.lang.Object) 10L);
        lista37.insere((java.lang.Object) (short) -1);
        boolean boolean44 = lista37.vazia();
        lista33.insere((java.lang.Object) lista37);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 100.0f);
        lista46.insere((java.lang.Object) 10L);
        lista46.insere((java.lang.Object) (short) -1);
        boolean boolean53 = lista46.vazia();
        boolean boolean54 = lista46.vazia();
        lista46.insere((java.lang.Object) (-1));
        boolean boolean57 = lista46.vazia();
        lista37.insere((java.lang.Object) boolean57);
        boolean boolean59 = lista37.vazia();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 100.0f);
        boolean boolean63 = lista60.vazia();
        lista60.insere((java.lang.Object) 100);
        lista60.imprime();
        ds.Lista lista67 = new ds.Lista();
        boolean boolean68 = lista67.vazia();
        lista67.imprime();
        lista67.insere((java.lang.Object) false);
        lista60.insere((java.lang.Object) lista67);
        lista37.insere((java.lang.Object) lista67);
        lista1.insere((java.lang.Object) lista67);
        lista1.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.insere((java.lang.Object) 10L);
        lista4.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista14.insere((java.lang.Object) false);
        boolean boolean19 = lista14.vazia();
        lista14.imprime();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        boolean boolean23 = lista21.vazia();
        boolean boolean24 = lista21.vazia();
        lista21.insere((java.lang.Object) 100L);
        lista21.imprime();
        lista14.insere((java.lang.Object) lista21);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 100.0f);
        lista29.insere((java.lang.Object) 10L);
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean36 = lista29.vazia();
        boolean boolean37 = lista29.vazia();
        lista29.insere((java.lang.Object) (-1));
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        boolean boolean42 = lista40.vazia();
        boolean boolean43 = lista40.vazia();
        java.lang.Object obj44 = new java.lang.Object();
        lista40.insere(obj44);
        lista40.imprime();
        lista40.imprime();
        lista29.insere((java.lang.Object) lista40);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 100.0f);
        boolean boolean52 = lista49.vazia();
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        lista53.imprime();
        lista53.insere((java.lang.Object) false);
        lista53.insere((java.lang.Object) false);
        lista49.insere((java.lang.Object) false);
        lista49.insere((java.lang.Object) (byte) 100);
        lista40.insere((java.lang.Object) lista49);
        lista21.insere((java.lang.Object) lista49);
        lista0.insere((java.lang.Object) lista21);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        boolean boolean8 = lista6.vazia();
        lista6.imprime();
        java.lang.Object obj10 = null;
        lista6.insere(obj10);
        lista0.insere(obj10);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.imprime();
        lista13.insere((java.lang.Object) 100.0f);
        lista13.imprime();
        lista13.imprime();
        java.lang.Class<?> wildcardClass20 = lista13.getClass();
        lista0.insere((java.lang.Object) wildcardClass20);
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        boolean boolean24 = lista22.vazia();
        lista22.imprime();
        lista22.insere((java.lang.Object) 100L);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 100.0f);
        lista28.insere((java.lang.Object) 10L);
        lista28.imprime();
        lista22.insere((java.lang.Object) lista28);
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 100.0f);
        lista39.insere((java.lang.Object) 10L);
        lista39.insere((java.lang.Object) (short) -1);
        boolean boolean46 = lista39.vazia();
        lista35.insere((java.lang.Object) lista39);
        lista39.imprime();
        lista22.insere((java.lang.Object) lista39);
        boolean boolean50 = lista39.vazia();
        boolean boolean51 = lista39.vazia();
        boolean boolean52 = lista39.vazia();
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        lista53.imprime();
        lista53.insere((java.lang.Object) false);
        boolean boolean58 = lista53.vazia();
        boolean boolean59 = lista53.vazia();
        boolean boolean60 = lista53.vazia();
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        boolean boolean63 = lista61.vazia();
        lista61.imprime();
        java.lang.Object obj65 = null;
        lista61.insere(obj65);
        boolean boolean67 = lista61.vazia();
        lista53.insere((java.lang.Object) lista61);
        java.lang.Class<?> wildcardClass69 = lista53.getClass();
        lista39.insere((java.lang.Object) wildcardClass69);
        lista0.insere((java.lang.Object) wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.insere((java.lang.Object) 1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 100.0f);
        lista11.insere((java.lang.Object) 10L);
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean18 = lista11.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        lista19.imprime();
        lista19.imprime();
        lista11.insere((java.lang.Object) lista19);
        lista11.imprime();
        boolean boolean26 = lista11.vazia();
        lista11.insere((java.lang.Object) (byte) 10);
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        boolean boolean31 = lista29.vazia();
        lista29.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) 100.0f);
        lista33.insere((java.lang.Object) 10L);
        lista33.insere((java.lang.Object) (short) -1);
        boolean boolean40 = lista33.vazia();
        lista29.insere((java.lang.Object) lista33);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 100.0f);
        lista42.insere((java.lang.Object) 10L);
        lista42.insere((java.lang.Object) (short) -1);
        boolean boolean49 = lista42.vazia();
        boolean boolean50 = lista42.vazia();
        lista42.insere((java.lang.Object) (-1));
        boolean boolean53 = lista42.vazia();
        lista33.insere((java.lang.Object) boolean53);
        boolean boolean55 = lista33.vazia();
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) 100.0f);
        boolean boolean59 = lista56.vazia();
        lista56.insere((java.lang.Object) 100);
        lista56.imprime();
        ds.Lista lista63 = new ds.Lista();
        boolean boolean64 = lista63.vazia();
        lista63.imprime();
        lista63.insere((java.lang.Object) false);
        lista56.insere((java.lang.Object) lista63);
        lista33.insere((java.lang.Object) lista63);
        lista11.insere((java.lang.Object) lista33);
        java.lang.Object obj71 = null;
        lista11.insere(obj71);
        boolean boolean73 = lista11.vazia();
        lista0.insere((java.lang.Object) lista11);
        java.lang.Class<?> wildcardClass75 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) (-1L));
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 100.0f);
        boolean boolean14 = lista11.vazia();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        lista15.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) false);
        lista11.insere((java.lang.Object) false);
        lista11.insere((java.lang.Object) (byte) 100);
        lista11.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) lista11);
        boolean boolean28 = lista0.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 100.0f);
        boolean boolean32 = lista29.vazia();
        lista29.insere((java.lang.Object) 100);
        lista29.imprime();
        lista29.insere((java.lang.Object) 0L);
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        lista38.imprime();
        java.lang.Object obj42 = null;
        lista38.insere(obj42);
        java.lang.Class<?> wildcardClass44 = lista38.getClass();
        lista29.insere((java.lang.Object) wildcardClass44);
        java.lang.Class<?> wildcardClass46 = lista29.getClass();
        lista0.insere((java.lang.Object) wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        lista0.imprime();
        boolean boolean15 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 10);
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 100.0f);
        lista22.insere((java.lang.Object) 10L);
        lista22.insere((java.lang.Object) (short) -1);
        boolean boolean29 = lista22.vazia();
        lista18.insere((java.lang.Object) lista22);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 100.0f);
        lista31.insere((java.lang.Object) 10L);
        lista31.insere((java.lang.Object) (short) -1);
        boolean boolean38 = lista31.vazia();
        boolean boolean39 = lista31.vazia();
        lista31.insere((java.lang.Object) (-1));
        boolean boolean42 = lista31.vazia();
        lista22.insere((java.lang.Object) boolean42);
        boolean boolean44 = lista22.vazia();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 100.0f);
        boolean boolean48 = lista45.vazia();
        lista45.insere((java.lang.Object) 100);
        lista45.imprime();
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        lista52.imprime();
        lista52.insere((java.lang.Object) false);
        lista45.insere((java.lang.Object) lista52);
        lista22.insere((java.lang.Object) lista52);
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 100.0f);
        boolean boolean63 = lista60.vazia();
        ds.Lista lista64 = new ds.Lista();
        boolean boolean65 = lista64.vazia();
        lista64.imprime();
        lista64.insere((java.lang.Object) false);
        lista64.insere((java.lang.Object) false);
        lista60.insere((java.lang.Object) false);
        lista60.insere((java.lang.Object) (byte) 100);
        lista60.imprime();
        ds.Lista lista75 = new ds.Lista();
        lista75.insere((java.lang.Object) 100.0f);
        boolean boolean78 = lista75.vazia();
        lista75.insere((java.lang.Object) 100);
        lista75.imprime();
        ds.Lista lista82 = new ds.Lista();
        boolean boolean83 = lista82.vazia();
        lista82.imprime();
        lista82.insere((java.lang.Object) false);
        lista75.insere((java.lang.Object) lista82);
        lista60.insere((java.lang.Object) lista82);
        boolean boolean89 = lista82.vazia();
        boolean boolean90 = lista82.vazia();
        lista0.insere((java.lang.Object) lista82);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        boolean boolean22 = lista19.vazia();
        lista19.insere((java.lang.Object) 100L);
        lista19.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 100.0f);
        lista26.insere((java.lang.Object) 10L);
        lista26.imprime();
        lista26.imprime();
        lista19.insere((java.lang.Object) lista26);
        lista0.insere((java.lang.Object) lista19);
        java.lang.Class<?> wildcardClass35 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 100.0f);
        lista18.insere((java.lang.Object) 10L);
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista18.vazia();
        boolean boolean26 = lista18.vazia();
        lista0.insere((java.lang.Object) boolean26);
        boolean boolean28 = lista0.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.imprime();
        lista31.insere((java.lang.Object) false);
        lista31.insere((java.lang.Object) false);
        boolean boolean38 = lista31.vazia();
        boolean boolean39 = lista31.vazia();
        java.lang.Class<?> wildcardClass40 = lista31.getClass();
        lista0.insere((java.lang.Object) wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        boolean boolean5 = lista0.vazia();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) false);
        boolean boolean13 = lista6.vazia();
        boolean boolean14 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        boolean boolean19 = lista16.vazia();
        java.lang.Object obj20 = new java.lang.Object();
        lista16.insere(obj20);
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 100.0f);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        boolean boolean28 = lista23.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.insere((java.lang.Object) 10L);
        lista4.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 100.0f);
        lista13.insere((java.lang.Object) 10L);
        lista13.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista13.vazia();
        boolean boolean21 = lista13.vazia();
        lista13.insere((java.lang.Object) (-1));
        boolean boolean24 = lista13.vazia();
        lista4.insere((java.lang.Object) boolean24);
        boolean boolean26 = lista4.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 100.0f);
        boolean boolean30 = lista27.vazia();
        lista27.insere((java.lang.Object) 100);
        lista27.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.imprime();
        lista34.insere((java.lang.Object) false);
        lista27.insere((java.lang.Object) lista34);
        lista4.insere((java.lang.Object) lista34);
        boolean boolean41 = lista4.vazia();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 100.0f);
        boolean boolean45 = lista42.vazia();
        lista42.insere((java.lang.Object) 100);
        lista42.imprime();
        lista42.insere((java.lang.Object) 0L);
        boolean boolean51 = lista42.vazia();
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        boolean boolean54 = lista52.vazia();
        boolean boolean55 = lista52.vazia();
        lista52.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass58 = lista52.getClass();
        lista42.insere((java.lang.Object) wildcardClass58);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 100.0f);
        lista60.insere((java.lang.Object) 10L);
        lista60.insere((java.lang.Object) (short) -1);
        boolean boolean67 = lista60.vazia();
        boolean boolean68 = lista60.vazia();
        lista42.insere((java.lang.Object) boolean68);
        boolean boolean70 = lista42.vazia();
        ds.Lista lista71 = new ds.Lista();
        lista42.insere((java.lang.Object) lista71);
        lista4.insere((java.lang.Object) lista42);
        java.lang.Class<?> wildcardClass74 = lista42.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.insere((java.lang.Object) 10L);
        lista4.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        lista4.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 100.0f);
        boolean boolean17 = lista14.vazia();
        lista14.insere((java.lang.Object) 100);
        lista14.imprime();
        boolean boolean21 = lista14.vazia();
        lista14.imprime();
        boolean boolean23 = lista14.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 100.0f);
        boolean boolean27 = lista24.vazia();
        lista24.insere((java.lang.Object) 100);
        lista24.imprime();
        lista24.insere((java.lang.Object) 0L);
        lista14.insere((java.lang.Object) 0L);
        lista14.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        boolean boolean37 = lista35.vazia();
        boolean boolean38 = lista35.vazia();
        lista14.insere((java.lang.Object) boolean38);
        lista14.imprime();
        lista4.insere((java.lang.Object) lista14);
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.imprime();
        lista42.insere((java.lang.Object) false);
        boolean boolean47 = lista42.vazia();
        lista42.imprime();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        boolean boolean52 = lista49.vazia();
        lista49.insere((java.lang.Object) 100L);
        lista49.imprime();
        lista42.insere((java.lang.Object) lista49);
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        lista57.imprime();
        lista57.insere((java.lang.Object) false);
        lista57.insere((java.lang.Object) false);
        boolean boolean64 = lista57.vazia();
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) 100.0f);
        lista65.insere((java.lang.Object) 10L);
        lista65.insere((java.lang.Object) (short) -1);
        boolean boolean72 = lista65.vazia();
        ds.Lista lista73 = new ds.Lista();
        boolean boolean74 = lista73.vazia();
        boolean boolean75 = lista73.vazia();
        lista73.imprime();
        lista73.imprime();
        lista65.insere((java.lang.Object) lista73);
        lista65.imprime();
        boolean boolean80 = lista65.vazia();
        lista65.imprime();
        lista57.insere((java.lang.Object) lista65);
        java.lang.Object obj83 = new java.lang.Object();
        lista65.insere(obj83);
        lista49.insere(obj83);
        lista14.insere((java.lang.Object) lista49);
        lista14.imprime();
        lista14.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 100.0f);
        lista7.insere((java.lang.Object) 10L);
        lista7.imprime();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        boolean boolean18 = lista15.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        lista19.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) (byte) 100);
        lista15.imprime();
        lista7.insere((java.lang.Object) lista15);
        java.lang.Object obj31 = null;
        lista7.insere(obj31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        boolean boolean14 = lista0.vazia();
        boolean boolean15 = lista0.vazia();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        lista16.insere((java.lang.Object) false);
        boolean boolean21 = lista16.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 1);
        lista22.insere((java.lang.Object) 'a');
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 100.0f);
        boolean boolean30 = lista27.vazia();
        lista27.insere((java.lang.Object) 100);
        lista27.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.imprime();
        lista34.insere((java.lang.Object) false);
        lista27.insere((java.lang.Object) lista34);
        lista22.insere((java.lang.Object) lista27);
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        boolean boolean43 = lista41.vazia();
        boolean boolean44 = lista41.vazia();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 100.0f);
        lista45.imprime();
        java.lang.Class<?> wildcardClass49 = lista45.getClass();
        lista41.insere((java.lang.Object) wildcardClass49);
        lista27.insere((java.lang.Object) lista41);
        boolean boolean52 = lista41.vazia();
        lista16.insere((java.lang.Object) boolean52);
        lista16.imprime();
        lista16.imprime();
        ds.Lista lista56 = new ds.Lista();
        boolean boolean57 = lista56.vazia();
        boolean boolean58 = lista56.vazia();
        boolean boolean59 = lista56.vazia();
        lista56.insere((java.lang.Object) 100L);
        lista56.imprime();
        lista56.insere((java.lang.Object) 1);
        lista56.insere((java.lang.Object) (-1L));
        lista56.imprime();
        lista56.imprime();
        lista16.insere((java.lang.Object) lista56);
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.insere((java.lang.Object) 100.0d);
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.insere((java.lang.Object) 100L);
        lista0.insere((java.lang.Object) 100L);
        boolean boolean15 = lista0.vazia();
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 100.0f);
        boolean boolean13 = lista10.vazia();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista14.insere((java.lang.Object) false);
        lista14.insere((java.lang.Object) false);
        lista10.insere((java.lang.Object) false);
        lista10.insere((java.lang.Object) (byte) 100);
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.imprime();
        lista26.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean32 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 100.0f);
        lista8.insere((java.lang.Object) 10L);
        lista8.insere((java.lang.Object) (short) -1);
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        lista16.imprime();
        lista16.imprime();
        lista8.insere((java.lang.Object) lista16);
        lista8.imprime();
        boolean boolean23 = lista8.vazia();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        lista8.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 100.0f);
        boolean boolean30 = lista27.vazia();
        lista27.insere((java.lang.Object) 100);
        lista27.insere((java.lang.Object) 100.0d);
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        lista35.imprime();
        lista35.insere((java.lang.Object) 100L);
        lista27.insere((java.lang.Object) 100L);
        lista27.imprime();
        lista8.insere((java.lang.Object) lista27);
        boolean boolean44 = lista27.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        lista5.insere((java.lang.Object) 10L);
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean12 = lista5.vazia();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        lista5.insere((java.lang.Object) lista13);
        boolean boolean19 = lista13.vazia();
        lista13.imprime();
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 100.0f);
        boolean boolean25 = lista22.vazia();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.imprime();
        lista26.insere((java.lang.Object) false);
        lista26.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) (byte) 100);
        lista22.imprime();
        boolean boolean37 = lista22.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 1);
        lista38.insere((java.lang.Object) 'a');
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 100.0f);
        boolean boolean46 = lista43.vazia();
        lista43.insere((java.lang.Object) 100);
        lista43.imprime();
        ds.Lista lista50 = new ds.Lista();
        boolean boolean51 = lista50.vazia();
        lista50.imprime();
        lista50.insere((java.lang.Object) false);
        lista43.insere((java.lang.Object) lista50);
        lista38.insere((java.lang.Object) lista43);
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        boolean boolean59 = lista57.vazia();
        boolean boolean60 = lista57.vazia();
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) 100.0f);
        lista61.imprime();
        java.lang.Class<?> wildcardClass65 = lista61.getClass();
        lista57.insere((java.lang.Object) wildcardClass65);
        lista43.insere((java.lang.Object) lista57);
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) 100.0f);
        lista68.imprime();
        lista43.insere((java.lang.Object) lista68);
        lista22.insere((java.lang.Object) lista68);
        lista13.insere((java.lang.Object) lista22);
        boolean boolean75 = lista13.vazia();
        boolean boolean76 = lista13.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.insere((java.lang.Object) 1);
        boolean boolean16 = lista0.vazia();
        lista0.imprime();
        java.lang.Object obj18 = null;
        lista0.insere(obj18);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 100.0f);
        lista20.insere((java.lang.Object) 10L);
        lista20.imprime();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.imprime();
        lista26.insere((java.lang.Object) false);
        lista26.insere((java.lang.Object) false);
        boolean boolean33 = lista26.vazia();
        boolean boolean34 = lista26.vazia();
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        boolean boolean38 = lista36.vazia();
        boolean boolean39 = lista36.vazia();
        java.lang.Object obj40 = new java.lang.Object();
        lista36.insere(obj40);
        lista20.insere((java.lang.Object) lista36);
        lista0.insere((java.lang.Object) lista36);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object obj4 = new java.lang.Object();
        lista0.insere(obj4);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        boolean boolean9 = lista7.vazia();
        boolean boolean10 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        lista7.imprime();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        lista14.insere((java.lang.Object) false);
        boolean boolean19 = lista14.vazia();
        java.lang.Class<?> wildcardClass20 = lista14.getClass();
        lista7.insere((java.lang.Object) wildcardClass20);
        lista7.imprime();
        lista7.imprime();
        boolean boolean24 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        lista7.imprime();
        lista7.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object obj6 = null;
        lista0.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.imprime();
        lista9.insere((java.lang.Object) false);
        lista8.insere((java.lang.Object) lista9);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        lista15.imprime();
        lista15.insere((java.lang.Object) 10.0f);
        lista8.insere((java.lang.Object) 10.0f);
        lista0.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass23 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) false);
        boolean boolean13 = lista6.vazia();
        boolean boolean14 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        lista16.insere((java.lang.Object) false);
        boolean boolean21 = lista16.vazia();
        boolean boolean22 = lista16.vazia();
        boolean boolean23 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 100.0f);
        lista29.insere((java.lang.Object) 10L);
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean36 = lista29.vazia();
        lista25.insere((java.lang.Object) lista29);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 100.0f);
        lista38.insere((java.lang.Object) 10L);
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean45 = lista38.vazia();
        boolean boolean46 = lista38.vazia();
        lista38.insere((java.lang.Object) (-1));
        boolean boolean49 = lista38.vazia();
        lista29.insere((java.lang.Object) boolean49);
        lista29.insere((java.lang.Object) (short) 10);
        lista29.imprime();
        lista16.insere((java.lang.Object) lista29);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 100.0f);
        boolean boolean58 = lista55.vazia();
        lista55.insere((java.lang.Object) 100);
        lista55.imprime();
        lista55.insere((java.lang.Object) 0L);
        ds.Lista lista64 = new ds.Lista();
        boolean boolean65 = lista64.vazia();
        boolean boolean66 = lista64.vazia();
        lista64.imprime();
        java.lang.Object obj68 = null;
        lista64.insere(obj68);
        java.lang.Class<?> wildcardClass70 = lista64.getClass();
        lista55.insere((java.lang.Object) wildcardClass70);
        lista55.imprime();
        boolean boolean73 = lista55.vazia();
        lista16.insere((java.lang.Object) boolean73);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) 100.0f);
        boolean boolean6 = lista3.vazia();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        lista7.insere((java.lang.Object) false);
        lista7.insere((java.lang.Object) false);
        lista3.insere((java.lang.Object) false);
        lista3.insere((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass17 = lista3.getClass();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean19 = lista0.vazia();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        lista20.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 100.0f);
        lista24.insere((java.lang.Object) 10L);
        lista24.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista24.vazia();
        lista20.insere((java.lang.Object) lista24);
        boolean boolean33 = lista24.vazia();
        lista0.insere((java.lang.Object) boolean33);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 100.0f);
        lista35.insere((java.lang.Object) 10L);
        lista35.insere((java.lang.Object) (short) -1);
        boolean boolean42 = lista35.vazia();
        boolean boolean43 = lista35.vazia();
        java.lang.Class<?> wildcardClass44 = lista35.getClass();
        lista0.insere((java.lang.Object) lista35);
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.imprime();
        lista46.insere((java.lang.Object) false);
        boolean boolean51 = lista46.vazia();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) 100.0f);
        lista52.insere((java.lang.Object) 10L);
        lista52.insere((java.lang.Object) (short) -1);
        boolean boolean59 = lista52.vazia();
        boolean boolean60 = lista52.vazia();
        lista52.insere((java.lang.Object) (-1));
        lista46.insere((java.lang.Object) (-1));
        ds.Lista lista64 = new ds.Lista();
        boolean boolean65 = lista64.vazia();
        boolean boolean66 = lista64.vazia();
        boolean boolean67 = lista64.vazia();
        lista64.insere((java.lang.Object) 100L);
        lista64.imprime();
        lista64.insere((java.lang.Object) 1);
        lista64.insere((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass75 = lista64.getClass();
        lista46.insere((java.lang.Object) wildcardClass75);
        lista46.imprime();
        lista0.insere((java.lang.Object) lista46);
        boolean boolean79 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 100.0f);
        lista6.insere((java.lang.Object) 10L);
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        boolean boolean14 = lista0.vazia();
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) false);
        boolean boolean13 = lista6.vazia();
        boolean boolean14 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        boolean boolean19 = lista16.vazia();
        java.lang.Object obj20 = new java.lang.Object();
        lista16.insere(obj20);
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 100.0f);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 100.0f);
        boolean boolean31 = lista28.vazia();
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        lista32.imprime();
        lista32.insere((java.lang.Object) false);
        lista32.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) (byte) 100);
        lista28.insere((java.lang.Object) 1);
        boolean boolean44 = lista28.vazia();
        lista28.imprime();
        lista23.insere((java.lang.Object) lista28);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 100.0f);
        lista7.insere((java.lang.Object) 10L);
        lista7.imprime();
        lista7.imprime();
        boolean boolean14 = lista7.vazia();
        lista0.insere((java.lang.Object) boolean14);
        lista0.imprime();
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.insere((java.lang.Object) 1);
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 100.0f);
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista17.insere((java.lang.Object) lista23);
        lista0.insere((java.lang.Object) lista23);
        lista0.imprime();
        boolean boolean28 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object obj6 = null;
        lista0.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.imprime();
        lista9.insere((java.lang.Object) false);
        lista8.insere((java.lang.Object) lista9);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        lista15.imprime();
        lista15.insere((java.lang.Object) 10.0f);
        lista8.insere((java.lang.Object) 10.0f);
        lista0.insere((java.lang.Object) lista8);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.insere((java.lang.Object) 10L);
        lista4.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 100.0f);
        lista13.insere((java.lang.Object) 10L);
        lista13.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista13.vazia();
        boolean boolean21 = lista13.vazia();
        lista13.insere((java.lang.Object) (-1));
        boolean boolean24 = lista13.vazia();
        lista4.insere((java.lang.Object) boolean24);
        boolean boolean26 = lista4.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 100.0f);
        lista27.insere((java.lang.Object) 10L);
        lista27.insere((java.lang.Object) (short) -1);
        boolean boolean34 = lista27.vazia();
        boolean boolean35 = lista27.vazia();
        lista27.insere((java.lang.Object) (-1));
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        boolean boolean41 = lista38.vazia();
        java.lang.Object obj42 = new java.lang.Object();
        lista38.insere(obj42);
        lista38.imprime();
        lista38.imprime();
        lista27.insere((java.lang.Object) lista38);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 100.0f);
        boolean boolean50 = lista47.vazia();
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        lista51.imprime();
        lista51.insere((java.lang.Object) false);
        lista51.insere((java.lang.Object) false);
        lista47.insere((java.lang.Object) false);
        lista47.insere((java.lang.Object) (byte) 100);
        lista38.insere((java.lang.Object) lista47);
        lista4.insere((java.lang.Object) lista38);
        boolean boolean63 = lista38.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 100.0f);
        lista18.insere((java.lang.Object) 10L);
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista18.vazia();
        boolean boolean26 = lista18.vazia();
        lista0.insere((java.lang.Object) boolean26);
        boolean boolean28 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 100.0f);
        boolean boolean33 = lista30.vazia();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.imprime();
        lista34.insere((java.lang.Object) false);
        lista34.insere((java.lang.Object) false);
        lista30.insere((java.lang.Object) false);
        lista30.insere((java.lang.Object) (byte) 100);
        lista30.insere((java.lang.Object) 1);
        boolean boolean46 = lista30.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 100.0f);
        ds.Lista lista50 = new ds.Lista();
        boolean boolean51 = lista50.vazia();
        boolean boolean52 = lista50.vazia();
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        lista47.insere((java.lang.Object) lista53);
        lista30.insere((java.lang.Object) lista53);
        lista0.insere((java.lang.Object) lista53);
        ds.Lista lista58 = new ds.Lista();
        boolean boolean59 = lista58.vazia();
        lista58.imprime();
        lista58.insere((java.lang.Object) false);
        boolean boolean63 = lista58.vazia();
        lista58.imprime();
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        boolean boolean67 = lista65.vazia();
        boolean boolean68 = lista65.vazia();
        lista65.insere((java.lang.Object) 100L);
        lista65.imprime();
        lista58.insere((java.lang.Object) lista65);
        lista53.insere((java.lang.Object) lista58);
        ds.Lista lista74 = new ds.Lista();
        boolean boolean75 = lista74.vazia();
        boolean boolean76 = lista74.vazia();
        ds.Lista lista77 = new ds.Lista();
        lista74.insere((java.lang.Object) lista77);
        lista58.insere((java.lang.Object) lista77);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 1);
        lista5.insere((java.lang.Object) 'a');
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 100.0f);
        boolean boolean13 = lista10.vazia();
        lista10.insere((java.lang.Object) 100);
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        lista17.imprime();
        lista17.insere((java.lang.Object) false);
        lista10.insere((java.lang.Object) lista17);
        lista5.insere((java.lang.Object) lista10);
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        boolean boolean26 = lista24.vazia();
        boolean boolean27 = lista24.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 100.0f);
        lista28.imprime();
        java.lang.Class<?> wildcardClass32 = lista28.getClass();
        lista24.insere((java.lang.Object) wildcardClass32);
        lista10.insere((java.lang.Object) lista24);
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        boolean boolean38 = lista35.vazia();
        java.lang.Object obj39 = new java.lang.Object();
        lista35.insere(obj39);
        lista35.imprime();
        java.lang.Class<?> wildcardClass42 = lista35.getClass();
        lista24.insere((java.lang.Object) wildcardClass42);
        boolean boolean44 = lista24.vazia();
        lista0.insere((java.lang.Object) lista24);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        boolean boolean8 = lista6.vazia();
        lista6.imprime();
        java.lang.Object obj10 = null;
        lista6.insere(obj10);
        lista0.insere(obj10);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 100.0f);
        boolean boolean16 = lista13.vazia();
        lista13.insere((java.lang.Object) 100);
        java.lang.Object obj19 = null;
        lista13.insere(obj19);
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        boolean boolean23 = lista21.vazia();
        boolean boolean24 = lista21.vazia();
        java.lang.Object obj25 = new java.lang.Object();
        lista21.insere(obj25);
        lista21.imprime();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        boolean boolean30 = lista28.vazia();
        boolean boolean31 = lista28.vazia();
        lista28.insere((java.lang.Object) 100L);
        lista28.imprime();
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        lista35.imprime();
        lista35.insere((java.lang.Object) false);
        boolean boolean40 = lista35.vazia();
        java.lang.Class<?> wildcardClass41 = lista35.getClass();
        lista28.insere((java.lang.Object) wildcardClass41);
        lista28.imprime();
        lista28.imprime();
        boolean boolean45 = lista28.vazia();
        lista21.insere((java.lang.Object) lista28);
        lista28.imprime();
        lista13.insere((java.lang.Object) lista28);
        java.lang.Class<?> wildcardClass49 = lista28.getClass();
        lista0.insere((java.lang.Object) lista28);
        boolean boolean51 = lista0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        boolean boolean7 = lista4.vazia();
        lista4.insere((java.lang.Object) 100);
        lista4.imprime();
        boolean boolean11 = lista4.vazia();
        lista4.insere((java.lang.Object) (short) 10);
        lista4.imprime();
        lista0.insere((java.lang.Object) lista4);
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        lista0.insere((java.lang.Object) (-1));
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        boolean boolean14 = lista11.vazia();
        java.lang.Object obj15 = new java.lang.Object();
        lista11.insere(obj15);
        lista11.imprime();
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 100.0f);
        boolean boolean23 = lista20.vazia();
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.imprime();
        lista24.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) (byte) 100);
        lista11.insere((java.lang.Object) lista20);
        lista11.imprime();
        lista11.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object obj4 = new java.lang.Object();
        lista0.insere(obj4);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 1);
        lista6.insere((java.lang.Object) 'a');
        boolean boolean11 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean11);
        lista0.imprime();
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        boolean boolean14 = lista5.vazia();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        boolean boolean17 = lista15.vazia();
        boolean boolean18 = lista15.vazia();
        lista15.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass21 = lista15.getClass();
        lista5.insere((java.lang.Object) wildcardClass21);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 100.0f);
        lista23.insere((java.lang.Object) 10L);
        lista23.insere((java.lang.Object) (short) -1);
        boolean boolean30 = lista23.vazia();
        boolean boolean31 = lista23.vazia();
        lista5.insere((java.lang.Object) boolean31);
        boolean boolean33 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 100.0f);
        boolean boolean38 = lista35.vazia();
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.imprime();
        lista39.insere((java.lang.Object) false);
        lista39.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) (byte) 100);
        lista35.insere((java.lang.Object) 1);
        boolean boolean51 = lista35.vazia();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) 100.0f);
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        ds.Lista lista58 = new ds.Lista();
        lista55.insere((java.lang.Object) lista58);
        lista52.insere((java.lang.Object) lista58);
        lista35.insere((java.lang.Object) lista58);
        lista5.insere((java.lang.Object) lista58);
        ds.Lista lista63 = new ds.Lista();
        boolean boolean64 = lista63.vazia();
        lista63.imprime();
        lista63.insere((java.lang.Object) false);
        boolean boolean68 = lista63.vazia();
        lista63.imprime();
        ds.Lista lista70 = new ds.Lista();
        boolean boolean71 = lista70.vazia();
        boolean boolean72 = lista70.vazia();
        boolean boolean73 = lista70.vazia();
        lista70.insere((java.lang.Object) 100L);
        lista70.imprime();
        lista63.insere((java.lang.Object) lista70);
        lista58.insere((java.lang.Object) lista63);
        lista0.insere((java.lang.Object) lista63);
        lista0.imprime();
        boolean boolean81 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        java.lang.Object obj5 = null;
        lista0.insere(obj5);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        lista1.imprime();
        lista1.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista1);
        boolean boolean7 = lista1.vazia();
        boolean boolean8 = lista1.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 100.0f);
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        lista13.imprime();
        boolean boolean19 = lista13.vazia();
        lista9.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 100.0f);
        boolean boolean24 = lista21.vazia();
        lista21.insere((java.lang.Object) 100);
        lista21.insere((java.lang.Object) 100.0d);
        lista13.insere((java.lang.Object) 100.0d);
        lista1.insere((java.lang.Object) 100.0d);
        boolean boolean31 = lista1.vazia();
        lista1.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) 100.0f);
        lista33.insere((java.lang.Object) 10L);
        lista33.insere((java.lang.Object) (short) -1);
        boolean boolean40 = lista33.vazia();
        boolean boolean41 = lista33.vazia();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 100.0f);
        boolean boolean45 = lista42.vazia();
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.imprime();
        lista46.insere((java.lang.Object) false);
        lista46.insere((java.lang.Object) false);
        lista42.insere((java.lang.Object) false);
        lista42.insere((java.lang.Object) (byte) 100);
        lista33.insere((java.lang.Object) (byte) 100);
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        boolean boolean59 = lista57.vazia();
        boolean boolean60 = lista57.vazia();
        lista57.insere((java.lang.Object) 100L);
        lista57.imprime();
        ds.Lista lista64 = new ds.Lista();
        boolean boolean65 = lista64.vazia();
        lista64.imprime();
        lista64.insere((java.lang.Object) false);
        boolean boolean69 = lista64.vazia();
        java.lang.Class<?> wildcardClass70 = lista64.getClass();
        lista57.insere((java.lang.Object) wildcardClass70);
        lista57.imprime();
        lista33.insere((java.lang.Object) lista57);
        lista33.imprime();
        lista1.insere((java.lang.Object) lista33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean19 = lista5.vazia();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 100.0f);
        boolean boolean28 = lista25.vazia();
        lista25.insere((java.lang.Object) 100);
        lista25.imprime();
        lista25.insere((java.lang.Object) 0L);
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        java.lang.Object obj38 = null;
        lista34.insere(obj38);
        java.lang.Class<?> wildcardClass40 = lista34.getClass();
        lista25.insere((java.lang.Object) wildcardClass40);
        lista23.insere((java.lang.Object) lista25);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.imprime();
        lista43.insere((java.lang.Object) false);
        lista43.insere((java.lang.Object) false);
        boolean boolean50 = lista43.vazia();
        boolean boolean51 = lista43.vazia();
        lista23.insere((java.lang.Object) lista43);
        lista43.imprime();
        lista5.insere((java.lang.Object) lista43);
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        lista55.imprime();
        lista55.insere((java.lang.Object) false);
        boolean boolean60 = lista55.vazia();
        boolean boolean61 = lista55.vazia();
        boolean boolean62 = lista55.vazia();
        ds.Lista lista63 = new ds.Lista();
        boolean boolean64 = lista63.vazia();
        boolean boolean65 = lista63.vazia();
        lista63.imprime();
        java.lang.Object obj67 = null;
        lista63.insere(obj67);
        boolean boolean69 = lista63.vazia();
        lista55.insere((java.lang.Object) lista63);
        lista5.insere((java.lang.Object) lista55);
        boolean boolean72 = lista55.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        lista0.insere((java.lang.Object) (-1));
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        boolean boolean14 = lista11.vazia();
        java.lang.Object obj15 = new java.lang.Object();
        lista11.insere(obj15);
        lista11.imprime();
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 100.0f);
        boolean boolean23 = lista20.vazia();
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.imprime();
        lista24.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) (byte) 100);
        lista11.insere((java.lang.Object) lista20);
        lista20.imprime();
        boolean boolean36 = lista20.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        lista1.imprime();
        lista1.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista1);
        boolean boolean7 = lista1.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        boolean boolean11 = lista8.vazia();
        lista8.insere((java.lang.Object) 100L);
        lista8.imprime();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        lista15.insere((java.lang.Object) false);
        boolean boolean20 = lista15.vazia();
        java.lang.Class<?> wildcardClass21 = lista15.getClass();
        lista8.insere((java.lang.Object) wildcardClass21);
        lista8.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 100.0f);
        lista24.insere((java.lang.Object) 10L);
        lista24.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista24.vazia();
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        boolean boolean34 = lista32.vazia();
        lista32.imprime();
        lista32.imprime();
        lista24.insere((java.lang.Object) lista32);
        lista8.insere((java.lang.Object) lista24);
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.imprime();
        lista39.insere((java.lang.Object) false);
        boolean boolean44 = lista39.vazia();
        boolean boolean45 = lista39.vazia();
        boolean boolean46 = lista39.vazia();
        java.lang.Class<?> wildcardClass47 = lista39.getClass();
        lista8.insere((java.lang.Object) wildcardClass47);
        lista1.insere((java.lang.Object) lista8);
        lista8.imprime();
        lista8.imprime();
        lista8.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 100.0f);
        lista7.insere((java.lang.Object) 10L);
        lista7.imprime();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        boolean boolean18 = lista15.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        lista19.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) (byte) 100);
        lista15.imprime();
        lista7.insere((java.lang.Object) lista15);
        lista7.imprime();
        boolean boolean32 = lista7.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        boolean boolean3 = lista0.vazia();
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        boolean boolean18 = lista15.vazia();
        lista15.insere((java.lang.Object) 100);
        lista15.imprime();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        lista22.imprime();
        lista22.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 1);
        lista29.imprime();
        lista29.imprime();
        boolean boolean34 = lista29.vazia();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 1);
        lista35.imprime();
        lista29.insere((java.lang.Object) lista35);
        lista35.imprime();
        lista0.insere((java.lang.Object) lista35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        lista9.imprime();
        java.lang.Object obj13 = null;
        lista9.insere(obj13);
        java.lang.Class<?> wildcardClass15 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass15);
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) false);
        boolean boolean13 = lista6.vazia();
        boolean boolean14 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 100.0f);
        lista16.insere((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = lista16.getClass();
        lista0.insere((java.lang.Object) wildcardClass21);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 100.0f);
        lista23.insere((java.lang.Object) 10L);
        lista23.imprime();
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        lista29.imprime();
        lista29.insere((java.lang.Object) false);
        lista29.insere((java.lang.Object) false);
        boolean boolean36 = lista29.vazia();
        boolean boolean37 = lista29.vazia();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 100.0f);
        lista39.insere((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass44 = lista39.getClass();
        lista23.insere((java.lang.Object) wildcardClass44);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        lista23.imprime();
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 100.0f);
        lista49.insere((java.lang.Object) 10L);
        lista49.insere((java.lang.Object) (short) -1);
        boolean boolean56 = lista49.vazia();
        boolean boolean57 = lista49.vazia();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 100.0f);
        boolean boolean61 = lista58.vazia();
        ds.Lista lista62 = new ds.Lista();
        boolean boolean63 = lista62.vazia();
        lista62.imprime();
        lista62.insere((java.lang.Object) false);
        lista62.insere((java.lang.Object) false);
        lista58.insere((java.lang.Object) false);
        lista58.insere((java.lang.Object) (byte) 100);
        lista49.insere((java.lang.Object) (byte) 100);
        ds.Lista lista73 = new ds.Lista();
        boolean boolean74 = lista73.vazia();
        boolean boolean75 = lista73.vazia();
        boolean boolean76 = lista73.vazia();
        lista73.insere((java.lang.Object) 100L);
        lista73.imprime();
        ds.Lista lista80 = new ds.Lista();
        boolean boolean81 = lista80.vazia();
        lista80.imprime();
        lista80.insere((java.lang.Object) false);
        boolean boolean85 = lista80.vazia();
        java.lang.Class<?> wildcardClass86 = lista80.getClass();
        lista73.insere((java.lang.Object) wildcardClass86);
        lista73.imprime();
        lista49.insere((java.lang.Object) lista73);
        boolean boolean90 = lista49.vazia();
        lista49.imprime();
        lista23.insere((java.lang.Object) lista49);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        java.lang.Object obj12 = null;
        lista8.insere(obj12);
        boolean boolean14 = lista8.vazia();
        lista0.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass16 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        boolean boolean9 = lista7.vazia();
        boolean boolean10 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        boolean boolean17 = lista15.vazia();
        boolean boolean18 = lista15.vazia();
        lista15.insere((java.lang.Object) 100L);
        lista0.insere((java.lang.Object) 100L);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 100.0f);
        lista22.insere((java.lang.Object) 10L);
        lista22.imprime();
        java.lang.Object obj28 = null;
        lista22.insere(obj28);
        lista0.insere((java.lang.Object) lista22);
        java.lang.Object obj31 = null;
        lista0.insere(obj31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 100.0f);
        boolean boolean14 = lista11.vazia();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        lista15.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) false);
        lista11.insere((java.lang.Object) false);
        lista11.insere((java.lang.Object) (byte) 100);
        lista11.insere((java.lang.Object) 1);
        boolean boolean27 = lista11.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 100.0f);
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        boolean boolean33 = lista31.vazia();
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista28.insere((java.lang.Object) lista34);
        lista11.insere((java.lang.Object) lista34);
        lista11.imprime();
        boolean boolean39 = lista11.vazia();
        lista0.insere((java.lang.Object) lista11);
        boolean boolean41 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.imprime();
        lista0.insere((java.lang.Object) 0L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 100.0f);
        lista18.insere((java.lang.Object) 10L);
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista18.vazia();
        boolean boolean26 = lista18.vazia();
        lista0.insere((java.lang.Object) boolean26);
        boolean boolean28 = lista0.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        boolean boolean33 = lista31.vazia();
        boolean boolean34 = lista31.vazia();
        lista31.insere((java.lang.Object) 100L);
        lista31.imprime();
        lista31.insere((java.lang.Object) 1);
        lista31.imprime();
        lista31.imprime();
        lista0.insere((java.lang.Object) lista31);
        java.lang.Class<?> wildcardClass43 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) false);
        boolean boolean13 = lista6.vazia();
        boolean boolean14 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        lista16.insere((java.lang.Object) false);
        boolean boolean21 = lista16.vazia();
        boolean boolean22 = lista16.vazia();
        boolean boolean23 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 100.0f);
        lista29.insere((java.lang.Object) 10L);
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean36 = lista29.vazia();
        lista25.insere((java.lang.Object) lista29);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 100.0f);
        lista38.insere((java.lang.Object) 10L);
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean45 = lista38.vazia();
        boolean boolean46 = lista38.vazia();
        lista38.insere((java.lang.Object) (-1));
        boolean boolean49 = lista38.vazia();
        lista29.insere((java.lang.Object) boolean49);
        lista29.insere((java.lang.Object) (short) 10);
        lista29.imprime();
        lista16.insere((java.lang.Object) lista29);
        boolean boolean55 = lista29.vazia();
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) 100.0f);
        lista56.insere((java.lang.Object) 10L);
        lista56.insere((java.lang.Object) (short) -1);
        boolean boolean63 = lista56.vazia();
        boolean boolean64 = lista56.vazia();
        lista56.insere((java.lang.Object) (-1));
        boolean boolean67 = lista56.vazia();
        lista29.insere((java.lang.Object) lista56);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 100.0f);
        boolean boolean9 = lista6.vazia();
        lista6.insere((java.lang.Object) 100);
        java.lang.Object obj12 = null;
        lista6.insere(obj12);
        lista0.insere(obj12);
        boolean boolean15 = lista0.vazia();
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        lista5.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        lista9.imprime();
        lista9.imprime();
        lista9.imprime();
        boolean boolean15 = lista9.vazia();
        lista5.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 100.0f);
        lista17.insere((java.lang.Object) 10L);
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean24 = lista17.vazia();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        lista25.imprime();
        lista17.insere((java.lang.Object) lista25);
        boolean boolean31 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        lista25.insere((java.lang.Object) lista33);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 100.0f);
        boolean boolean39 = lista36.vazia();
        lista36.insere((java.lang.Object) 100);
        lista36.imprime();
        boolean boolean43 = lista36.vazia();
        lista36.imprime();
        boolean boolean45 = lista36.vazia();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 100.0f);
        boolean boolean49 = lista46.vazia();
        lista46.insere((java.lang.Object) 100);
        lista46.imprime();
        lista46.insere((java.lang.Object) 0L);
        lista36.insere((java.lang.Object) 0L);
        lista36.imprime();
        ds.Lista lista57 = new ds.Lista();
        lista57.imprime();
        boolean boolean59 = lista57.vazia();
        boolean boolean60 = lista57.vazia();
        lista36.insere((java.lang.Object) boolean60);
        boolean boolean62 = lista36.vazia();
        lista33.insere((java.lang.Object) lista36);
        lista5.insere((java.lang.Object) lista36);
        lista0.insere((java.lang.Object) lista5);
        java.lang.Class<?> wildcardClass66 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        java.lang.Object obj12 = null;
        lista8.insere(obj12);
        boolean boolean14 = lista8.vazia();
        lista0.insere((java.lang.Object) lista8);
        boolean boolean16 = lista8.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 100.0f);
        lista10.insere((java.lang.Object) 10L);
        lista10.insere((java.lang.Object) (short) -1);
        boolean boolean17 = lista10.vazia();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        lista18.imprime();
        lista18.imprime();
        lista10.insere((java.lang.Object) lista18);
        boolean boolean24 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista18.insere((java.lang.Object) lista26);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 100.0f);
        boolean boolean32 = lista29.vazia();
        lista29.insere((java.lang.Object) 100);
        lista29.imprime();
        boolean boolean36 = lista29.vazia();
        lista29.imprime();
        boolean boolean38 = lista29.vazia();
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 100.0f);
        boolean boolean42 = lista39.vazia();
        lista39.insere((java.lang.Object) 100);
        lista39.imprime();
        lista39.insere((java.lang.Object) 0L);
        lista29.insere((java.lang.Object) 0L);
        lista29.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        boolean boolean52 = lista50.vazia();
        boolean boolean53 = lista50.vazia();
        lista29.insere((java.lang.Object) boolean53);
        boolean boolean55 = lista29.vazia();
        lista26.insere((java.lang.Object) lista29);
        java.lang.Class<?> wildcardClass57 = lista26.getClass();
        lista0.insere((java.lang.Object) wildcardClass57);
        boolean boolean59 = lista0.vazia();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 100.0f);
        boolean boolean63 = lista60.vazia();
        ds.Lista lista64 = new ds.Lista();
        boolean boolean65 = lista64.vazia();
        lista64.imprime();
        lista64.insere((java.lang.Object) false);
        lista64.insere((java.lang.Object) false);
        lista60.insere((java.lang.Object) false);
        lista60.insere((java.lang.Object) (byte) 100);
        lista60.insere((java.lang.Object) 1);
        boolean boolean76 = lista60.vazia();
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) 100.0f);
        ds.Lista lista80 = new ds.Lista();
        boolean boolean81 = lista80.vazia();
        boolean boolean82 = lista80.vazia();
        ds.Lista lista83 = new ds.Lista();
        lista80.insere((java.lang.Object) lista83);
        lista77.insere((java.lang.Object) lista83);
        lista60.insere((java.lang.Object) lista83);
        lista0.insere((java.lang.Object) lista60);
        boolean boolean88 = lista60.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        lista7.insere((java.lang.Object) false);
        boolean boolean12 = lista7.vazia();
        java.lang.Class<?> wildcardClass13 = lista7.getClass();
        lista0.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) 0.0f);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 100.0f);
        lista17.imprime();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        boolean boolean23 = lista21.vazia();
        lista21.imprime();
        lista21.imprime();
        lista21.imprime();
        boolean boolean27 = lista21.vazia();
        lista17.insere((java.lang.Object) lista21);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 100.0f);
        boolean boolean32 = lista29.vazia();
        lista29.insere((java.lang.Object) 100);
        lista29.insere((java.lang.Object) 100.0d);
        lista21.insere((java.lang.Object) 100.0d);
        lista0.insere((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass39 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        lista0.imprime();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 100.0f);
        boolean boolean13 = lista10.vazia();
        lista10.insere((java.lang.Object) 100);
        lista10.imprime();
        lista10.insere((java.lang.Object) 0L);
        lista0.insere((java.lang.Object) 0L);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 100.0f);
        lista22.insere((java.lang.Object) 10L);
        lista22.imprime();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        lista28.imprime();
        lista28.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) false);
        boolean boolean35 = lista28.vazia();
        boolean boolean36 = lista28.vazia();
        lista22.insere((java.lang.Object) lista28);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 100.0f);
        boolean boolean41 = lista38.vazia();
        lista38.insere((java.lang.Object) 100);
        lista38.imprime();
        lista38.insere((java.lang.Object) 0L);
        boolean boolean47 = lista38.vazia();
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        boolean boolean50 = lista48.vazia();
        boolean boolean51 = lista48.vazia();
        lista48.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass54 = lista48.getClass();
        lista38.insere((java.lang.Object) wildcardClass54);
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) 100.0f);
        lista56.insere((java.lang.Object) 10L);
        lista56.insere((java.lang.Object) (short) -1);
        boolean boolean63 = lista56.vazia();
        boolean boolean64 = lista56.vazia();
        lista38.insere((java.lang.Object) boolean64);
        boolean boolean66 = lista38.vazia();
        ds.Lista lista67 = new ds.Lista();
        lista38.insere((java.lang.Object) lista67);
        lista22.insere((java.lang.Object) lista38);
        lista0.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass71 = lista22.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.insere((java.lang.Object) false);
        boolean boolean11 = lista6.vazia();
        boolean boolean12 = lista6.vazia();
        java.lang.Class<?> wildcardClass13 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Class<?> wildcardClass15 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.insere((java.lang.Object) 10L);
        lista4.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista4.vazia();
        lista0.insere((java.lang.Object) lista4);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 100.0f);
        lista13.insere((java.lang.Object) 10L);
        lista13.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista13.vazia();
        boolean boolean21 = lista13.vazia();
        lista13.insere((java.lang.Object) (-1));
        boolean boolean24 = lista13.vazia();
        lista4.insere((java.lang.Object) boolean24);
        boolean boolean26 = lista4.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 100.0f);
        boolean boolean30 = lista27.vazia();
        lista27.insere((java.lang.Object) 100);
        lista27.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.imprime();
        lista34.insere((java.lang.Object) false);
        lista27.insere((java.lang.Object) lista34);
        lista4.insere((java.lang.Object) lista34);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 100.0f);
        lista41.insere((java.lang.Object) 10L);
        lista41.imprime();
        ds.Lista lista47 = new ds.Lista();
        boolean boolean48 = lista47.vazia();
        lista47.imprime();
        lista47.insere((java.lang.Object) false);
        lista47.insere((java.lang.Object) false);
        boolean boolean54 = lista47.vazia();
        boolean boolean55 = lista47.vazia();
        lista41.insere((java.lang.Object) lista47);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 100.0f);
        lista57.insere((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass62 = lista57.getClass();
        lista41.insere((java.lang.Object) wildcardClass62);
        ds.Lista lista64 = new ds.Lista();
        lista64.insere((java.lang.Object) 100.0f);
        lista64.insere((java.lang.Object) 10L);
        lista64.imprime();
        ds.Lista lista70 = new ds.Lista();
        boolean boolean71 = lista70.vazia();
        lista70.imprime();
        lista70.insere((java.lang.Object) false);
        lista70.insere((java.lang.Object) false);
        boolean boolean77 = lista70.vazia();
        boolean boolean78 = lista70.vazia();
        lista64.insere((java.lang.Object) lista70);
        ds.Lista lista80 = new ds.Lista();
        lista80.insere((java.lang.Object) 100.0f);
        lista80.insere((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass85 = lista80.getClass();
        lista64.insere((java.lang.Object) wildcardClass85);
        lista64.imprime();
        lista41.insere((java.lang.Object) lista64);
        lista4.insere((java.lang.Object) lista64);
        lista4.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        lista4.insere((java.lang.Object) false);
        lista4.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        boolean boolean17 = lista15.vazia();
        lista0.insere((java.lang.Object) lista15);
        boolean boolean19 = lista15.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1);
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista12.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        boolean boolean22 = lista19.vazia();
        java.lang.Object obj23 = new java.lang.Object();
        lista19.insere(obj23);
        lista19.imprime();
        java.lang.Class<?> wildcardClass26 = lista19.getClass();
        lista5.insere((java.lang.Object) wildcardClass26);
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        boolean boolean30 = lista28.vazia();
        boolean boolean31 = lista28.vazia();
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        lista33.imprime();
        lista33.insere((java.lang.Object) false);
        lista32.insere((java.lang.Object) lista33);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 100.0f);
        boolean boolean42 = lista39.vazia();
        lista39.insere((java.lang.Object) 100);
        lista39.imprime();
        lista33.insere((java.lang.Object) lista39);
        lista28.insere((java.lang.Object) lista39);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) 100.0f);
        boolean boolean51 = lista48.vazia();
        lista48.insere((java.lang.Object) 100);
        lista48.imprime();
        lista48.insere((java.lang.Object) 0L);
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        boolean boolean59 = lista57.vazia();
        lista57.imprime();
        java.lang.Object obj61 = null;
        lista57.insere(obj61);
        java.lang.Class<?> wildcardClass63 = lista57.getClass();
        lista48.insere((java.lang.Object) wildcardClass63);
        java.lang.Class<?> wildcardClass65 = lista48.getClass();
        lista39.insere((java.lang.Object) lista48);
        lista5.insere((java.lang.Object) lista39);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object obj6 = null;
        lista0.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.imprime();
        lista8.insere((java.lang.Object) false);
        lista8.insere((java.lang.Object) false);
        boolean boolean15 = lista8.vazia();
        java.lang.Class<?> wildcardClass16 = lista8.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 100.0f);
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        boolean boolean23 = lista21.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista21.insere((java.lang.Object) lista24);
        lista18.insere((java.lang.Object) lista24);
        java.lang.Class<?> wildcardClass27 = lista18.getClass();
        lista0.insere((java.lang.Object) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        lista0.imprime();
        boolean boolean15 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 10);
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 100.0f);
        lista22.insere((java.lang.Object) 10L);
        lista22.insere((java.lang.Object) (short) -1);
        boolean boolean29 = lista22.vazia();
        lista18.insere((java.lang.Object) lista22);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 100.0f);
        lista31.insere((java.lang.Object) 10L);
        lista31.insere((java.lang.Object) (short) -1);
        boolean boolean38 = lista31.vazia();
        boolean boolean39 = lista31.vazia();
        lista31.insere((java.lang.Object) (-1));
        boolean boolean42 = lista31.vazia();
        lista22.insere((java.lang.Object) boolean42);
        boolean boolean44 = lista22.vazia();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 100.0f);
        boolean boolean48 = lista45.vazia();
        lista45.insere((java.lang.Object) 100);
        lista45.imprime();
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        lista52.imprime();
        lista52.insere((java.lang.Object) false);
        lista45.insere((java.lang.Object) lista52);
        lista22.insere((java.lang.Object) lista52);
        lista0.insere((java.lang.Object) lista22);
        java.lang.Object obj60 = null;
        lista0.insere(obj60);
        boolean boolean62 = lista0.vazia();
        java.lang.Class<?> wildcardClass63 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 100.0f);
        lista7.insere((java.lang.Object) 10L);
        lista7.imprime();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        lista0.imprime();
        boolean boolean16 = lista0.vazia();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 100.0f);
        lista7.insere((java.lang.Object) 10L);
        lista7.imprime();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        lista7.imprime();
        lista7.imprime();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 100.0f);
        lista23.insere((java.lang.Object) 10L);
        lista23.imprime();
        lista17.insere((java.lang.Object) lista23);
        lista17.imprime();
        lista7.insere((java.lang.Object) lista17);
        boolean boolean32 = lista17.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.insere((java.lang.Object) 1);
        boolean boolean9 = lista0.vazia();
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        boolean boolean4 = lista2.vazia();
        boolean boolean5 = lista2.vazia();
        java.lang.Object obj6 = new java.lang.Object();
        lista2.insere(obj6);
        lista0.insere((java.lang.Object) lista2);
        lista0.insere((java.lang.Object) (byte) 10);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 100.0f);
        lista11.insere((java.lang.Object) 10L);
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean18 = lista11.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        lista19.imprime();
        lista19.imprime();
        lista11.insere((java.lang.Object) lista19);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        boolean boolean29 = lista27.vazia();
        boolean boolean30 = lista27.vazia();
        lista27.insere((java.lang.Object) 100L);
        lista0.insere((java.lang.Object) lista27);
        java.lang.Class<?> wildcardClass34 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        lista14.imprime();
        java.lang.Object obj18 = null;
        lista14.insere(obj18);
        java.lang.Class<?> wildcardClass20 = lista14.getClass();
        lista5.insere((java.lang.Object) wildcardClass20);
        lista3.insere((java.lang.Object) lista5);
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.imprime();
        lista23.insere((java.lang.Object) false);
        lista23.insere((java.lang.Object) false);
        boolean boolean30 = lista23.vazia();
        boolean boolean31 = lista23.vazia();
        lista3.insere((java.lang.Object) lista23);
        lista23.imprime();
        boolean boolean34 = lista23.vazia();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 100.0f);
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        ds.Lista lista41 = new ds.Lista();
        lista38.insere((java.lang.Object) lista41);
        lista35.insere((java.lang.Object) lista41);
        lista23.insere((java.lang.Object) lista41);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 100.0f);
        lista41.insere((java.lang.Object) lista45);
        boolean boolean49 = lista41.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        boolean boolean16 = lista14.vazia();
        lista14.imprime();
        java.lang.Object obj18 = null;
        lista14.insere(obj18);
        java.lang.Class<?> wildcardClass20 = lista14.getClass();
        lista5.insere((java.lang.Object) wildcardClass20);
        lista3.insere((java.lang.Object) lista5);
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        boolean boolean25 = lista23.vazia();
        boolean boolean26 = lista23.vazia();
        java.lang.Object obj27 = new java.lang.Object();
        lista23.insere(obj27);
        lista5.insere((java.lang.Object) lista23);
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista30.insere((java.lang.Object) lista33);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 100.0f);
        boolean boolean38 = lista35.vazia();
        lista35.insere((java.lang.Object) 100);
        lista35.imprime();
        lista35.insere((java.lang.Object) 0L);
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        boolean boolean46 = lista44.vazia();
        lista44.imprime();
        java.lang.Object obj48 = null;
        lista44.insere(obj48);
        java.lang.Class<?> wildcardClass50 = lista44.getClass();
        lista35.insere((java.lang.Object) wildcardClass50);
        lista33.insere((java.lang.Object) lista35);
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        lista53.imprime();
        lista53.insere((java.lang.Object) false);
        lista53.insere((java.lang.Object) false);
        boolean boolean60 = lista53.vazia();
        boolean boolean61 = lista53.vazia();
        lista33.insere((java.lang.Object) lista53);
        lista53.imprime();
        boolean boolean64 = lista53.vazia();
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) 100.0f);
        ds.Lista lista68 = new ds.Lista();
        boolean boolean69 = lista68.vazia();
        boolean boolean70 = lista68.vazia();
        ds.Lista lista71 = new ds.Lista();
        lista68.insere((java.lang.Object) lista71);
        lista65.insere((java.lang.Object) lista71);
        lista53.insere((java.lang.Object) lista71);
        ds.Lista lista75 = new ds.Lista();
        lista75.insere((java.lang.Object) 100.0f);
        lista71.insere((java.lang.Object) lista75);
        boolean boolean79 = lista75.vazia();
        java.lang.Class<?> wildcardClass80 = lista75.getClass();
        lista5.insere((java.lang.Object) wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) false);
        boolean boolean13 = lista6.vazia();
        boolean boolean14 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        lista16.insere((java.lang.Object) false);
        boolean boolean21 = lista16.vazia();
        boolean boolean22 = lista16.vazia();
        boolean boolean23 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 100.0f);
        lista29.insere((java.lang.Object) 10L);
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean36 = lista29.vazia();
        lista25.insere((java.lang.Object) lista29);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 100.0f);
        lista38.insere((java.lang.Object) 10L);
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean45 = lista38.vazia();
        boolean boolean46 = lista38.vazia();
        lista38.insere((java.lang.Object) (-1));
        boolean boolean49 = lista38.vazia();
        lista29.insere((java.lang.Object) boolean49);
        lista29.insere((java.lang.Object) (short) 10);
        lista29.imprime();
        lista16.insere((java.lang.Object) lista29);
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        lista55.imprime();
        ds.Lista lista59 = new ds.Lista();
        lista59.insere((java.lang.Object) 100.0f);
        lista59.insere((java.lang.Object) 10L);
        lista59.insere((java.lang.Object) (short) -1);
        boolean boolean66 = lista59.vazia();
        lista55.insere((java.lang.Object) lista59);
        lista59.imprime();
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) 100.0f);
        boolean boolean72 = lista69.vazia();
        lista69.insere((java.lang.Object) 100);
        lista69.imprime();
        boolean boolean76 = lista69.vazia();
        lista69.imprime();
        boolean boolean78 = lista69.vazia();
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) 100.0f);
        boolean boolean82 = lista79.vazia();
        lista79.insere((java.lang.Object) 100);
        lista79.imprime();
        lista79.insere((java.lang.Object) 0L);
        lista69.insere((java.lang.Object) 0L);
        lista69.imprime();
        ds.Lista lista90 = new ds.Lista();
        lista90.imprime();
        boolean boolean92 = lista90.vazia();
        boolean boolean93 = lista90.vazia();
        lista69.insere((java.lang.Object) boolean93);
        lista69.imprime();
        lista59.insere((java.lang.Object) lista69);
        lista29.insere((java.lang.Object) lista59);
        boolean boolean98 = lista29.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 100.0f);
        lista4.imprime();
        java.lang.Class<?> wildcardClass8 = lista4.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.insere((java.lang.Object) 100L);
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 100.0f);
        lista17.insere((java.lang.Object) 10L);
        lista17.imprime();
        lista17.imprime();
        lista10.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 100.0f);
        boolean boolean29 = lista26.vazia();
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.imprime();
        lista30.insere((java.lang.Object) false);
        lista30.insere((java.lang.Object) false);
        lista26.insere((java.lang.Object) false);
        lista26.insere((java.lang.Object) (byte) 100);
        lista26.imprime();
        lista0.insere((java.lang.Object) lista26);
        java.lang.Class<?> wildcardClass42 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0L);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 1);
        lista5.imprime();
        boolean boolean9 = lista5.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 100.0f);
        lista7.insere((java.lang.Object) 10L);
        lista7.imprime();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 100.0f);
        boolean boolean18 = lista15.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        lista19.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) (byte) 100);
        lista15.imprime();
        lista7.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass31 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 100.0f);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 100);
        lista5.imprime();
        lista5.insere((java.lang.Object) 0L);
        boolean boolean14 = lista5.vazia();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        boolean boolean17 = lista15.vazia();
        boolean boolean18 = lista15.vazia();
        lista15.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass21 = lista15.getClass();
        lista5.insere((java.lang.Object) wildcardClass21);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 100.0f);
        lista23.insere((java.lang.Object) 10L);
        lista23.insere((java.lang.Object) (short) -1);
        boolean boolean30 = lista23.vazia();
        boolean boolean31 = lista23.vazia();
        lista5.insere((java.lang.Object) boolean31);
        boolean boolean33 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 100.0f);
        boolean boolean38 = lista35.vazia();
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.imprime();
        lista39.insere((java.lang.Object) false);
        lista39.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) (byte) 100);
        lista35.insere((java.lang.Object) 1);
        boolean boolean51 = lista35.vazia();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) 100.0f);
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        ds.Lista lista58 = new ds.Lista();
        lista55.insere((java.lang.Object) lista58);
        lista52.insere((java.lang.Object) lista58);
        lista35.insere((java.lang.Object) lista58);
        lista5.insere((java.lang.Object) lista58);
        ds.Lista lista63 = new ds.Lista();
        boolean boolean64 = lista63.vazia();
        lista63.imprime();
        lista63.insere((java.lang.Object) false);
        boolean boolean68 = lista63.vazia();
        lista63.imprime();
        ds.Lista lista70 = new ds.Lista();
        boolean boolean71 = lista70.vazia();
        boolean boolean72 = lista70.vazia();
        boolean boolean73 = lista70.vazia();
        lista70.insere((java.lang.Object) 100L);
        lista70.imprime();
        lista63.insere((java.lang.Object) lista70);
        lista58.insere((java.lang.Object) lista63);
        lista0.insere((java.lang.Object) lista63);
        lista0.imprime();
        ds.Lista lista81 = new ds.Lista();
        boolean boolean82 = lista81.vazia();
        lista81.imprime();
        ds.Lista lista84 = new ds.Lista();
        boolean boolean85 = lista84.vazia();
        boolean boolean86 = lista84.vazia();
        lista84.imprime();
        lista84.insere((java.lang.Object) 100L);
        boolean boolean90 = lista84.vazia();
        lista81.insere((java.lang.Object) boolean90);
        lista0.insere((java.lang.Object) lista81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.insere((java.lang.Object) 10L);
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        boolean boolean10 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        boolean boolean14 = lista8.vazia();
        lista8.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista8.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 100.0f);
        lista20.imprime();
        boolean boolean24 = lista20.vazia();
        lista20.imprime();
        lista16.insere((java.lang.Object) lista20);
        boolean boolean27 = lista20.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 100.0f);
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 100.0f);
        lista6.imprime();
        lista6.insere((java.lang.Object) 10.0f);
        lista0.insere((java.lang.Object) 10.0f);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 100.0f);
        boolean boolean16 = lista13.vazia();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        lista17.imprime();
        lista17.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) false);
        lista13.insere((java.lang.Object) false);
        lista13.insere((java.lang.Object) (byte) 100);
        lista13.insere((java.lang.Object) 1);
        boolean boolean29 = lista13.vazia();
        java.lang.Class<?> wildcardClass30 = lista13.getClass();
        lista0.insere((java.lang.Object) wildcardClass30);
        boolean boolean32 = lista0.vazia();
        boolean boolean33 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }
}

