package ds.seed7992;

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
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}

