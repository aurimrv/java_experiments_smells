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
        ds.Identifier identifier0 = new ds.Identifier();
        java.lang.Class<?> wildcardClass1 = identifier0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass3 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass3 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f(' ');
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass3 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_f('4');
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f('a');
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass3 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('#');
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
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
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        boolean boolean22 = identifier0.valid_s('4');
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('4');
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f(' ');
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('4');
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass3 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s('4');
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('a');
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('a');
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s(' ');
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('a');
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
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('4');
        boolean boolean16 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s('#');
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('4');
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('#');
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
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
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
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
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s(' ');
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
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_s('a');
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
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_f('a');
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
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
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f('4');
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
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('4');
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
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('4');
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('4');
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
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f(' ');
        boolean boolean4 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
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
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f(' ');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
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
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.valid_s('a');
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
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('a');
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
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('4');
        boolean boolean22 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
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
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
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
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass3 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('4');
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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
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
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_f('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('#');
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
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
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
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('#');
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
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass9 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
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
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_s('4');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.valid_f('a');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s(' ');
        boolean boolean10 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s('a');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('4');
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
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_f(' ');
        boolean boolean18 = identifier0.valid_f('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
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
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f(' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('a');
        boolean boolean18 = identifier0.valid_f('#');
        boolean boolean20 = identifier0.valid_f(' ');
        boolean boolean22 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass23 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_s('#');
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
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_f('a');
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
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s(' ');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
        boolean boolean22 = identifier0.valid_s(' ');
        boolean boolean24 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass25 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass5 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
        boolean boolean14 = identifier0.valid_f(' ');
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f(' ');
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
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('4');
        boolean boolean14 = identifier0.valid_s('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s(' ');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
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
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
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
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s('a');
        boolean boolean6 = identifier0.valid_s(' ');
        boolean boolean8 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_s('a');
        boolean boolean16 = identifier0.valid_f('a');
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
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.valid_s('#');
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
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
        boolean boolean22 = identifier0.valid_s('4');
        boolean boolean24 = identifier0.valid_s(' ');
        boolean boolean26 = identifier0.valid_f(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f(' ');
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
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s('4');
        boolean boolean16 = identifier0.valid_s(' ');
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f(' ');
        boolean boolean4 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        boolean boolean14 = identifier0.valid_f(' ');
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_s('#');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass21 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.valid_s(' ');
        boolean boolean16 = identifier0.validateIdentifier("hi!");
        boolean boolean18 = identifier0.validateIdentifier("hi!");
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
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_f('a');
        boolean boolean22 = identifier0.valid_f('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass7 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('4');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('#');
        boolean boolean18 = identifier0.valid_s('#');
        boolean boolean20 = identifier0.valid_s('a');
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
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f(' ');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_f(' ');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('a');
        boolean boolean18 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass19 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
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
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('a');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('4');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s('a');
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
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_f(' ');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s('#');
        boolean boolean4 = identifier0.validateIdentifier("hi!");
        boolean boolean6 = identifier0.valid_s(' ');
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
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('4');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.valid_f('a');
        boolean boolean16 = identifier0.valid_f('4');
        boolean boolean18 = identifier0.valid_f('a');
        boolean boolean20 = identifier0.valid_s(' ');
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
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('#');
        boolean boolean10 = identifier0.valid_s(' ');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.validateIdentifier("hi!");
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_f('#');
        boolean boolean16 = identifier0.valid_f('#');
        boolean boolean18 = identifier0.valid_s('a');
        boolean boolean20 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.validateIdentifier("hi!");
        boolean boolean8 = identifier0.valid_s('#');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_f(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_f('4');
        boolean boolean12 = identifier0.valid_f(' ');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s(' ');
        boolean boolean18 = identifier0.validateIdentifier("hi!");
        boolean boolean20 = identifier0.valid_s(' ');
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
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_s('a');
        boolean boolean10 = identifier0.valid_s('4');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('#');
        java.lang.Class<?> wildcardClass11 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('#');
        boolean boolean6 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_s('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_s('#');
        boolean boolean6 = identifier0.valid_s('#');
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
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_s('#');
        boolean boolean12 = identifier0.valid_s('#');
        boolean boolean14 = identifier0.valid_s('#');
        boolean boolean16 = identifier0.valid_f(' ');
        java.lang.Class<?> wildcardClass17 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_s(' ');
        boolean boolean6 = identifier0.valid_s('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = identifier0.validateIdentifier("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('#');
        boolean boolean8 = identifier0.valid_s('4');
        boolean boolean10 = identifier0.valid_f('#');
        boolean boolean12 = identifier0.valid_f('#');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('4');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.validateIdentifier("hi!");
        boolean boolean14 = identifier0.validateIdentifier("hi!");
        boolean boolean16 = identifier0.valid_s('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_f('a');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_f('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.valid_s('4');
        java.lang.Class<?> wildcardClass15 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.validateIdentifier("hi!");
        boolean boolean12 = identifier0.valid_s('a');
        java.lang.Class<?> wildcardClass13 = identifier0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Identifier identifier0 = new ds.Identifier();
        boolean boolean2 = identifier0.valid_s(' ');
        boolean boolean4 = identifier0.valid_f('4');
        boolean boolean6 = identifier0.valid_s('a');
        boolean boolean8 = identifier0.valid_f('4');
        boolean boolean10 = identifier0.valid_f('a');
        boolean boolean12 = identifier0.valid_f('a');
        boolean boolean14 = identifier0.validateIdentifier("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

