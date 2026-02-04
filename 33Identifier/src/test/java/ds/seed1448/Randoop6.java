package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3001");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        boolean boolean32 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3002");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3003");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3004");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3005");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3006");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3007");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3008");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3009");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3010");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3011");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3012");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3013");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3014");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3015");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3016");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3017");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3018");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3019");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3020");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3021");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f('a');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.valid_f('#');
        boolean boolean32 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3022");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3023");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3024");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3025");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3026");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3027");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3028");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3029");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3030");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3031");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3032");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3033");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3034");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3035");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3036");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3037");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3038");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3039");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3040");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3041");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3042");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3043");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3044");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3045");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3046");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3047");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3048");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3049");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3050");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3051");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3052");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3053");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3054");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3055");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3056");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3057");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3058");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3059");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3060");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3061");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_s('#');
        boolean boolean30 = identifier0.valid_f('a');
        boolean boolean32 = identifier0.validateIdentifier("hi!");
        boolean boolean34 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3062");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3063");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3064");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3065");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3066");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3067");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3068");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3069");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3070");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_s('a');
        boolean boolean32 = identifier0.valid_s('4');
        boolean boolean34 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass35 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3071");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3072");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3073");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3074");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3075");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3076");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3077");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3078");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3079");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3080");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3081");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3082");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f('a');
        boolean boolean28 = identifier0.valid_s('a');
        boolean boolean30 = identifier0.valid_f('4');
        boolean boolean32 = identifier0.valid_f('a');
        boolean boolean34 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3083");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3084");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3085");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3086");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3087");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3088");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3089");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3090");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
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
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3091");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3092");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3093");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3094");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3095");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3096");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3097");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3098");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3099");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.valid_s('a');
        boolean boolean32 = identifier0.validateIdentifier("hi!");
        boolean boolean34 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3100");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s(' ');
        boolean boolean30 = identifier0.valid_s('#');
        boolean boolean32 = identifier0.valid_f('4');
        boolean boolean34 = identifier0.valid_f('a');
        boolean boolean36 = identifier0.valid_f('#');
        boolean boolean38 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3101");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_f('4');
        boolean boolean30 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3102");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3103");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_s(' ');
        boolean boolean26 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3104");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3105");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3106");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3107");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3108");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3109");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3110");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3111");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3112");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3113");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3114");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3115");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3116");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3117");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3118");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3119");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3120");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3121");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s(' ');
        boolean boolean30 = identifier0.valid_s('#');
        boolean boolean32 = identifier0.valid_f('4');
        boolean boolean34 = identifier0.valid_f('a');
        boolean boolean36 = identifier0.valid_f('#');
        boolean boolean38 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass39 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3122");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3123");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3124");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3125");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3126");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3127");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3128");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3129");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3130");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3131");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3132");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3133");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3134");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3135");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass31 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3136");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3137");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3138");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3139");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_s(' ');
        boolean boolean30 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3140");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3141");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3142");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3143");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3144");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3145");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3146");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3147");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3148");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3149");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3150");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3151");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3152");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3153");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3154");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3155");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3156");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3157");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3158");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3159");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3160");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3161");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_s('#');
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3162");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3163");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3164");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3165");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3166");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3167");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3168");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3169");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3170");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3171");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3172");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3173");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3174");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('a');
        boolean boolean28 = identifier0.valid_s('#');
        boolean boolean30 = identifier0.valid_f(' ');
        boolean boolean32 = identifier0.valid_f('#');
        boolean boolean34 = identifier0.valid_f(' ');
        boolean boolean36 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass37 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3175");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_s('#');
        boolean boolean26 = identifier0.valid_f('a');
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.valid_s('a');
        boolean boolean32 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3176");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3177");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3178");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3179");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3180");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3181");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3182");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3183");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3184");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s('a');
        boolean boolean30 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3185");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3186");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3187");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3188");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.valid_s(' ');
        boolean boolean32 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3189");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3190");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3191");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3192");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3193");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_s('a');
        boolean boolean32 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3194");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3195");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3196");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3197");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3198");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3199");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3200");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3201");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('4');
        boolean boolean28 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3202");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3203");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3204");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('#');
        boolean boolean30 = identifier0.valid_s('a');
        boolean boolean32 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3205");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3206");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
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
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3207");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3208");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3209");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3210");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3211");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass31 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3212");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3213");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_f('#');
        boolean boolean30 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3214");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3215");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3216");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3217");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3218");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3219");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3220");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3221");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s('#');
        boolean boolean30 = identifier0.valid_f('a');
        boolean boolean32 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3222");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_f('4');
        boolean boolean30 = identifier0.valid_f(' ');
        boolean boolean32 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3223");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3224");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s(' ');
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        boolean boolean32 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass33 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3225");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3226");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3227");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3228");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3229");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3230");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3231");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3232");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3233");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3234");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3235");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3236");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3237");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3238");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3239");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3240");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s('#');
        boolean boolean26 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3241");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3242");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3243");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3244");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3245");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3246");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_s(' ');
        boolean boolean26 = identifier0.valid_f('a');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        boolean boolean32 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3247");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3248");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3249");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.valid_f('a');
        boolean boolean32 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3250");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3251");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3252");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3253");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3254");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3255");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3256");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3257");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3258");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3259");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3260");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3261");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_s('#');
        boolean boolean26 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3262");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3263");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3264");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3265");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3266");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3267");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3268");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3269");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3270");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s(' ');
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        boolean boolean32 = identifier0.valid_s('a');
        boolean boolean34 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3271");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3272");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3273");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.valid_f('4');
        boolean boolean32 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3274");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3275");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3276");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3277");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3278");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3279");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3280");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3281");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3282");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3283");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3284");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3285");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3286");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3287");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3288");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3289");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3290");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3291");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3292");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3293");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3294");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3295");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3296");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3297");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3298");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.valid_s('a');
        boolean boolean32 = identifier0.valid_f(' ');
        boolean boolean34 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3299");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3300");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3301");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3302");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3303");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3304");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3305");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3306");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3307");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3308");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3309");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_f('a');
        boolean boolean32 = identifier0.valid_s('a');
        boolean boolean34 = identifier0.valid_f(' ');
        boolean boolean36 = identifier0.valid_f('a');
        boolean boolean38 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3310");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3311");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3312");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3313");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('4');
        boolean boolean30 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3314");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3315");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3316");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3317");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3318");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3319");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3320");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3321");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3322");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3323");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3324");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3325");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3326");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3327");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3328");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3329");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3330");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3331");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3332");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3333");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3334");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3335");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3336");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3337");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3338");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3339");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3340");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s(' ');
        boolean boolean28 = identifier0.valid_f(' ');
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        boolean boolean32 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3341");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3342");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3343");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_s('4');
        boolean boolean28 = identifier0.valid_f('4');
        boolean boolean30 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass31 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3344");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3345");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3346");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s(' ');
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        boolean boolean32 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass33 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3347");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3348");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3349");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3350");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3351");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3352");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3353");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3354");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3355");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3356");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3357");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3358");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3359");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

