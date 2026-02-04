package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2001");
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
        boolean boolean24 = identifier0.valid_s('4');
        boolean boolean26 = identifier0.valid_f('#');
        boolean boolean28 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
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
        boolean boolean26 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
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
        boolean boolean24 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
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
        boolean boolean22 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
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
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_s('4');
        boolean boolean26 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
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
        boolean boolean20 = identifier0.valid_s('a');
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
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
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
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
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
        boolean boolean22 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
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
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2021");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2022");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2023");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2024");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2025");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2026");
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
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2027");
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
        boolean boolean24 = identifier0.valid_f('a');
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
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2028");
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
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s('#');
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2029");
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
        boolean boolean26 = identifier0.valid_f('a');
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
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2030");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2031");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2032");
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
        boolean boolean30 = identifier0.valid_s(' ');
        boolean boolean32 = identifier0.valid_f('4');
        boolean boolean34 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2033");
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
        boolean boolean30 = identifier0.valid_f('a');
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
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2034");
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
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2035");
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
        boolean boolean22 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2036");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2037");
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
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2038");
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
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2039");
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
        boolean boolean32 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2040");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2041");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2042");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2043");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2044");
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
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_s('a');
        boolean boolean30 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2045");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2046");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2047");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2048");
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2049");
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
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2050");
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
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2051");
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
        boolean boolean24 = identifier0.valid_s('4');
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2052");
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
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2053");
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
        boolean boolean30 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2054");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2055");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2056");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2057");
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
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2058");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2059");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2060");
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
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2061");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
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
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2062");
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
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.valid_s('4');
        boolean boolean28 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2063");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2064");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2065");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2066");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2067");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2068");
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
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s(' ');
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
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2069");
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
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_s('#');
        boolean boolean30 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2070");
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
        boolean boolean24 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2071");
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
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2072");
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
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_s('#');
        boolean boolean32 = identifier0.valid_f('#');
        boolean boolean34 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass35 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2073");
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
        boolean boolean30 = identifier0.valid_s('#');
        boolean boolean32 = identifier0.valid_f('a');
        boolean boolean34 = identifier0.valid_f('4');
        boolean boolean36 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2074");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2075");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('4');
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2076");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2077");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2078");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('a');
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
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2079");
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
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2080");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2081");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2082");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2083");
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
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2084");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2085");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2086");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2087");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2088");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2089");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2090");
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
        boolean boolean24 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2091");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2092");
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
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_s('a');
        boolean boolean30 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2093");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2094");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2095");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2096");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2097");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2098");
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
        boolean boolean22 = identifier0.validateIdentifier("hi!");
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
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2099");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2100");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2101");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2102");
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
        boolean boolean28 = identifier0.valid_s('a');
        boolean boolean30 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2103");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2104");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
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
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2105");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2106");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2107");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2108");
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
        boolean boolean22 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2109");
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
        boolean boolean24 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2110");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2111");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2112");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2113");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('4');
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2114");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2115");
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
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2116");
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
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('4');
        boolean boolean30 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2117");
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
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2118");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2119");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2120");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2121");
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
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2122");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2123");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
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
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2124");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2125");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f('a');
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
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2126");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
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
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2127");
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
        boolean boolean28 = identifier0.valid_f('#');
        boolean boolean30 = identifier0.valid_f('a');
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
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2128");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2129");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2130");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2131");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2132");
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
        boolean boolean24 = identifier0.valid_f('4');
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
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2133");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2134");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('a');
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
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2135");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('4');
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
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2136");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2137");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2138");
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
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2139");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2140");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2141");
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
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f('a');
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
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2142");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2143");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_f('a');
        boolean boolean28 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2144");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2145");
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
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_s('#');
        boolean boolean32 = identifier0.valid_f(' ');
        boolean boolean34 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass35 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2146");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2147");
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
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2148");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2149");
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
        boolean boolean22 = identifier0.valid_f('a');
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
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2150");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('4');
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
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2151");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2152");
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
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2153");
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
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2154");
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
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2155");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2156");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2157");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2158");
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
        boolean boolean30 = identifier0.valid_s(' ');
        boolean boolean32 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2159");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2160");
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
        boolean boolean22 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2161");
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
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_f('#');
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
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2162");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2163");
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
        boolean boolean24 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2164");
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
        boolean boolean24 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2165");
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
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f(' ');
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
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2166");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2167");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2168");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2169");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('#');
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
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2170");
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
        boolean boolean32 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2171");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2172");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2173");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2174");
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
        boolean boolean26 = identifier0.valid_f('#');
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
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2175");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2176");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2177");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2178");
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
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_s('a');
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
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2179");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2180");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2181");
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
        boolean boolean24 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2182");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2183");
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
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2184");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2185");
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
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2186");
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
        boolean boolean22 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2187");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2188");
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
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2189");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2190");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2191");
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
        boolean boolean28 = identifier0.valid_s('4');
        boolean boolean30 = identifier0.valid_s('4');
        boolean boolean32 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2192");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2193");
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
        boolean boolean24 = identifier0.valid_s(' ');
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
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2194");
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
        boolean boolean24 = identifier0.valid_s('#');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2195");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2196");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2197");
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
        boolean boolean26 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2198");
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
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2199");
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
        boolean boolean20 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2200");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('a');
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
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2201");
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
        boolean boolean24 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2202");
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
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2203");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2204");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('4');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2205");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2206");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2207");
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
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_s('#');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2208");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2209");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = identifier0.validateIdentifier("");
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
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2210");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2211");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2212");
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
        boolean boolean26 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2213");
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
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2214");
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
        boolean boolean20 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2215");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2216");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2217");
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
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2218");
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
        boolean boolean22 = identifier0.validateIdentifier("hi!");
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2219");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2220");
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
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2221");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('#');
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
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2222");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2223");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2224");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2225");
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
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2226");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2227");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2228");
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
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s(' ');
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
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2229");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2230");
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
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_f('#');
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
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2231");
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
        boolean boolean20 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2232");
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
        boolean boolean30 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2233");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2234");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2235");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2236");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2237");
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
        boolean boolean26 = identifier0.valid_s('4');
        boolean boolean28 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2238");
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
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.validateIdentifier("hi!");
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
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2239");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2240");
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
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2241");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2242");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
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
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2243");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2244");
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
        boolean boolean28 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2245");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2246");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2247");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_f(' ');
        boolean boolean28 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2248");
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
        boolean boolean22 = identifier0.valid_f(' ');
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
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2249");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2250");
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
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2251");
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
        boolean boolean28 = identifier0.valid_f('#');
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        boolean boolean32 = identifier0.validateIdentifier("hi!");
        boolean boolean34 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2252");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2253");
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
        boolean boolean20 = identifier0.valid_f(' ');
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2254");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2255");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s(' ');
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
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2256");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2257");
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
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2258");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2259");
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
        boolean boolean26 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2260");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2261");
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
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2262");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2263");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2264");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_s('#');
        boolean boolean28 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2265");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2266");
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
        boolean boolean26 = identifier0.valid_s('4');
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
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2267");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f(' ');
        boolean boolean24 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2268");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.validateIdentifier("hi!");
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2269");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2270");
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
        java.lang.Class<?> wildcardClass33 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2271");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2272");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2273");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2274");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2275");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2276");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2277");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2278");
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
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2279");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2280");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2281");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2282");
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
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2283");
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
        boolean boolean24 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2284");
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
        boolean boolean28 = identifier0.valid_s('4');
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
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2285");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2286");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s(' ');
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
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2287");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2288");
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
        boolean boolean28 = identifier0.valid_f('a');
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
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2289");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2290");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2291");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2292");
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
        boolean boolean30 = identifier0.valid_s(' ');
        boolean boolean32 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2293");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2294");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2295");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2296");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2297");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2298");
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
        boolean boolean28 = identifier0.valid_f('#');
        boolean boolean30 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2299");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2300");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2301");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2302");
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
        boolean boolean24 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2303");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2304");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2305");
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
        boolean boolean24 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2306");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2307");
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
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2308");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2309");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('4');
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
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2310");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2311");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2312");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2313");
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
        boolean boolean24 = identifier0.validateIdentifier("hi!");
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
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2314");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2315");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2316");
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
        boolean boolean22 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2317");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_s('4');
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
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2318");
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
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s('a');
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
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2319");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.valid_f('a');
        boolean boolean28 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2320");
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
        boolean boolean24 = identifier0.valid_s('#');
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
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2321");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2322");
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
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2323");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2324");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2325");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2326");
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
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2327");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2328");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2329");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2330");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2331");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('#');
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
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2332");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('a');
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
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2333");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2334");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2335");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2336");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2337");
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
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('a');
        boolean boolean26 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2338");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2339");
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
        boolean boolean24 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2340");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2341");
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
        boolean boolean30 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2342");
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
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.validateIdentifier("hi!");
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
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2343");
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
        boolean boolean28 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2344");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2345");
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
        boolean boolean30 = identifier0.valid_s('4');
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
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2346");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2347");
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
        boolean boolean20 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2348");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2349");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2350");
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
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_f(' ');
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
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2351");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2352");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2353");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2354");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2355");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2356");
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
        boolean boolean30 = identifier0.valid_f('4');
        boolean boolean32 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2357");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2358");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2359");
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
        boolean boolean28 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2360");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_f('4');
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
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2361");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2362");
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
        boolean boolean24 = identifier0.valid_s('#');
        boolean boolean26 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass27 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2363");
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
        boolean boolean26 = identifier0.valid_s('a');
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
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2364");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2365");
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
        boolean boolean20 = identifier0.valid_f('#');
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
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2366");
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
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2367");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('4');
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
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2368");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
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
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2369");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2370");
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
        boolean boolean20 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2371");
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
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2372");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
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
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2373");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
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
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2374");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s(' ');
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
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2375");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('a');
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
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2376");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2377");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2378");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2379");
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
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        boolean boolean26 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2380");
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
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2381");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s(' ');
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
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2382");
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
        boolean boolean24 = identifier0.valid_s(' ');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2383");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2384");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2385");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2386");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2387");
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
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2388");
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
        boolean boolean28 = identifier0.valid_s('4');
        boolean boolean30 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2389");
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
        boolean boolean20 = identifier0.valid_f('4');
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
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2390");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2391");
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
        boolean boolean24 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2392");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2393");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = identifier0.validateIdentifier("");
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
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2394");
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
        boolean boolean22 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2395");
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
        boolean boolean28 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass29 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2396");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2397");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2398");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2399");
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
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2400");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2401");
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
        boolean boolean32 = identifier0.valid_f('4');
        boolean boolean34 = identifier0.valid_f(' ');
        boolean boolean36 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2402");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2403");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2404");
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
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2405");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
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
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2406");
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
        boolean boolean24 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2407");
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
        boolean boolean24 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2408");
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
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2409");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2410");
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
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2411");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2412");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2413");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2414");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
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
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2415");
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
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.validateIdentifier("hi!");
        boolean boolean30 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2416");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2417");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2418");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2419");
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
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2420");
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
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_s(' ');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2421");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2422");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2423");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
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
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2424");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2425");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('#');
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
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2426");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('#');
        boolean boolean26 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2427");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2428");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2429");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
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
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2430");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2431");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2432");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_s('a');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2433");
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
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2434");
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
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2435");
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
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.valid_f('4');
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_f('#');
        boolean boolean32 = identifier0.valid_f('4');
        boolean boolean34 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2436");
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
        boolean boolean24 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2437");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2438");
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
        boolean boolean30 = identifier0.validateIdentifier("hi!");
        boolean boolean32 = identifier0.valid_f('a');
        boolean boolean34 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2439");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2440");
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
        boolean boolean22 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = identifier0.validateIdentifier("");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2441");
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
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_s('#');
        boolean boolean32 = identifier0.valid_f(' ');
        boolean boolean34 = identifier0.valid_f('#');
        boolean boolean36 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2442");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2443");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2444");
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
        boolean boolean26 = identifier0.valid_s('4');
        boolean boolean28 = identifier0.valid_s(' ');
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
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2445");
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
        boolean boolean22 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2446");
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
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('a');
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
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2447");
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
        boolean boolean24 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2448");
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
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('#');
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
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2449");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2450");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2451");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('4');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2452");
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
        boolean boolean30 = identifier0.valid_s('#');
        boolean boolean32 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2453");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2454");
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
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('4');
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2455");
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
        boolean boolean36 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2456");
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
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s('#');
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
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2457");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s('a');
        boolean boolean24 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2458");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2459");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2460");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2461");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2462");
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
        boolean boolean36 = identifier0.valid_s(' ');
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
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2463");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2464");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2465");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2466");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2467");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2468");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.valid_f('4');
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
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2469");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2470");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('#');
        boolean boolean24 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2471");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2472");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2473");
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
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_f('a');
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
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2474");
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
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2475");
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
        boolean boolean20 = identifier0.valid_f('#');
        boolean boolean22 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2476");
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
        boolean boolean20 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2477");
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
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2478");
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
        boolean boolean24 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2479");
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
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
        boolean boolean24 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2480");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2481");
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
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_s('a');
        boolean boolean30 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2482");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2483");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2484");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.validateIdentifier("hi!");
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2485");
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
        boolean boolean26 = identifier0.valid_f(' ');
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
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2486");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2487");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2488");
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
        boolean boolean24 = identifier0.valid_f('4');
        boolean boolean26 = identifier0.valid_s('a');
        boolean boolean28 = identifier0.valid_f('a');
        boolean boolean30 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2489");
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
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('4');
        boolean boolean24 = identifier0.valid_f(' ');
        boolean boolean26 = identifier0.validateIdentifier("hi!");
        boolean boolean28 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2490");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2491");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('4');
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
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2492");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2493");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f(' ');
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
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2494");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2495");
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
        boolean boolean20 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2496");
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
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2497");
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
        boolean boolean22 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2498");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('#');
        boolean boolean24 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2499");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_f('a');
        boolean boolean24 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2500");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}

