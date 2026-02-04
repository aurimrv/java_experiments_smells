package ds.seed5311;

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
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        boolean boolean9 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 10.0d);
        boolean boolean12 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 1.0f);
        fila7.enfileira((java.lang.Object) 100.0d);
        fila7.imprime();
        boolean boolean14 = fila7.vazia();
        boolean boolean15 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 10.0d);
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        boolean boolean22 = fila20.vazia();
        fila20.enfileira((java.lang.Object) 10.0d);
        fila20.imprime();
        fila20.enfileira((java.lang.Object) 'a');
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        boolean boolean30 = fila28.vazia();
        fila28.enfileira((java.lang.Object) 10.0d);
        fila28.imprime();
        fila28.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj36 = fila28.desenfileira();
        boolean boolean37 = fila28.vazia();
        fila28.enfileira((java.lang.Object) 1L);
        fila28.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila42 = new ds.Fila();
        fila42.imprime();
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        fila44.enfileira((java.lang.Object) 1.0f);
        fila44.enfileira((java.lang.Object) 100.0d);
        fila44.imprime();
        java.lang.Class<?> wildcardClass51 = fila44.getClass();
        fila42.enfileira((java.lang.Object) wildcardClass51);
        fila42.imprime();
        java.lang.Object obj54 = fila42.desenfileira();
        fila42.imprime();
        boolean boolean56 = fila42.vazia();
        java.lang.Class<?> wildcardClass57 = fila42.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass57);
        fila20.enfileira((java.lang.Object) fila28);
        fila0.enfileira((java.lang.Object) fila20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 10.0d + "'", obj36, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (short) -1);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 1.0f);
        fila11.enfileira((java.lang.Object) 100.0d);
        fila11.imprime();
        java.lang.Class<?> wildcardClass18 = fila11.getClass();
        fila9.enfileira((java.lang.Object) wildcardClass18);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.enfileira((java.lang.Object) 1.0f);
        fila21.enfileira((java.lang.Object) 100.0d);
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        java.lang.Object obj29 = fila21.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        boolean boolean32 = fila30.vazia();
        fila30.enfileira((java.lang.Object) 10.0d);
        boolean boolean35 = fila30.vazia();
        fila21.enfileira((java.lang.Object) boolean35);
        fila0.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        java.lang.Class<?> wildcardClass39 = fila21.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0f + "'", obj29, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        boolean boolean9 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 10.0d);
        boolean boolean12 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila14 = new ds.Fila();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 1.0f);
        fila15.enfileira((java.lang.Object) 100.0d);
        fila15.imprime();
        boolean boolean22 = fila15.vazia();
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object obj24 = null;
        fila23.enfileira(obj24);
        fila15.enfileira((java.lang.Object) fila23);
        fila14.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila7.enfileira((java.lang.Object) fila15);
        boolean boolean30 = fila15.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        boolean boolean3 = fila2.vazia();
        boolean boolean4 = fila2.vazia();
        boolean boolean5 = fila2.vazia();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        boolean boolean11 = fila9.vazia();
        boolean boolean12 = fila9.vazia();
        boolean boolean13 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 10.0d);
        fila15.imprime();
        fila15.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = fila15.desenfileira();
        boolean boolean24 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 1L);
        fila15.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        fila31.enfileira((java.lang.Object) 1.0f);
        fila31.enfileira((java.lang.Object) 100.0d);
        fila31.imprime();
        java.lang.Class<?> wildcardClass38 = fila31.getClass();
        fila29.enfileira((java.lang.Object) wildcardClass38);
        fila29.imprime();
        java.lang.Object obj41 = fila29.desenfileira();
        fila29.imprime();
        boolean boolean43 = fila29.vazia();
        java.lang.Class<?> wildcardClass44 = fila29.getClass();
        fila15.enfileira((java.lang.Object) wildcardClass44);
        java.lang.Object obj46 = null;
        fila15.enfileira(obj46);
        boolean boolean48 = fila15.vazia();
        fila0.enfileira((java.lang.Object) boolean48);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0d + "'", obj23, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0f + "'", obj9, 1.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        boolean boolean9 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        boolean boolean14 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        fila12.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        boolean boolean9 = fila7.vazia();
        fila7.enfileira((java.lang.Object) 10.0d);
        boolean boolean12 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        boolean boolean17 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 10.0d);
        boolean boolean20 = fila15.vazia();
        java.lang.Class<?> wildcardClass21 = fila15.getClass();
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0f);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0d);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        boolean boolean9 = fila7.vazia();
        boolean boolean10 = fila7.vazia();
        boolean boolean11 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean14 = fila7.vazia();
        boolean boolean15 = fila7.vazia();
        fila7.imprime();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.enfileira((java.lang.Object) 1.0f);
        fila17.enfileira((java.lang.Object) 100.0d);
        fila17.imprime();
        boolean boolean24 = fila17.vazia();
        java.lang.Object obj25 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        fila7.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila1.enfileira((java.lang.Object) 1.0f);
        fila1.enfileira((java.lang.Object) 100.0d);
        fila1.imprime();
        boolean boolean8 = fila1.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object obj10 = null;
        fila9.enfileira(obj10);
        fila1.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean14 = fila1.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 1.0f);
        fila15.enfileira((java.lang.Object) 100.0d);
        fila15.imprime();
        fila15.enfileira((java.lang.Object) (short) -1);
        fila15.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj26 = fila15.desenfileira();
        fila1.enfileira((java.lang.Object) fila15);
        fila1.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0f + "'", obj26, 1.0f);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        boolean boolean9 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.enfileira((java.lang.Object) 1.0f);
        fila12.enfileira((java.lang.Object) 100.0d);
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        boolean boolean20 = fila12.vazia();
        fila12.enfileira((java.lang.Object) 10.0d);
        boolean boolean23 = fila12.vazia();
        fila7.enfileira((java.lang.Object) fila12);
        java.lang.Object obj25 = fila12.desenfileira();
        java.lang.Object obj26 = fila12.desenfileira();
        fila12.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        boolean boolean14 = fila12.vazia();
        fila12.enfileira((java.lang.Object) 10.0d);
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = fila12.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.enfileira((java.lang.Object) 1.0f);
        java.lang.Object obj25 = fila21.desenfileira();
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila12.enfileira((java.lang.Object) boolean27);
        boolean boolean29 = fila12.vazia();
        fila0.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0f + "'", obj9, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1.0f));
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 1.0f);
        fila8.enfileira((java.lang.Object) 100.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (short) -1);
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean18 = fila0.vazia();
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        boolean boolean21 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        fila26.enfileira((java.lang.Object) 1.0f);
        fila26.enfileira((java.lang.Object) 100.0d);
        fila26.imprime();
        java.lang.Class<?> wildcardClass33 = fila26.getClass();
        fila24.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass35 = fila24.getClass();
        fila19.enfileira((java.lang.Object) fila24);
        boolean boolean37 = fila19.vazia();
        fila0.enfileira((java.lang.Object) boolean37);
        java.lang.Object obj39 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 10.0d + "'", obj39, 10.0d);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 1.0f);
        fila5.enfileira((java.lang.Object) 100.0d);
        fila5.imprime();
        fila5.enfileira((java.lang.Object) (short) -1);
        fila5.enfileira((java.lang.Object) 10.0d);
        fila5.imprime();
        fila5.imprime();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean19 = fila5.vazia();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        boolean boolean9 = fila6.vazia();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        boolean boolean15 = fila13.vazia();
        fila13.imprime();
        fila6.enfileira((java.lang.Object) fila13);
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.enfileira((java.lang.Object) 1.0f);
        fila18.enfileira((java.lang.Object) 100.0d);
        fila18.imprime();
        boolean boolean25 = fila18.vazia();
        boolean boolean26 = fila18.vazia();
        fila18.enfileira((java.lang.Object) 10.0d);
        boolean boolean29 = fila18.vazia();
        fila13.enfileira((java.lang.Object) fila18);
        fila13.imprime();
        java.lang.Object obj32 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila36.enfileira((java.lang.Object) 1.0f);
        fila36.enfileira((java.lang.Object) 100.0d);
        fila36.imprime();
        java.lang.Class<?> wildcardClass43 = fila36.getClass();
        fila34.enfileira((java.lang.Object) wildcardClass43);
        fila34.imprime();
        java.lang.Object obj46 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) "");
        boolean boolean49 = fila34.vazia();
        fila0.enfileira((java.lang.Object) boolean49);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        boolean boolean2 = fila1.vazia();
        fila1.enfileira((java.lang.Object) 1.0f);
        fila1.enfileira((java.lang.Object) 100.0d);
        fila1.imprime();
        boolean boolean8 = fila1.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object obj10 = null;
        fila9.enfileira(obj10);
        fila1.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila1);
        fila1.imprime();
        boolean boolean15 = fila1.vazia();
        fila1.imprime();
        java.lang.Class<?> wildcardClass17 = fila1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

