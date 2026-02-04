package ds.seed5482;

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
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        lista0.imprime();
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        boolean boolean19 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        lista16.insere((java.lang.Object) lista21);
        boolean boolean26 = lista21.vazia();
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        boolean boolean29 = lista10.vazia();
        boolean boolean30 = lista10.vazia();
        java.lang.Class<?> wildcardClass31 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.insere((java.lang.Object) 'a');
        boolean boolean23 = lista17.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista24.imprime();
        boolean boolean30 = lista24.vazia();
        lista24.insere((java.lang.Object) 100L);
        boolean boolean33 = lista24.vazia();
        lista17.insere((java.lang.Object) lista24);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        boolean boolean38 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista17.insere((java.lang.Object) lista40);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        lista48.imprime();
        lista17.insere((java.lang.Object) lista48);
        boolean boolean53 = lista48.vazia();
        lista48.imprime();
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        boolean boolean58 = lista55.vazia();
        lista48.insere((java.lang.Object) lista55);
        lista10.insere((java.lang.Object) lista55);
        java.lang.Class<?> wildcardClass61 = lista55.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        boolean boolean10 = lista7.vazia();
        lista7.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        lista15.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass20 = lista15.getClass();
        lista12.insere((java.lang.Object) wildcardClass20);
        lista7.insere((java.lang.Object) lista12);
        boolean boolean23 = lista12.vazia();
        lista12.imprime();
        boolean boolean25 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean25);
        boolean boolean27 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.insere((java.lang.Object) 'a');
        boolean boolean23 = lista17.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista24.imprime();
        boolean boolean30 = lista24.vazia();
        lista24.insere((java.lang.Object) 100L);
        boolean boolean33 = lista24.vazia();
        lista17.insere((java.lang.Object) lista24);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        boolean boolean38 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista17.insere((java.lang.Object) lista40);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        lista48.imprime();
        lista17.insere((java.lang.Object) lista48);
        boolean boolean53 = lista48.vazia();
        lista48.imprime();
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        boolean boolean58 = lista55.vazia();
        lista48.insere((java.lang.Object) lista55);
        lista10.insere((java.lang.Object) lista55);
        boolean boolean61 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.insere((java.lang.Object) "hi!");
        lista11.imprime();
        lista11.imprime();
        lista11.insere((java.lang.Object) 1L);
        lista0.insere((java.lang.Object) 1L);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) (byte) 0);
        lista22.imprime();
        lista22.insere((java.lang.Object) false);
        boolean boolean32 = lista22.vazia();
        java.lang.Class<?> wildcardClass33 = lista22.getClass();
        lista0.insere((java.lang.Object) wildcardClass33);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        lista35.insere((java.lang.Object) false);
        lista35.imprime();
        boolean boolean41 = lista35.vazia();
        lista35.insere((java.lang.Object) 100L);
        lista0.insere((java.lang.Object) lista35);
        lista35.imprime();
        lista35.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        boolean boolean33 = lista30.vazia();
        lista30.imprime();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        lista35.insere((java.lang.Object) false);
        lista30.insere((java.lang.Object) lista35);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        boolean boolean44 = lista41.vazia();
        lista35.insere((java.lang.Object) lista41);
        lista35.imprime();
        ds.Lista lista47 = new ds.Lista();
        boolean boolean48 = lista47.vazia();
        boolean boolean49 = lista47.vazia();
        lista35.insere((java.lang.Object) boolean49);
        lista10.insere((java.lang.Object) lista35);
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) (short) -1);
        lista52.imprime();
        lista52.insere((java.lang.Object) "hi!");
        boolean boolean58 = lista52.vazia();
        boolean boolean59 = lista52.vazia();
        java.lang.Class<?> wildcardClass60 = lista52.getClass();
        lista10.insere((java.lang.Object) lista52);
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) (short) -1);
        lista62.imprime();
        lista62.imprime();
        boolean boolean67 = lista62.vazia();
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) (short) -1);
        lista68.imprime();
        lista68.imprime();
        boolean boolean73 = lista68.vazia();
        ds.Lista lista74 = new ds.Lista();
        lista74.insere((java.lang.Object) (short) -1);
        boolean boolean77 = lista74.vazia();
        lista74.imprime();
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) (short) -1);
        lista79.insere((java.lang.Object) false);
        lista74.insere((java.lang.Object) lista79);
        lista68.insere((java.lang.Object) lista79);
        lista62.insere((java.lang.Object) lista68);
        boolean boolean87 = lista68.vazia();
        ds.Lista lista88 = new ds.Lista();
        lista88.insere((java.lang.Object) (short) -1);
        lista88.imprime();
        lista88.imprime();
        lista68.insere((java.lang.Object) lista88);
        lista68.imprime();
        boolean boolean95 = lista68.vazia();
        lista52.insere((java.lang.Object) lista68);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.imprime();
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        boolean boolean17 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean17);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.imprime();
        lista26.imprime();
        boolean boolean31 = lista26.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.imprime();
        lista32.imprime();
        boolean boolean37 = lista32.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean41 = lista38.vazia();
        lista38.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.insere((java.lang.Object) false);
        lista38.insere((java.lang.Object) lista43);
        lista32.insere((java.lang.Object) lista43);
        lista26.insere((java.lang.Object) lista32);
        boolean boolean51 = lista32.vazia();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) (short) -1);
        lista52.imprime();
        lista52.imprime();
        lista32.insere((java.lang.Object) lista52);
        lista19.insere((java.lang.Object) lista52);
        lista0.insere((java.lang.Object) lista52);
        boolean boolean60 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        lista18.insere((java.lang.Object) false);
        boolean boolean23 = lista18.vazia();
        java.lang.Class<?> wildcardClass24 = lista18.getClass();
        lista7.insere((java.lang.Object) lista18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        lista0.insere((java.lang.Object) boolean2);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        boolean boolean15 = lista12.vazia();
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        java.lang.Class<?> wildcardClass23 = lista18.getClass();
        lista12.insere((java.lang.Object) wildcardClass23);
        lista0.insere((java.lang.Object) wildcardClass23);
        boolean boolean26 = lista0.vazia();
        boolean boolean27 = lista0.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        lista28.imprime();
        lista28.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        boolean boolean36 = lista33.vazia();
        lista33.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.insere((java.lang.Object) false);
        lista33.insere((java.lang.Object) lista38);
        lista28.insere((java.lang.Object) lista38);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        boolean boolean48 = lista45.vazia();
        lista45.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.insere((java.lang.Object) false);
        lista45.insere((java.lang.Object) lista50);
        java.lang.Class<?> wildcardClass56 = lista45.getClass();
        lista38.insere((java.lang.Object) wildcardClass56);
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) (short) -1);
        boolean boolean61 = lista58.vazia();
        lista58.imprime();
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) (short) -1);
        lista63.insere((java.lang.Object) false);
        lista58.insere((java.lang.Object) lista63);
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) (short) -1);
        boolean boolean72 = lista69.vazia();
        lista63.insere((java.lang.Object) lista69);
        lista63.imprime();
        ds.Lista lista75 = new ds.Lista();
        boolean boolean76 = lista75.vazia();
        boolean boolean77 = lista75.vazia();
        lista63.insere((java.lang.Object) boolean77);
        lista38.insere((java.lang.Object) lista63);
        lista0.insere((java.lang.Object) lista63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        lista9.insere((java.lang.Object) lista12);
        lista5.insere((java.lang.Object) lista9);
        boolean boolean17 = lista9.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.insere((java.lang.Object) 'a');
        lista18.insere((java.lang.Object) 0);
        boolean boolean26 = lista18.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        boolean boolean30 = lista27.vazia();
        lista27.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista27.insere((java.lang.Object) lista32);
        lista32.imprime();
        boolean boolean39 = lista32.vazia();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        lista32.insere(obj40);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.imprime();
        lista43.imprime();
        lista43.insere((java.lang.Object) (byte) 0);
        lista43.imprime();
        lista43.insere((java.lang.Object) false);
        boolean boolean53 = lista43.vazia();
        lista32.insere((java.lang.Object) lista43);
        lista18.insere((java.lang.Object) lista32);
        lista32.imprime();
        lista9.insere((java.lang.Object) lista32);
        lista32.imprime();
        lista0.insere((java.lang.Object) lista32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        lista7.imprime();
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        boolean boolean14 = lista7.vazia();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista17.imprime();
        lista17.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.imprime();
        lista24.imprime();
        boolean boolean29 = lista24.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.imprime();
        lista30.imprime();
        boolean boolean35 = lista30.vazia();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        boolean boolean39 = lista36.vazia();
        lista36.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        lista41.insere((java.lang.Object) false);
        lista36.insere((java.lang.Object) lista41);
        lista30.insere((java.lang.Object) lista41);
        lista24.insere((java.lang.Object) lista30);
        boolean boolean49 = lista30.vazia();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.imprime();
        lista50.imprime();
        lista30.insere((java.lang.Object) lista50);
        lista17.insere((java.lang.Object) lista50);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) (short) -1);
        lista57.imprime();
        lista57.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) (short) -1);
        boolean boolean65 = lista62.vazia();
        lista62.imprime();
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        lista67.insere((java.lang.Object) false);
        lista62.insere((java.lang.Object) lista67);
        lista57.insere((java.lang.Object) lista67);
        ds.Lista lista74 = new ds.Lista();
        lista74.insere((java.lang.Object) (short) -1);
        boolean boolean77 = lista74.vazia();
        lista74.imprime();
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) (short) -1);
        lista79.insere((java.lang.Object) false);
        lista74.insere((java.lang.Object) lista79);
        java.lang.Class<?> wildcardClass85 = lista74.getClass();
        lista67.insere((java.lang.Object) wildcardClass85);
        lista17.insere((java.lang.Object) lista67);
        lista67.imprime();
        lista7.insere((java.lang.Object) lista67);
        java.lang.Class<?> wildcardClass90 = lista7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        boolean boolean8 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        boolean boolean11 = lista5.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        lista10.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        lista10.insere((java.lang.Object) lista32);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) (short) -1);
        boolean boolean42 = lista39.vazia();
        lista32.insere((java.lang.Object) lista39);
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) (short) -1);
        lista47.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass52 = lista47.getClass();
        lista44.insere((java.lang.Object) wildcardClass52);
        boolean boolean54 = lista44.vazia();
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) (short) -1);
        lista55.imprime();
        lista55.insere((java.lang.Object) "hi!");
        lista55.imprime();
        lista55.imprime();
        lista55.insere((java.lang.Object) 1L);
        lista44.insere((java.lang.Object) 1L);
        lista44.insere((java.lang.Object) (-1L));
        lista39.insere((java.lang.Object) lista44);
        lista39.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        boolean boolean16 = lista11.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        boolean boolean23 = lista17.vazia();
        lista11.insere((java.lang.Object) lista17);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        lista25.imprime();
        boolean boolean31 = lista25.vazia();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean34 = lista25.vazia();
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        lista25.insere((java.lang.Object) lista35);
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        lista38.imprime();
        boolean boolean42 = lista38.vazia();
        lista38.insere((java.lang.Object) 'a');
        lista38.imprime();
        lista35.insere((java.lang.Object) lista38);
        boolean boolean47 = lista38.vazia();
        lista38.insere((java.lang.Object) (byte) 10);
        lista38.imprime();
        boolean boolean51 = lista38.vazia();
        lista11.insere((java.lang.Object) boolean51);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean32 = lista29.vazia();
        lista23.insere((java.lang.Object) lista29);
        lista0.insere((java.lang.Object) lista23);
        boolean boolean35 = lista23.vazia();
        lista23.imprime();
        lista23.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean41 = lista38.vazia();
        java.lang.Class<?> wildcardClass42 = lista38.getClass();
        lista23.insere((java.lang.Object) wildcardClass42);
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        boolean boolean46 = lista44.vazia();
        lista44.imprime();
        lista44.imprime();
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        lista49.imprime();
        lista49.imprime();
        lista49.insere((java.lang.Object) (byte) 0);
        lista49.imprime();
        lista44.insere((java.lang.Object) lista49);
        ds.Lista lista58 = new ds.Lista();
        ds.Lista lista59 = new ds.Lista();
        boolean boolean60 = lista59.vazia();
        lista58.insere((java.lang.Object) boolean60);
        boolean boolean62 = lista58.vazia();
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) (short) -1);
        boolean boolean66 = lista63.vazia();
        boolean boolean67 = lista63.vazia();
        lista58.insere((java.lang.Object) lista63);
        lista49.insere((java.lang.Object) lista63);
        ds.Lista lista70 = new ds.Lista();
        boolean boolean71 = lista70.vazia();
        lista70.imprime();
        ds.Lista lista73 = new ds.Lista();
        boolean boolean74 = lista73.vazia();
        lista73.imprime();
        lista70.insere((java.lang.Object) lista73);
        ds.Lista lista77 = new ds.Lista();
        lista77.imprime();
        lista73.insere((java.lang.Object) lista77);
        java.lang.Class<?> wildcardClass80 = lista73.getClass();
        lista63.insere((java.lang.Object) lista73);
        lista23.insere((java.lang.Object) lista63);
        boolean boolean83 = lista23.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        lista5.imprime();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        boolean boolean19 = lista17.vazia();
        lista5.insere((java.lang.Object) boolean19);
        java.lang.Class<?> wildcardClass21 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        boolean boolean17 = lista13.vazia();
        lista13.insere((java.lang.Object) 'a');
        lista13.imprime();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean22 = lista13.vazia();
        lista13.insere((java.lang.Object) (byte) 10);
        lista13.imprime();
        boolean boolean26 = lista13.vazia();
        java.lang.Class<?> wildcardClass27 = lista13.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        boolean boolean18 = lista0.vazia();
        boolean boolean19 = lista0.vazia();
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        boolean boolean10 = lista7.vazia();
        lista7.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        lista12.insere((java.lang.Object) false);
        lista7.insere((java.lang.Object) lista12);
        lista6.insere((java.lang.Object) lista12);
        boolean boolean19 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        boolean boolean12 = lista7.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) lista24);
        lista13.insere((java.lang.Object) lista24);
        lista7.insere((java.lang.Object) lista13);
        boolean boolean32 = lista13.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.imprime();
        lista13.insere((java.lang.Object) lista33);
        lista0.insere((java.lang.Object) lista33);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.imprime();
        lista40.insere((java.lang.Object) "hi!");
        boolean boolean46 = lista40.vazia();
        lista40.insere((java.lang.Object) (short) 10);
        boolean boolean49 = lista40.vazia();
        lista0.insere((java.lang.Object) boolean49);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        boolean boolean54 = lista51.vazia();
        lista51.imprime();
        boolean boolean56 = lista51.vazia();
        lista51.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) (short) -1);
        lista58.insere((java.lang.Object) false);
        lista58.imprime();
        boolean boolean64 = lista58.vazia();
        lista58.insere((java.lang.Object) 100L);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        lista67.imprime();
        lista67.imprime();
        lista67.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass74 = lista67.getClass();
        lista58.insere((java.lang.Object) wildcardClass74);
        lista51.insere((java.lang.Object) lista58);
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) (short) -1);
        lista77.imprime();
        boolean boolean81 = lista77.vazia();
        lista77.imprime();
        lista51.insere((java.lang.Object) lista77);
        lista0.insere((java.lang.Object) lista77);
        lista77.imprime();
        boolean boolean86 = lista77.vazia();
        lista77.imprime();
        boolean boolean88 = lista77.vazia();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        boolean boolean10 = lista7.vazia();
        lista7.imprime();
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        boolean boolean14 = lista7.vazia();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista17.imprime();
        lista17.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.imprime();
        lista24.imprime();
        boolean boolean29 = lista24.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.imprime();
        lista30.imprime();
        boolean boolean35 = lista30.vazia();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        boolean boolean39 = lista36.vazia();
        lista36.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        lista41.insere((java.lang.Object) false);
        lista36.insere((java.lang.Object) lista41);
        lista30.insere((java.lang.Object) lista41);
        lista24.insere((java.lang.Object) lista30);
        boolean boolean49 = lista30.vazia();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.imprime();
        lista50.imprime();
        lista30.insere((java.lang.Object) lista50);
        lista17.insere((java.lang.Object) lista50);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) (short) -1);
        lista57.imprime();
        lista57.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) (short) -1);
        boolean boolean65 = lista62.vazia();
        lista62.imprime();
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        lista67.insere((java.lang.Object) false);
        lista62.insere((java.lang.Object) lista67);
        lista57.insere((java.lang.Object) lista67);
        ds.Lista lista74 = new ds.Lista();
        lista74.insere((java.lang.Object) (short) -1);
        boolean boolean77 = lista74.vazia();
        lista74.imprime();
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) (short) -1);
        lista79.insere((java.lang.Object) false);
        lista74.insere((java.lang.Object) lista79);
        java.lang.Class<?> wildcardClass85 = lista74.getClass();
        lista67.insere((java.lang.Object) wildcardClass85);
        lista17.insere((java.lang.Object) lista67);
        lista67.imprime();
        lista7.insere((java.lang.Object) lista67);
        lista7.imprime();
        lista7.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean16 = lista5.vazia();
        boolean boolean17 = lista5.vazia();
        boolean boolean18 = lista5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        lista10.imprime();
        ds.Lista lista31 = new ds.Lista();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        boolean boolean35 = lista32.vazia();
        lista32.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.insere((java.lang.Object) false);
        lista32.insere((java.lang.Object) lista37);
        lista31.insere((java.lang.Object) lista37);
        java.lang.Class<?> wildcardClass44 = lista31.getClass();
        lista10.insere((java.lang.Object) wildcardClass44);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        boolean boolean54 = lista51.vazia();
        lista51.imprime();
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) (short) -1);
        lista56.insere((java.lang.Object) false);
        lista51.insere((java.lang.Object) lista56);
        lista46.insere((java.lang.Object) lista56);
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) (short) -1);
        boolean boolean66 = lista63.vazia();
        lista63.imprime();
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) (short) -1);
        lista68.insere((java.lang.Object) false);
        lista63.insere((java.lang.Object) lista68);
        java.lang.Class<?> wildcardClass74 = lista63.getClass();
        lista56.insere((java.lang.Object) wildcardClass74);
        lista10.insere((java.lang.Object) wildcardClass74);
        lista10.imprime();
        java.lang.Class<?> wildcardClass78 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean18 = lista0.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) (byte) 100);
        boolean boolean26 = lista19.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.insere((java.lang.Object) false);
        lista27.imprime();
        boolean boolean33 = lista27.vazia();
        lista27.insere((java.lang.Object) 100L);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        lista36.imprime();
        lista36.imprime();
        lista36.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass43 = lista36.getClass();
        lista27.insere((java.lang.Object) wildcardClass43);
        lista19.insere((java.lang.Object) wildcardClass43);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        lista46.imprime();
        lista46.imprime();
        boolean boolean51 = lista46.vazia();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) (short) -1);
        boolean boolean55 = lista52.vazia();
        lista52.imprime();
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) (short) -1);
        lista57.insere((java.lang.Object) false);
        lista52.insere((java.lang.Object) lista57);
        lista46.insere((java.lang.Object) lista57);
        ds.Lista lista64 = new ds.Lista();
        lista64.insere((java.lang.Object) (short) -1);
        boolean boolean67 = lista64.vazia();
        lista64.insere((java.lang.Object) (-1.0d));
        lista64.imprime();
        lista46.insere((java.lang.Object) lista64);
        lista19.insere((java.lang.Object) lista46);
        ds.Lista lista73 = new ds.Lista();
        lista73.insere((java.lang.Object) (short) -1);
        lista73.insere((java.lang.Object) false);
        boolean boolean78 = lista73.vazia();
        lista73.imprime();
        lista73.imprime();
        lista46.insere((java.lang.Object) lista73);
        lista0.insere((java.lang.Object) lista73);
        lista73.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.imprime();
        lista18.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista21);
        boolean boolean26 = lista0.vazia();
        boolean boolean27 = lista0.vazia();
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        boolean boolean12 = lista7.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) lista24);
        lista13.insere((java.lang.Object) lista24);
        lista7.insere((java.lang.Object) lista13);
        boolean boolean32 = lista13.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.imprime();
        lista13.insere((java.lang.Object) lista33);
        lista0.insere((java.lang.Object) lista33);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass16 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean8 = lista3.vazia();
        boolean boolean9 = lista3.vazia();
        boolean boolean10 = lista3.vazia();
        boolean boolean11 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista7.insere((java.lang.Object) boolean9);
        boolean boolean11 = lista7.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        boolean boolean15 = lista12.vazia();
        boolean boolean16 = lista12.vazia();
        lista7.insere((java.lang.Object) lista12);
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) lista24);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        boolean boolean33 = lista30.vazia();
        lista24.insere((java.lang.Object) lista30);
        lista24.imprime();
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        boolean boolean38 = lista36.vazia();
        lista24.insere((java.lang.Object) boolean38);
        lista7.insere((java.lang.Object) lista24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista3.insere((java.lang.Object) lista7);
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.imprime();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        boolean boolean18 = lista15.vazia();
        lista10.insere((java.lang.Object) lista15);
        boolean boolean20 = lista15.vazia();
        lista15.imprime();
        lista3.insere((java.lang.Object) lista15);
        boolean boolean23 = lista15.vazia();
        lista15.imprime();
        lista15.imprime();
        lista15.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista0.insere((java.lang.Object) lista31);
        boolean boolean36 = lista31.vazia();
        lista31.imprime();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        boolean boolean41 = lista38.vazia();
        lista31.insere((java.lang.Object) lista38);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.imprime();
        lista43.imprime();
        boolean boolean48 = lista43.vazia();
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        lista49.imprime();
        lista49.imprime();
        boolean boolean54 = lista49.vazia();
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) (short) -1);
        boolean boolean58 = lista55.vazia();
        lista55.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) (short) -1);
        lista60.insere((java.lang.Object) false);
        lista55.insere((java.lang.Object) lista60);
        lista49.insere((java.lang.Object) lista60);
        lista43.insere((java.lang.Object) lista49);
        boolean boolean68 = lista49.vazia();
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) (short) -1);
        lista69.imprime();
        lista69.imprime();
        lista49.insere((java.lang.Object) lista69);
        lista49.imprime();
        lista31.insere((java.lang.Object) lista49);
        lista49.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        boolean boolean12 = lista7.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) lista24);
        lista13.insere((java.lang.Object) lista24);
        lista7.insere((java.lang.Object) lista13);
        boolean boolean32 = lista13.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.imprime();
        lista13.insere((java.lang.Object) lista33);
        lista0.insere((java.lang.Object) lista33);
        lista33.imprime();
        lista33.imprime();
        lista33.imprime();
        java.lang.Class<?> wildcardClass43 = lista33.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        boolean boolean8 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.imprime();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        boolean boolean18 = lista15.vazia();
        lista10.insere((java.lang.Object) lista15);
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.imprime();
        lista21.insere((java.lang.Object) "hi!");
        lista21.imprime();
        lista21.imprime();
        java.lang.Class<?> wildcardClass29 = lista21.getClass();
        lista20.insere((java.lang.Object) wildcardClass29);
        lista10.insere((java.lang.Object) wildcardClass29);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        boolean boolean38 = lista32.vazia();
        lista32.insere((java.lang.Object) 100L);
        boolean boolean41 = lista32.vazia();
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        lista32.insere((java.lang.Object) lista42);
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        boolean boolean47 = lista45.vazia();
        lista45.imprime();
        boolean boolean49 = lista45.vazia();
        lista45.insere((java.lang.Object) 'a');
        lista45.imprime();
        lista42.insere((java.lang.Object) lista45);
        lista10.insere((java.lang.Object) lista45);
        java.lang.Class<?> wildcardClass55 = lista45.getClass();
        lista0.insere((java.lang.Object) wildcardClass55);
        lista0.imprime();
        boolean boolean58 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista3.insere((java.lang.Object) lista7);
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        boolean boolean16 = lista11.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        boolean boolean23 = lista17.vazia();
        lista11.insere((java.lang.Object) lista17);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        boolean boolean28 = lista25.vazia();
        boolean boolean29 = lista25.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.imprime();
        lista30.imprime();
        lista30.insere((java.lang.Object) (byte) 0);
        lista30.imprime();
        lista30.insere((java.lang.Object) false);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.imprime();
        lista40.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass46 = lista40.getClass();
        lista30.insere((java.lang.Object) wildcardClass46);
        lista25.insere((java.lang.Object) wildcardClass46);
        lista17.insere((java.lang.Object) lista25);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        boolean boolean53 = lista50.vazia();
        boolean boolean54 = lista50.vazia();
        lista17.insere((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.insere((java.lang.Object) "hi!");
        lista7.imprime();
        lista7.imprime();
        java.lang.Class<?> wildcardClass15 = lista7.getClass();
        lista6.insere((java.lang.Object) wildcardClass15);
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista0.insere((java.lang.Object) lista31);
        boolean boolean36 = lista31.vazia();
        lista31.imprime();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        boolean boolean41 = lista38.vazia();
        lista31.insere((java.lang.Object) lista38);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.insere((java.lang.Object) 'a');
        boolean boolean47 = lista43.vazia();
        lista43.imprime();
        boolean boolean49 = lista43.vazia();
        lista38.insere((java.lang.Object) lista43);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        lista51.imprime();
        lista51.imprime();
        lista51.insere((java.lang.Object) "hi!");
        lista51.imprime();
        lista38.insere((java.lang.Object) lista51);
        java.lang.Class<?> wildcardClass60 = lista51.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.insere((java.lang.Object) "hi!");
        lista10.imprime();
        lista10.imprime();
        lista10.insere((java.lang.Object) 1L);
        lista10.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        boolean boolean24 = lista21.vazia();
        lista21.insere((java.lang.Object) 'a');
        boolean boolean27 = lista21.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        lista28.insere((java.lang.Object) false);
        lista28.imprime();
        boolean boolean34 = lista28.vazia();
        lista28.insere((java.lang.Object) 100L);
        boolean boolean37 = lista28.vazia();
        lista21.insere((java.lang.Object) lista28);
        boolean boolean39 = lista21.vazia();
        boolean boolean40 = lista21.vazia();
        lista10.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.imprime();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        lista46.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass51 = lista46.getClass();
        lista43.insere((java.lang.Object) wildcardClass51);
        boolean boolean53 = lista43.vazia();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        lista54.imprime();
        lista54.insere((java.lang.Object) "hi!");
        lista54.imprime();
        lista54.imprime();
        lista54.insere((java.lang.Object) 1L);
        lista43.insere((java.lang.Object) 1L);
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        lista65.imprime();
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) (short) -1);
        lista68.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass73 = lista68.getClass();
        lista65.insere((java.lang.Object) wildcardClass73);
        boolean boolean75 = lista65.vazia();
        lista65.imprime();
        lista43.insere((java.lang.Object) lista65);
        lista65.imprime();
        lista65.insere((java.lang.Object) (short) 0);
        boolean boolean81 = lista65.vazia();
        lista10.insere((java.lang.Object) boolean81);
        lista10.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        lista12.imprime();
        lista12.insere((java.lang.Object) "hi!");
        lista12.imprime();
        lista12.imprime();
        lista12.insere((java.lang.Object) 1L);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) (byte) 0);
        lista22.imprime();
        lista22.insere((java.lang.Object) false);
        lista12.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        boolean boolean34 = lista0.vazia();
        boolean boolean35 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista10.imprime();
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.imprime();
        lista17.imprime();
        boolean boolean22 = lista17.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.imprime();
        lista23.imprime();
        boolean boolean28 = lista23.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        lista34.insere((java.lang.Object) false);
        lista29.insere((java.lang.Object) lista34);
        lista23.insere((java.lang.Object) lista34);
        lista17.insere((java.lang.Object) lista23);
        boolean boolean42 = lista23.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.imprime();
        lista43.imprime();
        lista23.insere((java.lang.Object) lista43);
        lista10.insere((java.lang.Object) lista43);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.imprime();
        lista50.imprime();
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) (short) -1);
        boolean boolean58 = lista55.vazia();
        lista55.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) (short) -1);
        lista60.insere((java.lang.Object) false);
        lista55.insere((java.lang.Object) lista60);
        lista50.insere((java.lang.Object) lista60);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        boolean boolean70 = lista67.vazia();
        lista67.imprime();
        ds.Lista lista72 = new ds.Lista();
        lista72.insere((java.lang.Object) (short) -1);
        lista72.insere((java.lang.Object) false);
        lista67.insere((java.lang.Object) lista72);
        java.lang.Class<?> wildcardClass78 = lista67.getClass();
        lista60.insere((java.lang.Object) wildcardClass78);
        lista10.insere((java.lang.Object) lista60);
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        java.lang.Object obj83 = null;
        lista10.insere(obj83);
        // The following exception was thrown during execution in test generation
        try {
            lista10.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 10);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) (byte) 0);
        lista9.imprime();
        boolean boolean17 = lista9.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) "hi!");
        boolean boolean25 = lista18.vazia();
        java.lang.Class<?> wildcardClass26 = lista18.getClass();
        lista9.insere((java.lang.Object) lista18);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista28.vazia();
        lista28.insere((java.lang.Object) 'a');
        boolean boolean34 = lista28.vazia();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        lista35.insere((java.lang.Object) false);
        lista35.imprime();
        boolean boolean41 = lista35.vazia();
        lista35.insere((java.lang.Object) 100L);
        boolean boolean44 = lista35.vazia();
        lista28.insere((java.lang.Object) lista35);
        lista28.imprime();
        lista9.insere((java.lang.Object) lista28);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        boolean boolean51 = lista48.vazia();
        lista48.insere((java.lang.Object) 'a');
        lista48.insere((java.lang.Object) 0);
        boolean boolean56 = lista48.vazia();
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) (short) -1);
        boolean boolean60 = lista57.vazia();
        lista57.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) (short) -1);
        lista62.insere((java.lang.Object) false);
        lista57.insere((java.lang.Object) lista62);
        lista62.imprime();
        boolean boolean69 = lista62.vazia();
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        lista62.insere(obj70);
        ds.Lista lista73 = new ds.Lista();
        lista73.insere((java.lang.Object) (short) -1);
        lista73.imprime();
        lista73.imprime();
        lista73.insere((java.lang.Object) (byte) 0);
        lista73.imprime();
        lista73.insere((java.lang.Object) false);
        boolean boolean83 = lista73.vazia();
        lista62.insere((java.lang.Object) lista73);
        lista48.insere((java.lang.Object) lista62);
        lista9.insere((java.lang.Object) lista62);
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista8.vazia();
        lista8.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.insere((java.lang.Object) false);
        lista8.insere((java.lang.Object) lista13);
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        boolean boolean22 = lista19.vazia();
        java.lang.Class<?> wildcardClass23 = lista19.getClass();
        lista13.insere((java.lang.Object) wildcardClass23);
        boolean boolean25 = lista13.vazia();
        lista0.insere((java.lang.Object) boolean25);
        boolean boolean27 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.insere((java.lang.Object) 'a');
        boolean boolean23 = lista17.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista24.imprime();
        boolean boolean30 = lista24.vazia();
        lista24.insere((java.lang.Object) 100L);
        boolean boolean33 = lista24.vazia();
        lista17.insere((java.lang.Object) lista24);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        boolean boolean38 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista17.insere((java.lang.Object) lista40);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        lista48.imprime();
        lista17.insere((java.lang.Object) lista48);
        boolean boolean53 = lista48.vazia();
        lista48.imprime();
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        boolean boolean58 = lista55.vazia();
        lista48.insere((java.lang.Object) lista55);
        lista10.insere((java.lang.Object) lista55);
        java.lang.Class<?> wildcardClass61 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.imprime();
        lista6.imprime();
        boolean boolean11 = lista6.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        boolean boolean15 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista12.insere((java.lang.Object) lista17);
        lista6.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        lista28.imprime();
        lista25.insere((java.lang.Object) lista28);
        java.lang.Class<?> wildcardClass32 = lista25.getClass();
        lista6.insere((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        lista7.insere((java.lang.Object) "hi!");
        boolean boolean14 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        lista7.imprime();
        lista7.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        boolean boolean11 = lista6.vazia();
        lista6.imprime();
        boolean boolean13 = lista6.vazia();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        boolean boolean16 = lista11.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        boolean boolean23 = lista17.vazia();
        lista11.insere((java.lang.Object) lista17);
        boolean boolean25 = lista17.vazia();
        lista17.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) lista11);
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        boolean boolean19 = lista11.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        boolean boolean23 = lista20.vazia();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) lista25);
        lista20.imprime();
        lista11.insere((java.lang.Object) lista20);
        boolean boolean33 = lista20.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.insere((java.lang.Object) "hi!");
        lista11.imprime();
        lista11.imprime();
        lista11.insere((java.lang.Object) 1L);
        lista0.insere((java.lang.Object) 1L);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) (byte) 0);
        lista22.imprime();
        lista22.insere((java.lang.Object) false);
        boolean boolean32 = lista22.vazia();
        java.lang.Class<?> wildcardClass33 = lista22.getClass();
        lista0.insere((java.lang.Object) wildcardClass33);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        lista35.insere((java.lang.Object) false);
        lista35.imprime();
        boolean boolean41 = lista35.vazia();
        lista35.insere((java.lang.Object) 100L);
        lista0.insere((java.lang.Object) lista35);
        lista0.imprime();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        boolean boolean49 = lista46.vazia();
        lista46.insere((java.lang.Object) 'a');
        boolean boolean52 = lista46.vazia();
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) (short) -1);
        lista53.insere((java.lang.Object) false);
        lista53.imprime();
        boolean boolean59 = lista53.vazia();
        lista53.insere((java.lang.Object) 100L);
        boolean boolean62 = lista53.vazia();
        lista46.insere((java.lang.Object) lista53);
        ds.Lista lista64 = new ds.Lista();
        lista64.insere((java.lang.Object) (short) -1);
        boolean boolean67 = lista64.vazia();
        lista64.imprime();
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) (short) -1);
        lista69.insere((java.lang.Object) false);
        lista64.insere((java.lang.Object) lista69);
        lista69.imprime();
        lista46.insere((java.lang.Object) lista69);
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) (short) -1);
        lista77.imprime();
        lista46.insere((java.lang.Object) lista77);
        boolean boolean82 = lista77.vazia();
        lista77.imprime();
        boolean boolean84 = lista77.vazia();
        lista0.insere((java.lang.Object) lista77);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        boolean boolean17 = lista13.vazia();
        lista13.insere((java.lang.Object) 'a');
        lista13.imprime();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean22 = lista13.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        boolean boolean26 = lista23.vazia();
        lista23.insere((java.lang.Object) 'a');
        boolean boolean29 = lista23.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.insere((java.lang.Object) false);
        lista30.imprime();
        boolean boolean36 = lista30.vazia();
        lista30.insere((java.lang.Object) 100L);
        boolean boolean39 = lista30.vazia();
        lista23.insere((java.lang.Object) lista30);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        boolean boolean44 = lista41.vazia();
        lista41.imprime();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        lista46.insere((java.lang.Object) false);
        lista41.insere((java.lang.Object) lista46);
        lista46.imprime();
        lista23.insere((java.lang.Object) lista46);
        lista13.insere((java.lang.Object) lista23);
        lista23.imprime();
        java.lang.Class<?> wildcardClass56 = lista23.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        boolean boolean8 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.insere((java.lang.Object) "hi!");
        lista11.imprime();
        lista11.imprime();
        java.lang.Class<?> wildcardClass19 = lista11.getClass();
        lista10.insere((java.lang.Object) wildcardClass19);
        lista0.insere((java.lang.Object) wildcardClass19);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista22.imprime();
        boolean boolean28 = lista22.vazia();
        lista22.insere((java.lang.Object) 100L);
        boolean boolean31 = lista22.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista22.insere((java.lang.Object) lista32);
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        lista35.imprime();
        boolean boolean39 = lista35.vazia();
        lista35.insere((java.lang.Object) 'a');
        lista35.imprime();
        lista32.insere((java.lang.Object) lista35);
        lista0.insere((java.lang.Object) lista35);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        lista45.insere((java.lang.Object) false);
        lista45.imprime();
        lista45.imprime();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) (short) -1);
        lista52.imprime();
        lista52.imprime();
        boolean boolean57 = lista52.vazia();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) (short) -1);
        lista58.imprime();
        lista58.imprime();
        boolean boolean63 = lista58.vazia();
        ds.Lista lista64 = new ds.Lista();
        lista64.insere((java.lang.Object) (short) -1);
        boolean boolean67 = lista64.vazia();
        lista64.imprime();
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) (short) -1);
        lista69.insere((java.lang.Object) false);
        lista64.insere((java.lang.Object) lista69);
        lista58.insere((java.lang.Object) lista69);
        lista52.insere((java.lang.Object) lista58);
        boolean boolean77 = lista58.vazia();
        ds.Lista lista78 = new ds.Lista();
        lista78.insere((java.lang.Object) (short) -1);
        lista78.imprime();
        lista78.imprime();
        lista58.insere((java.lang.Object) lista78);
        lista45.insere((java.lang.Object) lista78);
        java.lang.Class<?> wildcardClass85 = lista78.getClass();
        lista35.insere((java.lang.Object) lista78);
        lista78.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) (byte) 0);
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        boolean boolean14 = lista0.vazia();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        boolean boolean18 = lista15.vazia();
        lista15.insere((java.lang.Object) (-1.0d));
        lista15.imprime();
        lista0.insere((java.lang.Object) lista15);
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        lista9.imprime();
        lista9.imprime();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        lista5.insere((java.lang.Object) wildcardClass17);
        lista0.insere((java.lang.Object) wildcardClass17);
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        lista7.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.imprime();
        lista6.imprime();
        boolean boolean11 = lista6.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        boolean boolean15 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista12.insere((java.lang.Object) lista17);
        lista6.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean25 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.insere((java.lang.Object) "hi!");
        lista27.imprime();
        lista27.imprime();
        lista27.insere((java.lang.Object) 1L);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.imprime();
        lista37.imprime();
        lista37.insere((java.lang.Object) (byte) 0);
        lista37.imprime();
        lista37.insere((java.lang.Object) false);
        lista27.insere((java.lang.Object) lista37);
        boolean boolean48 = lista37.vazia();
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        lista49.imprime();
        lista49.imprime();
        lista49.imprime();
        lista37.insere((java.lang.Object) lista49);
        boolean boolean56 = lista37.vazia();
        lista6.insere((java.lang.Object) lista37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        boolean boolean10 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.imprime();
        lista6.imprime();
        boolean boolean11 = lista6.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        boolean boolean15 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista12.insere((java.lang.Object) lista17);
        lista6.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista6);
        lista6.imprime();
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) (short) -1);
        lista2.imprime();
        lista2.imprime();
        lista2.insere((java.lang.Object) (byte) 0);
        lista2.imprime();
        lista2.insere((java.lang.Object) false);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        lista12.imprime();
        lista12.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass18 = lista12.getClass();
        lista2.insere((java.lang.Object) wildcardClass18);
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.insere((java.lang.Object) false);
        lista21.imprime();
        lista21.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        lista28.imprime();
        lista28.imprime();
        boolean boolean33 = lista28.vazia();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        lista34.imprime();
        lista34.imprime();
        boolean boolean39 = lista34.vazia();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        boolean boolean43 = lista40.vazia();
        lista40.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        lista45.insere((java.lang.Object) false);
        lista40.insere((java.lang.Object) lista45);
        lista34.insere((java.lang.Object) lista45);
        lista28.insere((java.lang.Object) lista34);
        boolean boolean53 = lista34.vazia();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        lista54.imprime();
        lista54.imprime();
        lista34.insere((java.lang.Object) lista54);
        lista21.insere((java.lang.Object) lista54);
        lista54.imprime();
        lista54.imprime();
        lista2.insere((java.lang.Object) lista54);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        boolean boolean16 = lista11.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.imprime();
        lista17.insere((java.lang.Object) "hi!");
        boolean boolean23 = lista17.vazia();
        lista17.insere((java.lang.Object) (short) 10);
        boolean boolean26 = lista17.vazia();
        lista11.insere((java.lang.Object) lista17);
        boolean boolean28 = lista17.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        lista12.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass17 = lista12.getClass();
        lista9.insere((java.lang.Object) wildcardClass17);
        lista0.insere((java.lang.Object) wildcardClass17);
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) (byte) 100);
        boolean boolean29 = lista22.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.insere((java.lang.Object) false);
        lista30.imprime();
        boolean boolean36 = lista30.vazia();
        lista30.insere((java.lang.Object) 100L);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) (short) -1);
        lista39.imprime();
        lista39.imprime();
        lista39.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass46 = lista39.getClass();
        lista30.insere((java.lang.Object) wildcardClass46);
        lista22.insere((java.lang.Object) wildcardClass46);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        lista49.imprime();
        lista49.imprime();
        boolean boolean54 = lista49.vazia();
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) (short) -1);
        boolean boolean58 = lista55.vazia();
        lista55.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) (short) -1);
        lista60.insere((java.lang.Object) false);
        lista55.insere((java.lang.Object) lista60);
        lista49.insere((java.lang.Object) lista60);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        boolean boolean70 = lista67.vazia();
        lista67.insere((java.lang.Object) (-1.0d));
        lista67.imprime();
        lista49.insere((java.lang.Object) lista67);
        lista22.insere((java.lang.Object) lista49);
        lista0.insere((java.lang.Object) lista49);
        lista0.imprime();
        boolean boolean78 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean16 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.imprime();
        lista18.insere((java.lang.Object) lista21);
        lista5.insere((java.lang.Object) lista18);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        boolean boolean35 = lista32.vazia();
        lista32.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.insere((java.lang.Object) false);
        lista32.insere((java.lang.Object) lista37);
        lista27.insere((java.lang.Object) lista37);
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) (short) -1);
        boolean boolean47 = lista44.vazia();
        lista44.imprime();
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        lista49.insere((java.lang.Object) false);
        lista44.insere((java.lang.Object) lista49);
        java.lang.Class<?> wildcardClass55 = lista44.getClass();
        lista37.insere((java.lang.Object) wildcardClass55);
        java.lang.Object obj57 = new java.lang.Object();
        lista37.insere(obj57);
        ds.Lista lista59 = new ds.Lista();
        lista59.insere((java.lang.Object) (short) -1);
        lista59.insere((java.lang.Object) false);
        lista59.imprime();
        lista37.insere((java.lang.Object) lista59);
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        lista66.imprime();
        ds.Lista lista69 = new ds.Lista();
        boolean boolean70 = lista69.vazia();
        lista69.imprime();
        lista66.insere((java.lang.Object) lista69);
        boolean boolean73 = lista66.vazia();
        lista59.insere((java.lang.Object) lista66);
        lista18.insere((java.lang.Object) lista66);
        boolean boolean76 = lista18.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.imprime();
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        boolean boolean17 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean17);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass24 = lista19.getClass();
        lista16.insere((java.lang.Object) wildcardClass24);
        lista11.insere((java.lang.Object) lista16);
        boolean boolean27 = lista16.vazia();
        lista16.imprime();
        lista0.insere((java.lang.Object) lista16);
        lista0.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        boolean boolean34 = lista31.vazia();
        lista31.insere((java.lang.Object) 'a');
        boolean boolean37 = lista31.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.insere((java.lang.Object) false);
        lista38.imprime();
        boolean boolean44 = lista38.vazia();
        lista38.insere((java.lang.Object) 100L);
        boolean boolean47 = lista38.vazia();
        lista31.insere((java.lang.Object) lista38);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        boolean boolean52 = lista49.vazia();
        lista49.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        lista54.insere((java.lang.Object) false);
        lista49.insere((java.lang.Object) lista54);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) (short) -1);
        boolean boolean63 = lista60.vazia();
        lista54.insere((java.lang.Object) lista60);
        lista31.insere((java.lang.Object) lista54);
        lista0.insere((java.lang.Object) lista54);
        lista54.imprime();
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) (short) -1);
        boolean boolean71 = lista68.vazia();
        lista68.imprime();
        boolean boolean73 = lista68.vazia();
        ds.Lista lista74 = new ds.Lista();
        boolean boolean75 = lista74.vazia();
        lista74.imprime();
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) (short) -1);
        lista77.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass82 = lista77.getClass();
        lista74.insere((java.lang.Object) wildcardClass82);
        java.lang.Class<?> wildcardClass84 = lista74.getClass();
        lista68.insere((java.lang.Object) wildcardClass84);
        boolean boolean86 = lista68.vazia();
        lista54.insere((java.lang.Object) lista68);
        boolean boolean88 = lista54.vazia();
        lista54.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean16 = lista5.vazia();
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        lista0.imprime();
        boolean boolean32 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista3.insere((java.lang.Object) lista7);
        lista3.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.insere((java.lang.Object) false);
        lista11.insere((java.lang.Object) lista16);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista22.vazia();
        lista16.insere((java.lang.Object) lista22);
        boolean boolean27 = lista22.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista28.vazia();
        lista28.imprime();
        lista28.imprime();
        boolean boolean34 = lista28.vazia();
        lista22.insere((java.lang.Object) lista28);
        lista3.insere((java.lang.Object) lista28);
        boolean boolean37 = lista3.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.imprime();
        lista38.imprime();
        lista38.insere((java.lang.Object) (byte) 0);
        lista38.imprime();
        lista38.insere((java.lang.Object) false);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        lista48.imprime();
        lista48.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass54 = lista48.getClass();
        lista38.insere((java.lang.Object) wildcardClass54);
        lista38.imprime();
        boolean boolean57 = lista38.vazia();
        lista3.insere((java.lang.Object) lista38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) lista11);
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        boolean boolean19 = lista11.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        boolean boolean23 = lista20.vazia();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) lista25);
        lista20.imprime();
        lista11.insere((java.lang.Object) lista20);
        boolean boolean33 = lista11.vazia();
        boolean boolean34 = lista11.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        lista4.insere((java.lang.Object) lista7);
        lista0.insere((java.lang.Object) lista4);
        boolean boolean12 = lista4.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        boolean boolean16 = lista13.vazia();
        lista13.insere((java.lang.Object) 'a');
        lista13.insere((java.lang.Object) 0);
        boolean boolean21 = lista13.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) lista27);
        lista27.imprime();
        boolean boolean34 = lista27.vazia();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        lista27.insere(obj35);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.imprime();
        lista38.imprime();
        lista38.insere((java.lang.Object) (byte) 0);
        lista38.imprime();
        lista38.insere((java.lang.Object) false);
        boolean boolean48 = lista38.vazia();
        lista27.insere((java.lang.Object) lista38);
        lista13.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista4.insere((java.lang.Object) lista27);
        lista4.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.imprime();
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass23 = lista16.getClass();
        lista7.insere((java.lang.Object) wildcardClass23);
        lista0.insere((java.lang.Object) lista7);
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        lista11.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista17.imprime();
        boolean boolean23 = lista17.vazia();
        lista17.insere((java.lang.Object) 100L);
        boolean boolean26 = lista17.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        boolean boolean31 = lista27.vazia();
        lista17.insere((java.lang.Object) lista27);
        lista27.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        lista34.imprime();
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) 0);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.imprime();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        lista46.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass51 = lista46.getClass();
        lista43.insere((java.lang.Object) wildcardClass51);
        lista34.insere((java.lang.Object) wildcardClass51);
        lista27.insere((java.lang.Object) wildcardClass51);
        lista11.insere((java.lang.Object) wildcardClass51);
        lista11.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.insere((java.lang.Object) (short) -1);
        boolean boolean4 = lista1.vazia();
        lista1.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.insere((java.lang.Object) false);
        lista1.insere((java.lang.Object) lista6);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean13 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.imprime();
        boolean boolean18 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.imprime();
        boolean boolean23 = lista20.vazia();
        lista15.insere((java.lang.Object) lista20);
        boolean boolean25 = lista20.vazia();
        lista20.imprime();
        lista20.imprime();
        lista6.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass29 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 1L);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.imprime();
        lista10.insere((java.lang.Object) (byte) 0);
        lista10.imprime();
        lista10.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista10);
        boolean boolean21 = lista10.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.imprime();
        lista22.imprime();
        lista22.imprime();
        lista10.insere((java.lang.Object) lista22);
        boolean boolean29 = lista22.vazia();
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        boolean boolean32 = lista30.vazia();
        lista30.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.imprime();
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        lista37.imprime();
        lista34.insere((java.lang.Object) lista37);
        lista30.insere((java.lang.Object) lista34);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) (short) -1);
        boolean boolean45 = lista42.vazia();
        lista42.imprime();
        ds.Lista lista47 = new ds.Lista();
        boolean boolean48 = lista47.vazia();
        lista47.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass55 = lista50.getClass();
        lista47.insere((java.lang.Object) wildcardClass55);
        lista42.insere((java.lang.Object) lista47);
        java.lang.Class<?> wildcardClass58 = lista47.getClass();
        lista30.insere((java.lang.Object) lista47);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) (short) -1);
        boolean boolean63 = lista60.vazia();
        boolean boolean64 = lista60.vazia();
        lista47.insere((java.lang.Object) lista60);
        lista22.insere((java.lang.Object) lista47);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        boolean boolean8 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        boolean boolean10 = lista5.vazia();
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        java.lang.Class<?> wildcardClass14 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        boolean boolean14 = lista5.vazia();
        lista5.imprime();
        lista5.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.insere((java.lang.Object) 'a');
        boolean boolean23 = lista17.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista24.imprime();
        boolean boolean30 = lista24.vazia();
        lista24.insere((java.lang.Object) 100L);
        boolean boolean33 = lista24.vazia();
        lista17.insere((java.lang.Object) lista24);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        boolean boolean38 = lista35.vazia();
        lista35.insere((java.lang.Object) 'a');
        boolean boolean41 = lista35.vazia();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) (short) -1);
        lista42.insere((java.lang.Object) false);
        lista42.imprime();
        boolean boolean48 = lista42.vazia();
        lista42.insere((java.lang.Object) 100L);
        boolean boolean51 = lista42.vazia();
        lista35.insere((java.lang.Object) lista42);
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) (short) -1);
        boolean boolean56 = lista53.vazia();
        lista53.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) (short) -1);
        lista58.insere((java.lang.Object) false);
        lista53.insere((java.lang.Object) lista58);
        lista58.imprime();
        lista35.insere((java.lang.Object) lista58);
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) (short) -1);
        lista66.imprime();
        lista35.insere((java.lang.Object) lista66);
        boolean boolean71 = lista66.vazia();
        lista66.imprime();
        ds.Lista lista73 = new ds.Lista();
        boolean boolean74 = lista73.vazia();
        boolean boolean75 = lista73.vazia();
        boolean boolean76 = lista73.vazia();
        lista66.insere((java.lang.Object) lista73);
        ds.Lista lista78 = new ds.Lista();
        boolean boolean79 = lista78.vazia();
        lista78.insere((java.lang.Object) 'a');
        boolean boolean82 = lista78.vazia();
        lista78.imprime();
        boolean boolean84 = lista78.vazia();
        lista73.insere((java.lang.Object) lista78);
        ds.Lista lista86 = new ds.Lista();
        lista86.insere((java.lang.Object) (short) -1);
        lista86.imprime();
        lista86.imprime();
        lista86.insere((java.lang.Object) "hi!");
        lista86.imprime();
        lista73.insere((java.lang.Object) lista86);
        lista24.insere((java.lang.Object) lista86);
        lista5.insere((java.lang.Object) lista24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.insere((java.lang.Object) false);
        lista6.imprime();
        boolean boolean12 = lista6.vazia();
        lista6.insere((java.lang.Object) 100L);
        boolean boolean15 = lista6.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista6.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista16);
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        boolean boolean22 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean8 = lista3.vazia();
        boolean boolean9 = lista3.vazia();
        boolean boolean10 = lista3.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista11.insere((java.lang.Object) 'a');
        boolean boolean17 = lista11.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        lista18.insere((java.lang.Object) false);
        lista18.imprime();
        boolean boolean24 = lista18.vazia();
        lista18.insere((java.lang.Object) 100L);
        boolean boolean27 = lista18.vazia();
        lista11.insere((java.lang.Object) lista18);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        lista34.insere((java.lang.Object) false);
        lista29.insere((java.lang.Object) lista34);
        lista34.imprime();
        lista11.insere((java.lang.Object) lista34);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) (short) -1);
        lista42.imprime();
        lista11.insere((java.lang.Object) lista42);
        boolean boolean47 = lista42.vazia();
        lista42.imprime();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        boolean boolean52 = lista49.vazia();
        lista42.insere((java.lang.Object) lista49);
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        lista54.insere((java.lang.Object) 'a');
        boolean boolean58 = lista54.vazia();
        lista54.imprime();
        boolean boolean60 = lista54.vazia();
        lista49.insere((java.lang.Object) lista54);
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) (short) -1);
        lista62.imprime();
        lista62.imprime();
        lista62.insere((java.lang.Object) "hi!");
        lista62.imprime();
        lista49.insere((java.lang.Object) lista62);
        lista3.insere((java.lang.Object) lista49);
        boolean boolean72 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        lista6.imprime();
        boolean boolean12 = lista6.vazia();
        ds.Lista lista13 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista13.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista13.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        boolean boolean22 = lista18.vazia();
        lista13.insere((java.lang.Object) lista18);
        lista6.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        boolean boolean26 = lista13.vazia();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.imprime();
        lista27.insere((java.lang.Object) (byte) -1);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.imprime();
        boolean boolean36 = lista32.vazia();
        lista32.imprime();
        lista27.insere((java.lang.Object) lista32);
        lista13.insere((java.lang.Object) lista27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        boolean boolean7 = lista4.vazia();
        lista4.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        lista4.insere((java.lang.Object) lista9);
        lista0.insere((java.lang.Object) lista9);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        boolean boolean12 = lista9.vazia();
        lista9.insere((java.lang.Object) 'a');
        boolean boolean15 = lista9.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.insere((java.lang.Object) false);
        lista16.imprime();
        boolean boolean22 = lista16.vazia();
        lista16.insere((java.lang.Object) 100L);
        boolean boolean25 = lista16.vazia();
        lista9.insere((java.lang.Object) lista16);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        boolean boolean30 = lista27.vazia();
        lista27.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista27.insere((java.lang.Object) lista32);
        lista32.imprime();
        lista9.insere((java.lang.Object) lista32);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.imprime();
        lista9.insere((java.lang.Object) lista40);
        boolean boolean45 = lista40.vazia();
        lista0.insere((java.lang.Object) boolean45);
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.imprime();
        lista6.imprime();
        boolean boolean11 = lista6.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        boolean boolean15 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista12.insere((java.lang.Object) lista17);
        lista6.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean25 = lista6.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.imprime();
        lista26.imprime();
        lista6.insere((java.lang.Object) lista26);
        lista26.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        boolean boolean19 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.imprime();
        boolean boolean24 = lista21.vazia();
        lista16.insere((java.lang.Object) lista21);
        boolean boolean26 = lista21.vazia();
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        boolean boolean29 = lista10.vazia();
        boolean boolean30 = lista10.vazia();
        lista10.imprime();
        java.lang.Class<?> wildcardClass32 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        boolean boolean12 = lista7.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) lista24);
        lista13.insere((java.lang.Object) lista24);
        lista7.insere((java.lang.Object) lista13);
        boolean boolean32 = lista13.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.imprime();
        lista13.insere((java.lang.Object) lista33);
        lista0.insere((java.lang.Object) lista33);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.imprime();
        lista40.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        boolean boolean48 = lista45.vazia();
        lista45.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.insere((java.lang.Object) false);
        lista45.insere((java.lang.Object) lista50);
        lista40.insere((java.lang.Object) lista50);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) (short) -1);
        boolean boolean60 = lista57.vazia();
        lista57.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) (short) -1);
        lista62.insere((java.lang.Object) false);
        lista57.insere((java.lang.Object) lista62);
        java.lang.Class<?> wildcardClass68 = lista57.getClass();
        lista50.insere((java.lang.Object) wildcardClass68);
        lista0.insere((java.lang.Object) lista50);
        lista50.imprime();
        ds.Lista lista72 = new ds.Lista();
        lista72.insere((java.lang.Object) (short) -1);
        lista72.imprime();
        boolean boolean76 = lista72.vazia();
        lista72.imprime();
        boolean boolean78 = lista72.vazia();
        lista72.imprime();
        boolean boolean80 = lista72.vazia();
        lista50.insere((java.lang.Object) boolean80);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        lista0.insere((java.lang.Object) boolean2);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 'a');
        lista5.insere((java.lang.Object) 0);
        boolean boolean13 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Class<?> wildcardClass15 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.imprime();
        lista17.imprime();
        lista17.insere((java.lang.Object) (byte) 0);
        lista17.imprime();
        boolean boolean25 = lista17.vazia();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        lista29.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass34 = lista29.getClass();
        lista26.insere((java.lang.Object) wildcardClass34);
        lista17.insere((java.lang.Object) wildcardClass34);
        lista10.insere((java.lang.Object) wildcardClass34);
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        lista38.imprime();
        boolean boolean42 = lista38.vazia();
        lista38.insere((java.lang.Object) 'a');
        lista38.imprime();
        lista38.imprime();
        lista10.insere((java.lang.Object) lista38);
        boolean boolean48 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        boolean boolean8 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.insere((java.lang.Object) "hi!");
        lista11.imprime();
        lista11.imprime();
        java.lang.Class<?> wildcardClass19 = lista11.getClass();
        lista10.insere((java.lang.Object) wildcardClass19);
        lista0.insere((java.lang.Object) wildcardClass19);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista22.imprime();
        boolean boolean28 = lista22.vazia();
        lista22.insere((java.lang.Object) 100L);
        boolean boolean31 = lista22.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista22.insere((java.lang.Object) lista32);
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        boolean boolean37 = lista35.vazia();
        lista35.imprime();
        boolean boolean39 = lista35.vazia();
        lista35.insere((java.lang.Object) 'a');
        lista35.imprime();
        lista32.insere((java.lang.Object) lista35);
        lista0.insere((java.lang.Object) lista35);
        lista35.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        lista5.imprime();
        lista5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.insere((java.lang.Object) "hi!");
        lista11.imprime();
        lista11.imprime();
        lista11.insere((java.lang.Object) 1L);
        lista0.insere((java.lang.Object) 1L);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) (byte) 0);
        lista22.imprime();
        lista22.insere((java.lang.Object) false);
        boolean boolean32 = lista22.vazia();
        java.lang.Class<?> wildcardClass33 = lista22.getClass();
        lista0.insere((java.lang.Object) wildcardClass33);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        lista13.insere((java.lang.Object) (byte) 0);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        lista20.imprime();
        lista20.imprime();
        lista20.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass27 = lista20.getClass();
        lista13.insere((java.lang.Object) lista20);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        lista29.imprime();
        lista29.imprime();
        boolean boolean34 = lista29.vazia();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        boolean boolean38 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) lista40);
        lista29.insere((java.lang.Object) lista40);
        lista13.insere((java.lang.Object) lista40);
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        lista48.imprime();
        lista48.imprime();
        lista48.imprime();
        lista13.insere((java.lang.Object) lista48);
        java.lang.Class<?> wildcardClass54 = lista13.getClass();
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista56 = new ds.Lista();
        boolean boolean57 = lista56.vazia();
        lista0.insere((java.lang.Object) boolean57);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista6.insere((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        boolean boolean18 = lista0.vazia();
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.imprime();
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) 0);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        lista28.imprime();
        lista28.imprime();
        lista28.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass35 = lista28.getClass();
        lista21.insere((java.lang.Object) lista28);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.imprime();
        lista37.imprime();
        boolean boolean42 = lista37.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        boolean boolean46 = lista43.vazia();
        lista43.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        lista48.insere((java.lang.Object) false);
        lista43.insere((java.lang.Object) lista48);
        lista37.insere((java.lang.Object) lista48);
        lista21.insere((java.lang.Object) lista48);
        lista0.insere((java.lang.Object) lista21);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        lista4.insere((java.lang.Object) lista7);
        lista0.insere((java.lang.Object) lista4);
        boolean boolean12 = lista4.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista13.insere((java.lang.Object) lista23);
        lista13.imprime();
        lista13.imprime();
        lista4.insere((java.lang.Object) lista13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        boolean boolean19 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.insere((java.lang.Object) false);
        lista16.insere((java.lang.Object) lista21);
        lista11.insere((java.lang.Object) lista21);
        boolean boolean28 = lista21.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean32 = lista29.vazia();
        lista29.insere((java.lang.Object) 'a');
        boolean boolean35 = lista29.vazia();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        lista36.insere((java.lang.Object) false);
        lista36.imprime();
        boolean boolean42 = lista36.vazia();
        lista36.insere((java.lang.Object) 100L);
        boolean boolean45 = lista36.vazia();
        lista29.insere((java.lang.Object) lista36);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) (short) -1);
        boolean boolean50 = lista47.vazia();
        lista47.imprime();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) (short) -1);
        lista52.insere((java.lang.Object) false);
        lista47.insere((java.lang.Object) lista52);
        lista52.imprime();
        lista29.insere((java.lang.Object) lista52);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) (short) -1);
        lista60.imprime();
        lista60.imprime();
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) (short) -1);
        boolean boolean68 = lista65.vazia();
        lista65.imprime();
        ds.Lista lista70 = new ds.Lista();
        lista70.insere((java.lang.Object) (short) -1);
        lista70.insere((java.lang.Object) false);
        lista65.insere((java.lang.Object) lista70);
        lista60.insere((java.lang.Object) lista70);
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) (short) -1);
        boolean boolean80 = lista77.vazia();
        lista77.imprime();
        ds.Lista lista82 = new ds.Lista();
        lista82.insere((java.lang.Object) (short) -1);
        lista82.insere((java.lang.Object) false);
        lista77.insere((java.lang.Object) lista82);
        java.lang.Class<?> wildcardClass88 = lista77.getClass();
        lista70.insere((java.lang.Object) wildcardClass88);
        lista29.insere((java.lang.Object) lista70);
        lista21.insere((java.lang.Object) lista70);
        lista21.imprime();
        lista0.insere((java.lang.Object) lista21);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista6.insere((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        boolean boolean18 = lista0.vazia();
        boolean boolean19 = lista0.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        lista20.imprime();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        boolean boolean28 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.insere((java.lang.Object) false);
        lista25.insere((java.lang.Object) lista30);
        lista20.insere((java.lang.Object) lista30);
        lista0.insere((java.lang.Object) lista20);
        lista20.imprime();
        java.lang.Class<?> wildcardClass39 = lista20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        lista0.insere((java.lang.Object) boolean2);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.insere((java.lang.Object) 'a');
        lista5.insere((java.lang.Object) 0);
        boolean boolean13 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        java.lang.Class<?> wildcardClass16 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        boolean boolean17 = lista5.vazia();
        boolean boolean18 = lista5.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.imprime();
        lista24.imprime();
        lista24.insere((java.lang.Object) (byte) 0);
        lista24.imprime();
        lista19.insere((java.lang.Object) lista24);
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.insere((java.lang.Object) "hi!");
        lista33.imprime();
        lista33.imprime();
        lista33.insere((java.lang.Object) 1L);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.imprime();
        lista43.imprime();
        lista43.insere((java.lang.Object) (byte) 0);
        lista43.imprime();
        lista43.insere((java.lang.Object) false);
        lista33.insere((java.lang.Object) lista43);
        boolean boolean54 = lista43.vazia();
        lista19.insere((java.lang.Object) lista43);
        ds.Lista lista56 = new ds.Lista();
        boolean boolean57 = lista56.vazia();
        boolean boolean58 = lista56.vazia();
        lista56.imprime();
        boolean boolean60 = lista56.vazia();
        boolean boolean61 = lista56.vazia();
        java.lang.Class<?> wildcardClass62 = lista56.getClass();
        lista43.insere((java.lang.Object) lista56);
        lista5.insere((java.lang.Object) lista43);
        boolean boolean65 = lista5.vazia();
        boolean boolean66 = lista5.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        boolean boolean2 = lista1.vazia();
        lista0.insere((java.lang.Object) boolean2);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        boolean boolean9 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.imprime();
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) 0);
        lista16.imprime();
        lista11.insere((java.lang.Object) lista16);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        lista25.imprime();
        boolean boolean31 = lista25.vazia();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean34 = lista25.vazia();
        lista11.insere((java.lang.Object) lista25);
        lista0.insere((java.lang.Object) lista25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista0.insere((java.lang.Object) lista31);
        lista31.insere((java.lang.Object) "hi!");
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean41 = lista38.vazia();
        lista38.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.insere((java.lang.Object) false);
        lista38.insere((java.lang.Object) lista43);
        lista43.imprime();
        lista43.imprime();
        lista43.imprime();
        boolean boolean52 = lista43.vazia();
        lista43.imprime();
        boolean boolean54 = lista43.vazia();
        lista31.insere((java.lang.Object) lista43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista6.insere((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        boolean boolean18 = lista0.vazia();
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.imprime();
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) 0);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        lista28.imprime();
        lista28.imprime();
        lista28.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass35 = lista28.getClass();
        lista21.insere((java.lang.Object) lista28);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.imprime();
        lista37.imprime();
        boolean boolean42 = lista37.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        boolean boolean46 = lista43.vazia();
        lista43.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        lista48.insere((java.lang.Object) false);
        lista43.insere((java.lang.Object) lista48);
        lista37.insere((java.lang.Object) lista48);
        lista21.insere((java.lang.Object) lista48);
        lista0.insere((java.lang.Object) lista21);
        boolean boolean57 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        boolean boolean16 = lista9.vazia();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.insere((java.lang.Object) 'a');
        boolean boolean25 = lista19.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.insere((java.lang.Object) false);
        lista26.imprime();
        boolean boolean32 = lista26.vazia();
        lista26.insere((java.lang.Object) 100L);
        boolean boolean35 = lista26.vazia();
        lista19.insere((java.lang.Object) lista26);
        lista19.imprime();
        lista0.insere((java.lang.Object) lista19);
        boolean boolean39 = lista0.vazia();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        boolean boolean43 = lista40.vazia();
        lista40.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        lista45.insere((java.lang.Object) false);
        lista40.insere((java.lang.Object) lista45);
        lista45.imprime();
        boolean boolean52 = lista45.vazia();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        lista45.insere(obj53);
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) (short) -1);
        lista56.imprime();
        lista56.imprime();
        lista56.insere((java.lang.Object) (byte) 0);
        lista56.imprime();
        lista56.insere((java.lang.Object) false);
        boolean boolean66 = lista56.vazia();
        lista45.insere((java.lang.Object) lista56);
        lista0.insere((java.lang.Object) lista45);
        java.lang.Class<?> wildcardClass69 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        boolean boolean8 = lista5.vazia();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        boolean boolean13 = lista10.vazia();
        lista10.insere((java.lang.Object) 'a');
        boolean boolean16 = lista10.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista17.imprime();
        boolean boolean23 = lista17.vazia();
        lista17.insere((java.lang.Object) 100L);
        boolean boolean26 = lista17.vazia();
        lista10.insere((java.lang.Object) lista17);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista28.vazia();
        lista28.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) lista33);
        lista33.imprime();
        lista10.insere((java.lang.Object) lista33);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        lista41.imprime();
        lista41.imprime();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        boolean boolean49 = lista46.vazia();
        lista46.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        lista51.insere((java.lang.Object) false);
        lista46.insere((java.lang.Object) lista51);
        lista41.insere((java.lang.Object) lista51);
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) (short) -1);
        boolean boolean61 = lista58.vazia();
        lista58.imprime();
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) (short) -1);
        lista63.insere((java.lang.Object) false);
        lista58.insere((java.lang.Object) lista63);
        java.lang.Class<?> wildcardClass69 = lista58.getClass();
        lista51.insere((java.lang.Object) wildcardClass69);
        lista10.insere((java.lang.Object) lista51);
        lista10.imprime();
        java.lang.Class<?> wildcardClass73 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) lista11);
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.insere((java.lang.Object) (-1.0d));
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        lista18.imprime();
        boolean boolean27 = lista18.vazia();
        java.lang.Class<?> wildcardClass28 = lista18.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.imprime();
        lista6.imprime();
        boolean boolean11 = lista6.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        boolean boolean15 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista12.insere((java.lang.Object) lista17);
        lista6.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean25 = lista6.vazia();
        lista6.imprime();
        java.lang.Class<?> wildcardClass27 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.imprime();
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass23 = lista16.getClass();
        lista7.insere((java.lang.Object) wildcardClass23);
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.imprime();
        lista26.imprime();
        boolean boolean30 = lista26.vazia();
        lista26.imprime();
        boolean boolean32 = lista26.vazia();
        lista7.insere((java.lang.Object) boolean32);
        java.lang.Object obj34 = null;
        lista7.insere(obj34);
        boolean boolean36 = lista7.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        lista11.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.imprime();
        lista17.insere((java.lang.Object) "hi!");
        lista17.imprime();
        lista17.imprime();
        lista17.insere((java.lang.Object) 1L);
        lista17.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista28.vazia();
        lista28.insere((java.lang.Object) 'a');
        boolean boolean34 = lista28.vazia();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        lista35.insere((java.lang.Object) false);
        lista35.imprime();
        boolean boolean41 = lista35.vazia();
        lista35.insere((java.lang.Object) 100L);
        boolean boolean44 = lista35.vazia();
        lista28.insere((java.lang.Object) lista35);
        boolean boolean46 = lista28.vazia();
        boolean boolean47 = lista28.vazia();
        lista17.insere((java.lang.Object) lista28);
        lista11.insere((java.lang.Object) lista17);
        java.lang.Class<?> wildcardClass50 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.imprime();
        boolean boolean21 = lista17.vazia();
        lista7.insere((java.lang.Object) lista17);
        boolean boolean23 = lista17.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.imprime();
        lista24.imprime();
        lista24.insere((java.lang.Object) (byte) 0);
        lista24.imprime();
        lista24.insere((java.lang.Object) false);
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        lista34.imprime();
        lista34.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass40 = lista34.getClass();
        lista24.insere((java.lang.Object) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = lista24.getClass();
        lista17.insere((java.lang.Object) wildcardClass42);
        lista0.insere((java.lang.Object) wildcardClass42);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = lista4.getClass();
        lista0.insere((java.lang.Object) wildcardClass7);
        lista0.insere((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) (byte) 100);
        boolean boolean12 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        boolean boolean17 = lista14.vazia();
        boolean boolean18 = lista14.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        lista14.insere((java.lang.Object) false);
        boolean boolean25 = lista14.vazia();
        lista5.insere((java.lang.Object) boolean25);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.imprime();
        lista27.insere((java.lang.Object) (byte) 0);
        lista27.imprime();
        lista27.insere((java.lang.Object) false);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.imprime();
        lista37.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass43 = lista37.getClass();
        lista27.insere((java.lang.Object) wildcardClass43);
        lista5.insere((java.lang.Object) wildcardClass43);
        lista0.insere((java.lang.Object) wildcardClass43);
        java.lang.Class<?> wildcardClass47 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.insere((java.lang.Object) 'a');
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass15 = lista12.getClass();
        lista8.insere((java.lang.Object) wildcardClass15);
        lista0.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass18 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        boolean boolean16 = lista9.vazia();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.insere((java.lang.Object) 'a');
        boolean boolean25 = lista19.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.insere((java.lang.Object) false);
        lista26.imprime();
        boolean boolean32 = lista26.vazia();
        lista26.insere((java.lang.Object) 100L);
        boolean boolean35 = lista26.vazia();
        lista19.insere((java.lang.Object) lista26);
        lista19.imprime();
        lista0.insere((java.lang.Object) lista19);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) (short) -1);
        boolean boolean42 = lista39.vazia();
        lista39.insere((java.lang.Object) (-1.0d));
        lista0.insere((java.lang.Object) lista39);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        boolean boolean49 = lista46.vazia();
        lista46.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        lista51.insere((java.lang.Object) false);
        lista46.insere((java.lang.Object) lista51);
        lista51.imprime();
        lista51.imprime();
        lista51.imprime();
        boolean boolean60 = lista51.vazia();
        lista51.imprime();
        lista39.insere((java.lang.Object) lista51);
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) (short) -1);
        lista63.imprime();
        lista63.imprime();
        lista63.insere((java.lang.Object) "hi!");
        boolean boolean70 = lista63.vazia();
        ds.Lista lista71 = new ds.Lista();
        boolean boolean72 = lista71.vazia();
        lista71.insere((java.lang.Object) 'a');
        ds.Lista lista75 = new ds.Lista();
        lista75.insere((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass78 = lista75.getClass();
        lista71.insere((java.lang.Object) wildcardClass78);
        lista63.insere((java.lang.Object) lista71);
        lista51.insere((java.lang.Object) lista71);
        boolean boolean82 = lista71.vazia();
        java.lang.Class<?> wildcardClass83 = lista71.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        lista0.imprime();
        boolean boolean19 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.imprime();
        lista6.insere((java.lang.Object) "hi!");
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        boolean boolean15 = lista12.vazia();
        lista12.imprime();
        lista12.imprime();
        boolean boolean18 = lista12.vazia();
        ds.Lista lista19 = new ds.Lista();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista19.insere((java.lang.Object) boolean21);
        boolean boolean23 = lista19.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        boolean boolean27 = lista24.vazia();
        boolean boolean28 = lista24.vazia();
        lista19.insere((java.lang.Object) lista24);
        lista12.insere((java.lang.Object) lista19);
        lista6.insere((java.lang.Object) lista19);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        lista32.imprime();
        boolean boolean39 = lista32.vazia();
        java.lang.Class<?> wildcardClass40 = lista32.getClass();
        lista6.insere((java.lang.Object) wildcardClass40);
        lista0.insere((java.lang.Object) lista6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) lista11);
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        boolean boolean19 = lista11.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        boolean boolean23 = lista20.vazia();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) lista25);
        lista20.imprime();
        lista11.insere((java.lang.Object) lista20);
        boolean boolean33 = lista11.vazia();
        java.lang.Class<?> wildcardClass34 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.insere((java.lang.Object) "hi!");
        lista11.imprime();
        lista11.imprime();
        lista11.insere((java.lang.Object) 1L);
        lista0.insere((java.lang.Object) 1L);
        lista0.insere((java.lang.Object) (-1L));
        boolean boolean24 = lista0.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        boolean boolean28 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.insere((java.lang.Object) false);
        lista25.insere((java.lang.Object) lista30);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        boolean boolean16 = lista5.vazia();
        java.lang.Class<?> wildcardClass17 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        lista7.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass14 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.imprime();
        lista16.imprime();
        boolean boolean21 = lista16.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) lista27);
        lista16.insere((java.lang.Object) lista27);
        lista0.insere((java.lang.Object) lista27);
        boolean boolean35 = lista0.vazia();
        boolean boolean36 = lista0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        lista5.imprime();
        java.lang.Class<?> wildcardClass10 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista6.insere((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        lista0.imprime();
        boolean boolean19 = lista0.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista6.insere((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        boolean boolean18 = lista0.vazia();
        boolean boolean19 = lista0.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        lista20.imprime();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        boolean boolean28 = lista25.vazia();
        lista25.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.insere((java.lang.Object) false);
        lista25.insere((java.lang.Object) lista30);
        lista20.insere((java.lang.Object) lista30);
        lista0.insere((java.lang.Object) lista20);
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        lista38.imprime();
        boolean boolean42 = lista38.vazia();
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        boolean boolean48 = lista45.vazia();
        lista45.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.insere((java.lang.Object) false);
        lista45.insere((java.lang.Object) lista50);
        lista44.insere((java.lang.Object) lista50);
        boolean boolean57 = lista44.vazia();
        lista38.insere((java.lang.Object) lista44);
        lista0.insere((java.lang.Object) lista44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        boolean boolean17 = lista5.vazia();
        boolean boolean18 = lista5.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.imprime();
        lista24.imprime();
        lista24.insere((java.lang.Object) (byte) 0);
        lista24.imprime();
        lista19.insere((java.lang.Object) lista24);
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.insere((java.lang.Object) "hi!");
        lista33.imprime();
        lista33.imprime();
        lista33.insere((java.lang.Object) 1L);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.imprime();
        lista43.imprime();
        lista43.insere((java.lang.Object) (byte) 0);
        lista43.imprime();
        lista43.insere((java.lang.Object) false);
        lista33.insere((java.lang.Object) lista43);
        boolean boolean54 = lista43.vazia();
        lista19.insere((java.lang.Object) lista43);
        ds.Lista lista56 = new ds.Lista();
        boolean boolean57 = lista56.vazia();
        boolean boolean58 = lista56.vazia();
        lista56.imprime();
        boolean boolean60 = lista56.vazia();
        boolean boolean61 = lista56.vazia();
        java.lang.Class<?> wildcardClass62 = lista56.getClass();
        lista43.insere((java.lang.Object) lista56);
        lista5.insere((java.lang.Object) lista43);
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) (short) -1);
        lista65.imprime();
        lista65.imprime();
        ds.Lista lista70 = new ds.Lista();
        lista70.insere((java.lang.Object) (short) -1);
        boolean boolean73 = lista70.vazia();
        lista70.imprime();
        ds.Lista lista75 = new ds.Lista();
        lista75.insere((java.lang.Object) (short) -1);
        lista75.insere((java.lang.Object) false);
        lista70.insere((java.lang.Object) lista75);
        lista65.insere((java.lang.Object) lista75);
        lista5.insere((java.lang.Object) lista75);
        ds.Lista lista83 = new ds.Lista();
        boolean boolean84 = lista83.vazia();
        lista83.imprime();
        boolean boolean86 = lista83.vazia();
        boolean boolean87 = lista83.vazia();
        ds.Lista lista88 = new ds.Lista();
        lista88.insere((java.lang.Object) (short) -1);
        lista88.insere((java.lang.Object) false);
        lista83.insere((java.lang.Object) false);
        boolean boolean94 = lista83.vazia();
        lista75.insere((java.lang.Object) lista83);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean16 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.imprime();
        lista18.insere((java.lang.Object) lista21);
        lista5.insere((java.lang.Object) lista18);
        lista5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.imprime();
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        boolean boolean17 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean17);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.imprime();
        lista26.imprime();
        boolean boolean31 = lista26.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.imprime();
        lista32.imprime();
        boolean boolean37 = lista32.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean41 = lista38.vazia();
        lista38.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.insere((java.lang.Object) false);
        lista38.insere((java.lang.Object) lista43);
        lista32.insere((java.lang.Object) lista43);
        lista26.insere((java.lang.Object) lista32);
        boolean boolean51 = lista32.vazia();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) (short) -1);
        lista52.imprime();
        lista52.imprime();
        lista32.insere((java.lang.Object) lista52);
        lista19.insere((java.lang.Object) lista52);
        lista0.insere((java.lang.Object) lista52);
        java.lang.Class<?> wildcardClass60 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        lista11.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.insere((java.lang.Object) false);
        lista17.imprime();
        boolean boolean23 = lista17.vazia();
        lista17.insere((java.lang.Object) 100L);
        boolean boolean26 = lista17.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        boolean boolean31 = lista27.vazia();
        lista17.insere((java.lang.Object) lista27);
        lista27.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        lista34.imprime();
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) 0);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.imprime();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        lista46.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass51 = lista46.getClass();
        lista43.insere((java.lang.Object) wildcardClass51);
        lista34.insere((java.lang.Object) wildcardClass51);
        lista27.insere((java.lang.Object) wildcardClass51);
        lista11.insere((java.lang.Object) wildcardClass51);
        java.lang.Class<?> wildcardClass56 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        boolean boolean10 = lista7.vazia();
        lista7.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        lista15.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass20 = lista15.getClass();
        lista12.insere((java.lang.Object) wildcardClass20);
        lista7.insere((java.lang.Object) lista12);
        boolean boolean23 = lista12.vazia();
        lista12.imprime();
        boolean boolean25 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean25);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.insere((java.lang.Object) "hi!");
        lista27.imprime();
        lista27.imprime();
        lista27.insere((java.lang.Object) 1L);
        lista27.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean41 = lista38.vazia();
        lista38.insere((java.lang.Object) 'a');
        boolean boolean44 = lista38.vazia();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        lista45.insere((java.lang.Object) false);
        lista45.imprime();
        boolean boolean51 = lista45.vazia();
        lista45.insere((java.lang.Object) 100L);
        boolean boolean54 = lista45.vazia();
        lista38.insere((java.lang.Object) lista45);
        boolean boolean56 = lista38.vazia();
        boolean boolean57 = lista38.vazia();
        lista27.insere((java.lang.Object) lista38);
        java.lang.Class<?> wildcardClass59 = lista27.getClass();
        lista0.insere((java.lang.Object) wildcardClass59);
        java.lang.Class<?> wildcardClass61 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista0.insere((java.lang.Object) lista31);
        boolean boolean36 = lista31.vazia();
        lista31.imprime();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        boolean boolean41 = lista38.vazia();
        lista31.insere((java.lang.Object) lista38);
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        lista43.imprime();
        lista31.insere((java.lang.Object) lista43);
        java.lang.Class<?> wildcardClass47 = lista43.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        lista7.insere((java.lang.Object) "hi!");
        boolean boolean14 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        boolean boolean19 = lista16.vazia();
        lista16.imprime();
        lista16.imprime();
        java.lang.Class<?> wildcardClass22 = lista16.getClass();
        lista0.insere((java.lang.Object) lista16);
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 1L);
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.insere((java.lang.Object) false);
        lista11.imprime();
        boolean boolean17 = lista11.vazia();
        lista11.insere((java.lang.Object) 100L);
        boolean boolean20 = lista11.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.imprime();
        boolean boolean25 = lista21.vazia();
        lista11.insere((java.lang.Object) lista21);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        boolean boolean35 = lista32.vazia();
        lista32.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.insere((java.lang.Object) false);
        lista32.insere((java.lang.Object) lista37);
        lista27.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista11.insere((java.lang.Object) lista37);
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) (byte) 0);
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) (short) -1);
        lista14.insere((java.lang.Object) false);
        lista14.imprime();
        boolean boolean20 = lista14.vazia();
        lista14.insere((java.lang.Object) 100L);
        boolean boolean23 = lista14.vazia();
        lista0.insere((java.lang.Object) lista14);
        lista14.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.imprime();
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        boolean boolean17 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean17);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        boolean boolean27 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        lista29.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) lista29);
        lista19.insere((java.lang.Object) lista29);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        boolean boolean39 = lista36.vazia();
        lista36.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        lista41.insere((java.lang.Object) false);
        lista36.insere((java.lang.Object) lista41);
        java.lang.Class<?> wildcardClass47 = lista36.getClass();
        lista29.insere((java.lang.Object) wildcardClass47);
        java.lang.Object obj49 = new java.lang.Object();
        lista29.insere(obj49);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        lista51.insere((java.lang.Object) false);
        lista51.imprime();
        lista29.insere((java.lang.Object) lista51);
        java.lang.Object obj58 = null;
        lista51.insere(obj58);
        boolean boolean60 = lista51.vazia();
        lista0.insere((java.lang.Object) boolean60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.insere((java.lang.Object) 'a');
        boolean boolean23 = lista17.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista24.imprime();
        boolean boolean30 = lista24.vazia();
        lista24.insere((java.lang.Object) 100L);
        boolean boolean33 = lista24.vazia();
        lista17.insere((java.lang.Object) lista24);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        boolean boolean38 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.insere((java.lang.Object) false);
        lista35.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista17.insere((java.lang.Object) lista40);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        lista48.imprime();
        lista17.insere((java.lang.Object) lista48);
        boolean boolean53 = lista48.vazia();
        lista48.imprime();
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        boolean boolean58 = lista55.vazia();
        lista48.insere((java.lang.Object) lista55);
        lista10.insere((java.lang.Object) lista55);
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) (short) -1);
        lista61.imprime();
        lista61.imprime();
        lista61.imprime();
        java.lang.Class<?> wildcardClass67 = lista61.getClass();
        lista10.insere((java.lang.Object) lista61);
        boolean boolean69 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean16 = lista5.vazia();
        lista5.imprime();
        lista5.imprime();
        boolean boolean19 = lista5.vazia();
        java.lang.Class<?> wildcardClass20 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.insere((java.lang.Object) (short) -1);
        lista1.imprime();
        lista1.insere((java.lang.Object) "hi!");
        lista1.imprime();
        lista1.imprime();
        java.lang.Class<?> wildcardClass9 = lista1.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        boolean boolean11 = lista0.vazia();
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) 0);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.insere((java.lang.Object) false);
        lista21.imprime();
        boolean boolean27 = lista21.vazia();
        lista21.insere((java.lang.Object) 100L);
        boolean boolean30 = lista21.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        boolean boolean35 = lista31.vazia();
        lista21.insere((java.lang.Object) lista31);
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        lista37.imprime();
        boolean boolean40 = lista37.vazia();
        lista37.imprime();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.imprime();
        boolean boolean45 = lista42.vazia();
        lista37.insere((java.lang.Object) lista42);
        boolean boolean47 = lista42.vazia();
        lista42.imprime();
        lista31.insere((java.lang.Object) lista42);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.imprime();
        lista50.imprime();
        lista50.insere((java.lang.Object) (byte) 0);
        lista50.imprime();
        java.lang.Class<?> wildcardClass58 = lista50.getClass();
        lista42.insere((java.lang.Object) lista50);
        lista0.insere((java.lang.Object) lista42);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        boolean boolean10 = lista0.vazia();
        lista0.imprime();
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        boolean boolean30 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        boolean boolean35 = lista32.vazia();
        lista32.insere((java.lang.Object) 'a');
        lista32.insere((java.lang.Object) 0);
        boolean boolean40 = lista32.vazia();
        lista10.insere((java.lang.Object) boolean40);
        lista10.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        boolean boolean14 = lista11.vazia();
        java.lang.Class<?> wildcardClass15 = lista11.getClass();
        lista5.insere((java.lang.Object) wildcardClass15);
        boolean boolean17 = lista5.vazia();
        boolean boolean18 = lista5.vazia();
        boolean boolean19 = lista5.vazia();
        lista5.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        boolean boolean11 = lista8.vazia();
        lista8.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.insere((java.lang.Object) false);
        lista8.insere((java.lang.Object) lista13);
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        boolean boolean22 = lista19.vazia();
        java.lang.Class<?> wildcardClass23 = lista19.getClass();
        lista13.insere((java.lang.Object) wildcardClass23);
        boolean boolean25 = lista13.vazia();
        lista13.imprime();
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        lista28.insere((java.lang.Object) false);
        lista28.imprime();
        boolean boolean34 = lista28.vazia();
        lista28.insere((java.lang.Object) 100L);
        boolean boolean37 = lista28.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.imprime();
        boolean boolean42 = lista38.vazia();
        lista28.insere((java.lang.Object) lista38);
        lista38.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        lista45.imprime();
        lista45.imprime();
        lista45.insere((java.lang.Object) (byte) 0);
        lista45.imprime();
        boolean boolean53 = lista45.vazia();
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        lista54.imprime();
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) (short) -1);
        lista57.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass62 = lista57.getClass();
        lista54.insere((java.lang.Object) wildcardClass62);
        lista45.insere((java.lang.Object) wildcardClass62);
        lista38.insere((java.lang.Object) wildcardClass62);
        lista13.insere((java.lang.Object) wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) (byte) 0);
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) (short) -1);
        boolean boolean17 = lista14.vazia();
        lista14.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        lista14.insere((java.lang.Object) lista19);
        lista19.imprime();
        lista19.imprime();
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        lista29.imprime();
        boolean boolean33 = lista29.vazia();
        boolean boolean34 = lista29.vazia();
        lista19.insere((java.lang.Object) lista29);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        lista36.imprime();
        lista36.imprime();
        boolean boolean41 = lista36.vazia();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) (short) -1);
        lista42.imprime();
        lista42.imprime();
        boolean boolean47 = lista42.vazia();
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        boolean boolean51 = lista48.vazia();
        lista48.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) (short) -1);
        lista53.insere((java.lang.Object) false);
        lista48.insere((java.lang.Object) lista53);
        lista42.insere((java.lang.Object) lista53);
        lista36.insere((java.lang.Object) lista42);
        boolean boolean61 = lista42.vazia();
        java.lang.Class<?> wildcardClass62 = lista42.getClass();
        lista19.insere((java.lang.Object) lista42);
        lista5.insere((java.lang.Object) lista42);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.imprime();
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        boolean boolean17 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean17);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.imprime();
        lista26.imprime();
        boolean boolean31 = lista26.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.imprime();
        lista32.imprime();
        boolean boolean37 = lista32.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean41 = lista38.vazia();
        lista38.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.insere((java.lang.Object) false);
        lista38.insere((java.lang.Object) lista43);
        lista32.insere((java.lang.Object) lista43);
        lista26.insere((java.lang.Object) lista32);
        boolean boolean51 = lista32.vazia();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) (short) -1);
        lista52.imprime();
        lista52.imprime();
        lista32.insere((java.lang.Object) lista52);
        lista19.insere((java.lang.Object) lista52);
        lista0.insere((java.lang.Object) lista52);
        ds.Lista lista60 = new ds.Lista();
        boolean boolean61 = lista60.vazia();
        lista60.insere((java.lang.Object) 'a');
        boolean boolean64 = lista60.vazia();
        lista60.imprime();
        lista60.imprime();
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        lista67.imprime();
        lista67.imprime();
        boolean boolean72 = lista67.vazia();
        ds.Lista lista73 = new ds.Lista();
        lista73.insere((java.lang.Object) (short) -1);
        lista73.imprime();
        lista73.imprime();
        boolean boolean78 = lista73.vazia();
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) (short) -1);
        boolean boolean82 = lista79.vazia();
        lista79.imprime();
        ds.Lista lista84 = new ds.Lista();
        lista84.insere((java.lang.Object) (short) -1);
        lista84.insere((java.lang.Object) false);
        lista79.insere((java.lang.Object) lista84);
        lista73.insere((java.lang.Object) lista84);
        lista67.insere((java.lang.Object) lista73);
        lista60.insere((java.lang.Object) lista73);
        lista73.imprime();
        boolean boolean94 = lista73.vazia();
        boolean boolean95 = lista73.vazia();
        lista73.imprime();
        lista73.imprime();
        lista0.insere((java.lang.Object) lista73);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        lista11.imprime();
        boolean boolean15 = lista11.vazia();
        lista11.insere((java.lang.Object) 'a');
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        boolean boolean22 = lista19.vazia();
        boolean boolean23 = lista19.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) false);
        lista19.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista31.insere((java.lang.Object) "hi!");
        lista31.imprime();
        lista31.imprime();
        lista31.insere((java.lang.Object) 1L);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        lista41.imprime();
        lista41.imprime();
        lista41.insere((java.lang.Object) (byte) 0);
        lista41.imprime();
        lista41.insere((java.lang.Object) false);
        lista31.insere((java.lang.Object) lista41);
        lista19.insere((java.lang.Object) lista41);
        lista11.insere((java.lang.Object) lista19);
        lista19.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        lista0.insere((java.lang.Object) 1.0f);
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        java.lang.Class<?> wildcardClass15 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass15);
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        boolean boolean16 = lista10.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.imprime();
        lista17.imprime();
        lista17.insere((java.lang.Object) (byte) 0);
        lista17.imprime();
        lista17.insere((java.lang.Object) false);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass33 = lista27.getClass();
        lista17.insere((java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass35 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass35);
        boolean boolean37 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.imprime();
        lista8.insere((java.lang.Object) "hi!");
        lista8.imprime();
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object obj17 = null;
        lista0.insere(obj17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass24 = lista19.getClass();
        lista16.insere((java.lang.Object) wildcardClass24);
        lista11.insere((java.lang.Object) lista16);
        boolean boolean27 = lista16.vazia();
        lista16.imprime();
        lista0.insere((java.lang.Object) lista16);
        lista0.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        boolean boolean34 = lista31.vazia();
        lista31.insere((java.lang.Object) 'a');
        boolean boolean37 = lista31.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.insere((java.lang.Object) false);
        lista38.imprime();
        boolean boolean44 = lista38.vazia();
        lista38.insere((java.lang.Object) 100L);
        boolean boolean47 = lista38.vazia();
        lista31.insere((java.lang.Object) lista38);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        boolean boolean52 = lista49.vazia();
        lista49.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        lista54.insere((java.lang.Object) false);
        lista49.insere((java.lang.Object) lista54);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) (short) -1);
        boolean boolean63 = lista60.vazia();
        lista54.insere((java.lang.Object) lista60);
        lista31.insere((java.lang.Object) lista54);
        lista0.insere((java.lang.Object) lista54);
        lista54.imprime();
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) (short) -1);
        boolean boolean71 = lista68.vazia();
        lista68.imprime();
        boolean boolean73 = lista68.vazia();
        ds.Lista lista74 = new ds.Lista();
        boolean boolean75 = lista74.vazia();
        lista74.imprime();
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) (short) -1);
        lista77.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass82 = lista77.getClass();
        lista74.insere((java.lang.Object) wildcardClass82);
        java.lang.Class<?> wildcardClass84 = lista74.getClass();
        lista68.insere((java.lang.Object) wildcardClass84);
        boolean boolean86 = lista68.vazia();
        lista54.insere((java.lang.Object) lista68);
        java.lang.Class<?> wildcardClass88 = lista68.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean16 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.imprime();
        lista18.insere((java.lang.Object) lista21);
        lista5.insere((java.lang.Object) lista18);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        boolean boolean35 = lista32.vazia();
        lista32.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.insere((java.lang.Object) false);
        lista32.insere((java.lang.Object) lista37);
        lista27.insere((java.lang.Object) lista37);
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) (short) -1);
        boolean boolean47 = lista44.vazia();
        lista44.imprime();
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        lista49.insere((java.lang.Object) false);
        lista44.insere((java.lang.Object) lista49);
        java.lang.Class<?> wildcardClass55 = lista44.getClass();
        lista37.insere((java.lang.Object) wildcardClass55);
        java.lang.Object obj57 = new java.lang.Object();
        lista37.insere(obj57);
        ds.Lista lista59 = new ds.Lista();
        lista59.insere((java.lang.Object) (short) -1);
        lista59.insere((java.lang.Object) false);
        lista59.imprime();
        lista37.insere((java.lang.Object) lista59);
        ds.Lista lista66 = new ds.Lista();
        boolean boolean67 = lista66.vazia();
        lista66.imprime();
        ds.Lista lista69 = new ds.Lista();
        boolean boolean70 = lista69.vazia();
        lista69.imprime();
        lista66.insere((java.lang.Object) lista69);
        boolean boolean73 = lista66.vazia();
        lista59.insere((java.lang.Object) lista66);
        lista18.insere((java.lang.Object) lista66);
        ds.Lista lista76 = new ds.Lista();
        lista76.insere((java.lang.Object) (short) -1);
        boolean boolean79 = lista76.vazia();
        lista76.insere((java.lang.Object) 'a');
        boolean boolean82 = lista76.vazia();
        ds.Lista lista83 = new ds.Lista();
        lista83.insere((java.lang.Object) (short) -1);
        lista83.insere((java.lang.Object) false);
        lista83.imprime();
        boolean boolean89 = lista83.vazia();
        lista83.insere((java.lang.Object) 100L);
        boolean boolean92 = lista83.vazia();
        lista76.insere((java.lang.Object) lista83);
        lista76.imprime();
        boolean boolean95 = lista76.vazia();
        lista76.imprime();
        lista18.insere((java.lang.Object) lista76);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) 1L);
        lista9.imprime();
        boolean boolean20 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) (byte) 0);
        lista5.imprime();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.imprime();
        boolean boolean16 = lista13.vazia();
        lista5.insere((java.lang.Object) boolean16);
        lista0.insere((java.lang.Object) boolean16);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.imprime();
        lista19.imprime();
        lista19.insere((java.lang.Object) (byte) 0);
        lista19.imprime();
        lista19.imprime();
        lista0.insere((java.lang.Object) lista19);
        java.lang.Class<?> wildcardClass29 = lista19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        boolean boolean12 = lista7.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) lista24);
        lista13.insere((java.lang.Object) lista24);
        lista7.insere((java.lang.Object) lista13);
        boolean boolean32 = lista13.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.imprime();
        lista13.insere((java.lang.Object) lista33);
        lista0.insere((java.lang.Object) lista33);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.imprime();
        lista40.insere((java.lang.Object) "hi!");
        boolean boolean46 = lista40.vazia();
        lista40.insere((java.lang.Object) (short) 10);
        boolean boolean49 = lista40.vazia();
        lista0.insere((java.lang.Object) boolean49);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        boolean boolean54 = lista51.vazia();
        lista51.imprime();
        boolean boolean56 = lista51.vazia();
        lista51.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) (short) -1);
        lista58.insere((java.lang.Object) false);
        lista58.imprime();
        boolean boolean64 = lista58.vazia();
        lista58.insere((java.lang.Object) 100L);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        lista67.imprime();
        lista67.imprime();
        lista67.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass74 = lista67.getClass();
        lista58.insere((java.lang.Object) wildcardClass74);
        lista51.insere((java.lang.Object) lista58);
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) (short) -1);
        lista77.imprime();
        boolean boolean81 = lista77.vazia();
        lista77.imprime();
        lista51.insere((java.lang.Object) lista77);
        lista0.insere((java.lang.Object) lista77);
        lista77.imprime();
        boolean boolean86 = lista77.vazia();
        lista77.imprime();
        ds.Lista lista88 = new ds.Lista();
        lista88.insere((java.lang.Object) (short) -1);
        lista88.imprime();
        lista88.imprime();
        boolean boolean93 = lista88.vazia();
        boolean boolean94 = lista88.vazia();
        ds.Lista lista95 = new ds.Lista();
        lista95.imprime();
        lista88.insere((java.lang.Object) lista95);
        lista77.insere((java.lang.Object) lista95);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        boolean boolean12 = lista7.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) lista24);
        lista13.insere((java.lang.Object) lista24);
        lista7.insere((java.lang.Object) lista13);
        boolean boolean32 = lista13.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.imprime();
        lista13.insere((java.lang.Object) lista33);
        lista0.insere((java.lang.Object) lista33);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.imprime();
        lista40.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        boolean boolean48 = lista45.vazia();
        lista45.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.insere((java.lang.Object) false);
        lista45.insere((java.lang.Object) lista50);
        lista40.insere((java.lang.Object) lista50);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) (short) -1);
        boolean boolean60 = lista57.vazia();
        lista57.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) (short) -1);
        lista62.insere((java.lang.Object) false);
        lista57.insere((java.lang.Object) lista62);
        java.lang.Class<?> wildcardClass68 = lista57.getClass();
        lista50.insere((java.lang.Object) wildcardClass68);
        lista0.insere((java.lang.Object) lista50);
        ds.Lista lista71 = new ds.Lista();
        lista71.insere((java.lang.Object) (short) -1);
        lista71.insere((java.lang.Object) false);
        lista71.imprime();
        boolean boolean77 = lista71.vazia();
        lista71.insere((java.lang.Object) 100L);
        boolean boolean80 = lista71.vazia();
        ds.Lista lista81 = new ds.Lista();
        lista81.imprime();
        lista71.insere((java.lang.Object) lista81);
        ds.Lista lista84 = new ds.Lista();
        boolean boolean85 = lista84.vazia();
        boolean boolean86 = lista84.vazia();
        lista84.imprime();
        boolean boolean88 = lista84.vazia();
        lista84.insere((java.lang.Object) 'a');
        lista84.imprime();
        lista81.insere((java.lang.Object) lista84);
        lista0.insere((java.lang.Object) lista84);
        java.lang.Class<?> wildcardClass94 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean32 = lista29.vazia();
        lista23.insere((java.lang.Object) lista29);
        lista0.insere((java.lang.Object) lista23);
        lista0.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        boolean boolean39 = lista36.vazia();
        lista36.insere((java.lang.Object) 'a');
        boolean boolean42 = lista36.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.insere((java.lang.Object) false);
        lista43.imprime();
        boolean boolean49 = lista43.vazia();
        lista43.insere((java.lang.Object) 100L);
        boolean boolean52 = lista43.vazia();
        lista36.insere((java.lang.Object) lista43);
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        boolean boolean57 = lista54.vazia();
        lista54.imprime();
        ds.Lista lista59 = new ds.Lista();
        lista59.insere((java.lang.Object) (short) -1);
        lista59.insere((java.lang.Object) false);
        lista54.insere((java.lang.Object) lista59);
        lista59.imprime();
        lista36.insere((java.lang.Object) lista59);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        lista67.imprime();
        lista36.insere((java.lang.Object) lista67);
        boolean boolean72 = lista67.vazia();
        lista67.imprime();
        ds.Lista lista74 = new ds.Lista();
        boolean boolean75 = lista74.vazia();
        boolean boolean76 = lista74.vazia();
        boolean boolean77 = lista74.vazia();
        lista67.insere((java.lang.Object) lista74);
        lista0.insere((java.lang.Object) lista74);
        boolean boolean80 = lista0.vazia();
        java.lang.Class<?> wildcardClass81 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        lista10.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        lista10.insere((java.lang.Object) lista32);
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.imprime();
        lista39.insere((java.lang.Object) lista42);
        boolean boolean46 = lista39.vazia();
        lista32.insere((java.lang.Object) lista39);
        lista32.imprime();
        java.lang.Class<?> wildcardClass49 = lista32.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = lista4.getClass();
        lista0.insere((java.lang.Object) wildcardClass7);
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        boolean boolean16 = lista11.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        boolean boolean23 = lista17.vazia();
        lista11.insere((java.lang.Object) lista17);
        lista17.imprime();
        boolean boolean26 = lista17.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.imprime();
        lista8.insere((java.lang.Object) "hi!");
        boolean boolean14 = lista8.vazia();
        boolean boolean15 = lista8.vazia();
        lista8.imprime();
        java.lang.Class<?> wildcardClass17 = lista8.getClass();
        lista0.insere((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        lista7.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass14 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass16 = lista7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) (short) -1);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass15 = lista10.getClass();
        lista7.insere((java.lang.Object) wildcardClass15);
        lista2.insere((java.lang.Object) lista7);
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass27 = lista22.getClass();
        lista19.insere((java.lang.Object) wildcardClass27);
        boolean boolean29 = lista19.vazia();
        lista0.insere((java.lang.Object) lista19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        boolean boolean16 = lista11.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        boolean boolean23 = lista17.vazia();
        lista11.insere((java.lang.Object) lista17);
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        lista25.imprime();
        boolean boolean28 = lista25.vazia();
        boolean boolean29 = lista25.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) (short) -1);
        lista30.insere((java.lang.Object) false);
        lista25.insere((java.lang.Object) false);
        boolean boolean36 = lista25.vazia();
        boolean boolean37 = lista25.vazia();
        boolean boolean38 = lista25.vazia();
        boolean boolean39 = lista25.vazia();
        java.lang.Class<?> wildcardClass40 = lista25.getClass();
        lista17.insere((java.lang.Object) lista25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean8 = lista3.vazia();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        boolean boolean11 = lista9.vazia();
        lista9.imprime();
        lista9.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) (short) -1);
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) (byte) 0);
        lista14.imprime();
        lista9.insere((java.lang.Object) lista14);
        ds.Lista lista23 = new ds.Lista();
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista23.insere((java.lang.Object) boolean25);
        boolean boolean27 = lista23.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista28.vazia();
        boolean boolean32 = lista28.vazia();
        lista23.insere((java.lang.Object) lista28);
        lista14.insere((java.lang.Object) lista28);
        lista3.insere((java.lang.Object) lista14);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        lista36.insere((java.lang.Object) false);
        boolean boolean41 = lista36.vazia();
        lista36.imprime();
        lista36.imprime();
        lista14.insere((java.lang.Object) lista36);
        boolean boolean45 = lista14.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        lista16.insere((java.lang.Object) lista19);
        lista12.insere((java.lang.Object) lista16);
        boolean boolean24 = lista16.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        boolean boolean28 = lista25.vazia();
        lista25.insere((java.lang.Object) 'a');
        lista25.insere((java.lang.Object) 0);
        boolean boolean33 = lista25.vazia();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        boolean boolean37 = lista34.vazia();
        lista34.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) (short) -1);
        lista39.insere((java.lang.Object) false);
        lista34.insere((java.lang.Object) lista39);
        lista39.imprime();
        boolean boolean46 = lista39.vazia();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        lista39.insere(obj47);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.imprime();
        lista50.imprime();
        lista50.insere((java.lang.Object) (byte) 0);
        lista50.imprime();
        lista50.insere((java.lang.Object) false);
        boolean boolean60 = lista50.vazia();
        lista39.insere((java.lang.Object) lista50);
        lista25.insere((java.lang.Object) lista39);
        lista39.imprime();
        lista16.insere((java.lang.Object) lista39);
        java.lang.Class<?> wildcardClass65 = lista39.getClass();
        lista0.insere((java.lang.Object) lista39);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean18 = lista0.vazia();
        boolean boolean19 = lista0.vazia();
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        boolean boolean18 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        lista20.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) lista20);
        lista10.insere((java.lang.Object) lista20);
        lista20.imprime();
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass30 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.insere((java.lang.Object) false);
        lista6.imprime();
        boolean boolean12 = lista6.vazia();
        lista6.insere((java.lang.Object) 100L);
        boolean boolean15 = lista6.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista6.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) -1);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        lista6.imprime();
        lista6.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        lista6.insere((java.lang.Object) lista11);
        lista0.insere((java.lang.Object) lista6);
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        lista3.insere((java.lang.Object) lista7);
        boolean boolean10 = lista7.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) lista11);
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        boolean boolean19 = lista11.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        boolean boolean23 = lista20.vazia();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) lista25);
        lista20.imprime();
        lista11.insere((java.lang.Object) lista20);
        lista11.imprime();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        lista11.insere((java.lang.Object) wildcardClass35);
        boolean boolean37 = lista11.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        boolean boolean12 = lista7.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.imprime();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.insere((java.lang.Object) false);
        lista19.insere((java.lang.Object) lista24);
        lista13.insere((java.lang.Object) lista24);
        lista7.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        boolean boolean33 = lista0.vazia();
        java.lang.Class<?> wildcardClass34 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        lista12.imprime();
        lista12.insere((java.lang.Object) "hi!");
        lista12.imprime();
        lista12.imprime();
        lista12.insere((java.lang.Object) 1L);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) (byte) 0);
        lista22.imprime();
        lista22.insere((java.lang.Object) false);
        lista12.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        boolean boolean39 = lista36.vazia();
        lista36.imprime();
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        lista41.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) (short) -1);
        lista44.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass49 = lista44.getClass();
        lista41.insere((java.lang.Object) wildcardClass49);
        lista36.insere((java.lang.Object) lista41);
        lista34.insere((java.lang.Object) lista41);
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) (short) -1);
        boolean boolean56 = lista53.vazia();
        lista53.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) (short) -1);
        lista58.insere((java.lang.Object) false);
        lista53.insere((java.lang.Object) lista58);
        lista58.imprime();
        boolean boolean65 = lista58.vazia();
        boolean boolean66 = lista58.vazia();
        lista34.insere((java.lang.Object) lista58);
        lista22.insere((java.lang.Object) lista58);
        java.lang.Class<?> wildcardClass69 = lista22.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista6.insere((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        lista0.imprime();
        boolean boolean19 = lista0.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        boolean boolean23 = lista20.vazia();
        boolean boolean24 = lista20.vazia();
        java.lang.Class<?> wildcardClass25 = lista20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.imprime();
        boolean boolean12 = lista9.vazia();
        boolean boolean13 = lista9.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) (short) -1);
        lista14.insere((java.lang.Object) false);
        lista9.insere((java.lang.Object) false);
        boolean boolean20 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean20);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) (byte) 0);
        lista22.imprime();
        lista22.insere((java.lang.Object) false);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.imprime();
        lista32.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass38 = lista32.getClass();
        lista22.insere((java.lang.Object) wildcardClass38);
        lista0.insere((java.lang.Object) wildcardClass38);
        boolean boolean41 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista6.insere((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        boolean boolean18 = lista0.vazia();
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista21 = new ds.Lista();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) lista27);
        lista21.insere((java.lang.Object) lista27);
        boolean boolean34 = lista27.vazia();
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        lista35.imprime();
        lista35.imprime();
        lista35.insere((java.lang.Object) (byte) 0);
        lista35.imprime();
        boolean boolean43 = lista35.vazia();
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) (short) -1);
        lista47.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass52 = lista47.getClass();
        lista44.insere((java.lang.Object) wildcardClass52);
        lista35.insere((java.lang.Object) wildcardClass52);
        lista27.insere((java.lang.Object) lista35);
        boolean boolean56 = lista35.vazia();
        lista35.insere((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass59 = lista35.getClass();
        lista0.insere((java.lang.Object) lista35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass24 = lista19.getClass();
        lista16.insere((java.lang.Object) wildcardClass24);
        lista11.insere((java.lang.Object) lista16);
        boolean boolean27 = lista16.vazia();
        lista16.imprime();
        lista0.insere((java.lang.Object) lista16);
        lista16.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista31.insere((java.lang.Object) "hi!");
        boolean boolean37 = lista31.vazia();
        boolean boolean38 = lista31.vazia();
        lista31.imprime();
        lista31.imprime();
        lista16.insere((java.lang.Object) lista31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) (byte) 100);
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        lista8.imprime();
        boolean boolean14 = lista8.vazia();
        lista8.insere((java.lang.Object) 100L);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.imprime();
        lista17.imprime();
        lista17.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass24 = lista17.getClass();
        lista8.insere((java.lang.Object) wildcardClass24);
        lista0.insere((java.lang.Object) wildcardClass24);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.imprime();
        boolean boolean32 = lista27.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        boolean boolean36 = lista33.vazia();
        lista33.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.insere((java.lang.Object) false);
        lista33.insere((java.lang.Object) lista38);
        lista27.insere((java.lang.Object) lista38);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        boolean boolean48 = lista45.vazia();
        lista45.insere((java.lang.Object) (-1.0d));
        lista45.imprime();
        lista27.insere((java.lang.Object) lista45);
        lista0.insere((java.lang.Object) lista27);
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        lista54.insere((java.lang.Object) false);
        boolean boolean59 = lista54.vazia();
        lista54.imprime();
        lista54.imprime();
        lista27.insere((java.lang.Object) lista54);
        boolean boolean63 = lista54.vazia();
        boolean boolean64 = lista54.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        lista7.insere((java.lang.Object) lista17);
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        lista20.imprime();
        boolean boolean24 = lista20.vazia();
        lista20.insere((java.lang.Object) 'a');
        lista20.imprime();
        lista17.insere((java.lang.Object) lista20);
        lista0.insere((java.lang.Object) lista20);
        boolean boolean30 = lista20.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        lista6.imprime();
        boolean boolean12 = lista6.vazia();
        ds.Lista lista13 = new ds.Lista();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista13.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista13.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        boolean boolean22 = lista18.vazia();
        lista13.insere((java.lang.Object) lista18);
        lista6.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        boolean boolean16 = lista9.vazia();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.insere((java.lang.Object) 'a');
        boolean boolean25 = lista19.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.insere((java.lang.Object) false);
        lista26.imprime();
        boolean boolean32 = lista26.vazia();
        lista26.insere((java.lang.Object) 100L);
        boolean boolean35 = lista26.vazia();
        lista19.insere((java.lang.Object) lista26);
        lista19.imprime();
        lista0.insere((java.lang.Object) lista19);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) (short) -1);
        boolean boolean42 = lista39.vazia();
        lista39.insere((java.lang.Object) (-1.0d));
        lista0.insere((java.lang.Object) lista39);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        boolean boolean49 = lista46.vazia();
        lista46.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        lista51.insere((java.lang.Object) false);
        lista46.insere((java.lang.Object) lista51);
        lista51.imprime();
        lista51.imprime();
        lista51.imprime();
        boolean boolean60 = lista51.vazia();
        lista51.imprime();
        lista39.insere((java.lang.Object) lista51);
        java.lang.Object obj63 = null;
        lista51.insere(obj63);
        java.lang.Class<?> wildcardClass65 = lista51.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.insere((java.lang.Object) "hi!");
        lista7.imprime();
        lista7.imprime();
        java.lang.Class<?> wildcardClass15 = lista7.getClass();
        lista6.insere((java.lang.Object) wildcardClass15);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean18 = lista6.vazia();
        java.lang.Class<?> wildcardClass19 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.imprime();
        lista7.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass14 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.imprime();
        lista16.imprime();
        boolean boolean21 = lista16.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) lista27);
        lista16.insere((java.lang.Object) lista27);
        lista0.insere((java.lang.Object) lista27);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) (short) -1);
        lista35.imprime();
        lista35.insere((java.lang.Object) "hi!");
        lista35.imprime();
        lista35.imprime();
        lista35.insere((java.lang.Object) 1L);
        lista27.insere((java.lang.Object) 1L);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        boolean boolean49 = lista46.vazia();
        lista46.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        lista51.insere((java.lang.Object) false);
        lista46.insere((java.lang.Object) lista51);
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        boolean boolean59 = lista57.vazia();
        lista57.imprime();
        boolean boolean61 = lista57.vazia();
        lista57.insere((java.lang.Object) 'a');
        lista46.insere((java.lang.Object) lista57);
        lista27.insere((java.lang.Object) lista57);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        lista9.imprime();
        lista9.imprime();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        lista5.insere((java.lang.Object) wildcardClass17);
        lista0.insere((java.lang.Object) wildcardClass17);
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.imprime();
        lista20.imprime();
        boolean boolean24 = lista20.vazia();
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        lista25.imprime();
        lista25.imprime();
        java.lang.Class<?> wildcardClass29 = lista25.getClass();
        lista20.insere((java.lang.Object) lista25);
        lista0.insere((java.lang.Object) lista25);
        lista0.imprime();
        boolean boolean33 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista0.insere((java.lang.Object) lista31);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        lista36.imprime();
        lista36.insere((java.lang.Object) "hi!");
        boolean boolean42 = lista36.vazia();
        lista36.insere((java.lang.Object) (short) 10);
        boolean boolean45 = lista36.vazia();
        lista0.insere((java.lang.Object) lista36);
        java.lang.Class<?> wildcardClass47 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        lista17.imprime();
        lista14.insere((java.lang.Object) lista17);
        lista10.insere((java.lang.Object) lista14);
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        lista22.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass30 = lista25.getClass();
        lista22.insere((java.lang.Object) wildcardClass30);
        boolean boolean32 = lista22.vazia();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.insere((java.lang.Object) "hi!");
        lista33.imprime();
        lista33.imprime();
        lista33.insere((java.lang.Object) 1L);
        lista22.insere((java.lang.Object) 1L);
        lista14.insere((java.lang.Object) 1L);
        lista0.insere((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) lista11);
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.insere((java.lang.Object) (-1.0d));
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        lista0.imprime();
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) 0);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        boolean boolean17 = lista10.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.insere((java.lang.Object) 'a');
        boolean boolean24 = lista18.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        lista25.imprime();
        boolean boolean31 = lista25.vazia();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean34 = lista25.vazia();
        lista18.insere((java.lang.Object) lista25);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        boolean boolean39 = lista36.vazia();
        lista36.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        lista41.insere((java.lang.Object) false);
        lista36.insere((java.lang.Object) lista41);
        lista41.imprime();
        lista18.insere((java.lang.Object) lista41);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        lista49.imprime();
        lista49.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        boolean boolean57 = lista54.vazia();
        lista54.imprime();
        ds.Lista lista59 = new ds.Lista();
        lista59.insere((java.lang.Object) (short) -1);
        lista59.insere((java.lang.Object) false);
        lista54.insere((java.lang.Object) lista59);
        lista49.insere((java.lang.Object) lista59);
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) (short) -1);
        boolean boolean69 = lista66.vazia();
        lista66.imprime();
        ds.Lista lista71 = new ds.Lista();
        lista71.insere((java.lang.Object) (short) -1);
        lista71.insere((java.lang.Object) false);
        lista66.insere((java.lang.Object) lista71);
        java.lang.Class<?> wildcardClass77 = lista66.getClass();
        lista59.insere((java.lang.Object) wildcardClass77);
        lista18.insere((java.lang.Object) lista59);
        lista10.insere((java.lang.Object) lista59);
        lista10.imprime();
        boolean boolean82 = lista10.vazia();
        boolean boolean83 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        boolean boolean12 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        lista17.imprime();
        lista14.insere((java.lang.Object) lista17);
        lista10.insere((java.lang.Object) lista14);
        lista0.insere((java.lang.Object) lista14);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        lista10.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        lista10.insere((java.lang.Object) lista32);
        lista10.imprime();
        boolean boolean40 = lista10.vazia();
        lista10.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        boolean boolean12 = lista9.vazia();
        lista9.insere((java.lang.Object) 'a');
        boolean boolean15 = lista9.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.insere((java.lang.Object) false);
        lista16.imprime();
        boolean boolean22 = lista16.vazia();
        lista16.insere((java.lang.Object) 100L);
        boolean boolean25 = lista16.vazia();
        lista9.insere((java.lang.Object) lista16);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        boolean boolean30 = lista27.vazia();
        lista27.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista27.insere((java.lang.Object) lista32);
        lista32.imprime();
        lista9.insere((java.lang.Object) lista32);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.imprime();
        lista9.insere((java.lang.Object) lista40);
        boolean boolean45 = lista40.vazia();
        lista0.insere((java.lang.Object) boolean45);
        java.lang.Class<?> wildcardClass47 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.imprime();
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) 0);
        lista16.imprime();
        lista16.insere((java.lang.Object) false);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.imprime();
        lista26.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass32 = lista26.getClass();
        lista16.insere((java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = lista16.getClass();
        lista10.insere((java.lang.Object) lista16);
        lista10.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        boolean boolean19 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.insere((java.lang.Object) false);
        lista16.insere((java.lang.Object) lista21);
        lista11.insere((java.lang.Object) lista21);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista28.vazia();
        lista28.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) lista33);
        java.lang.Class<?> wildcardClass39 = lista28.getClass();
        lista21.insere((java.lang.Object) wildcardClass39);
        java.lang.Object obj41 = new java.lang.Object();
        lista21.insere(obj41);
        lista21.imprime();
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        boolean boolean46 = lista44.vazia();
        boolean boolean47 = lista44.vazia();
        boolean boolean48 = lista44.vazia();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        lista49.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) (short) -1);
        lista53.imprime();
        lista53.insere((java.lang.Object) "hi!");
        lista53.imprime();
        lista53.imprime();
        java.lang.Class<?> wildcardClass61 = lista53.getClass();
        lista49.insere((java.lang.Object) wildcardClass61);
        lista44.insere((java.lang.Object) wildcardClass61);
        lista21.insere((java.lang.Object) wildcardClass61);
        lista0.insere((java.lang.Object) lista21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista5.insere((java.lang.Object) lista16);
        lista16.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        boolean boolean18 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        lista20.insere((java.lang.Object) false);
        lista15.insere((java.lang.Object) lista20);
        lista10.insere((java.lang.Object) lista20);
        lista20.imprime();
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        boolean boolean30 = lista0.vazia();
        boolean boolean31 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) (byte) 0);
        lista5.imprime();
        lista5.insere((java.lang.Object) false);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        lista15.imprime();
        lista15.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass21 = lista15.getClass();
        lista5.insere((java.lang.Object) wildcardClass21);
        lista0.insere((java.lang.Object) wildcardClass21);
        lista0.imprime();
        boolean boolean25 = lista0.vazia();
        boolean boolean26 = lista0.vazia();
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.insere((java.lang.Object) (short) -1);
        boolean boolean4 = lista1.vazia();
        lista1.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.insere((java.lang.Object) false);
        lista1.insere((java.lang.Object) lista6);
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        lista18.imprime();
        lista18.imprime();
        lista18.insere((java.lang.Object) (byte) 0);
        lista18.imprime();
        lista13.insere((java.lang.Object) lista18);
        ds.Lista lista27 = new ds.Lista();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        lista27.insere((java.lang.Object) boolean29);
        boolean boolean31 = lista27.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        boolean boolean35 = lista32.vazia();
        boolean boolean36 = lista32.vazia();
        lista27.insere((java.lang.Object) lista32);
        lista18.insere((java.lang.Object) lista32);
        lista32.imprime();
        lista6.insere((java.lang.Object) lista32);
        lista6.imprime();
        lista6.imprime();
        boolean boolean43 = lista6.vazia();
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        boolean boolean18 = lista15.vazia();
        lista15.insere((java.lang.Object) (-1.0d));
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        boolean boolean27 = lista24.vazia();
        lista24.insere((java.lang.Object) 'a');
        boolean boolean30 = lista24.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.insere((java.lang.Object) false);
        lista31.imprime();
        boolean boolean37 = lista31.vazia();
        lista31.insere((java.lang.Object) 100L);
        boolean boolean40 = lista31.vazia();
        lista24.insere((java.lang.Object) lista31);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) (short) -1);
        boolean boolean45 = lista42.vazia();
        lista42.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) (short) -1);
        lista47.insere((java.lang.Object) false);
        lista42.insere((java.lang.Object) lista47);
        lista47.imprime();
        lista24.insere((java.lang.Object) lista47);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) (short) -1);
        lista55.imprime();
        lista24.insere((java.lang.Object) lista55);
        lista0.insere((java.lang.Object) lista24);
        lista24.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        boolean boolean11 = lista6.vazia();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        lista15.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass20 = lista15.getClass();
        lista12.insere((java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        lista6.insere((java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        boolean boolean16 = lista9.vazia();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.insere((java.lang.Object) 'a');
        boolean boolean25 = lista19.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.insere((java.lang.Object) false);
        lista26.imprime();
        boolean boolean32 = lista26.vazia();
        lista26.insere((java.lang.Object) 100L);
        boolean boolean35 = lista26.vazia();
        lista19.insere((java.lang.Object) lista26);
        lista19.imprime();
        lista0.insere((java.lang.Object) lista19);
        boolean boolean39 = lista0.vazia();
        boolean boolean40 = lista0.vazia();
        lista0.imprime();
        boolean boolean42 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean16 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        boolean boolean20 = lista18.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        boolean boolean24 = lista21.vazia();
        lista21.insere((java.lang.Object) (-1.0d));
        lista18.insere((java.lang.Object) (-1.0d));
        boolean boolean28 = lista18.vazia();
        lista5.insere((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) false);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        lista19.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass24 = lista19.getClass();
        lista16.insere((java.lang.Object) wildcardClass24);
        lista11.insere((java.lang.Object) lista16);
        boolean boolean27 = lista16.vazia();
        lista16.imprime();
        lista0.insere((java.lang.Object) lista16);
        lista0.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        boolean boolean34 = lista31.vazia();
        lista31.insere((java.lang.Object) 'a');
        boolean boolean37 = lista31.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.insere((java.lang.Object) false);
        lista38.imprime();
        boolean boolean44 = lista38.vazia();
        lista38.insere((java.lang.Object) 100L);
        boolean boolean47 = lista38.vazia();
        lista31.insere((java.lang.Object) lista38);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) (short) -1);
        boolean boolean52 = lista49.vazia();
        lista49.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        lista54.insere((java.lang.Object) false);
        lista49.insere((java.lang.Object) lista54);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) (short) -1);
        boolean boolean63 = lista60.vazia();
        lista54.insere((java.lang.Object) lista60);
        lista31.insere((java.lang.Object) lista54);
        lista0.insere((java.lang.Object) lista54);
        lista54.imprime();
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) (short) -1);
        boolean boolean71 = lista68.vazia();
        lista68.imprime();
        boolean boolean73 = lista68.vazia();
        ds.Lista lista74 = new ds.Lista();
        boolean boolean75 = lista74.vazia();
        lista74.imprime();
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) (short) -1);
        lista77.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass82 = lista77.getClass();
        lista74.insere((java.lang.Object) wildcardClass82);
        java.lang.Class<?> wildcardClass84 = lista74.getClass();
        lista68.insere((java.lang.Object) wildcardClass84);
        boolean boolean86 = lista68.vazia();
        lista54.insere((java.lang.Object) lista68);
        lista68.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.insere((java.lang.Object) 'a');
        boolean boolean12 = lista6.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.insere((java.lang.Object) false);
        lista13.imprime();
        boolean boolean19 = lista13.vazia();
        lista13.insere((java.lang.Object) 100L);
        boolean boolean22 = lista13.vazia();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        boolean boolean27 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        lista29.insere((java.lang.Object) false);
        lista24.insere((java.lang.Object) lista29);
        lista29.imprime();
        lista6.insere((java.lang.Object) lista29);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.imprime();
        lista6.insere((java.lang.Object) lista37);
        boolean boolean42 = lista37.vazia();
        boolean boolean43 = lista37.vazia();
        lista0.insere((java.lang.Object) lista37);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista6.insere((java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        lista0.imprime();
        boolean boolean19 = lista0.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) (byte) 0);
        lista23.imprime();
        boolean boolean31 = lista23.vazia();
        java.lang.Class<?> wildcardClass32 = lista23.getClass();
        lista0.insere((java.lang.Object) lista23);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.imprime();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.imprime();
        lista4.insere((java.lang.Object) lista7);
        lista0.insere((java.lang.Object) lista4);
        boolean boolean12 = lista4.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        boolean boolean16 = lista13.vazia();
        lista13.insere((java.lang.Object) 'a');
        lista13.insere((java.lang.Object) 0);
        boolean boolean21 = lista13.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.insere((java.lang.Object) false);
        lista22.insere((java.lang.Object) lista27);
        lista27.imprime();
        boolean boolean34 = lista27.vazia();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        lista27.insere(obj35);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        lista38.imprime();
        lista38.imprime();
        lista38.insere((java.lang.Object) (byte) 0);
        lista38.imprime();
        lista38.insere((java.lang.Object) false);
        boolean boolean48 = lista38.vazia();
        lista27.insere((java.lang.Object) lista38);
        lista13.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista4.insere((java.lang.Object) lista27);
        boolean boolean53 = lista27.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        boolean boolean17 = lista13.vazia();
        lista13.insere((java.lang.Object) 'a');
        lista13.imprime();
        lista10.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass22 = lista13.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista6 = new ds.Lista();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.imprime();
        lista7.insere((java.lang.Object) "hi!");
        lista7.imprime();
        lista7.imprime();
        java.lang.Class<?> wildcardClass15 = lista7.getClass();
        lista6.insere((java.lang.Object) wildcardClass15);
        lista0.insere((java.lang.Object) lista6);
        java.lang.Class<?> wildcardClass18 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        boolean boolean17 = lista13.vazia();
        lista13.insere((java.lang.Object) 'a');
        lista13.imprime();
        lista10.insere((java.lang.Object) lista13);
        lista10.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        boolean boolean9 = lista5.vazia();
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        lista12.imprime();
        lista12.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        lista12.insere((java.lang.Object) lista22);
        boolean boolean29 = lista22.vazia();
        lista22.imprime();
        lista0.insere((java.lang.Object) lista22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista5.insere((java.lang.Object) lista11);
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        java.lang.Class<?> wildcardClass19 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        boolean boolean9 = lista5.vazia();
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) (byte) 0);
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista14 = new ds.Lista();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista14.insere((java.lang.Object) boolean16);
        boolean boolean18 = lista14.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        boolean boolean23 = lista19.vazia();
        lista14.insere((java.lang.Object) lista19);
        lista5.insere((java.lang.Object) lista19);
        boolean boolean26 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        boolean boolean31 = lista28.vazia();
        lista28.imprime();
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        lista33.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        lista36.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass41 = lista36.getClass();
        lista33.insere((java.lang.Object) wildcardClass41);
        lista28.insere((java.lang.Object) lista33);
        boolean boolean44 = lista33.vazia();
        lista5.insere((java.lang.Object) lista33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) (short) -1);
        lista3.imprime();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean8 = lista3.vazia();
        boolean boolean9 = lista3.vazia();
        boolean boolean10 = lista3.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        boolean boolean14 = lista11.vazia();
        lista11.insere((java.lang.Object) 'a');
        boolean boolean17 = lista11.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        lista18.insere((java.lang.Object) false);
        lista18.imprime();
        boolean boolean24 = lista18.vazia();
        lista18.insere((java.lang.Object) 100L);
        boolean boolean27 = lista18.vazia();
        lista11.insere((java.lang.Object) lista18);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        lista34.insere((java.lang.Object) false);
        lista29.insere((java.lang.Object) lista34);
        lista34.imprime();
        lista11.insere((java.lang.Object) lista34);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) (short) -1);
        lista42.imprime();
        lista11.insere((java.lang.Object) lista42);
        boolean boolean47 = lista42.vazia();
        lista42.imprime();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        boolean boolean52 = lista49.vazia();
        lista42.insere((java.lang.Object) lista49);
        ds.Lista lista54 = new ds.Lista();
        boolean boolean55 = lista54.vazia();
        lista54.insere((java.lang.Object) 'a');
        boolean boolean58 = lista54.vazia();
        lista54.imprime();
        boolean boolean60 = lista54.vazia();
        lista49.insere((java.lang.Object) lista54);
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) (short) -1);
        lista62.imprime();
        lista62.imprime();
        lista62.insere((java.lang.Object) "hi!");
        lista62.imprime();
        lista49.insere((java.lang.Object) lista62);
        lista3.insere((java.lang.Object) lista49);
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista31.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        boolean boolean39 = lista36.vazia();
        lista36.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) (short) -1);
        lista41.insere((java.lang.Object) false);
        lista36.insere((java.lang.Object) lista41);
        lista31.insere((java.lang.Object) lista41);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) (short) -1);
        boolean boolean51 = lista48.vazia();
        lista48.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) (short) -1);
        lista53.insere((java.lang.Object) false);
        lista48.insere((java.lang.Object) lista53);
        java.lang.Class<?> wildcardClass59 = lista48.getClass();
        lista41.insere((java.lang.Object) wildcardClass59);
        lista0.insere((java.lang.Object) lista41);
        lista41.imprime();
        boolean boolean63 = lista41.vazia();
        boolean boolean64 = lista41.vazia();
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        lista65.imprime();
        boolean boolean68 = lista65.vazia();
        lista65.imprime();
        ds.Lista lista70 = new ds.Lista();
        boolean boolean71 = lista70.vazia();
        lista70.imprime();
        boolean boolean73 = lista70.vazia();
        lista65.insere((java.lang.Object) lista70);
        ds.Lista lista75 = new ds.Lista();
        ds.Lista lista76 = new ds.Lista();
        lista76.insere((java.lang.Object) (short) -1);
        lista76.imprime();
        lista76.insere((java.lang.Object) "hi!");
        lista76.imprime();
        lista76.imprime();
        java.lang.Class<?> wildcardClass84 = lista76.getClass();
        lista75.insere((java.lang.Object) wildcardClass84);
        lista65.insere((java.lang.Object) wildcardClass84);
        lista41.insere((java.lang.Object) wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) (byte) 0);
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista14 = new ds.Lista();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista14.insere((java.lang.Object) boolean16);
        boolean boolean18 = lista14.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        boolean boolean23 = lista19.vazia();
        lista14.insere((java.lang.Object) lista19);
        lista5.insere((java.lang.Object) lista19);
        boolean boolean26 = lista5.vazia();
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        boolean boolean16 = lista9.vazia();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.insere((java.lang.Object) 'a');
        boolean boolean25 = lista19.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.insere((java.lang.Object) false);
        lista26.imprime();
        boolean boolean32 = lista26.vazia();
        lista26.insere((java.lang.Object) 100L);
        boolean boolean35 = lista26.vazia();
        lista19.insere((java.lang.Object) lista26);
        lista19.imprime();
        lista0.insere((java.lang.Object) lista19);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) (short) -1);
        boolean boolean42 = lista39.vazia();
        lista39.insere((java.lang.Object) (-1.0d));
        lista0.insere((java.lang.Object) lista39);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) (short) -1);
        boolean boolean49 = lista46.vazia();
        lista46.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        lista51.insere((java.lang.Object) false);
        lista46.insere((java.lang.Object) lista51);
        lista51.imprime();
        lista51.imprime();
        lista51.imprime();
        boolean boolean60 = lista51.vazia();
        lista51.imprime();
        lista39.insere((java.lang.Object) lista51);
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) (short) -1);
        lista63.imprime();
        lista63.imprime();
        lista63.insere((java.lang.Object) "hi!");
        boolean boolean70 = lista63.vazia();
        ds.Lista lista71 = new ds.Lista();
        boolean boolean72 = lista71.vazia();
        lista71.insere((java.lang.Object) 'a');
        ds.Lista lista75 = new ds.Lista();
        lista75.insere((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass78 = lista75.getClass();
        lista71.insere((java.lang.Object) wildcardClass78);
        lista63.insere((java.lang.Object) lista71);
        lista51.insere((java.lang.Object) lista71);
        lista71.imprime();
        ds.Lista lista83 = new ds.Lista();
        lista83.insere((java.lang.Object) (short) -1);
        lista83.imprime();
        lista83.imprime();
        lista83.insere((java.lang.Object) "hi!");
        boolean boolean90 = lista83.vazia();
        lista71.insere((java.lang.Object) boolean90);
        java.lang.Class<?> wildcardClass92 = lista71.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        java.lang.Class<?> wildcardClass11 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass11);
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) (short) -1);
        boolean boolean17 = lista14.vazia();
        lista14.insere((java.lang.Object) 'a');
        boolean boolean20 = lista14.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        lista21.insere((java.lang.Object) false);
        lista21.imprime();
        boolean boolean27 = lista21.vazia();
        lista21.insere((java.lang.Object) 100L);
        boolean boolean30 = lista21.vazia();
        lista14.insere((java.lang.Object) lista21);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        boolean boolean35 = lista32.vazia();
        lista32.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.insere((java.lang.Object) false);
        lista32.insere((java.lang.Object) lista37);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        boolean boolean46 = lista43.vazia();
        lista37.insere((java.lang.Object) lista43);
        lista14.insere((java.lang.Object) lista37);
        boolean boolean49 = lista37.vazia();
        lista0.insere((java.lang.Object) boolean49);
        lista0.imprime();
        boolean boolean52 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) (short) -1);
        lista12.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass17 = lista12.getClass();
        lista9.insere((java.lang.Object) wildcardClass17);
        lista0.insere((java.lang.Object) wildcardClass17);
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        boolean boolean32 = lista29.vazia();
        lista23.insere((java.lang.Object) lista29);
        lista0.insere((java.lang.Object) lista23);
        boolean boolean35 = lista23.vazia();
        lista23.imprime();
        boolean boolean37 = lista23.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        boolean boolean8 = lista7.vazia();
        lista7.insere((java.lang.Object) 'a');
        boolean boolean11 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.imprime();
        boolean boolean17 = lista14.vazia();
        lista14.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        boolean boolean22 = lista19.vazia();
        lista14.insere((java.lang.Object) lista19);
        ds.Lista lista24 = new ds.Lista();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.imprime();
        lista25.insere((java.lang.Object) "hi!");
        lista25.imprime();
        lista25.imprime();
        java.lang.Class<?> wildcardClass33 = lista25.getClass();
        lista24.insere((java.lang.Object) wildcardClass33);
        lista14.insere((java.lang.Object) wildcardClass33);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) (short) -1);
        lista36.insere((java.lang.Object) false);
        lista36.imprime();
        boolean boolean42 = lista36.vazia();
        lista36.insere((java.lang.Object) 100L);
        boolean boolean45 = lista36.vazia();
        ds.Lista lista46 = new ds.Lista();
        lista46.imprime();
        lista36.insere((java.lang.Object) lista46);
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        boolean boolean51 = lista49.vazia();
        lista49.imprime();
        boolean boolean53 = lista49.vazia();
        lista49.insere((java.lang.Object) 'a');
        lista49.imprime();
        lista46.insere((java.lang.Object) lista49);
        lista14.insere((java.lang.Object) lista49);
        lista0.insere((java.lang.Object) lista49);
        lista49.imprime();
        lista49.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.insere((java.lang.Object) 'a');
        boolean boolean12 = lista6.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) (short) -1);
        lista13.insere((java.lang.Object) false);
        lista13.imprime();
        boolean boolean19 = lista13.vazia();
        lista13.insere((java.lang.Object) 100L);
        boolean boolean22 = lista13.vazia();
        lista6.insere((java.lang.Object) lista13);
        lista6.imprime();
        boolean boolean25 = lista6.vazia();
        java.lang.Class<?> wildcardClass26 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) (short) -1);
        boolean boolean21 = lista18.vazia();
        lista18.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        lista23.insere((java.lang.Object) false);
        lista18.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) (short) -1);
        lista31.imprime();
        lista0.insere((java.lang.Object) lista31);
        boolean boolean36 = lista31.vazia();
        lista31.imprime();
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        boolean boolean41 = lista38.vazia();
        lista31.insere((java.lang.Object) lista38);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.insere((java.lang.Object) 'a');
        boolean boolean47 = lista43.vazia();
        lista43.imprime();
        boolean boolean49 = lista43.vazia();
        lista38.insere((java.lang.Object) lista43);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) (short) -1);
        lista51.imprime();
        lista51.imprime();
        lista51.insere((java.lang.Object) "hi!");
        lista51.imprime();
        lista38.insere((java.lang.Object) lista51);
        java.lang.Class<?> wildcardClass60 = lista38.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        boolean boolean10 = lista7.vazia();
        lista7.imprime();
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        lista15.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass20 = lista15.getClass();
        lista12.insere((java.lang.Object) wildcardClass20);
        lista7.insere((java.lang.Object) lista12);
        boolean boolean23 = lista12.vazia();
        lista12.imprime();
        boolean boolean25 = lista12.vazia();
        lista0.insere((java.lang.Object) boolean25);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        lista27.imprime();
        lista27.insere((java.lang.Object) "hi!");
        lista27.imprime();
        lista27.imprime();
        lista27.insere((java.lang.Object) 1L);
        lista27.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) (short) -1);
        boolean boolean41 = lista38.vazia();
        lista38.insere((java.lang.Object) 'a');
        boolean boolean44 = lista38.vazia();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        lista45.insere((java.lang.Object) false);
        lista45.imprime();
        boolean boolean51 = lista45.vazia();
        lista45.insere((java.lang.Object) 100L);
        boolean boolean54 = lista45.vazia();
        lista38.insere((java.lang.Object) lista45);
        boolean boolean56 = lista38.vazia();
        boolean boolean57 = lista38.vazia();
        lista27.insere((java.lang.Object) lista38);
        java.lang.Class<?> wildcardClass59 = lista27.getClass();
        lista0.insere((java.lang.Object) wildcardClass59);
        boolean boolean61 = lista0.vazia();
        boolean boolean62 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) -1);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        lista6.imprime();
        lista6.insere((java.lang.Object) "hi!");
        boolean boolean12 = lista6.vazia();
        lista6.insere((java.lang.Object) (short) 10);
        boolean boolean15 = lista6.vazia();
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        boolean boolean17 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.insere((java.lang.Object) 'a');
        boolean boolean25 = lista19.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.insere((java.lang.Object) false);
        lista26.imprime();
        boolean boolean32 = lista26.vazia();
        lista26.insere((java.lang.Object) 100L);
        boolean boolean35 = lista26.vazia();
        lista19.insere((java.lang.Object) lista26);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        boolean boolean40 = lista37.vazia();
        lista37.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) (short) -1);
        lista42.insere((java.lang.Object) false);
        lista37.insere((java.lang.Object) lista42);
        lista42.imprime();
        lista19.insere((java.lang.Object) lista42);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) (short) -1);
        lista50.imprime();
        lista19.insere((java.lang.Object) lista50);
        lista50.imprime();
        lista10.insere((java.lang.Object) lista50);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        lista9.imprime();
        lista9.imprime();
        lista9.insere((java.lang.Object) "hi!");
        boolean boolean16 = lista9.vazia();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) (short) -1);
        boolean boolean22 = lista19.vazia();
        lista19.insere((java.lang.Object) 'a');
        boolean boolean25 = lista19.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) (short) -1);
        lista26.insere((java.lang.Object) false);
        lista26.imprime();
        boolean boolean32 = lista26.vazia();
        lista26.insere((java.lang.Object) 100L);
        boolean boolean35 = lista26.vazia();
        lista19.insere((java.lang.Object) lista26);
        lista19.imprime();
        lista0.insere((java.lang.Object) lista19);
        boolean boolean39 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        lista10.imprime();
        boolean boolean31 = lista10.vazia();
        java.lang.Class<?> wildcardClass32 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        boolean boolean14 = lista10.vazia();
        lista0.insere((java.lang.Object) lista10);
        lista10.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        lista17.imprime();
        lista17.imprime();
        lista17.insere((java.lang.Object) (byte) 0);
        lista17.imprime();
        boolean boolean25 = lista17.vazia();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) (short) -1);
        lista29.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass34 = lista29.getClass();
        lista26.insere((java.lang.Object) wildcardClass34);
        lista17.insere((java.lang.Object) wildcardClass34);
        lista10.insere((java.lang.Object) wildcardClass34);
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        boolean boolean40 = lista38.vazia();
        lista38.imprime();
        boolean boolean42 = lista38.vazia();
        lista38.insere((java.lang.Object) 'a');
        lista38.imprime();
        lista38.imprime();
        lista10.insere((java.lang.Object) lista38);
        boolean boolean48 = lista38.vazia();
        java.lang.Class<?> wildcardClass49 = lista38.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) (short) -1);
        lista15.insere((java.lang.Object) false);
        lista10.insere((java.lang.Object) lista15);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) (short) -1);
        boolean boolean24 = lista21.vazia();
        lista15.insere((java.lang.Object) lista21);
        boolean boolean26 = lista21.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        boolean boolean30 = lista27.vazia();
        lista27.imprime();
        lista27.imprime();
        boolean boolean33 = lista27.vazia();
        lista21.insere((java.lang.Object) lista27);
        lista0.insere((java.lang.Object) lista27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) (short) -1);
        boolean boolean12 = lista9.vazia();
        lista9.insere((java.lang.Object) 'a');
        boolean boolean15 = lista9.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) (short) -1);
        lista16.insere((java.lang.Object) false);
        lista16.imprime();
        boolean boolean22 = lista16.vazia();
        lista16.insere((java.lang.Object) 100L);
        boolean boolean25 = lista16.vazia();
        lista9.insere((java.lang.Object) lista16);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) (short) -1);
        boolean boolean30 = lista27.vazia();
        lista27.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista27.insere((java.lang.Object) lista32);
        lista32.imprime();
        lista9.insere((java.lang.Object) lista32);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) (short) -1);
        lista40.imprime();
        lista9.insere((java.lang.Object) lista40);
        lista40.insere((java.lang.Object) "hi!");
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) (short) -1);
        lista47.imprime();
        lista47.insere((java.lang.Object) "hi!");
        lista47.imprime();
        lista47.imprime();
        lista47.insere((java.lang.Object) 1L);
        lista47.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) (short) -1);
        boolean boolean61 = lista58.vazia();
        lista58.insere((java.lang.Object) 'a');
        boolean boolean64 = lista58.vazia();
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) (short) -1);
        lista65.insere((java.lang.Object) false);
        lista65.imprime();
        boolean boolean71 = lista65.vazia();
        lista65.insere((java.lang.Object) 100L);
        boolean boolean74 = lista65.vazia();
        lista58.insere((java.lang.Object) lista65);
        boolean boolean76 = lista58.vazia();
        boolean boolean77 = lista58.vazia();
        lista47.insere((java.lang.Object) lista58);
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) (short) -1);
        boolean boolean82 = lista79.vazia();
        lista79.imprime();
        ds.Lista lista84 = new ds.Lista();
        lista84.insere((java.lang.Object) (short) -1);
        lista84.insere((java.lang.Object) false);
        lista79.insere((java.lang.Object) lista84);
        lista84.imprime();
        boolean boolean91 = lista84.vazia();
        java.lang.Object obj92 = new java.lang.Object();
        java.lang.Class<?> wildcardClass93 = obj92.getClass();
        lista84.insere(obj92);
        lista58.insere(obj92);
        lista40.insere(obj92);
        lista0.insere(obj92);
        java.lang.Class<?> wildcardClass98 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) false);
        java.lang.Class<?> wildcardClass13 = lista8.getClass();
        lista5.insere((java.lang.Object) wildcardClass13);
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        boolean boolean17 = lista5.vazia();
        boolean boolean18 = lista5.vazia();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        boolean boolean21 = lista19.vazia();
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) (short) -1);
        lista24.imprime();
        lista24.imprime();
        lista24.insere((java.lang.Object) (byte) 0);
        lista24.imprime();
        lista19.insere((java.lang.Object) lista24);
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) (short) -1);
        lista33.imprime();
        lista33.insere((java.lang.Object) "hi!");
        lista33.imprime();
        lista33.imprime();
        lista33.insere((java.lang.Object) 1L);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) (short) -1);
        lista43.imprime();
        lista43.imprime();
        lista43.insere((java.lang.Object) (byte) 0);
        lista43.imprime();
        lista43.insere((java.lang.Object) false);
        lista33.insere((java.lang.Object) lista43);
        boolean boolean54 = lista43.vazia();
        lista19.insere((java.lang.Object) lista43);
        ds.Lista lista56 = new ds.Lista();
        boolean boolean57 = lista56.vazia();
        boolean boolean58 = lista56.vazia();
        lista56.imprime();
        boolean boolean60 = lista56.vazia();
        boolean boolean61 = lista56.vazia();
        java.lang.Class<?> wildcardClass62 = lista56.getClass();
        lista43.insere((java.lang.Object) lista56);
        lista5.insere((java.lang.Object) lista43);
        boolean boolean65 = lista43.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.insere((java.lang.Object) "hi!");
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) 1L);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.imprime();
        lista10.insere((java.lang.Object) (byte) 0);
        lista10.imprime();
        lista10.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista10);
        boolean boolean21 = lista10.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.imprime();
        lista22.imprime();
        lista22.imprime();
        lista10.insere((java.lang.Object) lista22);
        boolean boolean29 = lista22.vazia();
        lista22.imprime();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        boolean boolean18 = lista0.vazia();
        lista0.imprime();
        boolean boolean20 = lista0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.insere((java.lang.Object) false);
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        lista5.imprime();
        lista5.imprime();
        boolean boolean14 = lista5.vazia();
        lista5.imprime();
        lista5.imprime();
        boolean boolean17 = lista5.vazia();
        java.lang.Class<?> wildcardClass18 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) (short) -1);
        boolean boolean9 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) (short) -1);
        lista11.insere((java.lang.Object) false);
        lista6.insere((java.lang.Object) lista11);
        lista0.insere((java.lang.Object) lista11);
        lista11.imprime();
        boolean boolean19 = lista11.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) (short) -1);
        boolean boolean23 = lista20.vazia();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) (short) -1);
        lista25.insere((java.lang.Object) false);
        lista20.insere((java.lang.Object) lista25);
        lista20.imprime();
        lista11.insere((java.lang.Object) lista20);
        boolean boolean33 = lista11.vazia();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) (short) -1);
        boolean boolean37 = lista34.vazia();
        lista34.imprime();
        lista34.imprime();
        java.lang.Object obj40 = null;
        lista34.insere(obj40);
        boolean boolean42 = lista34.vazia();
        lista11.insere((java.lang.Object) lista34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        lista10.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        lista10.insere((java.lang.Object) lista32);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) (short) -1);
        boolean boolean42 = lista39.vazia();
        lista32.insere((java.lang.Object) lista39);
        lista39.imprime();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) (short) -1);
        lista45.imprime();
        boolean boolean49 = lista45.vazia();
        boolean boolean50 = lista45.vazia();
        lista45.imprime();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) (short) -1);
        lista52.imprime();
        lista52.imprime();
        lista52.insere((java.lang.Object) "hi!");
        boolean boolean59 = lista52.vazia();
        lista45.insere((java.lang.Object) lista52);
        lista52.imprime();
        lista39.insere((java.lang.Object) lista52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        lista10.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        lista10.insere((java.lang.Object) lista32);
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.imprime();
        lista39.insere((java.lang.Object) lista42);
        boolean boolean46 = lista39.vazia();
        lista32.insere((java.lang.Object) lista39);
        lista32.imprime();
        boolean boolean49 = lista32.vazia();
        boolean boolean50 = lista32.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        lista10.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        lista10.insere((java.lang.Object) lista32);
        boolean boolean39 = lista32.vazia();
        boolean boolean40 = lista32.vazia();
        java.lang.Class<?> wildcardClass41 = lista32.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) -1);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        lista5.imprime();
        lista5.insere((java.lang.Object) "hi!");
        lista5.imprime();
        lista5.imprime();
        lista5.insere((java.lang.Object) 1L);
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.imprime();
        lista16.insere((java.lang.Object) lista19);
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista19.insere((java.lang.Object) lista23);
        lista23.imprime();
        boolean boolean27 = lista23.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) (short) -1);
        lista28.imprime();
        lista28.imprime();
        lista28.insere((java.lang.Object) (byte) 0);
        lista28.imprime();
        boolean boolean36 = lista28.vazia();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) (short) -1);
        lista37.imprime();
        lista37.imprime();
        lista37.insere((java.lang.Object) "hi!");
        boolean boolean44 = lista37.vazia();
        java.lang.Class<?> wildcardClass45 = lista37.getClass();
        lista28.insere((java.lang.Object) lista37);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) (short) -1);
        boolean boolean50 = lista47.vazia();
        lista47.insere((java.lang.Object) 'a');
        boolean boolean53 = lista47.vazia();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) (short) -1);
        lista54.insere((java.lang.Object) false);
        lista54.imprime();
        boolean boolean60 = lista54.vazia();
        lista54.insere((java.lang.Object) 100L);
        boolean boolean63 = lista54.vazia();
        lista47.insere((java.lang.Object) lista54);
        lista47.imprime();
        lista28.insere((java.lang.Object) lista47);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) (short) -1);
        boolean boolean70 = lista67.vazia();
        lista67.insere((java.lang.Object) (-1.0d));
        lista28.insere((java.lang.Object) lista67);
        ds.Lista lista74 = new ds.Lista();
        boolean boolean75 = lista74.vazia();
        lista74.imprime();
        boolean boolean77 = lista74.vazia();
        boolean boolean78 = lista74.vazia();
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) (short) -1);
        lista79.insere((java.lang.Object) false);
        lista74.insere((java.lang.Object) false);
        lista28.insere((java.lang.Object) lista74);
        lista28.imprime();
        lista23.insere((java.lang.Object) lista28);
        lista0.insere((java.lang.Object) lista28);
        boolean boolean89 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        boolean boolean3 = lista0.vazia();
        lista0.insere((java.lang.Object) 'a');
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) (short) -1);
        lista7.insere((java.lang.Object) false);
        lista7.imprime();
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 100L);
        boolean boolean16 = lista7.vazia();
        lista0.insere((java.lang.Object) lista7);
        lista0.imprime();
        boolean boolean19 = lista0.vazia();
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        boolean boolean22 = lista20.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) (short) -1);
        boolean boolean26 = lista23.vazia();
        lista23.insere((java.lang.Object) (-1.0d));
        lista20.insere((java.lang.Object) (-1.0d));
        lista20.imprime();
        lista20.imprime();
        lista0.insere((java.lang.Object) lista20);
        lista0.insere((java.lang.Object) 100.0f);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        lista0.insere((java.lang.Object) false);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.imprime();
        lista10.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass16);
        boolean boolean18 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) (short) -1);
        boolean boolean8 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) (short) -1);
        lista10.insere((java.lang.Object) false);
        lista5.insere((java.lang.Object) lista10);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) (short) -1);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) (short) -1);
        lista22.insere((java.lang.Object) false);
        lista17.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista17.getClass();
        lista10.insere((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        lista10.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) (short) -1);
        lista32.insere((java.lang.Object) false);
        lista32.imprime();
        lista10.insere((java.lang.Object) lista32);
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.imprime();
        lista39.insere((java.lang.Object) lista42);
        boolean boolean46 = lista39.vazia();
        lista32.insere((java.lang.Object) lista39);
        lista39.imprime();
        lista39.imprime();
        boolean boolean50 = lista39.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }
}

