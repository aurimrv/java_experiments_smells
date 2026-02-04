package ds.seed6733;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test01");
        ds.Fibonacci fibonacci0 = new ds.Fibonacci();
        java.lang.Class<?> wildcardClass1 = fibonacci0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test02");
        int int1 = ds.Fibonacci.fibIter((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test03");
        int int1 = ds.Fibonacci.fibIter((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test04");
        int int1 = ds.Fibonacci.fibIter((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test05");
        int int1 = ds.Fibonacci.fibIter((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-980107325) + "'", int1 == (-980107325));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test06");
        int int1 = ds.Fibonacci.fibIter((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test07");
        int int1 = ds.Fibonacci.fibIter((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test08");
        int int1 = ds.Fibonacci.fibIter((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9227465 + "'", int1 == 9227465);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test09");
        int int1 = ds.Fibonacci.fibIter((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2178309 + "'", int1 == 2178309);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test10");
        int int1 = ds.Fibonacci.fibIter((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-798870975) + "'", int1 == (-798870975));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test11");
        int int1 = ds.Fibonacci.fibIter(9227465);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1050337453 + "'", int1 == 1050337453);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test12");
        int int1 = ds.Fibonacci.fibIter(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test13");
        int int1 = ds.Fibonacci.fibIter((-980107325));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test14");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test15");
        int int1 = ds.Fibonacci.fibIter((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-980107325) + "'", int1 == (-980107325));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test16");
        int int1 = ds.Fibonacci.fibIter(55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2144908973 + "'", int1 == 2144908973);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test17");
        int int1 = ds.Fibonacci.fibIter(2178309);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1163903934) + "'", int1 == (-1163903934));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test18");
        int int1 = ds.Fibonacci.fibIter(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-980107325) + "'", int1 == (-980107325));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test19");
        int int1 = ds.Fibonacci.fibIter(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test20");
        int int1 = ds.Fibonacci.fibIter(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test21");
        int int1 = ds.Fibonacci.fibIter(2144908973);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1570223573 + "'", int1 == 1570223573);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test22");
        int int1 = ds.Fibonacci.fibIter((-1163903934));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test23");
        int int1 = ds.Fibonacci.fibIter((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test24");
        int int1 = ds.Fibonacci.fibIter(1570223573);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1370785189 + "'", int1 == 1370785189);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test25");
        int int1 = ds.Fibonacci.fibIter((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1408458269) + "'", int1 == (-1408458269));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test26");
        int int1 = ds.Fibonacci.fibIter((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test27");
        int int1 = ds.Fibonacci.fibIter((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test28");
        int int1 = ds.Fibonacci.fibIter((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test29");
        int int1 = ds.Fibonacci.fibIter((-798870975));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test30");
        int int1 = ds.Fibonacci.fibIter(1370785189);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-662489223) + "'", int1 == (-662489223));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test31");
        int int1 = ds.Fibonacci.fibIter((-1408458269));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test32");
        int int1 = ds.Fibonacci.fibIter(1050337453);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1151253847) + "'", int1 == (-1151253847));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test33");
        int int1 = ds.Fibonacci.fibIter((-662489223));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test34");
        int int1 = ds.Fibonacci.fibIter((-1151253847));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}

